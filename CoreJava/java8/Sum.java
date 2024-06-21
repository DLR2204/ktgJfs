package java8;

public class Sum {
	
	public static void main(String[] args) {
		
		Calculator sum = new Addition()::add;
		
		sum.add(6, 3);
		
	}

}
