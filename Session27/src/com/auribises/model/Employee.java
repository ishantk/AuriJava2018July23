package com.auribises.model;

// Textual Representation how an object will look like in the memory
// Model or Bean or POJO(Plain Old Java Object)
public class Employee {
	
	// Attributes : State of an Object
	public int eid;
	public String name;
	public int salary;
	public String email;
	public String address;
	
	public Employee() {
		eid = 0;
		name = "NA";
		salary = 10000;
		email = "info@abc.com";
		address = "NA";
	}

	public Employee(int eid, String name, int salary, String email, String address) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]";
	}
	
}
