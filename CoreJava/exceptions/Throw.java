package exceptions;

public class Throw {
	
	public static void vote(int age) {
		
		if(age<18) {
			throw new ArithmeticException("you are not eligible to vote");
		}
		else {
			System.out.println("You can procced to vote");
		}
	}
	
	public static void main(String[] args) {
		
		vote(12);
		
	}
	
	
}
