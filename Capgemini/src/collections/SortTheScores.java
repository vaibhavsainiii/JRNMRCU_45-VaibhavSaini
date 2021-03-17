package collections;
import java.util.*;

public class SortTheScores {

	public static void main(String args[])
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr=getMatches();
		arr=sort(arr);
		for(int runs: arr)
		System.out.println(runs);
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
	
	
	
	static ArrayList<Integer> sort(ArrayList<Integer> arr)
	{
		Collections.sort(arr);
		return arr;

	}
}
