package flow.control;
import java.util.Scanner;

public class Exercise3 {
	int a=1,b=1,c,n;
	int a1=1,b1=1,c1;
	void print()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the nth term: ");
		n= s.nextInt();
		
		for(int i=0;i<=n-3;i++)
		{
			c1=a1+b1;
			a1=b1;
			b1=c1;
		}
		System.out.println("Normal method= "+c1 );
		
		rec(n);
		System.out.println("recursive output= "+c);
		s.close();
	}
	void rec(int n)
	{
		if(n>=3)
		{
			c=a+b;
			a=b;
			b=c;
			n=n-1;
			rec(n);
		} 
		
	}

	public static void main(String args[])
	{
		Exercise3 obj= new Exercise3();
		obj.print();
	}
}
