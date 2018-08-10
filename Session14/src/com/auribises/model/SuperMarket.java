package com.auribises.model;

public class SuperMarket {
	
	String name;
	String address; 
	Product[] products; // HAS-A | 1 to many
	
	public SuperMarket() {
		name = "ABC Super Store";
		address = "Redwood Shores";
		products = new Product[3];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public void showSuperMarketDetails(){
		System.out.println("====Welcome=====");
		System.out.println("===="+name+"=====");
		System.out.println("===="+address+"=====");
		
		for(Product p : products){
			p.showProductDetails();
		}
	}
}
