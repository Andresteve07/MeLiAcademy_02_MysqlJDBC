package dataBaseExample;
//mysql-conector-java
//Driver: com.mysql.jdbc.Driver
//url: localhost:3306/dbname

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler {
	public static void main(String[] args) {
		 
        // creates three different Connection objects
        Connection conn1 = null;
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/javabase";
            String user = "java";
            String password = "12345";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}
