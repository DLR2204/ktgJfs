package basics;

public class MethodEx1 {

	public static void display(String name) { //static - void
		System.out.println("your name is:-"+name);
	}
	
	public int add(int a,int b) { //instance - int
		return (a+b);
	}
	
	public static void main(String[] args) {
		display("Ravalika");
		
		MethodEx1 obj = new MethodEx1();
		
		System.out.println(obj.add(5, 67));
		
		
	}
}
