package com.exceptions;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			divide(2,0);

			
		}
		catch(ArithmeticException e){
			System.out.println("Can't divide by 0");
			
		}
		finally {
			System.out.println("Thank you!!");
		}
	}
	
	public static void divide(int a , int b) throws ArithmeticException {
		int result = a/b;
	}

}
