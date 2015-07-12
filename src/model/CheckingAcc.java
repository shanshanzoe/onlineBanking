package model;

public class CheckingAcc extends AbsAccount {	
	Transaction[] transactions;
	private int transactionIndex;
	double balance;
	
	public CheckingAcc(double balance) {
		super(balance);
	}
	
	public void swipeCard(String date, String description, double paidMoney) { 
		// String descriptionValue= description;
		balance -= paidMoney;
		insertTransaction(date, description, paidMoney);
		}

}
