package com.hexaware;

public class StringModification {

	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println(s1.hashCode());

		s1 = s1.concat("world");//hello become unreferenced s1 points to hello world obj now
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer sb1 = new StringBuffer("hello");
		sb1.append(" world !");
		System.out.println(sb1);
		
		String n1 = new String("B");//65
		String n2 = new String("A");//66
		System.out.println(n1.compareTo(n2));//compare val 65-66 = -1 bcoz already in sorted order
	}

}
