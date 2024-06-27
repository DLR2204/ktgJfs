package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DRLEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		1)loading the driver class
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		2)creating the connection
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "keerthi", "kyathi");

		//		3)creating the statement 
		Statement stmt = conn.createStatement();
		
//		4)executing query DDL-->execute(),DML-->executeUpdate(),DRL-->executeQuery()
		
		ResultSet result=stmt.executeQuery("select * from person");
		
//		5)close the connection
		System.out.println("perAge | perName | perId");
		System.out.println("------   -------   -----");
		
		
		while(result.next())
		{
			
System.out.println(result.getInt("age")+"     "+result.getString("name")+"      "+result.getInt("id"));
		}
		conn.close();
	

	}

}
