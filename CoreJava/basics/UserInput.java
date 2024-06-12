package basics;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name:-");
		
		String name = scan.next();
		
		System.out.print("Enter your age:-");
		
		byte age = scan.nextByte();
		
		System.out.println("Your name is:-"+name+"\t"+"Your age is:-"+age);
		
		
	}

}
