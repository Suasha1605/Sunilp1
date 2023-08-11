package java_basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		
		hm.put(0, "UK");
		hm.put(1, "USA");
		hm.put(2, "INDIA");
		hm.put(3, "UAE");
		hm.put(0, "MAXICO");
		hm.put(4, "RASSUIA");
		hm.put(5, null);
		
		System.out.println(hm);
		
  HashMap<Integer,String> hm2= new HashMap<Integer,String>();
		
		hm2.put(0, "Pune");
		hm2.put(1, "Mumbai");
		hm2.put(2, "Delhi");
		hm2.put(3, "Banglore");
		hm2.put(0, "Chennai");
		
		
		
		
		System.out.println(hm2);
		
		
		
		Iterator<Integer> keys= hm.keySet().iterator();
		
		
		while(keys.hasNext()) {
			
			
			 int key= keys.next();
			System.out.println(key+ " : " + hm.get(key));
		}
		
		System.out.println("################");
		
		Iterator<Entry<Integer, String>> it= hm.entrySet().iterator();
		
		
		while(it.hasNext()) {
			
			Entry<Integer, String> entry= it.next();
			
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
		
		System.out.println("################");
		
		hm.forEach((k,v)->System.out.println(k+": "+v));
		
		System.out.println("################");
		
		System.out.println(hm.equals(hm2));
		
		System.out.println(hm.keySet().equals(hm2.keySet()));
		
		
		HashSet<Integer> hs= new HashSet<Integer>(hm.keySet());
		
		hs.addAll(hm2.keySet());
		
		hs.removeAll(hm2.keySet());
		
		System.out.println(hs);
		
		
		

	}

}
