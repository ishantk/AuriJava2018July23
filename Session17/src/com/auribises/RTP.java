package com.auribises;

/*class Shape{
	
	Shape(){
		System.out.println("==Shape Object Constructed==");
	}
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}*/

// Refined RTP
/*abstract class Shape{
	
	Shape(){
		System.out.println("==Shape Object Constructed==");
	}
	
	// can be created only in abstract class
	// it is a rule or a protocol, created by parent
	// if thr are n abstract methods, all of them must be defined by child
	abstract void draw();
	
	void fun(){
		System.out.println("This is fun");
	}
}*/

// RTP -> Most Refined Way
interface Shape{
	
	// error
	/*Shape(){
		System.out.println("==Shape Object Constructed==");
	}*/

	// it is a rule or a protocol, created by not by parent
	// if thr are n abstract methods, all of them must be defined by the one who implements it
	void draw(); // -> public abstract void draw(); 
	
	// error
	/*void fun(){
		System.out.println("This is fun");
	}*/
}

class Circle implements Shape{ //extends Shape{
	
	Circle(){
		System.out.println("==Circle Object Constructed==");
	}
	
	public void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Rectangle implements Shape{ // extends Shape{
	
	Rectangle(){
		System.out.println("==Rectangle Object Constructed==");
	}
	
	public void draw(){
		System.out.println("Drawing a Rectangle");
	}
}

class Triangle implements Shape{ //extends Shape{
	
	Triangle(){
		System.out.println("==Triangle Object Constructed==");
	}
	
	public void draw(){
		System.out.println("Drawing a Triangle");
	}
}

public class RTP {

	public static void main(String[] args) {
		
		/*Shape s;
		s = new Shape();
		s.draw();*/
		
		//Circle c;
		//c = new Circle();
		//c.draw();
		
		Shape s;
		// Parent's Ref can point to the object of child
		// Ref Var of Interface can point to the object which implements it
		s = new Circle(); // Polymorphic Statement
		s.draw();

		System.out.println(">>>>>>>><<<<<<<<<");
		
		s = new Triangle();
		s.draw();
		
		System.out.println(">>>>>>>><<<<<<<<<");
		
		s = new Rectangle();
		s.draw();
			
		System.out.println(">>>>>>>><<<<<<<<<");
		//s = new Shape(); error
		//s.draw();
		
	}

}
