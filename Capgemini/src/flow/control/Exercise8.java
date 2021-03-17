package flow.control;
import java.util.Scanner;

public class Exercise8 {
	public static void main(String ar[])
	{
		System.out.println(checkNum());
	}
	
	static boolean checkNum()
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		if(n==0)
			{
			return false;
			}
		
		while(n!=1)
		{
			if (n%2!=0)
				{
				return false;
				}
			
			n=n/2;
		}
		
		return true;
		
	}

}
