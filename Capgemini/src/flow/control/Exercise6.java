package flow.control;

import java.util.Scanner;

public class Exercise6 {

	static int Difference(int n)
	{
		int sumOfSquare=0,total=0,squareOfSum;
		for(int i=1;i<=n;i++)
		{
			sumOfSquare+=i*i;
			total+=i;
		}
		squareOfSum=total*total;
		return(sumOfSquare-squareOfSum);
	}
	
	public static void main(String args[])
	{
		int num,dif;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number:");
		num=s.nextInt();
		dif=Difference(num);
		System.out.println("Difference= "+dif);
		s.close();
	}
}
