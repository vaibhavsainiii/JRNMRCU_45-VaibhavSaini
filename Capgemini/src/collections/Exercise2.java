package collections;

import java.util.HashMap;

public class Exercise2 {

	public static void main(String args[])
	{
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		char[] arr= {'a','a','f','v','e','f','r','s'};
		map=countChars(arr);
		System.out.println(map);
	}
	
	static HashMap<Character,Integer> countChars(char[] arr)
	{
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count=count+1;
				}
			}
			map.put(arr[i],count);
			
		}
		return map;
	}
}
