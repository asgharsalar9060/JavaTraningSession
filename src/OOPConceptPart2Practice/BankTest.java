package OOPConceptPart2Practice;

public class BankTest {

	public static void main(String[] args) {

		HSBCBank h = new HSBCBank();
		h.credit();
		h.debit();
		h.moneyTransfer();
		h.studentLoan();
		
		
		System.out.println("***********");
		USBank u = new HSBCBank();
		u.credit();
		u.debit();
		u.moneyTransfer();
		
		System.out.println("*********");
	
		BrazilBank b = new HSBCBank();
		b.carWash();
		
		
		
	}

}
