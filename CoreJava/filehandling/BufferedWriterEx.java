package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Sri.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(1234);
		
		bw.newLine();
		
		bw.write("good \n morning");
		
		bw.newLine();
		
		char ch[]= {'a','b','c'};
		
		bw.write(ch);
		
		bw.newLine();
		
		bw.flush();
		
		bw.close();
		
		System.out.println("work is done");
	}
	//It will not allows boolean ,decimal value
		//It can't read int values
		
	
}
