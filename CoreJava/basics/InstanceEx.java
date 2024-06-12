package basics;

public class InstanceEx {
	
	static String name = "apple";
	
	String value = "flower";
	
	public static void main(String[] args) {
		
		System.out.println(InstanceEx.name);
		
		InstanceEx obj = new InstanceEx();
		
		System.out.println(obj.value);
		
	}

}
