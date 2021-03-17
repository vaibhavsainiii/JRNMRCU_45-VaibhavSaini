package com.capg.employee;

import java.util.ArrayList;
import java.util.Scanner;

import com.capg.company.Company;

public class Employee extends Company{
	static Scanner scannerI = new Scanner(System.in);
	static Scanner scannerS = new Scanner(System.in);

	private String name;
	private String position;
	private int age;
	private int id;

	

	public Employee(int id, String name, String position, int age) {
		super();
		this.name = name;
		this.position = position;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	static public ArrayList<Object> updateMyProfile(ArrayList<Object> employeeList, int id) {
		int age;
		String name, position;

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

	static ArrayList<Object> employeeLogin(ArrayList<Object> employeeList) {
		int id, choice;
		System.out.println("Enter your Employee ID ");
		id = scannerI.nextInt();
		for (int i = 0; i < employeeList.size(); i++) {
			Employee obj = (Employee) employeeList.get(i);
			if (id == obj.getId()) {

				do {
					System.out.println(
							"What do you want to do: \n1. View Profile\n2. Update Profile\n3. Back to login page\n4. Exit");

					choice = scannerI.nextInt();
					switch (choice) {

					case 1:
						System.out.println(obj.getId());
						System.out.println(obj.getName());
						System.out.println(obj.getAge());
						System.out.println(obj.getPosition());
						break;

					case 2:
						employeeList = updateMyProfile(employeeList, id);
						break;

					case 3:
						employeeList = loginChoices(employeeList);
						break;

					case 4:
						System.out.println("Exiting Program...");
						System.exit(0);
						break;
					default:
						System.out.println("This is not a valid Menu Option! Please Select Another");
						break;

					}

				} while (choice != 5);
			}

			return employeeList;
		}
	}

	public static void main(String args[]) {
		ArrayList<Object> employeeList = new ArrayList<Object>();
		employeeList = loginChoices(employeeList);
	}

	public static ArrayList<Object> loginChoices(ArrayList<Object> employeeList) {
		Scanner scannerI = new Scanner(System.in);
		Company objHR = new Company();
		System.out.println("Which login you want- /n1. Employee Login\n2. HR Login");

		int login = scannerI.nextInt();
		if (login == 1) {
			employeeList = employeeLogin(employeeList);
		} else if (login == 2) {
			employeeList = objHR.hrLogin(employeeList);
		}
		scannerI.close();
		return employeeList;
	}

}
