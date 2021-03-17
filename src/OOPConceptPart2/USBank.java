package OOPConceptPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
//	Only method declaration
//	No method body -- only method prototype
//	In interface, we can declare the variables, and variables by default are static in nature
//	Variable values will not be changed -- it is final/constant in nature
//	No static method allowed in interface - gives illegal modifier
//	No main method in interface
//	We cannot create the object of interface -->meaning interface is abstract in nature

}
