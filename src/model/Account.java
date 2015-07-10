package model;

public class Account {
	private Transaction[] transactions;
	private int transactionIndex;
	private double balance;

 
	public Account(){
		transactions= new Transaction [100];
		transactionIndex=0;
		this.balance=0.0;
	}
	
	public void insertTransaction(String date, String description, double amount){
		balance = balance+amount;
		Transaction transaction = new Transaction(date, description, amount,balance);
		transactions[transactionIndex]=transaction;
		transactionIndex++;
	}
	
	public double getBalance(){
		return balance;
	}

}
