package com.auribises.model;

// Bean or Model or POJO
public class Product {
	
	// Attributes
	int pid;
	String name;
	public int price;
	
	// Constructor
	public Product() {
		pid = 0;
		name = "NA";
		price = 0;
	}

	public Product(int pid, String name, int price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
		// this is a ref var which points to the current object
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showProductDetails(){
		System.out.println(">>>>>>>>><<<<<<<<<<<<");
		System.out.println("Product "+pid);
		System.out.println(name+" | \u20b9"+price);
		System.out.println(">>>>>>>>><<<<<<<<<<<<");
	}
	
}
