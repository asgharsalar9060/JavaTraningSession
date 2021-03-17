package OOPConceptPart1Practice;

public class MethodOverloading {

	public static void main(String[] args) {

//		Method Overloading --> When the method names are same with different arguments or input parameters within the same class with different data types		
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		
		obj.sum(10);
		
		obj.sum(10, 10);
		
		obj.sum(12.12);
		
		
		
	}

	public void sum() {
		System.out.println("Sum method--->zero parameter");
	}
	
	public void sum (int a) {
		System.out.println("Sum method---> one parameter "+a);
	}
	
	public void sum(int a, int b) {
		System.out.println("Sum method---> two parameters "+a+b);
	}
	
	public void sum(double a) {
		System.out.println("Sum method---> one parameter "+a);
	}
	
}
