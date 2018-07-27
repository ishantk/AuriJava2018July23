
public class DataTypes {

	public static void main(String[] args) {
		
		// Write Operation
		byte age = 30;
		
		// Read Operation
		System.out.println("age is: "+age);
		
		// Update Operation
		age = 50;
		System.out.println("age now is: "+age);
		
		float areaOfCircle = 23.45f;
		
		boolean isInternetConnected = true;
		
		char ch = 'A';
		ch = 'E';
		System.out.println("ch is: "+ch);
		
		// Copy Operation
		char rupee = ch;
		rupee = '\u20b9';
		rupee = '\u0905';
		System.out.println("rupee is: "+rupee);
		
		String name = "John Watson";
		String address = "Redwood Shores";
		System.out.println(name+" lives in "+address);

	}

}
