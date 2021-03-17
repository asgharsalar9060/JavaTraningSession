package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		/*
		 * int a = 30; int b = 20;
		 * 
		 * if (a>b){ System.out.println("a is greater than b"); } else{
		 * System.out.println("b is greater than a"); }
		 */
		
//		Comparison operators:
//		< > <= >= == !=
		
		/*
		 * int c = 80; int d = 80;
		 * 
		 * if (c==d) { System.out.println("c is equal to d"); } if (c!=d) {
		 * System.out.println("c is not equal to d"); } if (c>d) {
		 * System.out.println("c is greater than d"); } if (c<d) {
		 * System.out.println("c is less than d"); } if (c<=d) {
		 * System.out.println("c is less than or equal to d"); } else{
		 * System.out.println("c is greater or equal to d"); }
		 */
		
//		Write a logic to find the  greatest number
		
		int a = 400;
		int b = 500;
		int c = 300;
		
//		Nested if-else
		if (a>b & a>c) {
			System.out.println("a is the greatest");
		}
		else if(b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
		
				
		
		

	}

}
