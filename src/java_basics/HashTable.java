package java_basics;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(0, "UK");
		hm.put(1, "USA");
		hm.put(2, "INDIA");
		hm.put(3, "UAE");
		hm.put(0, "MAXICO");
		hm.put(5, "RASSUIA");
//		hm.put(6, null);

		System.out.println(hm);

		Set<Integer> keys = hm.keySet();

		for (int key : keys) {

			System.out.println(key + " : " + hm.get(key));
		}

	}

}
