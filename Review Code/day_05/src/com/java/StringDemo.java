package com.java;

public class StringDemo {

	public static void main(String[] args) {
		Object o1= new Object();
		Object o2= new Object();
		System.out.println(o1==o2);//false
		System.out.println(o1.equals(o2));//false
		
		
		String s1= "Hello";//String literal: Literal pool (permgenspace)
		String s2= new String("Hello");// object: heap
		String s3= "Hello";
		String s4= new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		
		
		
		String str="Hello World";
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf("llo"));
		System.out.println(str.compareTo("hello World"));
		str=str.concat("abc");
		System.out.println(str);
		System.out.println(str.contains("lo"));
		System.out.println(str.endsWith("d"));
		String[] arr=str.split(" ");
	//	str=str.substring(3);
		str= str.substring(3, 5);
	}

}
