package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.auribises.model.Employee;

// DAO | Data Access Object
public class JDBCHelper {
	
	Connection con;
	Statement stmt;
	PreparedStatement pStmt;

	// 1. Load the Driver
	public JDBCHelper(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("==Driver Loaded==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//2. Create the Connection
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/GW2018A";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("==Connection Created==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void saveEmployee(Employee emp){
		try {
			
			//3. Write SQL Statement
			//String sql = "insert into Employee values(null,'"+emp.name+"',"+emp.salary+",'"+emp.email+"','"+emp.address+"')";
			
			//4. Execute the Statement
			//stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			//System.out.println("Row(s) inserted: "+i);
			
			// indexing is always from 1
			String sql = "insert into Employee values(null,?,?,?,?)";
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.salary);
			pStmt.setString(3, emp.email);
			pStmt.setString(4, emp.address);
			
			int i = pStmt.executeUpdate();
			System.out.println("Row(s) inserted: "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){
		try {
			
			// indexing is always from 1
			String sql = "update Employee set name = ?, salary = ?, email = ?, address = ? where eid = ?";
			pStmt = con.prepareStatement(sql);
			
			pStmt.setString(1, emp.name);
			pStmt.setInt(2, emp.salary);
			pStmt.setString(3, emp.email);
			pStmt.setString(4, emp.address);
			pStmt.setInt(5, emp.eid);
			
			int i = pStmt.executeUpdate();
			System.out.println("Row(s) Updated: "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int eid){
		try {
			
			// indexing is always from 1
			String sql = "delete from Employee where eid = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, eid);
			
			int i = pStmt.executeUpdate();
			System.out.println("Row(s) Deleted: "+i);
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public ArrayList<Employee> retrieveEmployees(){
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
			
			// Retrieve All
			String sql = "Select * from Employee";
			
			// Retrieve Selection
			//String sql = "Select * from Employee where eid = ?";
			
			pStmt = con.prepareStatement(sql);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				Employee e = new Employee();
				e.eid = rs.getInt(1);
				e.name = rs.getString(2);
				e.salary = rs.getInt(3);
				e.email = rs.getString(4);
				e.address = rs.getString(5);
				//System.out.println(e);
				//System.out.println("*********************************************");
				
				list.add(e);
				
			}
			
			rs.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return list;
	}
	
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println("==Connection Closed==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
