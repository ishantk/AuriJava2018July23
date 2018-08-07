class Counter{
	
	// Whatever written below does not belong to class. 
	// It belongs to Object
	int count = 1;
	
	// Business Method : Will do some logical operation 
	void incrementCount(){
		count++; // count = count+1;
	}
	
	// Business Method : logical operation to read the data 
	void showCount(){
		System.out.println("count is: "+count);
	}
}

public class OOPSTest {

	public static void main(String[] args) {
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = c1;
		
		c1.incrementCount(); //2
		c2.incrementCount(); //2
		c3.incrementCount(); //3
		
		c1.incrementCount(); //4
		c1.incrementCount(); //5
		c2.incrementCount(); //3
		
		c2.incrementCount(); //4
		c2.incrementCount(); //5
		c3.incrementCount(); //6
		
		c1.incrementCount(); //7
		c2.incrementCount(); //6

		c1.showCount();  // 7
		c2.showCount();  // 6
		c3.showCount();  // 7
	}

}
