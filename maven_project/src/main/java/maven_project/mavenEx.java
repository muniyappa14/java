package maven_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class mavenEx {

	public static void main(String[] args) {
		try {
			//connecting the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp?user=root&password=Muni@123");
			 Statement st =con.createStatement();
			 //executeupdate is to update table deatils
			 st.executeLargeUpdate("create table data( names varchar(10))");
			 System.out.println("connected to database");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
