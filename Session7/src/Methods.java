
public class Methods {
	
	// Methods : Non Static Method
	void addNumbers(int a, int b){
		int c = a+b;
		System.out.println("sum of "+a+" and "+b+" is "+c);
	}
	
	double caluclateAreaOfCircle(double radius){
		double area = 3.14 * radius * radius;
		return area;
	}
	
	// Methods : static Method
	static int squareOfNum(int num){
		int result = num*num;
		return result;
	}

	int result(int[] arr){
		int sum = 0;
		
		// write some code here
		
		return sum;
	}
	
	// main method is executed automatically. JVM executes it !!
	public static void main(String[] args) {
			
		//int sum = m.result( ..);
		//System.out.println("sum is: "+sum);	
		
		// Execute the Methods
		// 1. Execution of Non Static Method
		
		// Object Construction Statement
		Methods m = new Methods();
		
		m.addNumbers(10, 20);
		m.addNumbers(33, 55);
		m.addNumbers(13, 17);
		
		double result = m.caluclateAreaOfCircle(3.3);
		System.out.println("Area of Circle is: "+result);
		
		result = m.caluclateAreaOfCircle(7.3);
		System.out.println("Area of Circle is: "+result);
		
		// 2. Execution of Static Methods
		
		int square = Methods.squareOfNum(5);
		System.out.println("Square of number 5 is: "+square);
		
		
	}

}
