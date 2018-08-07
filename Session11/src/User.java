// Textual Representation of an Object
// Whatever we are writing in class, it actually goes in the object
public class User {
	
	// Attributes or Property : Belongs to Object and not to Class
	String name;
	String email;
	String password;
	private int age;
	char gender;
	private String phone;
	
	// Method
	
	// Setters and Getters
	void setAge(int a){
		age = a;
	}
	
	void setPhone(String p){
		phone = p;
	}
	
	int getAge(){
		return age;
	}
	
	String getPhone(){
		return phone;
	}
}
