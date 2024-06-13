package collection;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(100, "apple");
		tm.put(109, "orange");
		tm.put(105, "kiwi");
		tm.put(100, "apple");
		tm.put(109, "orange");
		tm.put(105, "kiwi");
		tm.put(108, "banana");
		tm.put(102, "avacado");
		tm.put(106, "carrot");
		tm.put(104, "grapes");
		
		Set<Integer> set = tm.keySet();

		for(Integer itr: set) {
			System.out.println(itr);
		}
	}

}
