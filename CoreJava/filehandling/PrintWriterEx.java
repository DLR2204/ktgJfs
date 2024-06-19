package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Sri.txt");
		
		pw.println(1234);
		
		pw.println("good \n morning");
		
		pw.println(true);
		
		pw.println(3.14f);
		
		char ch[] = {'a','b','c'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("work is done");
		
	}

}
