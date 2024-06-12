package basics;

public class VariableEx {
	
	static String Nationality = "Indian";
	
	String name ;
	
	public void display() {
		System.out.println(Nationality);
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		VariableEx obj1 = new VariableEx();
		VariableEx obj2 = new VariableEx();
		VariableEx obj3 = new VariableEx();
		
		obj1.name="ramesh";
		
		obj2.name = "suresh";
		
		obj3.name="mahesh";
		
		obj1.display();
		
		obj2.display();
		
		obj3.display();
		
		
		
	}
	

}
