package jdbc;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		String url ="jdbc:mysql://localhost/3303/demo";
		String uname="root";
		String pass="root";
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection Established");
	}

}
