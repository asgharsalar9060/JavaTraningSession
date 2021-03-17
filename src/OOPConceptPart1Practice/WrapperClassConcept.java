package OOPConceptPart1Practice;

public class WrapperClassConcept {

	public static void main(String[] args) {

		String a = "100";
		
		//Conversion: String to int
		int a1 = Integer.parseInt(a);
		System.out.println(a1+10);
		
		//Conversion: int to string
		int b = 12;
		
		String b1 = String.valueOf(b);
		System.out.println(b1+10);
		
		//Conversion: string to double
		String c = "10.11";
		double c1 = Double.parseDouble(c);
		System.out.println(12+c1);
		System.out.println(c1+10);
		
		//Conversion: double to string
		double d = 20.12;
		String d1 = String.valueOf(d);
		System.out.println(10+d1);
		
		//Conversion: string to boolean
		String e = "false";
		boolean e1 = Boolean.parseBoolean(e);
		System.out.println(e1);
	}

}
