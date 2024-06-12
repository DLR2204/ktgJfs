package basics;

public class StaticEx {
	
	static int staticcounter;
	
	int instancecounter;
	
	public void counter() {
		staticcounter++;
		
		instancecounter++;
	}
	public void display() {
		System.out.println("StaticCounter:- "+staticcounter);
		System.out.println("InstanceCounter:-"+instancecounter);
	}
	
	public static void main(String[] args) {
		 StaticEx obj1 = new StaticEx();
		 
		 StaticEx obj2 = new StaticEx();
		 
		 StaticEx obj3 = new StaticEx();
		 
		 obj1.counter();
		 
		 obj2.counter();
		 
		 obj3.counter();
		 
		 obj3.counter();
		 
		 obj3.display();
		
	}

}
