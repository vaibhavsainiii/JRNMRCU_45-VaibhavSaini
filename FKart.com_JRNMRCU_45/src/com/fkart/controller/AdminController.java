package com.fkart.controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.fkart.dao.CustomerDaoImpl;
import com.fkart.model.Product;
import com.fkart.service.IAdminServices;
import com.fkart.service.AdminServicesImpl;
import com.fkart.util.DateUtil;
import com.fkart.util.InputUtil;

//admin menu will be keep displaying until exit.
public class AdminController {
	private static IAdminServices productService;
	private static DateUtil date;

	static {
		productService = new AdminServicesImpl();
		date = new DateUtil();
	}

	public void operations() {
		Scanner scanner = InputUtil.getScanner();
		boolean status = true;
		int id;
		String userName = "abc";
		String pass = "abc";
		System.out.println("Please enter the ID and Password: ");
		userName = scanner.next();
		pass = scanner.next();

//		userName/password validation
		if (productService.validate(userName, pass) == true) {
			System.out.println("ID and password matched....");
			while (status) {
				System.out.println("-----Welcome to Admin Operations-----");
				System.out.println(
						" 1. Enter product \n 2. Update product \n 3. Remove product \n 4. view Product \n 5. All Products \n 6. See All Customers \n 7. Exit");

				System.out.println("enter your choice:");
				int choice = scanner.nextInt();

				switch (choice) {

				case 1:
					Product product = readProductInfo();
					if (productService.add(product)) {
						System.out.println("Product with product ID: " + product.getId() + " added successfully!");
					} else {
						System.out.println("Product not added.!");
					}
					break;

				case 2:
					System.out.println("Enter Product id: ");
					id = scanner.nextInt();
					if (productService.update(id) == true) {
						System.out.println("Product is sucessfully updated: ");
					} else
						System.out.println("Product does not exist");
					break;

				case 3:
					System.out.println("Enter product id: ");
					id = scanner.nextInt();
					if (productService.delete(id) == true)
						System.out.println("Product is sucessfully deleted: ");
					else
						System.out.println("Product does not exist");
					break;

				case 4:
					System.out.println("Enter Product id: ");
					id = scanner.nextInt();
					if (productService.getProduct(id) == null) {
						System.out.println("Product does not exist: ");
					} else {
						Product obj1 = new Product();
						obj1 = productService.getProduct(id);
						System.out.println(" " + obj1.toString());
					}
					break;
				case 5:
					List<Product> list = productService.getAllProduct();
					Product obj2 = new Product();
					if (productService.getAllProduct() != null) {
						for (int i = 0; i < list.size(); i++) {
							obj2 = list.get(i);
							System.out.println(obj2.toString());
						}
					} else
						System.out.println("No Product in the list, add some Products first");
					break;
				case 6:
					CustomerDaoImpl cust = new CustomerDaoImpl();
					Object[] customers = cust.showCustomer();
					System.out.println(customers.length);

					for (int i = 0; i < customers.length; i++) {

						System.out.println(customers[i]);
					}
					break;
				case 7:
					status = false;
					break;
				default:
					System.out.println("Exiting Admin section....");

				}

			}
		} else {
			System.out.println("Admin ID/password not matched, please reenter ");
			operations();
		}

	}

//read the product info
	private Product readProductInfo() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println(
				"Enter Product id, name, price, qty, Manufacturing Date (dd-MM-yyyy), Expiry Date (dd-MM-yyyy): ");

		int id = scanner.nextInt();
		if (id < 1) {
			System.out.println("Enter valid Product Id ");
			readProductInfo();
		}
		String name = scanner.next();

		int price = scanner.nextInt();

		int quantity = scanner.nextInt();
		if (id < 1) {
			System.out.println("Quantity cannot be negative ");
			readProductInfo();

		}

		String date1 = scanner.next();
		String date2 = scanner.next();

		Date mfd = date.getDate(date1);
		Date expiry = date.getDate(date2);
		return new Product(id, name, price, quantity, mfd, expiry);

	}

}
