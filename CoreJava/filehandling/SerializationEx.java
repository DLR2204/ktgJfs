package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Sri.txt");
	
		Employee emp = new Employee(100, "keerthi",3928794, "india");
	
		Employee emp1 = new Employee(101, "Kyathi", 23493485,"india");
		
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		obj.writeObject(emp1);
		
		
		
		System.out.println("work is done");
		
	}

}
