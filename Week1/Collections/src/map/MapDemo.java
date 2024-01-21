package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(101, "Sid");
		map.put(102, "abc");
		map.put(102, "xyz");//override abc
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k +" "+map.get(k));
		}
		
//		for (Integer i : set) {
//			System.out.println(i);
//			
//		}
	}

}
