package com.auribises;

interface Inf1{
	
	// Attributes
	int i=10;    // public static final int i = 10;
	
	// Methods
	void show(); // public abstract void show();
	void fun();
}


interface Inf2{
	// Methods
	void show(); // public abstract void show();
	void bye();
}

// Java Supports Multiple Inheritance -> Interface to Interface (I2I)
interface Inf3 extends Inf1, Inf2{
	
}

// This is not Multiple Inheritance -> This is multiple implementation
class CA implements Inf3{//Inf1, Inf2{

	int i = 100;
	
	public void show() {
		System.out.println("This is show");
	}
	
	public void fun() {
		System.out.println("This is fun");
	}
	
	public void bye() {
		System.out.println("This is bye");
	}
	
	void sayHello(){
		System.out.println("This is hello from CA");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		/*CA cRef = new CA();
		cRef.show();
		cRef.fun();
		cRef.sayHello();
		
		System.out.println("i is: "+Inf1.i);
		//System.out.println("i is: "+CA.i);
		System.out.println("i is: "+cRef.i);*/
		
		Inf1 i1 = new CA(); // Polymorphic Statement
		i1.show();
		i1.fun();
		//i1.bye(); err
		//i1.sayHello(); err
		
		System.out.println("-----");
		
		Inf2 i2 = new CA();
		i2.show();
		i2.bye();
		//i2.fun(); err
		//i2.sayHello(); err
		
		System.out.println("------");
		
		Inf3 i3 = new CA();
		i3.show();
		i3.fun();
		i3.bye();
		//i3.sayHello(); err
		
	}

}
