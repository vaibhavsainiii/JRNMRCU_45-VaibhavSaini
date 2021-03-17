package Practice;
import java.util.Scanner;

public class Fabonacci {
	static int a=0,b=1,c;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the length:");
		int num=s.nextInt();
		System.out.print(a+" "+b);
		Fabonacci obj=new Fabonacci();
		obj.rec(num);
	}
	
	void rec(int n)
	{
		if(n>=3)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			n=n-1;
			rec(n);
		} 
	}
	
}




