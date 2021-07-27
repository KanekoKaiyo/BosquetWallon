package be.josimon.BWConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static Connection instance = null;
	
	private DBConnect() {
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlite/db/BW.db";
            // create a connection to the database
            instance = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
        	System.out.println(e.getMessage());
        } /* finally {
        	try {
                if (instance != null) {
                	instance.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        } */
	}
	
	public static Connection getInstance() {
		if(instance == null) {
			new DBConnect();
		}
		return instance;
	}
}
