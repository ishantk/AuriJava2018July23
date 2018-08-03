
public class Overloading {

	void addNums(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
	}
	
	// error
	/*void addNums(int p, int q){
		int c = p+q;
		System.out.println("c is: "+c);
	}*/
	
	// error
	/*int addNums(int a, int b){
		int c = a+b;
		return c;
	}*/
	
	void addNums(int a, int b, int c){
		int d = a+b+c;
		System.out.println("d is: "+d);
	}
	
	void addNums(double a, double b){
		double c = a+b;
		System.out.println("c is: "+c);
	}
	
	void addNums(int a, double b){
		double c = a+b;
		System.out.println("c is: "+c);
	}
	
	void addNums(double a, int b){
		double c = a+b;
		System.out.println("c is: "+c);
	}
	
	
	// Rules to Overload
	// 1. Method Name should be same
	// 2. Signature (Inputs) should be different and unique
		// 2.1 Inputs/Arguments should increase or decrease in number
		// 2.2 Inputs/Arguments can have different types
		// 2.3 Inputs/Arguments can have different sequence 
	// 3. Return type has no role to play
	
	public static void main(String[] args) {
	
		Overloading o = new Overloading();
		o.addNums(10, 20);
		o.addNums(10, 20, 30);
		o.addNums(2.2, 3.3);
		o.addNums(2.2, 10);
		o.addNums(20, 3.3);
	}

}
