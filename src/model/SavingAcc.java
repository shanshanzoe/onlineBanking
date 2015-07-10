package model;

public class SavingAcc extends Account {
	private double interestRate;
	
	public double getRate(){
		return interestRate;
	}
	
	public void setRate(double rate){
		this.interestRate=rate;
	}

}
