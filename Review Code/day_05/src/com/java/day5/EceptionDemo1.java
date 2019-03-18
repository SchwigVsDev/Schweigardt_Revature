package com.java.day5;

public class EceptionDemo1 {
	static String s=null;
	public static void main(String[] args) {
		//Unchecked Exceptions: These are not checked by the compiler
		//Generally due to programmatic errors.
		//Instead of catching them u shud prevent them
		int a = 5;
		int b = 0;
		
		System.out.println(a / b);//DivideByZero (ArithmeticException)
		if(s!=null) {
		System.out.println(s.length());//NullPointerException
		}
		
		int[] arr= {3,4,5};
		System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
	}
}
