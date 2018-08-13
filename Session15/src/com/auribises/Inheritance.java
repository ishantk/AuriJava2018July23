package com.auribises;

class Product{
	
	// Attributes | Property of Object (non static)
	int pid;
	String name;
	int price;
	String brand;
	int weight;
	
	// Attributes | Property of Class (static)
	static String businessName;
	
	// Default Constructor
	Product(){
		System.out.println("==Product Object Created==");
	}
	
	// Parameterized Constructor
	Product(int p, String n, int pr, String b, int w){
		pid = p;
		name = n;
		price = pr;
		brand = b;
		weight = w;
	}
	
	// Method
	void setProductDetails(int p, String n, int pr, String b, int w){
		pid = p;
		name = n;
		price = pr;
		brand = b;
		weight = w;
	}
	
	// Method
	void showProductDetails(){
		System.out.println("======="+pid+" | "+name+" Details======");
		System.out.println("Price :\t \u20b9"+price);
		System.out.println("Brand :\t "+brand);
		System.out.println("Weight : "+weight);
		System.out.println("===============================");
	}
	
	static void showBusinessName(){
		System.out.println("Buiness name is: "+businessName);
	}
}

class TV extends Product{
	
	int screenSize;
	String type;
	
	TV(){
		System.out.println("==TV Object Created==");
	}
	
	// Method Overloading
	void setProductDetails(int p, String n, int pr, String b, int w, int ss, String t){
		pid = p;
		name = n;
		price = pr;
		brand = b;
		weight = w;
		screenSize = ss;
		type = t;
	}
	
	// Method Overriding
	void showProductDetails(){
		System.out.println("======="+pid+" | "+name+" Details======");
		System.out.println("Price :\t \u20b9"+price);
		System.out.println("Brand :\t "+brand);
		System.out.println("Weight : "+weight);
		System.out.println("ScreenSize : "+screenSize);
		System.out.println("Type : "+type);
		System.out.println("===============================");
	}
}

class Phone extends Product{
	Phone(){
		System.out.println("==Phone Object Created==");
	}
}

class Shoe extends Product{
	Shoe(){
		System.out.println("==Shoe Object Created==");
	}
}

public class Inheritance {

	public static void main(String[] args) {

		TV tRef = new TV();
		tRef.setProductDetails(101, "LED TV", 50000, "Samsung", 5, 50, "Curved LED");
		tRef.showProductDetails();
		System.out.println(">>>>>>>><<<<<<<<<");
		
		Phone pRef = new Phone();
		pRef.setProductDetails(201, "iPhone X", 80000, "Apple", 1);
		pRef.showProductDetails();
		System.out.println(">>>>>>>><<<<<<<<<");
		
		Shoe sRef = new Shoe();
		sRef.setProductDetails(301, "AlphaBounce", 7000, "Adidas", 1);
		sRef.showProductDetails();

		TV.businessName = "Amazon";
		TV.showBusinessName();
		
		Phone.businessName = "Flipkart";
		
		Phone.showBusinessName();
		TV.showBusinessName();
		
	}

}
