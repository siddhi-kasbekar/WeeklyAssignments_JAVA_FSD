package com.hexaware;

public class StringDemos {

	public static void main(String[] args) {
		StringDemos s1 = new StringDemos();
		StringDemos s2 = new StringDemos();// = s1; true
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1.equals(str2)); //true - compares values as it overrides equals 
		System.out.println("hashcode"+str1 == str2 );
		String str3 = "Siddhi";//String obj created in SCP
		String str4 = "Siddhi";//same val so just creates new reference to existing obj
		System.out.println(str3.equals(str4));



	}

}
