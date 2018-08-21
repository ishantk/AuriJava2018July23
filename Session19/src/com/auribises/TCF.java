package com.auribises;

public class TCF {

	public static void main(String[] args) {
		System.out.println("==App Started==");

		// Array of 5 integers
		int[] arr = {10,20,30,40,50};
		int a=10,b=0,c=0;
		
		try{
			System.out.println("arr[2] is: "+arr[2]);
			c = a/b;
			//System.out.println("This is Awesome !!"); // will not be executed
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println("Some Error !!"+aRef);
			//aRef.printStackTrace();
		}catch(ArithmeticException aRef){
			System.out.println("Some Error !!"+aRef);
			//aRef.printStackTrace();
		}*/
		catch(Exception e){
			System.out.println("Some Error !!"+e);
			//e.printStackTrace();
		}finally{
			System.out.println("This is Awesome !!");
		}
		
		System.out.println("c is: "+c);
		
		
		System.out.println("==App Finished==");

	}

}
