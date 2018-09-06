package com.auribises.main;

import com.auribises.db.JDBCHelper;
import com.auribises.model.Employee;
import com.auribises.view.RegisterEmpoyeeGUI;

/*
 * SQL Intro:
 * 
 * Object Structure:
		public class Employee {
	
			// Attributes : State of an Object
			public int eid;
			public String name;
			public int salary;
			public String email;
			public String address;

		}

		Table Structure:

		create table Employee(
			eid integer primary key auto_increment,
			name varchar(256),
			salary integer,
			email varchar(256),
			address varchar(512)
		)


		// Insert data in Table !!
		insert into Employee values(null,'Mike',45000,'mike@example.com','Redood Shores')


		// update data in Table
		update Employee set salary = 55700, email = 'mike.w@example.com' where eid = 1

		// retrieve
		select * form Employee
		select name, email, salary from Employee
		select name, email, salary from Employee where eid = 1
		select name, email, salary from Employee where salary >50000  and address = 'redwood shores'


		// delete
		delete from Employee where eid = 1
 */

public class App {

	public static void main(String[] args) {
		
		System.out.println("==App Started==");
		
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee(0,"John",30000,"john@exmaple.com","Redwood Shores");
		
		Employee emp3 = new Employee();
		emp3.setEid(0);
		emp3.setName("Jennie");
		emp3.setEmail("jennie@example.com");
		emp3.setSalary(40000);
		emp3.setAddress("Country Homes");
		
		Employee emp4 = new Employee();
		emp4.eid = 0;
		emp4.name = "Joe";
		emp4.email = "joe@example.com";
		emp4.salary = 35700;
		emp4.address = "Pristine Magnum";
		
		System.out.println(emp1); // System.out.println(emp1.toString());
		System.out.println("**************");
		System.out.println(emp2);
		System.out.println("**************");
		System.out.println(emp3);
		System.out.println("**************");
		System.out.println(emp4);
		System.out.println("**************");
		
		System.out.println(emp1.getName()+" can be emailed at "+emp1.getEmail());
		System.out.println(emp2.name+" can be emailed at "+emp2.email);
		
		// Before your app finishes.. 
		// we must persist the useful data -> i.e. save the data
		// Persistance 1. -> Files
		// Persistance 2. -> Database | RDBMS | SQL -> MySQL
				
		/*JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		//helper.saveEmployee(emp2);
		//helper.saveEmployee(emp3);
		helper.saveEmployee(emp4);
		helper.closeConnection();*/
		
		RegisterEmpoyeeGUI gui = new RegisterEmpoyeeGUI();
		gui.showGUI();
		
		
		System.out.println("==App Finished==");

	}

}
