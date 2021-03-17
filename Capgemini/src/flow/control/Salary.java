package flow.control;
import java.util.Scanner;

public class Salary {
	public static void main(String args[])
	{
		calcSalary();
	}

	static void calcSalary()
	{
		Scanner scanner= new Scanner(System.in);
		int sal= scanner.nextInt();
		scanner.close();
		System.out.println("Expenditure= "+(sal*0.25));
		System.out.println("Savings= "+(sal*0.35));
		System.out.println("Sports= "+(sal*0.10));
		System.out.println("Charity= "+(sal*0.05));
		System.out.println("Future Savings= "+(sal*0.25));
	}
}
