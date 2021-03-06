package com.fkart.service;

import java.util.List;

import com.fkart.model.*;

public interface IAdminServices {

	boolean add(Product product);

	boolean update(int productId);

	boolean delete(int productId);

	Product getProduct(int productId);

	List<Product> getAllProduct();

	boolean validate(String name, String pass);
}
