
package stringsAndParsing;

import java.util.*;

public class Exercise1 {

	public static void main(String args[])
	{
		getInteger();
	}
	static void getInteger()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a line of integers");
		String line=scanner.nextLine();
		int sum=count(line);
		System.out.println("Sum= "+sum);
		scanner.close();
		
	}
	static int count(String line)
	{
		int sum=0;
		StringBuilder sb = new StringBuilder();
		if (line.length() > 0) {
		    sb.append(line.charAt(0));
		    for (int i = 1; i < line.length(); i++) {
		        sb.append(" ");
		        sb.append(line.charAt(i));
		    }
		}
		line = sb.toString();
		StringTokenizer st = new StringTokenizer(line);
		System.out.println(line);
		while (st.hasMoreTokens()) {
		sum=sum+Integer.valueOf(st.nextToken());}
		return sum;
	}
}
