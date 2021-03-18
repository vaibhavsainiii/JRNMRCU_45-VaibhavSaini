package com.employeesort.service;

import java.util.Comparator;

import com.employeesort.model.Employee;

public class EmployeeDojComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
			return e1.getDateOfJoin().compareTo(e2.getDateOfJoin());
	}

}
