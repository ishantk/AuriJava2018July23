package com.auribises;

class Father{
	
	void purchaseBike(){
		System.out.println("Lets Purchase Bajaj Pulsar"); 
	}
}

class Son extends Father{
	
	public void purchaseBike(){
		super.purchaseBike();
		System.out.println("Lets Purchase Royal Enfield"); 
	}
	
}

class GrandSon extends Son{
	public void purchaseBike(){
		super.purchaseBike();
		System.out.println("Lets Purchase Harley Davidson"); 
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		
		//Son sRef = new Son();
		//sRef.purchaseBike();
		
		GrandSon gRef = new GrandSon();
		gRef.purchaseBike();

	}

}
