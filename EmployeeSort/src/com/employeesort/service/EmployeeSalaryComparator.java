package com.employeesort.service;
import java.util.Comparator;

import com.employeesort.model.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()==e2.getSalary()) {
			return 0;
		}
		else if(e1.getSalary()>e2.getSalary()) {
			return 1;
		}
		else return -1;
	}

}