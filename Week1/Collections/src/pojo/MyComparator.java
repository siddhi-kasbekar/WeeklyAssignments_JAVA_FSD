package pojo;

import java.util.Comparator;

public class MyComparator implements Comparator<Book> {

	@Override
	public int compare(Book b1,Book b2) {
		String s1 = b1.toString();
		String s2 = b2.toString();
		
		return s1.compareTo(s2);
	}

}
