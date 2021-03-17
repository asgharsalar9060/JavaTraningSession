package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+20);
		
		
//		data conversion: string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
//		Wrapper classes - 1st letter should be written capitalized: Integer, Double, Character, Boolean
		
//		String to Double conversion
		String y = "12.13";
		System.out.println(10+y);
		
		double l = Double.parseDouble(y);
		System.out.println(10+l);
		
		String k = "true";
		
//		String to boolean conversion
		boolean d = Boolean.parseBoolean(k);
		System.out.println(d);
		
//		Int to string conversion
		int m = 23;
		System.out.println(m+20);
		
		String s = String.valueOf(m);
		System.out.println(s+20);
		
	}

}
