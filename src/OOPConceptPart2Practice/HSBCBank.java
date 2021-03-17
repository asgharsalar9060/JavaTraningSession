package OOPConceptPart2Practice;

public class HSBCBank implements USBank, BrazilBank{

	public void credit() {
		System.out.println("hsbc---credit");
	}
	
	public void debit() {
		System.out.println("hsbc---debit");
	}
	
	public void moneyTransfer() {
		System.out.println("hsbc---moneyTransfer");
	}
	
	//separate methods of hsbc bank
	
	public void studentLoan() {
		System.out.println("hsbc-- studentLoan");
	}
	
	public void carWash() {
		System.out.println("hsbc---carWash");
	}

	
}
