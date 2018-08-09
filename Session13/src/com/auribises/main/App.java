package com.auribises.main;

import com.auribises.model.Address;
import com.auribises.model.Person;

public class App {

	public static void main(String[] args) {
		
		int i = 10; 					// Single Value Container | Show the data within it
		int[] arr = {10,20,30,40,50};   // Multi Value Container  | Show the address
										// Homogeneous
 		
		Address aRef1 = new Address();
		aRef1.setAddress("Country Homes", "Ludhiana", "Punjab", 141002);
		
		Address aRef2 = new Address();
		
		Address aRef3 = new Address("Pristine Magnum","Bengaluru","Karantaka",520001);
		
		/*aRef1.showAddress();
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
		aRef2.showAddress();
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
		aRef3.showAddress();*/
		
		Person pRef1 = new Person(); 	// Multi Value Container | Show the address
										// Hetrogeneous
		
		Person pRef2 = new Person();
		Person pRef3 = new Person("Jennie","+91 98765 98765","jennie@example.com",33,'F',aRef3);
		
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("pRef1 is: "+pRef1);
		
		System.out.println("###########################");
		
		pRef1.setDataForPerson("John","+91 99999 88888","john@example.com",30,'M',aRef1);
		pRef1.showPerson();
		
		System.out.println("###########################");
		pRef2.showPerson();
		
		System.out.println("###########################");
		pRef3.showPerson();
		
		System.out.println("<<<<<<<<<<<<>>>>>>>>>>>>");
		
		
		
		
	}

}
