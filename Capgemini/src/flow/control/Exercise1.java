package flow.control;
import java.util.Scanner;
import java.lang.Math;
public class Exercise1 {
	static void sumOfCubes()
	{
		int num=0,temp,sum=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number:");
		num=s.nextInt();
		s.close();
		
		while(num>0)
		{
			temp=num%10;
			sum+=(Math.pow(temp,3));
			num/=10;
		}
		
		System.out.println("Sum of cubes of digit of "+num +"= "+sum);
		
	}
	public static void main(String args[])
	{
		sumOfCubes();
		
	}

}
