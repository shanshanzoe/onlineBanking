package model;

public class Test {
	public static void main(String arg[]) {
		CreditCard card2 = new CreditCard(700);
		
		card2.swipeCard("07/07/2010", "clothes", 900);
		
		System.out.println(card2.getBalance());
		
		card2.swipeCard("07/07/2010", "food", 50);
		
		System.out.println(card2.getBalance());
		
		card2.printAllTransactions();
		
	}

}