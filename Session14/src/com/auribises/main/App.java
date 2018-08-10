package com.auribises.main;

import com.auribises.model.Product;
import com.auribises.model.SuperMarket;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int ph = 90;
		int mt = 85;
		int ch = 95;
		
		// Collection : Homogeneous Collection of Fixed Size i.e. Array
		//int[] marks = {90, 85, 95};
		int[] marks = new int[3];
		marks[0] = 90;
		marks[1] = 85;
		marks[2] = 95;
		
		Product p1 = new Product(101,"Samsung LED",50000);
		Product p2 = new Product(201,"iPhone",70000);
		Product p3 = new Product(301,"Shoes",5000);
		
		p1.showProductDetails();
		p2.showProductDetails();
		p3.showProductDetails();
		
		//int total = p1.getPrice()+p2.getPrice()+p3.getPrice();
		int total = p1.price+p2.price+p3.price;

		// Collection: Homogeneous Collection of Fixed Size i.e. Array
		// array of Object
		Product[] pArr = new Product[3];
		
		pArr[0] = new Product(101,"Samsung LED",50000);
		pArr[1] = new Product(201,"iPhone",70000);
		pArr[2] = new Product(301,"Shoes",5000);
		
		System.out.println("pArr is "+pArr+" and size is: "+pArr.length);
		System.out.println("pArr[0] is: "+pArr[0]);
		System.out.println("pArr[1] is: "+pArr[1]);
		System.out.println("pArr[2] is: "+pArr[2]);
		
		Product[] myArr = pArr; // reference copy
		
		//myArr[0].setName("Samsung Curve LED");
		//myArr[0].showProductDetails();
		
		/*for(Product p : pArr){
			p.showProductDetails();
		}*/
		
		SuperMarket market = new SuperMarket();
		market.setProducts(pArr);
		market.showSuperMarketDetails();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Products you wish to add");
		int size = scanner.nextInt();
		
		System.out.println("size is: "+size);
		
		System.out.println("Hello, Whats your name ?");
		String name = scanner.nextLine();
		
		System.out.println("Welcome, "+name+" to SuperMarket");
		
		scanner.close(); // remove the object from memory
	}

}
