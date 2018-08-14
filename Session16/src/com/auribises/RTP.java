package com.auribises;

/*class Cab{
	Cab(){
		System.out.println("==Cab Object Created==");
	}
	
	void bookCab(){
		System.out.println("==Cab Booked, Arriving Soon==");
	}
}*/

// One step more towards refinement of RTP
// Which cannot have objects
abstract class Cab{
	Cab(){
		System.out.println("==Cab Object Created==");
	}
	
	// which cannot have definition
	// it is a rule, which children must define
	abstract void bookCab();
	
	void fun(){
		System.out.println("This is fun");
	}
}

class UberGo extends Cab{ // IS-A Relation
	UberGo(){
		System.out.println("==UberGo Object Created==");
	}
	
	void bookCab(){
		System.out.println("==UberGo Booked, Arriving Soon==");
	}
}

class UberX extends Cab{ // IS-A Relation
	UberX(){
		System.out.println("==UberX Object Created==");
	}
	
	void bookCab(){
		System.out.println("==UberX Booked, Arriving Soon==");
	}
}

class UberMoto extends Cab{ // IS-A Relation
	UberMoto(){
		System.out.println("==UberMoto Object Created==");
	}
	
	void bookCab(){
		System.out.println("==UberMoto Booked, Arriving Soon==");
	}
}

public class RTP {

	public static void main(String[] args) {

		//UberGo uGo = new UberGo();
		//uGo.bookCab();
		
		// Polymorphic Statement
		// Ref Var of Parent is pointing to the object of child
		Cab cRef;
		
		cRef = new UberGo();
		cRef.bookCab();
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<<");
		
		cRef = new UberX();
		cRef.bookCab();
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<<");
		
		cRef = new UberMoto();
		cRef.bookCab();
		
		System.out.println(">>>>>>>>>>>><<<<<<<<<<<<<");
		
		//cRef = new Cab(); // error
		//cRef.bookCab();
	}

}
