package com.kodnest.jdbc.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDEMO1 {
	private static final String URL ="jdbc:mysql://localhost:3306/kodnest";
	private static final String USER_NAME ="root";
	private static final String PASSWORD = "Shivani369$";
	
	//private static final String CREATE_TRAINER_QUERY = "CREATE TABLE TRAINER (ID INT,NAME VARCHAR(20))";
	//private static final String INSERT_TRAINER_QUERY ="INSERT INTO TRAINER VALUES(1,'PUNITH SIR') ";
	//private static final String UPDATE_TRAINER_QUERY = "UPDATE TRAINER SET NAME ='Arun sir' WHERE NAME ='Punith sir'";
	//private static final String DELETE_TRAINER_QUERY = "DELETE FROM TRAINER WHERE ID=1";
	private static final String SELECT_ALL_TRAINER_QUERY ="SELECT*FROM TRAINER"; 
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//1.Load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish the connection with database
			 conn = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		
			
			//3.Create Statement Object
			Statement stmt = conn.createStatement();
			
			//4.send and Execute query
			//stmt.execute(CREATE_TRAINER_QUERY);
			//stmt.execute(INSERT_TRAINER_QUERY);
			//stmt.executeUpdate(UPDATE_TRAINER_QUERY);
			//stmt.execute(DELETE_TRAINER_QUERY);
			
			ResultSet rs = stmt.executeQuery(SELECT_ALL_TRAINER_QUERY);
			while (rs.next()) {
				System.out.println("ID ="+rs.getInt(1)+"Name ="+rs.getString(2));
			}	
		}
		catch(ClassNotFoundException e) {			
			e.printStackTrace();
		}
		catch(SQLException e) {	
			e.printStackTrace();
		}
		finally {
			//5.close the connection
			try {
				if(conn!=null) {
					conn.close();
				}
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}

}
}
