class Employee{
	
	// Attributes: Property of Object
	int eid;
	String name;
	int salary;
	
	// Attributes: Property of Class
	static String companyName;
}

public class StatDemo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();

		// Write Operation in Object
		emp1.eid = 101;
		emp1.name = "John";
		emp1.salary = 40000;
		
		// Write Operation in Object
		emp2.eid = 201;
		emp2.name = "Fionna";
		emp2.salary = 50000;

		// Write Operation in Class
		Employee.companyName = "ABC International";
		
		// Read Operation in Class
		System.out.println("Company name is: "+Employee.companyName);
		System.out.println(emp1.name+" works for "+emp1.companyName);
		System.out.println(emp2.name+" works for "+emp2.companyName);
	}

}
