package collection;

import java.util.LinkedHashSet;
/*Collections:-

(1)It is growable in nature

(2)It will allows both homogeneous/heterogeneous elements

(3)It will have lots of utility methods.

Set:-

(4)It allows not duplicates

(5)Insertion order is  storing
*/
public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add(1234);
		
		lhs.add("string");
		
		lhs.add(3.14f);
		
		lhs.add('c');
		
		lhs.add("keerthi");
		
		lhs.add("sri");
		
		System.out.println(lhs);
	}

}
