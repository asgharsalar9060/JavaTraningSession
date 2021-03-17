package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
//	Global variables: the scope of global variables will be available across all the functions with some conditions.
	
	String name = "Tom";//global non-static variable
	static int age = 25;//global static variable

	public static void main(String[] args) {
		
//		How to call static methods and variables
//		1- direct calling
		sum();
		
//		2- calling by class name
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
//		How to call non-static methods and variables --> create object
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		
		System.out.println(obj.name);
		
//		Can I access static methods by using object reference? yes but it is not a good practice
		obj.sum();//warning will be given

	}
	
	public void sendMail() {//non-static method
		System.out.println("send mail method");
	}
	
	public static void sum() {//static method
		System.out.println("sum method");
	}

}
