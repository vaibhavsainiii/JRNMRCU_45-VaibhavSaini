package com.capg.company;

import java.util.ArrayList;
import java.util.Scanner;

import com.capg.employee.*;

public class Company {
	static Scanner scannerI = new Scanner(System.in);
	static Scanner scannerS = new Scanner(System.in);

	String companyName;
	

	public ArrayList<Object> addEmp(ArrayList<Object> employeeList) {
		int id, age;
		String name, position;
		System.out.println("Enter id ");
		id = scannerI.nextInt();
		System.out.println("Enter Name ");
		name = scannerS.nextLine();
		System.out.println("Enter age ");
		age = scannerI.nextInt();
		System.out.println("Enter position ");
		position = scannerS.nextLine();
		Employee obj = new Employee(id, name, position, age);
		employeeList.add(obj);

		return employeeList;

	}

	public ArrayList<Object> updateEmp(ArrayList<Object> employeeList) {
		int id, age;
		String name, position;

		System.out.println("Enter id ");
		id = scannerI.nextInt();

		for (int i = 0; i < employeeList.size(); i++) {
			Employee obj = (Employee) employeeList.get(i);

			if (obj.getId() == id) {

				System.out.println("Enter Name ");
				name = scannerS.nextLine();
				System.out.println("Enter age ");
				age = scannerI.nextInt();
				System.out.println("Enter position ");
				position = scannerS.nextLine();
				Employee obj1 = new Employee(id, name, position, age);
				employeeList.remove(i);
				employeeList.add(obj1);
			}

		}

		return employeeList;

	}

	 void viewEmp(ArrayList<Object> employeeList) {
		for (int i = 0; i < employeeList.size(); i++) {
			Employee obj = (Employee) employeeList.get(i);
			System.out.print("Name: " + obj.getId());
			System.out.print("\tName: " + obj.getName());
			System.out.print("\tage: " + obj.getAge());
			System.out.print("\tposition: " + obj.getPosition());
		}

	}

	public ArrayList<Object> removeEmp(ArrayList<Object> employeeList) {
		int id;

		System.out.println("Enter id ");
		id = scannerI.nextInt();

		for (int i = 0; i < employeeList.size(); i++) {
			Employee obj = (Employee) employeeList.get(i);
			if (obj.getId() == id) {
				employeeList.remove(i);
			}
		}
		return employeeList;
	}

	

	

	public ArrayList<Object> hrLogin(ArrayList<Object> employeeList) {

		int choice;
	    do{
	    	System.out.println("What do you want to do:\n1. Add employee\n2. Update employee\n3. View Employee\n4. Remove employee\n5. exit");

	        choice = scannerI.nextInt();
	    switch(choice){

	    case 1:
	    	employeeList = addEmp(employeeList);
	        break;

	    case 2: 
	    	employeeList = updateEmp(employeeList);
	        break;

	    case 3:
	    	viewEmp(employeeList);
	        break;

	    case 4: 
	    	employeeList = removeEmp(employeeList);
	        break;

	    case 5:
	        System.out.println("Exiting Program...");
	        System.exit(0);
	         break;
	    default :
	             System.out.println("This is not a valid Menu Option! Please Select Another");
	             break;

	    }


	    }while(choice!=5);

		return employeeList;
	}
}
