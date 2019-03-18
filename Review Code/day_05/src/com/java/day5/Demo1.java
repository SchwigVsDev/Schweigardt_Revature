package com.java.day5;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = "hello";
		s1=s1.concat(" world");
		System.out.println(s1);//3 objects , 1 reference
		
		StringBuilder builder= new StringBuilder("hello"); 
		builder.append(" world");
		builder.deleteCharAt(4);
		System.out.println(builder);//1 object for builder, 1 reference
		
		
		
		
		
		
		
		
		
		//Garbage Collection
				//Garbage collector is a thread which is running in background
				//and removing objects from heap which don't have any reference to them
				//2 objects which are ready for garbage collection
			s1="My";	//here "hello world" is ready for garbage collection
			System.gc();
		s1=null; //here "My" is also ready for garbage collection
		System.out.println(s1);
		
		
	//Every OS has a scheduler process which is responsible for scheduling the threads.
		//So we cannot force GC to clean up the heap space.
		//But we can ask our scheduler to schedule GC,.
		
		//Runtime.getRuntime().gc();
		
		A a= new A();
		B b= new B();
		a.b= b;
		b.a= a;
		a= null; b= null;
	}
}

class A{
	
	B b;
}
class B{
	A a;
}
