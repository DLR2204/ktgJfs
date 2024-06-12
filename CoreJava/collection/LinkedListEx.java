package collection;

import java.util.LinkedList;
/*Collections:-

(1)It is growable in nature

(2)It will allows both homogeneous/heterogeneous elements

(3)It will have lots of utility methods.

List :-

(4)It allows duplicates

(5)Insertion order is preserved
*/
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.add(123);

		ll.add("Strings");

		ll.add(true);

		ll.add(3.14f);

		ll.add('c');

		System.out.println(ll);

		ll.add(123);

		ll.add("Strings");

		ll.add(true);

		ll.add(3.14f);

		ll.add('c');
		
		System.out.println(ll);

	}

}
