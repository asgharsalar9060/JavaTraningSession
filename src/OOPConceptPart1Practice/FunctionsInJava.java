package OOPConceptPart1Practice;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
		int i = obj.pqr();
		System.out.println(i);
		
		String j = obj.qa();
		System.out.println(j);
		
		int div = obj.division(10, 5);
		System.out.println(div);
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public int pqr() {
		System.out.println("pqr method");
		int a = 10;
		int b = 12;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {
		System.out.println("qa method");
		String a = "Selenium";
		return a;
	}
	
	public int division(int x, int y) {
		System.out.println("divistion method");
		int a = x/y;
		return a;
	}
	

}
