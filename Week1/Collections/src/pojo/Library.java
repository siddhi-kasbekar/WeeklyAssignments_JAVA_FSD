package pojo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Library {
	public static void main(String[] args) {
		Set<Book> lib = new TreeSet<Book>(new MyComparator());
		lib.add(new Book(1001,"verity",400));
		lib.add(new Book(1002,"ikigai",200));
		lib.add(new Book(1002,"powe of subconscious mind",250));
		lib.add(new Book(1003,"silent patient",300));
		
//		System.out.println(lib);
		
		for (Book b : lib) {
			System.out.println(b);
			
		}

	}

}
