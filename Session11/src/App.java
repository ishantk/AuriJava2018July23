
public class App {

	public static void main(String[] args) {
		
		// Object Construction Statement
		User u1 = new User();
		// u1 is not an object. u1 is a ref var which points to the object
		// object is a box which gets created in the RAM i.e. HEAP
		
		// Write Operation
		u1.name = "John Watson";
		u1.email = "john@example.com";
		u1.password = "password123";
		u1.gender = 'M';
		
		// error : we cannot write the data in private property of Object directly
		//u1.age = 30;
		//u1.phone = "+91 99999 88888";
		
		u1.setAge(20);
		u1.setPhone("+91 99999 88888");

		// Read Operation
		
		// error
		//System.out.println(u1.name+" is "+u1.age+" years old and can be called at "+u1.phone);
		
		System.out.println(u1.name+" is "+u1.getAge()+" years old and can be called at "+u1.getPhone());
	}

}
