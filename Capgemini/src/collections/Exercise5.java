package collections;

import java.util.ArrayList;
import java.util.*;

public class Exercise5 {

public static void main(String args[])
{
	int secondSmallest;
	int[] arr= {2,4,2,4,2,11,46,57};
	secondSmallest=getSecondSmallest(arr);
	System.out.println(arr+" second smallest element is: "+secondSmallest);

}

	static int getSecondSmallest(int[] arr) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int a:arr)
			al.add(a);
Collections.sort(al);
int secondSmallest=0;

int smallest=al.get(0);

for(int i=0;i<al.size()-1;i++)
{
	if(smallest<al.get(i))
	{
		secondSmallest=al.get(i);
		return secondSmallest;
	}
	}
return secondSmallest;

	}
}
