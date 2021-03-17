package com.fkart.service;

import java.util.List;

import com.fkart.model.Customer;
import com.fkart.model.Product;

public interface ICustomerServices {

	boolean register(Customer customer);

	List<Product> view();

	boolean add(int productId, int customerId);

	List<Product> viewCart(int cartId);

}
