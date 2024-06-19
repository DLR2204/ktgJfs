package strings;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String name = "hyderabad"; //literal
		
		System.out.println(name.concat(" Biryani"));
		
		name.concat(" Biryani");
		
		System.out.println(name);
		
		String name1 = new String("good");
		
		System.out.println(name1);
		
		name1.concat("Evening");
		
		System.out.println(name1);
		
		StringBuffer name2 = new StringBuffer("hello");
		
		name2.append(" Everyone");
		
		System.out.println(name2);
	}

}
