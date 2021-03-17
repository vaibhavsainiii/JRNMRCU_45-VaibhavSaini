package stringsAndParsing;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=getString();
		if(checkString(s)==true)
			{
			System.out.println("Yes, it is a positive string");
			}
		else
			System.out.println("No, it is not a positive string");

	}

	static String getString()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scanner.nextLine();
		return s;
	}
	
	static Boolean checkString(String s)
	{
		s=s.toLowerCase();
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)>s.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}
}
