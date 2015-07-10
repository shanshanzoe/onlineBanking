package model;

public abstract class AbsAccount implements IAccount {
	private Transaction[] transactions;
	private int transactionIndex;
	private double balance;

	public AbsAccount (Transaction[] transactions, double balance) {
		this.transactions = transactions;
		this.balance=0.0;
	}
	
	public void swipeCard(String date, String description, double paidMoney) {}
	
	public void insertTransaction(String date, String description, double amount){
		balance = balance+amount;
		Transaction transaction = new Transaction(date, description, amount,balance);
		transactions[transactionIndex]=transaction;
		transactionIndex++;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void withdraw(double amount) {
		if (this.balance >= amount)
			this.balance -= amount;
		else
			System.out.println("Withdraw amount can not exceed the available balance");
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
}
