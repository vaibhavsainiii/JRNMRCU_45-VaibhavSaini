package flow.control;
import java.util.Scanner;


public class Exercise2 {

	static void light()
	{
		System.out.println("Please enter a colour- Red, Yellow, Green: ");
		Scanner scanner=new Scanner(System.in);
		String colour= scanner.nextLine();
		if(colour.equals("Red"))
		{
			System.out.println("Stop");
		}
		else if(colour.equals("Yellow"))
		{
			System.out.println("Ready");
		}
		else if(colour.equals("Green"))
		{
			System.out.println("Go");
		}
		scanner.close();
	}
	public static void main(String args[])
	{
		light();
	}
}
