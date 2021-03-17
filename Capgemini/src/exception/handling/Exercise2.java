package exception.handling;

import java.util.Scanner;

//this program is integrated with exercise 3 in exercise3.java

class NameException extends Exception{
	NameException(String s)
	{
		super(s);
	}
}
public class Exercise2 {

	static void validate(String first,String last) throws NameException
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
			System.out.println("hello "+first+" "+last);

	}
	
	static void getName()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your first name");
		String first=scanner.nextLine();
		System.out.println("Enter your last name");
		String last=scanner.nextLine();
		try {
			validate(first, last);
		}catch(Exception e){ System.out.println(" Name Exception found "+e);
			
		}
	}
	
	public static void main(String args[])
	{
		getName();
	}
	
}
