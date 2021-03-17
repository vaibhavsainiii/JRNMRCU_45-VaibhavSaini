package flow.control;

import java.util.Scanner;

class SBI {

	private int accNo = 1001;
	private float balance = 1000;
	private float amount = 0;

	public void deposit(int acc, int a) {
		amount = a;
		if (accNo == acc) {

			balance = balance + amount;
			System.out.println("Final balance: " + balance);
		} else
			System.out.println("Enter valid acc number");

	}

	public void withdraw(int acc, int a) {
		amount = a;
		if (accNo == acc) {
			balance = balance - amount;
			System.out.println("Final balance: " + balance);
		} else
			System.out.println("Enter valid acc number");

	}

	public void checkBal(int acc) {
		if (accNo == acc)
			System.out.println("Final balance: " + balance);
		else
			System.out.println("Enter valid acc number");

	}

	public void doSomething() {
		Scanner scanner = new Scanner(System.in);
		int s, acc = 0, am;
		while (true) {
			System.out.println("---- Welcome to SBI Bank ----");
			System.out.println("1. deposit amount");
			System.out.println("2. withdraw amount");
			System.out.println("3. check balance");
			System.out.println("4. exit");
			s = scanner.nextInt();
			System.out.println("Enter account no.");
			acc = scanner.nextInt();
			System.out.println("Enter amount");
			am = scanner.nextInt();
			scanner.close();
			if (s == 1) {

				deposit(acc, am);

			} else if (s == 2) {

				withdraw(acc, am);
			} else if (s == 3) {

				checkBal(acc);
			} else if (s == 4) {
				System.exit(0);
			} else
				System.out.println("Enter a valid choice");

		}

	}

	

}
public class Bank {
	public static void main(String args[]) {
		SBI obj = new SBI();
		obj.doSomething();
	}

}
