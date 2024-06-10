package oops;

interface Parent1 {
	public int add(int a, int b);
}

interface Parent2 {
	public int add(int a, int b);
}

public class Child2 implements Parent1,Parent2 {

	@Override
	public int add(int a, int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		
		Child2 obj = new Child2();
		
		System.out.println(obj.add(5, 89));
		

	}

}
