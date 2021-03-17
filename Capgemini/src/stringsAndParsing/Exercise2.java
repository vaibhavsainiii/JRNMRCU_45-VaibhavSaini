package stringsAndParsing;
import java.util.*;
public class Exercise2 {

	public static void main(String args[])

	{
		getString();
	}
	
	static void getString()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=scanner.next();
		StringBuilder sb = new StringBuilder();
		String s1="";
		sb.append(s);
		sb.reverse();
		System.out.println(s+"|"+sb);

		
	}
}
