package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream file = new FileInputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Sri.txt");

		ObjectInputStream obj = new ObjectInputStream(file);

		System.out.println((Employee) obj.readObject());

	}
}
