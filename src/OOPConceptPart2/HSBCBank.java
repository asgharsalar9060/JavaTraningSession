package OOPConceptPart2;

// the implements keyword is used to implement an interface

public class HSBCBank implements USBank, BrazilBank{//We are achieving multiple inheritance
//	Is-a relationship
	
//	If a class is implementing any interface, then it is mandatory to define/override all the methods of interface.
	
	//Overriding from USBank
	public void credit() {
		System.out.println("hsbc---credit");
	}
	
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc---transferMoney");
	}
	
	//Separate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc---edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc---car loan");
	}
	
	
	//Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("hsbc---mutualFund");
	}
	
}
