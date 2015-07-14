package model;

public class SavingAcc extends AbsAccount {

	public SavingAcc(String accName, double balance) {
		super(accName, balance);
	}

	private double interestRate;

	public double getRate() {
		return interestRate;
	}

	public void setRate(double rate) {
		this.interestRate = rate;
	}

}
