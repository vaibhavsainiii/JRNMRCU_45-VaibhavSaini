package flow.control;
import java.util.Scanner;

public class Prime {

	static void primeNumbers()
	{
		int temp=0;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			temp=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) 
				{
					temp+=1;
				}
				
			}
			if(temp==0)
			{
				System.out.print(i+" ");
			}
		}
		s.close();
	}
	
	public static void main(String args[])
	{
		primeNumbers();
	}
}
