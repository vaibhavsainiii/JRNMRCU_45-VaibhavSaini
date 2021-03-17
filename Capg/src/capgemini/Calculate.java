package capgemini;

import java.util.Scanner;

public class Calculate {

	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum+=i;
		}
		return sum;
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number ");
		n=s.nextInt();
		int sum= calculateSum(n);
		System.out.println("Sum= "+sum);
		s.close();
	
	}
}
