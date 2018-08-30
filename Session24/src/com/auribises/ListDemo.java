package com.auribises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

class Student{
	int roll;
	String name;
	String address;
	
	public String toString() {
		return "[Student is: "+roll+"\t"+name+"\t"+address+"]";
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		// Single Value Container
		int i = 10;
		
		// Multi Value Container
		int[] arr = {10,20,30,40,50}; // Homogeneous with fixed size
		
		//Hetrogeneous
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "Mike";
		s1.address = "Redwood Shores";
		
		Student s2 = new Student();
		s2.roll = 201;
		s2.name = "Leo";
		s2.address = "Country Homes";
		
		// Collection of Students i.e. create an Array
		Student[] sArr = new Student[5];
		
		// Only biggest challenge with Collection (Array) is that Size is Fixed
		
		// Data Structure: Size is not fixed, they can grow and shrink dynamically
		// 1 List
		// 2 Set
		// 3 Queue
		// 4 Map
		
		// List is an interface and ArrayList is a class which implements List interface
		
		// 1. Creating a List
		
		//List list1 = new ArrayList();  	// Polymorhic Statement
		// we can store any type of in the form of Object
		ArrayList list1 = new ArrayList(); 	// Direct Object Construction | RAW Type
		ArrayList<String> list2 = new ArrayList<String>(); // Generic Type
		ArrayList<Student> list3 = new ArrayList<Student>();
		
		// 2. Adding Data in List
		// it starts from 0th index and keeps on growing automatically
		//list1.add(0,100); 	//0
		list1.add(100); 	//0
		list1.add("John");	//1
		list1.add(s1);		//2
		list1.add('A');		//3
		list1.add("Jennie");//4
		list1.add(23.33);	//5

		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("Jack");
		list2.add("Joe");
		list2.add("John"); // duplicacy is allowed
		//list2.add(100); // error
		
		list3.add(s1);
		list3.add(s2);
		
		//3. Read the Data
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		//4. Read Single Element
		Object o = list1.get(3);
		String name = list2.get(1);
		Student stu = list3.get(0);
		        
		System.out.println(o);
		System.out.println(name);
		System.out.println(stu);
		
		//5. Get the Size
		int l1 = list1.size();
		int l2 = list2.size();
		int l3 = list3.size();
		
		System.out.println(l1+"\t"+l2+"\t"+l3);
		
		//6. Remove the element
		list2.remove(2);
		System.out.println(list2);
		
		//7. Update the element
		list2.set(2, "Jack Watson");
		System.out.println(list2);
		
		//8. Check for element
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		int idx = list2.indexOf("John");
		System.out.println("Index of John is: "+idx);
		idx = list2.lastIndexOf("John");
		System.out.println("Last Index of John is: "+idx);
		
		//9. Add List to a List
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mike");
		names.add("Leo");
		names.add("George");
		
		list2.addAll(names);
		System.out.println(names);
		System.out.println(list2);
		
		// 10. Clear All
		//list2.clear();
		
		// 11. Iterating in the List
		// 11.1 For Loop
		System.out.println("====For Loop====");
		for(i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		// 11.2 Enhanced For Loop
		System.out.println("====Enhanced For Loop====");
		for(String str : list2){
			System.out.println(str);
		}
		System.out.println(">>>><<<<");
		for(Object o1 : list1){
			System.out.println(o1);
		}
		System.out.println(">>>><<<<");
		for(Student s : list3){
			System.out.println(s);
		}
		
		// 11.3 Iterator 
		System.out.println("====Iterator====");
		Iterator<String> itr = list2.iterator();
		//System.out.println(itr.next());
		//System.out.println(itr.next());
		
		while(itr.hasNext()){
			String name1 = itr.next();
			System.out.println(name1);
			if(name1.equals("Jennie")){
				itr.remove(); // remove the element from list
			}
		}
		
		// 11.4 ListIterator
		System.out.println("====ListIterator====");
		ListIterator<String> listItr = list2.listIterator();
		while(listItr.hasNext()){
			String name1 = listItr.next();
			System.out.println(name1);
		}
		System.out.println("---------");
		while(listItr.hasPrevious()){
			String name1 = listItr.previous();
			System.out.println(name1);
		}
		
		// 11.5 Enumeration
		System.out.println("====Enumeration====");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String name1 = enm.nextElement();
			System.out.println(name1);
		}
		
		// Vector is THREAD SAFE i.e. Synchronized 
		Vector<String> vector = new Vector<String>();
		vector.add("Mike");
		vector.add("Leo");
		vector.add("George");
		
		System.out.println(vector);
	}

}
