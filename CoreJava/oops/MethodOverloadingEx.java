package oops;

public class MethodOverloadingEx {

	public void add(int a,int b) {
		System.out.println("6.The sum of 2 integers is :-"+(a+b));
	}
	
	public void add(int a, int b,int c) {
		System.out.println("10.The sum of 3 integer is :-"+(a+b));
	}
	public void add(int a,float b) {
		System.out.println("13.The sum of an int and a float is:-"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("16.The sum of a float and an int is:-"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("19.The sum of two floats is:-"+(a+b));
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingEx obj =new MethodOverloadingEx();
		
		obj.add('a','b');
		
	}
}
