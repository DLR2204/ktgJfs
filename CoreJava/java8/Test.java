package java8;

public interface Test {
	
	public static void display() {
		System.out.println("Hello everyone");
	}
	
	default void hello() {
		System.out.println("Hi everyone");
	}

}
