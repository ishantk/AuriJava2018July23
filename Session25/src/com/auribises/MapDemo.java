package com.auribises;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(123, "Jennie");
		map.put(432, "Jim");
		map.put(98, "Jack");
		map.put(522, "Joe");
		map.put(444, "John");
		map.put(432, "Mike");
		map.put(111, null);
		
		map.put(null, "Leo");
		
		
		System.out.println(map);
		
		System.out.println(map.get(123));
		
		System.out.println(map.size());
		
		if(map.containsKey(101)){
			System.out.println("101 key exists");
		}
		
		if(map.containsValue("Mike")){
			System.out.println("Mike is in the map");
		}
		
		map.remove(101);
		
		System.out.println(map);
		
		// Iterate in HashMap : Read All
		Set<Integer> keys = map.keySet();
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		
		// Hashtable is THREAD-SAFE
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "John");
		table.put(123, "Jennie");
		table.put(432, "Jim");
		table.put(98, "Jack");
		table.put(522, "Joe");
		table.put(444, "John");
		table.put(432, "Mike");
		
		// null key and null value not allowed in Hashtable !!
		//table.put(null, "Leo");
		//table.put(111, null);
		
		System.out.println(table);

	}

}
