package java8;

public class Rose implements Flower{

	@Override
	public void name(String name) {
		System.out.println("The flower name is:- "+name);
	}
	
	public static void main(String[] args) {
		
		Rose rose = new Rose();
		
		rose.name("rose");
	}

}
