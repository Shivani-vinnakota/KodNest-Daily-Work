package com.kodnest.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBECInsert {
	public static void main(String[] args) {
		String URL ="jdbc:mysql://localhost:3306/kodnest";
		String USER_NAME ="root";
		String PASSWORD = "Shivani369$";
		
		String INSERT_STUDENT_QUERY = "INSERT INTO STUDENT2 VALUES (1,'RAM',100)";
		try {
			//1.Load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//FQCN(Fully Qualified Class Name)- canonical Name
			System.out.println("===> Driver loaded  & registered successfully");
			
			//2.Establish the connection with database
			Connection conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			System.out.println("===> Connection Established Successfully" +conn);
			
			//3.Create Statement Object
			Statement stmt = conn.createStatement();
			
			//4.send and Execute query
			int rowsAffected= stmt.executeUpdate(INSERT_STUDENT_QUERY);
			System.out.println("rowsAffected"+rowsAffected);
			System.out.println("=====>Values inserted Successfully!");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("=====>Driver Not Found");
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("====>Failed to establish the connection");
			e.printStackTrace();
		}
	}

}
