package stringsAndParsing;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=getInput();
		num=convert(num);
		System.out.println("final= "+num);
	}
	static int convert(int num)
	{
		int l;
		String number=String.valueOf(num);
		StringBuffer sb= new StringBuffer("");
		for(int i=1;i<(number.length()-1);i++)
		{
			int j=Integer.valueOf(String.valueOf(number.charAt(i-1)));
			int k=Integer.valueOf(String.valueOf(number.charAt(i)));
			l=Math.abs(j-k);
			String c=Integer.toString(l);
			sb.append(c);
		}
		sb.append(String.valueOf(number.charAt(number.length()-1)));
		number=sb.toString();
		num=Integer.valueOf(number);
		
		return num;
		
	}
	static int getInput()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scanner.nextInt();
		scanner.close();
		return num;
	}

}
