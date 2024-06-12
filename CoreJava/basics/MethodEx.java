package basics;

public class MethodEx {

	public String display() { // Dynamic -String
		return "Hello Ravalika";
	}

	public int add() { // Dynamic -int
		return 3 + 6;
	}

	public static void displayMsg() { // Static - void
		System.out.println("Im from the static displayMsg method");

	}

	public static void main(String args[]) {

		displayMsg();
		
		MethodEx obj = new MethodEx();
		
		System.out.println(obj.display());
		
		System.out.println(obj.add());
	}

}
