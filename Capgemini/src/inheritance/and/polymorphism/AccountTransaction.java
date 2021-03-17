/**
 * 
 */
package inheritance.and.polymorphism;

import java.util.Scanner;

/**
 * @author Vaibhav Saini
 *
 */
public class AccountTransaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doSomething();

	}

	public static void doSomething() {

		Scanner scanner = new Scanner(System.in);
		int s;
		float am;
		String acc;
		System.out.println("---- Welcome to SBI Bank ----");
		System.out.println("Enter your account number");
		acc = scanner.next();
		System.out.println("Enter your account balance");
		Float bal = scanner.nextFloat();
		SBI obj = new SBI(acc, bal);
		System.out.println("1. deposit amount");
		System.out.println("2. withdraw amount");
		s = scanner.nextInt();
		if (s == 1) {
			System.out.println("Enter amount");
			am = scanner.nextInt();
			obj.deposit(am);

		} else if (s == 2) {
			System.out.println("Enter amount");
			am = scanner.nextFloat();
			obj.withdraw(am);
		} else
			System.out.println("Enter a valid choice");

		System.out.println("Balance= " + obj.getBalance());
	}

}

class SBI {

	private String accNo;
	private float balance;

	SBI(String accNo, Float balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public void setAcc(String accNo) {

		this.accNo = accNo;
	}

	public String getAcc() {

		return this.accNo;
	}

	public float getBalance() {

		return this.balance;
	}

	public void deposit(float amount) {
		balance = balance + amount;
		System.out.println("Final balance: " + balance);
	}

	public void withdraw(float amount) {

		if ((balance - amount) > 0) {
			balance = balance - amount;
		} else
			System.out.println("Insufficient Balance");

	}

}
