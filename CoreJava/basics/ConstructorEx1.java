package basics;

public class ConstructorEx1 {

	public ConstructorEx1() {
		this("apple"); // constructor calling
	}

	public ConstructorEx1(String name) {
		this("banana", "carrot");

		System.out.println(name);

	}

	public ConstructorEx1(String name, String name1) {

		this("duck", "egg", "fish");
		System.out.println(name + "\t" + name1);
	}

	public ConstructorEx1(String name, String name1, String name2) {
		System.out.println(name + "\t" + name1 + "\t" + name2);
	}

	public static void main(String[] args) {

		ConstructorEx1 obj = new ConstructorEx1();
	}
}
