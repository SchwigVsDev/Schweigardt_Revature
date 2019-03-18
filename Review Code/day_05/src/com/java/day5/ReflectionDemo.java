package com.java.day5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException {
		Class obj=Class.forName("com.java.SqlClass");
		Constructor cons=obj.getConstructor(Integer.class, Integer.class);
		Object sqlClassObj1=cons.newInstance(2,3);
		
		Field i=obj.getDeclaredField("x");
		i.setAccessible(true);
		System.out.println(i.getInt(sqlClassObj1));
		Constructor privateCons=obj.getDeclaredConstructor();
		privateCons.setAccessible(true);
		Object sqlClassObj2=privateCons.newInstance();
		
		//Public methods of this class and superclasses
		Method[] methods= obj.getMethods();
		
		//All the methods of only this class
		Method[] methods_declared=obj.getDeclaredMethods();
		/*Xyz obj= new Xyz();
		System.out.println(obj.x);*/
	}
}

class Xyz{
	int x;
}