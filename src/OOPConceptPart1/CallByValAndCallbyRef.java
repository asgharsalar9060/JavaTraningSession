package OOPConceptPart1;

public class CallByValAndCallbyRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByValAndCallbyRef obj = new CallByValAndCallbyRef();
		
		int x = 10;
		int y = 20;
		obj.testSum(x, y); //Call by value OR pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		
//		After swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	
	
	
	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a+b;
		return c;
	}
	
//	Call by reference - possible by using obj reference
	public void swap(CallByValAndCallbyRef t) {
		int temp;
		temp = t.p;//temp = 50
		t.p = t.q;//t.q = 60
		t.q = temp;//t.q = 50
		
	}

}
