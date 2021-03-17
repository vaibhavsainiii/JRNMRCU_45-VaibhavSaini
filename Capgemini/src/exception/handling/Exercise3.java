package exception.handling;

import java.util.*;

class NameException extends Exception{
	
	NameException(String s)
	{
		super(s);
	}
}

class InvalidAgeException extends Exception {
	InvalidAgeException(String s) {
		super(s);
	}

}

 class Employee {
	 static Scanner scanner=new Scanner(System.in);

	private int salary;
	private String first,last;

	public String getName() {
		return (first+" "+last);
	}
	
	public int getSalary() {
		return (this.salary);
	}

	public void setSalary(int salary) {
		
		this.salary = salary;
		try {
			validateSal(salary);
		} catch (Exception e) {
			System.out.println("exception occured " + e);
			System.out.println("reenter salary");
			salary=scanner.nextInt();
			setSalary(salary);
		} 
	}
	
	void setName(String first, String last)
	{
		try {
			validateName(first,last);
		}catch(Exception e){ System.out.println("Name Exception found "+e);
			
		}
	}
	
	 void validateSal(int salary) throws InvalidAgeException {
		if (salary < 3000)
			throw new InvalidAgeException("Salary is not valid");

		else {
			System.out.println("Salary is valid, employee is approved");
			this.salary=salary;

		}

	}
	
	 void validateName(String first,String last) throws NameException
	{
		
		if(first.isEmpty()==true )
		{
			throw new NameException("First Name is empty");
		}
		else if(last.isEmpty()==true)
		{
			throw new NameException("Last name is empty");
		}
		else
			{System.out.println("hello "+first+" "+last);
			this.first=first;
			this.last=last;
			}
		

	}


	void getDetails() {
		System.out.println("Enter first name");
		String first=scanner.nextLine();
		System.out.println("Enter last name");
		String last=scanner.nextLine();
		setName(first,last);
		System.out.println("Enter salary");
		salary = scanner.nextInt();
		setSalary(salary);
		

		
	}

	
	
}




public class Exercise3{
public static void main(String args[]) {
		Employee obj=new Employee();
		Employee obj1=new Employee();

		obj.getDetails();
		obj1.getDetails();
		obj.getName();
		obj.getSalary();
		obj1.getName();
		obj1.getSalary();
	}

}
