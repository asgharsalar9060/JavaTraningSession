package JavaBasics;

public class LoopConcept {

	public static void main(String[] args) {

		
//		  Loops can execute a block of code as long as a specified condition is
//		  reached.
		  
//		  Loops are handy because they save time, reduce errors, and they make code
//		  more readable.
		  
		 
//		The disadvantage of the 'while' loop is that it gives infinite loop if you don't give increment/decrement part

		
		  int i = 0; //initialization
		  while (i < 5) { //conditional 
		  System.out.println(i); 
		  i++; } //incremental/decramental
		 

//		The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

		
//		  int i = 0;
		  
//		  do { System.out.println(i);
		  
		  // Note: Do not forget to increase the variable used in the condition,
//		  otherwise the loop will never end! // i=i+1; ===> same as i++; i++; } while
//		  (i < 5);
		 
//		When you know exactly how many times you want to loop through a block of code, use the for loop instead of while loop:

//		for (statement 1; statement 2; statement 3) {
		// code block to be executed
//	}
		
//		  Statement 1 sets a variable before the loop starts (int i = 0).
		  
//		  Statement 2 defines the condition for the loop to run (i must be less than
//		  5). If the condition is true, the loop will start over again, if it is false,
//		  the loop will end.
		  
//		  Statement 3 increases a value (i++) each time the code block in the loop has
//		  been executed.
		 
		
		  for (int k = 0; k < 5; k++) { 
			  System.out.println(k); }
		 

		
		  // This example will only print even values between 0 and 10: for (int i = 0;
//		  i <= 10; i = i + 2) { System.out.println(i); }
		 
		
		  // The following example outputs all elements in the cars array, using a "for-each" loop: 
		  String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; 
		  for (String l : cars) {
			  System.out.println(l); 
			  }
		 

				/*
				 * for (int i = 0; i < 5; i++) { System.out.println("Yes"); }
				 */
		
		  for(int j = 10; j >= 1; j--){
			System.out.println(j);
		  }

	}

}
