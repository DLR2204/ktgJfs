package collection;

import java.util.HashSet;
import java.util.Iterator;
/*Collections:-

(1)It is growable in nature

(2)It will allows both homogeneous/heterogeneous elements

(3)It will have lots of utility methods.

Set:-

(4)It allows not duplicates

(5)Insertion order is not storing - random order
*/
public class HashSetEx {
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		
		hs.add(1234);
		
		hs.add("string");
		
		hs.add(3.14f);
		
		hs.add(945435);
		
		hs.add('c');
		
		hs.add("keerthi");
		
		hs.add("sri");
		
		System.out.println(hs);
		
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
	}

}
