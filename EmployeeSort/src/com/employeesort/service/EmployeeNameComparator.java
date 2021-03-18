package com.employeesort.service;

import java.util.Comparator;

import com.employeesort.model.Employee;

public class EmployeeNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
	
}
