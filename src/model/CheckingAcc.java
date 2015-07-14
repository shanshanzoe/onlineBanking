package model;

public class CheckingAcc extends AbsAccount {

	public CheckingAcc(String accName, double balance) {
		super(accName, balance);
	}

	public void swipeCard(String date, String description, double amount) {
		// String descriptionValue= description;
		this.withdraw(date, description, amount);

	}

}
