package maven_three;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class maventhreeEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp? user=root&password=Muni@123");
		 Statement st =con.createStatement();
		 st.executeUpdate("insert into details values(10)");
		 st.executeUpdate("insert into details values(20)");
		 st.executeUpdate("insert into details values(30)");
		 st.executeUpdate("insert into details values(40)");
		 st.executeUpdate("insert into details values(50)");
		 
		 System.out.println("data inserted");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
