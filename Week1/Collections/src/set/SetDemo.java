package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("sid");
		set.add(null);
		set.add("a");
		System.out.println(set);//order based on hashcode
		
		for (String str : set) {
			System.out.println(str);
			
		}
	}

}
