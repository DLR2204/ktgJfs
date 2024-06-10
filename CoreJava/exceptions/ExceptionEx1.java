package exceptions;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean value = true;
		while (value) {

			System.out.print("Enter the numerator :-");

			int num = scan.nextInt();

			System.out.print("Enter the denominator:-");

			int den = scan.nextInt();

			try {
				int result = (num / den);

				System.out.println("The division result is :-" + result);

				value = false;
			}

			catch (ArithmeticException  e) {
				System.out.println("Please don't enter zero as the denominator");
				
				System.out.println(e);
				System.out.println("\n  \n");
				
				

				value = true;
			}
		}
		System.out.println("The remaining 10,000 line of code");
	}

}
