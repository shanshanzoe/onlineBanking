package model;

public class CheckingAcc extends AbsAccount {	
	Transaction[] transactions;
	double balance;
	
	public CheckingAcc(double balance) {
		super(balance);
	}
	
	public void swipeCard(String date, String description, double amount) { 
		// String descriptionValue= description;
		this.withdraw(date, description, amount);
		
	}

}
