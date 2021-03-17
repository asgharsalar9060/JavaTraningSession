package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("Hello");//5
		ar.add("World");//6
		ar.add(12.12);//7
		ar.add('A');//8
		ar.add(600);//9
		
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
//		To print all the values of arrays: use for loop
		for (int i= 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		
//		To strict what should the array add, we can add a specific type of data type after the object
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(100);
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("Star");
		
		

	}

}
