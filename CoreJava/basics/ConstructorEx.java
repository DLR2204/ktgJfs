package basics;

public class ConstructorEx {
	
	public ConstructorEx() {
		System.out.println("Iam from the default constructor");
	}
	
	public ConstructorEx(String flower) {
		System.out.println("The flowe name is :-"+flower);
	}
	
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx("Tulips");//object creatiion,constr calling
	}

}
