package java8;
//Lambda expression can be used on only F.I's
public class Tulips {
	
	public static void main(String[] args) {
		
		//()->{};
Flower flower = (name)->System.out.println("The name of the flower is:-"+name);
		
	flower.name("Tulips");
	
	}

}
