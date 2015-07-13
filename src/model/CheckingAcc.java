package model;

public class CheckingAcc extends AbsAccount {

	public CheckingAcc(double balance) {
		super(balance);
	}

	public void swipeCard(String date, String description, double amount) {
		// String descriptionValue= description;
		this.withdraw(date, description, amount);

	}

}
