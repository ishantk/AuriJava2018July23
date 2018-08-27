import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	// Attributes
	int roll;
	String name;
	transient String address;
	
	public Student() {
	
	}

	public Student(int roll, String name, String address) {
		this.roll = roll;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
}


public class SerializarionDemo {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		/*Student s1 = new Student();
		s1.roll = 101;
		s1.name = "John";
		s1.address = "Redwood Shores";*/
		
		Student s1 = new Student(101,"John","Redwood Shores");
		//System.out.println("s1 is: "+s1);
		//System.out.println("s1 is: "+s1.toString());
		
		// Persist the data in Object i.e. save the state of an Object
		// Serialization -> Data of object will be written in a file
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/students.dat");
			
			// Serialization
			/*FileOutputStream fos = new FileOutputStream(file);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1); // Serialiazation
			
			oos.close();
			fos.close();*/
			
			// DeSerialization
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student = (Student)ois.readObject();
			
			System.out.println(student);
			
			//System.out.println("==Object Serialized==");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
		
		System.out.println("==App Finished==");

	}

}
