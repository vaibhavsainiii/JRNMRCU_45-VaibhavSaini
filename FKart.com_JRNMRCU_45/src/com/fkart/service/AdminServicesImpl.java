package com.fkart.service;

import java.util.List;

import com.fkart.dao.IProductDao;
import com.fkart.dao.ProductDaoImpl;
import com.fkart.model.Admin;
import com.fkart.model.Product;

public class AdminServicesImpl implements IAdminServices {

	private static IProductDao ProductDao;
	private static Admin admin;
	
	static {
		ProductDao = new ProductDaoImpl();
		 admin = new Admin();
		
	}

//	adds product to the Hashmap, calls add method from ProductDaoImpl
	@Override
	public boolean add(Product product) {
		return ProductDao.add(product);
	}

//	update product in the Hashmap, calls update method from ProductDaoImpl
	@Override
	public boolean update(int id) {

		return ProductDao.update(id);
	}

//	delete product in the Hashmap, calls delete method from ProductDaoImpl
	@Override
	public boolean delete(int productId) {
		return ProductDao.delete(productId);
	}

//	returns product with productId in the Hashmap, calls getProduct method from ProductDaoImpl
	@Override
	public Product getProduct(int productId) {
		return ProductDao.getProduct(productId);
	}

//	returns all product from the Hashmap, calls getAllProduct method from ProductDaoImpl
	@Override
	public List<Product> getAllProduct() {
		return ProductDao.getAllProduct();
	}

	@Override
	public boolean validate(String name,String pass)
	{
		if( ((admin.getUserName()).equals(name)) && (admin.getPassword()).compareTo(pass) == 0)
			return true;
		else
			return false;
	}
}
