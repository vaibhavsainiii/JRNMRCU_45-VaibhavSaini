package collections;

import java.util.*;

public class SumAndAverage {

	public static void main(String args[])
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr=getMatches();
		calculate(arr);
	}
	
	static ArrayList<Integer> getMatches()
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Number of matches?");
		int a=scanner.nextInt();
		
		for(int i=1;i<=a;i++)
		{
			System.out.println("Runs Scored in "+i+"th Match?");
			int run=scanner.nextInt();
			arr.add(run);
		}
		return arr;
	}
	
	
	
	static void calculate(ArrayList<Integer> arr)
	{
		int total=0;
		for(int i=0;i<arr.size();i++)
		{
			total+=arr.get(i);
		}
		System.out.println("Total="+total);
		float average=total/arr.size();
		System.out.println("Average="+average);

	}
}
