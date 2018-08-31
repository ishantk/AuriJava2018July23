package com.auribises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("John");	//0 index
		list.add("Jennie");
		list.add("Jim");
		list.add("John");  // duplicated data is allowed in ArrayList
		list.add("Jack");
		list.add("Joe");   //n-1 index
		System.out.println(list);
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("John");	
		set.add("Jennie");
		set.add("Jim");
		set.add("John");  // duplicated data is not allowed in HashSet
		set.add("Jack");
		set.add("Joe");   
		System.out.println(set);
		
		String name = list.get(2);
		System.out.println("name is: "+name);
		
		// we cannot get the element from HashSet as we dont know the index
		// In HashSet indexing wont work rather Hashing works where we have hashcode for every element
		
		// Iterating in HashSet : Read All elements one by one in HashSet
		System.out.println("****************");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(nm);
		}
		System.out.println("****************");	
		
		System.out.println("Size of set is: "+set.size());
		if(set.contains("John")){
			System.out.println("John is in the Set");
		}
		
		set.remove("John");
		System.out.println(set);
		//set.clear();
		//System.out.println(set);
	}

}
