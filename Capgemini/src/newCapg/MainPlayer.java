package newCapg;
import java.util.Scanner;

public class MainPlayer {

	static void doSomething()
	{
		Player obj=new Player();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the player name: ");
		String player=scanner.nextLine();
		obj.setName(player);
		
		System.out.println("Enter the country name: ");
		String country=scanner.nextLine();
		obj.setCountry(country);
		
		System.out.println("Enter the skill: ");
		String skill=scanner.nextLine();
		obj.setSkill(skill);
		scanner.close();
		obj.getDetails();
	}
	public static void main(String args[]) {
		doSomething();
	}
}
