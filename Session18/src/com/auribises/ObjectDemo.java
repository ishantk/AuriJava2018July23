package com.auribises;

class Student{ //extends Object{
	int roll;
	String name;
	
	public String toString(){
		return "This is Awsome";
	}
}

class X{
	
}

class Y extends X{
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.getClass());
		System.out.println(s1.getClass().getName());
		System.out.println(s1.getClass().getSimpleName());
		
		System.out.println("hashcode of s1 "+s1.hashCode());
		
		System.out.println("s1 is: "+s1); // -> System.out.println("s1 is: "+s1.toString());
		System.out.println("s1 is: "+s1.toString());
		
		String str = "Hello";
		System.out.println("str is: "+str);
		
		Object o = new Student();
		o = new String("Hello");
	}

}
