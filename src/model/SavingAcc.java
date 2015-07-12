package model;

public class SavingAcc extends AbsAccount {
	Transaction[] transactions;
	double balance;
	
	public SavingAcc(double balance) {
		super(balance);
	}
	
	private double interestRate;
	
	public double getRate(){
		return interestRate;
	}
	
	public void setRate(double rate){
		this.interestRate=rate;
	}

}
