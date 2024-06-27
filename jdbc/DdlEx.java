package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DdlEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		(1)Loading driver classes
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		(2)Creating the connection
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","keerthi","kyathi");
		
//		(3)create the statement
		
		Statement stmt = conn.createStatement();
		
//		(4)Executing the the quires DDL---->execute();
		
		stmt.execute("create table person(age number(10),name varchar2(10),id number(10))");

//		(5)Closing the connection
		
		conn.close();
		
		System.out.println("Table is created");
	}

}
