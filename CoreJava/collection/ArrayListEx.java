package collection;

import java.util.ArrayList;

/*Collections:-

(1)It is growable in nature

(2)It will allows both homogeneous/heterogeneous elements

(3)It will have lots of utility methods.

List :-

(4)It allows duplicates

(5)Insertion order is preserved
*/
public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(123);

		al.add("Strings");

		al.add(true);

		al.add(3.14f);

		al.add('c');

		System.out.println(al);

		al.add(123);

		al.add("Strings");

		al.add(true);

		al.add(3.14f);

		al.add('c');

		System.out.println(al);

	}

}
