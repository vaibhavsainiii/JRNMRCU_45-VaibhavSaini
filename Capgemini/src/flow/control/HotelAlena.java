package flow.control;
import java.util.Scanner;

public class HotelAlena {
	public static void main(String args[])
	{
		double bill=bill();
		System.out.println("Your bill is= $"+bill);
	}
	
	static double bill()
	{
		double amount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("----- WELCOME TO HOTEL ELENA -----");
		System.out.println("1. IDLI ($2)");
		System.out.println("2. PURI ($3)");
		System.out.println("3. DOSA ($2.5)");
		System.out.println("4. MILK ($3)");
		System.out.println("5. EXIT");
		System.out.println("\n\n Enter your favorite dish code: ");
		int code=s.nextInt();
		System.out.println("\n\n How many packets you want: ");
		int q=s.nextInt();
		s.close();
		
		if(code==1)
		{
			amount= 2*q;
		}
		else if(code==2)
		{
			amount= 3*q;
		}
		else if(code==3)
		{
			amount= 2.5*q;
		}
		else if(code==4)
		{
			amount= 3*q;
		}
		else
			System.exit(0);
		return amount;
		
	}

}
