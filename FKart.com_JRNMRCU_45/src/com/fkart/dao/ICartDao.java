package com.fkart.dao;

import java.util.List;

import com.fkart.model.Product;

public interface ICartDao {

	public boolean add(Product prod, int customerId);

	public List<Product> viewCart(int id);

}
