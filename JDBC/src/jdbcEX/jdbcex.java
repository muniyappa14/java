package jdbcEX;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Statement;



public class jdbcex {

	public static void main(String[] args) {
		try {
			//import driver intermediate
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/?emp","Root","Muni@123");
			Statement st=con.createStatement();
			st.executeUpdate("create database (id int ,name varchar(20)");
			//close the connection
			con.close();
			System.out.println("jdbc connected");
		
		}
		catch(Exception e) {
		System.out.println(e);
		}
	}
}
