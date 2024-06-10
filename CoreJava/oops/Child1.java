package oops;

interface Parent3 {
	public void display();		//100%
}

abstract class Child3 {					//50%			//0-100%

	public abstract void displayMsg();

	public void display() {
		System.out.println("Hello Everyone !! Iam from a calss");
	}

}

public class Child1 {			//0%

	public void display() {
		System.out.println("Hello Everyone !! Iam from a calss");
	}

}
