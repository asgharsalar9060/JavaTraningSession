package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
//		Method Overloading --> When the method names are same with different arguments or input parameters within the same
//		class with different data types

		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		
		obj.sum(10);
		
		obj.sum(15, 30);

	}
	
	public static void main(int h) {
		
	}
	
	public static void main(int k, int l) {
		
	}
	
//	We can overload main method also
//	We cannot create a method inside a method
//	Duplicate method --> same method name with same input parameters are not allowed
	

	public void sum() {//0 parameter
		System.out.println("SUM Method --> zero input parameter");
		
	}
	
	public void sum(int i) {//1 parameter
		System.out.println("SUM Method --> one input parameter");
		System.out.println(i);
		
	}
	
	public void sum(int k, int l) {//2 parameters
		System.out.println("SUM Method --> two input parameters");
		System.out.println(k + l);
		
	}
	
	public void sum(double n) {//2 parameters
		System.out.println("SUM Method --> two input parameters");
		System.out.println(n);
		
	}

}
