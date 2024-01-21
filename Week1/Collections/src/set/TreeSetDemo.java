package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		
		set.add("sid");
		set.add("A");
		set.add("b");
		System.out.println(set);
	}

}
