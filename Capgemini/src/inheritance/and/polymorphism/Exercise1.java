package inheritance.and.polymorphism;

public class Exercise1 {

	public static void main(String args[]) {

		Account smith = new Account(2000, "smith", 30);
		System.out.println("Smith= " + smith.getBalance());
		Account kathy = new Account(3000, "kathy", 20);
		System.out.println("Kathy= " + kathy.getBalance());
		smith.deposit(2000);
		System.out.println("Smith= " + smith.getBalance());
		kathy.withdraw(3000);
		System.out.println("Kathy= " + kathy.getBalance());
		

	}
}

class Person {
	private String name;
	private float age;

	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}

class Account extends Person {

	private static long accNum = 1001;
	double balance;
	Person accHolder;

	public Account(double balance, String name, float age) {
		super(name, age);
		accNum += 1;
		this.balance = balance;
		// TODO Auto-generated constructor stub
	}

	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	void deposit(double amount) {
		balance = balance + amount;
	}

	boolean withdraw(double amount) {
		if (balance - amount > 500) {
			balance = balance - amount;
			return true;
		} else
			{System.out.println("Balance less than 500");
			return false;
			}
	}
}

class SavingsAccount extends Account{
	final int minBal=500;
	public SavingsAccount(double balance, String name, float age) {
		super(balance, name, age);
		// TODO Auto-generated constructor stub
	}

	boolean withdraw(double amount)
	{
		
		if (balance - amount > minBal) {
			balance = balance - amount;
			return true;
		} else
			{System.out.println("Balance less than 500");
			return false;
			}
		
	}
	
}

class CurrentAccount extends Account{
	final int overdraftLimit=500;
	public CurrentAccount(double balance, String name, float age) {
		super(balance, name, age);
		// TODO Auto-generated constructor stub
	}

	boolean withdraw(double amount)
	{
		
		if (balance - amount > overdraftLimit) {
			balance = balance - amount;
			return true;
		} else
			return false;
		
	}
	
}


