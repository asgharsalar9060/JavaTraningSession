package OOPConceptPart1;

public class FunctionsInJava {
	
//	main method --> starting point of execution

	public static void main(String[] args) {
//		Functions and methods are same thing: e.g: in FunctionsInJava class, we have only one method/function called 'main'

		
//		one object will be created, obj is the reference variable, referring to 'new FunctionsInJava();' object
//		after creating the object, the copy of all non-static methods will be given to this object
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
	
		int l = obj.pqr();
		System.out.println(l);
		
		String i = obj.qa();
		System.out.println(i);

		int div = obj.division(30, 10);
		System.out.println(div);
		
//		main method is 'void' because it never returns a value
	}
	
	
//	non-static method
	
//	void --> means does not return any value
//	return type is void
	
	public void test() {//no input, no output
		System.out.println("test method");
		
	}
	
	
//	return type - int
	public int pqr() {//no input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
			}
		
//	return type - string
	public String qa() {//no input, some output
		System.out.println("qa method");
		String s = "Selenium";
				return s;
	}
	
//	return type - int
//	input parameters/arguements
	
	public int division(int x, int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}

}
