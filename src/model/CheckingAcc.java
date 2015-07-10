package model;

public class CheckingAcc extends AbsAccount {	
	Transaction[] transactions;
	double balance;
	
	public CheckingAcc(Transaction[] transactions, double balance) {
		super(transactions, balance);
	}
	
	public void swipeCard(String date, String description, double paidMoney) { 
		// String descriptionValue= description;
		balance -= paidMoney;
		insertTransaction(date, description, paidMoney);
		}
}
