package JavaBasics;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.size());
		
		System.out.println(h.get("A"));
		System.out.println(h.get(2));
		
		h.put(3, "Star");
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		
		h1.put(4, 300);
		
		System.out.println(h1);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2.put(4, "Hello");
		
		System.out.println(h2);
	}

}
