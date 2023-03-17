package maven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/emp? user=root&password=Muni@123 ");
			Statement st=con.createStatement();
			st.executeUpdate("create table details(ids int)");
			System.out.println("pass");
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
