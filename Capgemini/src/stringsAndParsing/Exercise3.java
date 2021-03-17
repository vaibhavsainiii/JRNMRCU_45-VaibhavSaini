package stringsAndParsing;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String args[])
	{
		alphabet();
	}
	static void alphabet()
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scanner.next();
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		for(int i=0;i<sb.length();i++)
		{
			if(sb.charAt(i)=='a'||sb.charAt(i)=='A'||sb.charAt(i)=='e'
					||sb.charAt(i)=='E'||sb.charAt(i)=='i'
					||sb.charAt(i)=='I'||sb.charAt(i)=='o'
					||sb.charAt(i)=='O'||sb.charAt(i)=='u'
					||sb.charAt(i)=='U')
			{
				continue;
				
			}
			else
			{
				//store ASCII value of sb[i] into a
				int a=(int)(sb.charAt(i));
				//store character value of (incremented a) into c
				char c=(char)(a+1);
				//replacing sb[i] with c 
				sb.setCharAt(i,c);
				
			}
			
		}
		System.out.println(sb);
	}

}
