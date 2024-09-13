package jdbc;

import java.sql.*;

public class Demo {

	public static void main(String[] args) throws Exception {
		String url ="jdbc:mysql://programiz.com/sql/online-compiler/";
		String uname="root";
		String pass="root";
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		System.out.println("Connection Established");
	}

}
