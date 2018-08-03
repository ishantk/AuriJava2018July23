
public class Methods {

	// Non Static Method
	void addNumbers(int a, int b){
		int c = a+b;
		System.out.println("c is: "+c);
	}
	
	// Method with return type or ack
	int wholeSquare(int a, int b){
		int ws = (a*a)+(b*b)+(2*a*b);
		return ws;
	}
	
	// Static Method
	static void squareOfNumber(int a){
		int sq = a*a;
		System.out.println("square is: "+sq);
	}
	
	public static void main(String[] args) {
		
		// Create object to execute non static method
		Methods m = new Methods();
		m.addNumbers(10, 20);
		m.addNumbers(30, 40);
		
		int result = m.wholeSquare(12, 16);
		System.out.println("Result is: "+result);
		System.out.println("Result is: "+m.wholeSquare(12, 13));
		
		Methods.squareOfNumber(31);
	}

}
