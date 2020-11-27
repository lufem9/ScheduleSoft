/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
/**
 *
 * @author BukayoDan
 * This class can be used to initialize the database connection 
 */
public class DBconnect 
    {
    
	protected static Connection initializeDatabase() 
		throws SQLException, ClassNotFoundException 
	{ 
		// Initialize all the information regarding 
		// Database Connection 
		String dbDriver = "com.mysql.jdbc.Driver"; 
		String dbURL = "jdbc:mysql:// 127.0.0.1/ScheduleSoftdb"; 
		// Database name to access 
		//String dbName = ""; 
		String dbUsername = "root"; 
		String dbPassword = ""; 

		Class.forName(dbDriver); 
		Connection con = DriverManager.getConnection(dbURL,dbUsername,dbPassword); 
                System.out.println("Connected Successfully");
		return con; 
	} 
} 
