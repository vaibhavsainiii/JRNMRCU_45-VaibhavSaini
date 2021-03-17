package collections;
import java.util.*;

public class Exercise4 {

	public static void main(String args[])
	{
		HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
		HashMap<Integer, String> medal=new HashMap<Integer,String>();
		map.put(1,50);
		map.put(2,80);
		map.put(3,89);
		map.put(4,60);
		map.put(5,99);



		medal=putMedal(map);
		System.out.println(medal);
	}
	
	static HashMap<Integer,String> putMedal(HashMap<Integer,Integer> map)
	{
		HashMap<Integer, String> medal=new HashMap<Integer,String>();
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
		{
			if(entry.getValue()>=90)
			{
				medal.put(entry.getKey(),"Gold");
			}
			else if(entry.getValue()>=80)
			{
				medal.put(entry.getKey(),"Silver");
			}
			else if(entry.getValue()>=70)
			{
				medal.put(entry.getKey(),"Bronze");
			}
			
		}
            
		return medal;
	}
}
