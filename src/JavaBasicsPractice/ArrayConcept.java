package JavaBasicsPractice;

public class ArrayConcept {

	public static void main(String[] args) {

		//We use array to store multiple values in a single varriable
		//We declare arrays by square brackets
		
		String [] a = {"book", "pen", "pencil", "pencil case"};
		System.out.println(a[1]);
		
		//changing an array element
		String[] b = {"book", "pen", "pencil", "pencil case"};
		b[2] = "notebook";
		System.out.println(b[2]);
		
		//finding the number of array elements using length property
		String[] c = {"book", "pen", "pencil", "pencil case"};
		System.out.println(c.length);
		
		//we can loop through array using for loop to specify how many time the loop should run
		String[] d = {"book", "pen", "pencil", "pencil case"};
		for(int i=0; i<4; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("************");
		//we can also use for each loop
		String[] e = {"book", "pen", "pencil", "pencil case"};
		for (String f : e) {
			System.out.println(f);
		}
		
		System.out.println("************");
		int [] s = {10,20,30,40,50};
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		System.out.println("************");
		//Creating multidimensional array
		int [][] g = {{1,2,3}, {4,5,6,7}};
		int h = g [1][2];
		System.out.println(h);
		
		System.out.println("************");
		String [] [] i = {{"book", "pen", "pencil", "pencil case"},{"computer", "tablet", "phone"}};
		String j = i[0][1];
		System.out.println(j);
		
		System.out.println("************");
		//we can also use for loop inside another for loop to get the elements of 2-dimensional array
		String [] [] k = {{"book", "pen", "pencil", "pencil case"},{"computer", "tablet", "phone"}};
		for(int l=0; l< k.length; l++) {
			for(int m=0; m<k[l].length; m++) {
				System.out.println(k[l][m]);
			}
		}
		
		System.out.println("************");
		
		
		
		
		
	}

}
