package com.fkart.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.fkart.dao.ProductDaoImpl;
import com.fkart.model.Product;
import com.fkart.service.AdminServicesImpl;
import com.fkart.service.CustomerServicesImpl;

class AdminServiceTest {

	private AdminServicesImpl admin;

	@BeforeEach
	void setUp() throws Exception {
		
		admin=new AdminServicesImpl();

	}

	@AfterEach
	void tearDown() throws Exception {
		admin = null;

	} 
	@Test
	void test() {


	}

}
