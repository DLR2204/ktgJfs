package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlEx {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		 1.Loading the driver class.
 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
//		 2.Create the connection with the database
		
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "keerthi","kyathi");
	 
//		 3.create the statment
	 
		Statement stmt = conn.createStatement();
		
//		 4.exceute the queries.  DML ------>excuteUpdate()
		
		
		stmt.executeUpdate("insert into person values(45,'Ramesh',10)");
 
		stmt.addBatch("insert into person values(67,'Suresh',11)");
		stmt.addBatch("insert into person values(34,'Naresh',12)");
		stmt.addBatch("insert into person values(65,'Mahesh',13)");
		stmt.addBatch("insert into person values(68,'Rakesh',14)");
		stmt.addBatch("insert into person values(34,'Rajesh',15)");
		stmt.addBatch("insert into person values(45,'Ramesh',10)");
		stmt.executeBatch();
		
//		 5.close the connections.
		
		conn.close();
		
		System.out.println("Data is inserted succesfully");
	}

}
