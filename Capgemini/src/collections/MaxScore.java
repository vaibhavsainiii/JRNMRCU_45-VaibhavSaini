package collections;

import java.util.*;

public class MaxScore {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("Enter the number of players");
		int n = Integer.parseInt(sc.next());
	
		int temp=0;
		map = getValues(map, n);

		int max=Collections.max(map.values());
		System.out.println(map);
		for(Map.Entry m : map.entrySet()){  
			if(((int)m.getValue())==max)
		    System.out.println("Maximum runs is scored by "+m.getKey()+" - "+m.getValue());  
		}
		
	

		sc.close();
	}

	static HashMap<String, Integer> getValues(HashMap<String, Integer> map, int n) {
		int runs;
		String name;
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the details of player " + i);
			name = sc.next();
			runs = Integer.parseInt(sc.next());
			map.put(name, runs);
		}
		return map;

	}
}