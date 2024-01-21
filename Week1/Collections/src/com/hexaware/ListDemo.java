package com.hexaware;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);// new Integer(30);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(10);
		//list.add(null);
//		System.out.println(list);
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
//		//or
//		for(Integer i : list) {
//			System.out.println(i);
//			
//		}
		
		Stream<Integer> stream = list.stream();
		Integer result = stream.reduce((a,b)->{return a+b;}).orElse(0);
		System.out.println(result);
		
		
		
		
	}

}
