package com.auribises;

public class ExcDemo {

	public static void main(String[] args) {
		System.out.println("==App Started==");

		// Array of 5 integers
		int[] arr = {10,20,30,40,50};
		
		try{
			System.out.println("arr[20] is: "+arr[20]);
		}catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Some Error !!"+aRef);
			//aRef.printStackTrace();
		}
		
		int a=10,b=0,c=0;
		
		try{
			c = a/b;
		}catch(ArithmeticException aRef){
			System.out.println("Some Error !!"+aRef);
			//aRef.printStackTrace();
		}
		
		
		System.out.println("c is: "+c);
		
		
		System.out.println("==App Finished==");
	}

}
