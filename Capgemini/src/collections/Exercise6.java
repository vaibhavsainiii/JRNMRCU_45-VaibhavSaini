package collections;
import java.util.*;

public class Exercise6 {

	public static void main(String args[])
	{
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		List<Integer> list=new ArrayList<Integer>();
		map.put(1,17);
		map.put(2,30);
		map.put(3,16);
		map.put(4,3);
		map.put(5,60);



		list=putMedal(map);
		System.out.println(list);
	}
	
	static List<Integer> putMedal(HashMap<Integer,Integer> map)
	{
		List<Integer> list=new ArrayList<Integer>();

		for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
		{
			if(entry.getValue()>=18)
			{
				list.add(entry.getKey());
			}
			
		}
            
		return list;
	}
}
