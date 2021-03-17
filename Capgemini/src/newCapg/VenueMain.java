package newCapg;
import java.util.Scanner;

public class VenueMain {

	static void doSomething()
	{
		Venue obj=new Venue();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter venue name: ");
		String name=scanner.nextLine();
		obj.setName(name);
		
		System.out.println("Enter the city: ");
		String city=scanner.nextLine();
		obj.setCity(city);
		
		
		scanner.close();
		obj.getDetails();
	}
	public static void main(String args[]) {
		doSomething();
	}
}


