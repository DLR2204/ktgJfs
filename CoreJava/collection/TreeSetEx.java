package collection;

import java.util.Comparator;
import java.util.TreeSet;
/*Collections:-

(1)It is growable in nature

(2)It will allows both homogeneous/heterogeneous elements

(3)It will have lots of utility methods.

Set:-

(4)It allows not duplicates

(5)Insertion order is not storing - alphabetical order
*/
public class TreeSetEx {
	
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>(new MyOrder());
		
		ts.add("orange");
		
		ts.add("apple");
		
		ts.add("carrot");
		
		ts.add("jack");
		
		ts.add("kiwi");
		
		ts.add("avacado");
		
		System.out.println(ts);
		
//		for(String str : ts) {
//			System.out.println(str);
//		}
		
		
	}

}


class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}
	
}
