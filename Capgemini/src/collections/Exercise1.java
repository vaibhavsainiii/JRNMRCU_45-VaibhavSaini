package collections;

import java.util.*;

public class Exercise1 {

	public static void main(String args[])
	{
		HashMap<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "Vaibhav");
		map.put(3, "Capgemini");
		map.put(2, "Saini");
		List<String> list=sortHashMap(map);
		System.out.println(list);

	}
	static List<String> sortHashMap(HashMap<Integer,String> map) {
		
		List<String> list=new ArrayList<String>();
		List<Integer> keys=new ArrayList<Integer>(map.keySet());
		Collections.sort(keys);
		for(int x: keys)
			list.add(map.get(x));
		return list;
	}
}
