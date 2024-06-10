package oops;

class GrandParent{
	public void displayMsg() {
		System.out.println("Iam from the grand parent");
	}
}

class Parent extends GrandParent{
	public void display() {
		System.out.println("Iam from the parent class");
	}
	
}

public class Child extends Parent{

	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.display();
		
		obj.displayMsg();
	}
}
