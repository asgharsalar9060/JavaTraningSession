package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		+ sign is the concatenation operator
		
		int a = 9;
		int b = 41;
		
		String c = "Hello";
		String d = "World";
		
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(a+b+c+d);
		System.out.println(c+d+a+b);
		System.out.println(a+b+(c+d));
		System.out.println(c+d+(a+b));
		System.out.println("Hello World");
		System.out.println("The value of a is: "+ a);
		System.out.println("The value of a and b are: "+(a+b));
		
//		In System.out.println, 'ln' gives a new line on the console
		System.out.println("Hello Selenium");
		System.out.println("Hello Testing");
		
//		In System.out.print, the output will be printed on the same line on the console
		System.out.print("Hello Selenium");
		System.out.print(" Hello Testing");

	}

}


