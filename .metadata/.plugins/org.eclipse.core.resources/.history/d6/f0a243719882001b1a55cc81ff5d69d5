package com.abc.controller;

import java.util.Scanner;

import com.abc.util.InputUtil;

public class MainController {

	public static void main(String[] args) {

		runApplication();

	}

	private static void runApplication() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("------WELCOME TO ABCcompany-------");
		System.out.println("1. Employ \n 2.Company \n 3.Exit");

		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			EmployController employController = new EmployController();
			employController.operations();
			break;

		case 2:
			CompanyController companyController = new CompanyController();

			break;

		case 3:
			System.out.println("Exiting..!");
			System.exit(1);

		}

	}
}
