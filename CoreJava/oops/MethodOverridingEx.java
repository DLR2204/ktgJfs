package oops;

class Parent6{
	public void display() {
		System.out.println("Iam from the parent class");
	}
	public void add(int a,int b) {
		System.out.println("The sum of the values is :-"+(a*b));
	}
}

public class MethodOverridingEx extends Parent6{
	
	public static void main(String[] args) {
		
		MethodOverridingEx obj = new MethodOverridingEx();
		
		obj.display();
		
		obj.add(10, 7);
		
		
	}

	@Override
	public void add(int a,int b) {
		System.out.println("The sum is :-"+(a+b));
	}
}
