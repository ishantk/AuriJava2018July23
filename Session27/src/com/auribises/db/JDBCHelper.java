package com.auribises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

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
	
	public void closeConnection(){
		try {
			con.close();
			System.out.println("==Connection Closed==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
