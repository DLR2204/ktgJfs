package oops;

interface Parent4 {

	public void display();

}

public class Child4 implements Parent4 {

	public static void main(String[] args) {

		Child4 obj = new Child4();

		obj.display();
	}

	@Override
	public void display() {
		System.out.println("Iam from the interface method");

	}
}
