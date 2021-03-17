package OOPConceptPart2;

public class BMW extends Car{//has-a relationship
	
//	Method overriding: When same methods are present in the parent class as well as in  child class with the same name and
//	same number of arguments

	
	public void start() {//overridden method
		System.out.println("BMW---start");
	}
	
	public void theftSafety() {
		System.out.println("BMW---theftSafety");
	}
	
}
