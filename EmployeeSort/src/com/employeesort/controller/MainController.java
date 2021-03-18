package com.employeesort.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import com.employeesort.dao.EmployeeDaoImpl;
import com.employeesort.model.Employee;
import com.employeesort.service.EmployeeDojComparator;
import com.employeesort.service.EmployeeNameComparator;
import com.employeesort.service.EmployeeSalaryComparator;
import com.employeesort.service.EmployeeServiceImpl;

public class MainController {

	static Scanner scanner = new Scanner(System.in);
	static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	static EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
	public static HashSet<Employee> tree = employeeDao.getTree();
	public static List<Employee> emplist = new ArrayList<Employee>();

	public static void main(String args[]) {
		runApplication();

	}

	private static void runApplication() {

		int choice;
		boolean bool = true;
		while (bool == true) {
			System.out.println(
					"1. Enter an employee \n2. Sort by Id \n3. Sort by name \n4. Sort by date of joining \n5. Sort by salary \n6. exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Employee e = getEmployee();
				if (employeeService.add(e)) {
					System.out.println("Employee added ");
					tree = employeeDao.getTree();
					emplist.clear();
					for (Employee el : tree) {
						emplist.add(el);
					}
				} else
					System.out.println("Employee not added ");

				break;
			case 2:
				Collections.sort(emplist);
				System.out.println("Sorted order according to empid is : ");
				for (Employee el : emplist) {
					System.out.println(
							el.employId + " " + el.name + " " + el.Salary + " " + el.dateOfJoin + " " + el.designation);
				}
				break;
			case 3:
				System.out.println("Sorting by name : ");
				Collections.sort(emplist, new EmployeeNameComparator());
				for (Employee el : emplist) {
					System.out.println(
							el.employId + " " + el.name + " " + el.Salary + " " + el.dateOfJoin + " " + el.designation);
				}
				break;

			case 4:
				System.out.println("Sorting by Date of Joining : ");
				Collections.sort(emplist, new EmployeeDojComparator());
				for (Employee el : emplist) {
					System.out.println(
							el.employId + " " + el.name + " " + el.Salary + " " + el.dateOfJoin + " " + el.designation);
				}
				break;

			case 5:
				System.out.println("Sorting by salary : ");
				Collections.sort(emplist, new EmployeeSalaryComparator());
				for (Employee el : emplist) {
					System.out.println(
							el.employId + " " + el.name + " " + el.Salary + " " + el.dateOfJoin + " " + el.designation);
				}
				break;
			case 6:
				bool = false;
				System.out.println("Exiting: ");

				break;
			default:
				System.out.println("Please enter valid choice: ");

			}
		}
	}

	private static Employee getEmployee() {
		Long id;
		String name;
		Long salary;
		String dateOfJoin;
		String designation;
		System.out.println("Enter Employee id, name, salary, date of joining (dd/MM/yyyy) and designation");
		id = scanner.nextLong();
		name = scanner.next();
		salary = scanner.nextLong();
		dateOfJoin = scanner.next();
		designation = scanner.next();

		Employee emp = new Employee();
		emp.setEmployId(id);
		emp.setName(name);
		emp.setSalary(salary);
		emp.setDateOfJoin(dateOfJoin);
		emp.setDesignation(designation);
		return emp;
	}

}
