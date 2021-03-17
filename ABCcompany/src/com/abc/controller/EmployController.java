package com.abc.controller;

import java.util.List;
import java.util.Scanner;

import com.abc.model.Employ;
import com.abc.service.EmployServiceImpl;
import com.abc.service.IEmployService;
import com.abc.util.InputUtil;

public class EmployController {

	private static IEmployService employService = new EmployServiceImpl();

	public void operations() {
		Scanner scanner = InputUtil.getScanner();
		boolean status = true;
		int id;
		while (status) {
			System.out.println("---Welcome to Employ operations---");
			System.out.println(
					" 1. register employ \n 2. update employ \n 3. remove employ \n 4. view employ \n 5.All employees \n 6.Exit");

			System.out.println("enter your choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				Employ employ = readEmployInfo();
				if (employService.add(employ)) {
					System.out.println("employ added with " + employ.getId() + " successfully.!");
				} else {
					System.out.println("employ not added.!");
				}
				break;

			case 2:
				System.out.println("Enter employee id: ");
				id = scanner.nextInt();
				Employ emp = readEmployInfo();
				if (employService.update(emp, id) == true)
					System.out.println("Employ is sucessfully updated: ");
				else
					System.out.println("Employ does not exist");
				break;

			case 3:
				System.out.println("Enter employee id: ");
				id = scanner.nextInt();
				if (employService.delete(id) == true)
					System.out.println("Employ is sucessfully updated: ");
				else
					System.out.println("Employ does not exist");
				break;

			case 4:
				System.out.println("Enter employee id: ");
				id = scanner.nextInt();
				if (employService.getEmploy(id) != null) {
					System.out.println("Employee does not exist: ");
				} else {
					Employ obj = new Employ();
					obj = employService.getEmploy(id);
					System.out.println(" " + obj.toString());
				}
				break;
			case 5:
				List<Employ> list= employService.getAllEmploy();
				if(employService.getAllEmploy()!=null)
				{
				for(int i=0;i<list.size();i++)
				{
					System.out.println((list.get(i)).toString());
				}
				}
				else
					System.out.println("No employ in the list, add some employs first");

				
			}

		}
	}

	private Employ readEmployInfo() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("Enter employ id,name,salary:");
		int id = scanner.nextInt();
		String name = scanner.next();
		double salary = scanner.nextDouble();

		return new Employ(id, name, salary);
	}


}
