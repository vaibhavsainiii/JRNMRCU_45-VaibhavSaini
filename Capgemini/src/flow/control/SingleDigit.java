package flow.control;
import java.util.Scanner;

public class SingleDigit {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		System.out.println(lastDigit(n));
		scanner.close();
	}
	
	static int lastDigit(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				sum=sum+n%10;
				n=n/10;
			}
			n=sum;
		}
		return n;
	}

}
