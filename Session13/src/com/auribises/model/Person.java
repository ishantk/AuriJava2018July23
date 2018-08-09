package com.auribises.model;

// Class is a textual representation how an object will look like
// An Object is a Multi Value Container
public class Person {
	
	// Attributes : Belongs to Object
	String name;
	String phone;
	String email;
	int age;
	char gender;
	//String address;
	
	// HAS-A
	// 1 to 1
	Address address; // address is a Reference Variable
	
	// Special Method: Constructor | Same Name as that of class name and no return type
	// default constructor : because we specify default values of attributes in an object
	public Person(){
		name = "NA";
		phone = "NA";
		email = "NA";
		age = 0;
		gender = 'U';
		address = null;
	}
	
	// argument/parameterized constructor
	public Person(String n, String p, String e, int a, char g, Address ad){
		name = n;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
	}
	
	// Methods : Belongs to Objects
	public void setDataForPerson(String n, String p, String e, int a, char g, Address ad){
		name = n;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
	}
	
	public void showPerson(){
		System.out.println(name+" can be called at "+phone+" and can be emailed at "+email);
		
		if(gender == 'M'){
			System.out.println(name+" is "+age+" years old and is Male");
		}else if(gender == 'F'){
			System.out.println(name+" is "+age+" years old and is Female");
		}
		
		System.out.println(name+" lives at ");
		
		if(address!=null)
			address.showAddress();
	}
}
