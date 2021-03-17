package collections;
import java.util.HashMap;

public class Exercise3 {

	public static void main(String args[])
	{
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		int[] arr= {2,4,3,52,6};
		map=doSquare(arr);
		System.out.println(map);
	}
	
	static HashMap<Integer,Integer> doSquare(int[] arr)
	{
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],arr[i]*arr[i]);
			
		}
		return map;
	}
}
