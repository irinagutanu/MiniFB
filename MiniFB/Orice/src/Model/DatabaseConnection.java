package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static String dbURL = "jdbc:sql7.freemysqlhosting.net";
	private static String dbUser = "sql7254565@ec2-52-8-112-233.us-west-1.compute.amazonaws.com";
	private static String dbPassword = "sql7254565";
	
	public static Connection createConnection() {
		Connection con = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException ex) {
				System.out.println("Error: unable to load driver class!");
				System.exit(1);
			}
			con = DriverManager.getConnection(dbURL, dbUser, dbPassword);
		} catch (SQLException sqe) {
			System.out.println("Error: While Creating connection to database");
			sqe.printStackTrace();
		}
		if (con!= null) {
			System.out.println("Connection established");
		}
		return con;
	}
}
