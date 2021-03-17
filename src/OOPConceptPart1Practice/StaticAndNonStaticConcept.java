package OOPConceptPart1Practice;

public class StaticAndNonStaticConcept {

	//Global variables: will be available across all functions/methods with some conditions
	String name = "Salar";
	static int age = 25;
	
	public static void main(String[] args) {

		System.out.println(age);
		
		sendMail();
		StaticAndNonStaticConcept.sendMail();
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.name);
		
		obj.sum();
	}

	public void sum() {
		System.out.println("Sum method");
	}
	
	public static void sendMail() {
		System.out.println("Send mail method");
	}
	
}
