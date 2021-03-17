package OOPConceptPart2Practice;

public class CarTest {

	public static void main(String[] args) {

		BMW t = new BMW();
		
		t.start();
		t.stop();
		t.refuel();
		t.engine();
		t.theftSafety();
		
		System.out.println("***********");
		
		Car c = new Car();
		c.start();
		c.start();
		c.refuel();
		c.engine();
		
		System.out.println("*********");
		//Top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		System.out.println("*********");
		Vehicle e = new Vehicle();
		e.engine();
		
		
		
		
	}

}
