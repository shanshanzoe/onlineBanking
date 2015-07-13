package model;

public class SavingAcc extends AbsAccount {

	public SavingAcc(double balance) {
		super(balance);
	}

	private double interestRate;

	public double getRate() {
		return interestRate;
	}

	public void setRate(double rate) {
		this.interestRate = rate;
	}

}
