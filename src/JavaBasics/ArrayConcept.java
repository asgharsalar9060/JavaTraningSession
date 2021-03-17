package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		/*
		 * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value
		 * To declare an array, define the variable type with square brackets:
		 */
		
//		Examples of string
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		
		System.out.println("***************");
		
//		Change an Array Element
//		To change the value of a specific element, refer to the index number:
		String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
		car [0]= "Ferari";
		System.out.println(car[0]);
		
		System.out.println("***************");
		
//		To find out how many elements an array has, use the length property:
		String[] carss = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(carss.length);
		
		
		System.out.println("***************"); 
		
//		You can loop through the array elements with for loop, and use the length property to specify how many times the loop should run.
		String[] carsss = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < carsss.length; i++) {
		  System.out.println(carsss[i]);
		}
		
		System.out.println("***************");
		
//		There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
//		The example above can be read like this: for each String element (called i - as in index) in carssss, print out the value of i.
		String[] carssss = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : carssss) {
		  System.out.println(i);
		}
		
//		If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, it does not require a counter (using the length property), and it is more readable.


		
		System.out.println("***************");
		
//		Examples of integers
		int[] myNum = {10, 20, 30, 40};
		System.out.println(myNum[3]);
		
		System.out.println("***************");
		
//		A multidimensional array is an array containing one or more arrays.

//		To create a two-dimensional array, add each array within its own set of curly braces:
//		To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x);
		
		
		System.out.println("***************");
		
//		We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):
		int[][] myNumberss = { {1, 2, 3, 4}, {5, 6, 7} };
	    for (int i = 0; i < myNumberss.length; ++i) {
	      for(int j = 0; j < myNumberss[i].length; ++j) {
	        System.out.println(myNumberss[i][j]);
	      }
	    }
	    
	    System.out.println("***************");
	    
	    int m[] = new int[5];
	    m[0] = 10;
	    m[1] = 20;
	    m[2] = 30;
	    m[3] = 40;
	    m[4] = 50;
	    
	    System.out.println(m.length); //size/length of array
	    
	    System.out.println("***************");
	    
	    for (int n=0; n<m.length; n++){ // to print all the values of array, we use 'for' loop
		System.out.println(m[n]);
	    }
	    
	    System.out.println("***************");

//	    double array
	    double p[] = new double[5];
	    p[0] = 10.44;
	    p[1] = 11.55;
	    p[2] = 12.66;
	    p[3] = 13.77;
	    
	    System.out.println(p[3]);
	    
	    System.out.println("***************");
	    
//	    character array
	    char z [] = new char[5];
	    z[0] = 'a';
	    z[1] = 'b';
	    z[2] = 'c';
	    z[3] = 'd';
	    z[4] = 'e';
	    
	    System.out.println(z[2]);
	    
	    System.out.println("***************");
	    
//	    boolean array
	    boolean y[] = new boolean[2];
	    y[0] = true;
	    y[1] = false;
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
