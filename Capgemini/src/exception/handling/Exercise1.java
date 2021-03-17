package exception.handling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String s)
	{
		super(s);
	}
	
}

public class Exercise1{
	
	static void validate(int age) throws InvalidAgeException{
		if(age<15)
			throw new InvalidAgeException("Age is not valid to enter");
		else
			{System.out.println("Age is valid, you can enter");
				vote();
			}
		
	}
	static void vote()
	{
		System.out.println("please vote");

	}
	public static void main(String args[])
	{
		getAge();
	}
	static void getAge()
	{
	int age;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your age");
	age=scanner.nextInt();
		try {
			validate(age);
		}catch(Exception e) {System.out.println("exception occured "+e);
		getAge();
}
		finally
		{
			scanner.close();
		}
	}

}
