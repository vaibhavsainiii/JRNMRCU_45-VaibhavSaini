package com.employeesort.service;

import com.employeesort.dao.EmployeeDaoImpl;
import com.employeesort.model.Employee;

public class EmployeeServiceImpl{
	static EmployeeDaoImpl employeeDao=new EmployeeDaoImpl(); 
	
	 

	public boolean add(Employee e) {
		return employeeDao.add(e);
	}

	 
	 
}




