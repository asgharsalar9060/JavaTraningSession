package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		System.out.println("*******");
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		System.out.println("*******");
		
//		Dynamic polymorphism
//		Child class object can be referred by interface reference variables
		USBank us = new HSBCBank();
		us.credit();
		us.debit();
		us.transferMoney();
		
		System.out.println("*******");
		
		BrazilBank br = new HSBCBank();
		br.mutualFund();
		

	}

}
