class Product{
	String name;
	String brand;
	int code;
	int price;
	float weight;
}

public class App {

	public static void main(String[] args) {
		
		int i = 10;
		int[] arr = {10,20,30,40,50};
		
		// Object Construction Statement
		User u1 = new User();
		//Product p1 = new Product();
		
		System.out.println("i is: "+i);
		System.out.println("arr is: "+arr);
		System.out.println("u1 is: "+u1);
		
		// u1 is a reference variable, and not an object
		// new will create the object dynamically i.e. at run time in the Heap Area of RAM
		// u1 will hold the address of the object created by new

		// Run time entity | Instance of Class
		// Object is just a Multi Value Container i.e. a BOX
		User u2 = new User();
		System.out.println("u2 is: "+u2);
		
		User u3 = u1; // reference copy
		System.out.println("u3 is: "+u3);
		
		// Write the data in object
		u1.name = "John";
		u1.phone = "+91 99999 88888";
		u3.email = "john@example.com";
		u3.age = 30;
		u1.gender = 'M';
		u1.address = "Redwood Shores";
		
		u2.name = "Sia";
		u2.phone = "+91 99999 77777";
		u2.email = "sia@example.com";
		u2.age = 32;
		u2.gender = 'F';
		u2.address = "Country Homes";
		
		// Read data from Object
		System.out.println(u1.name+" is "+u3.age+" years old and lives in "+u1.address);
		System.out.println(u3.name+" can be called at "+u1.phone);
		
		System.out.println("*******************");
		
		// Update data in Object (Overwriting the previous value)
		u2.name = "Sia Watson";
		u2.age = 33;
		
		System.out.println(u2.name+" is "+u2.age+" years old and lives in "+u2.address);
		System.out.println(u2.name+" can be called at "+u2.phone);
		
		
	}

}
