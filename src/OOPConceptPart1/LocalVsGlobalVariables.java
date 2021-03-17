package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
//	Global variables --> global class
	String name = "Salar";
	int age = 25;

	public static void main(String[] args) {
		
//		Local variable
		int i = 10; // this is inside the main method and can't be used inside the sum method because main method is a local class
		System.out.println(i); //We can use the local variable directly
				
		
//		We should access the global variable by FIRST creating an obj in the 'main method'
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
	}
	
	public void sum() {
//		We cannot call the global variable inside the sum method because it is a non-static method
		
		int i = 15; // this i is in the sum method and can't be used in the main method because sum method is a local class
		
	}

}
