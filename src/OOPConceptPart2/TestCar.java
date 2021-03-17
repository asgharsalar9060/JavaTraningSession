package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
//		Static polymorphism or compile-time polymorphism --> polymorphism means 1 to many or overriding and inheriting
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		System.out.println("**********");
		
		Car c = new Car();
		
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("**********");
		
//		Top casting
		Car c1 = new BMW(); //Child class object can be referred by parent class reference variable -- called dynamic polymorphism  
//		or Run-time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		
//		Down casting
		
		BMW b1 = (BMW)new Car();//we can convert/cast car object to BMW object but it gives ClassCastException

	}

}
