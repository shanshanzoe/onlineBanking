package model;

public abstract class AbsAccount implements IAccount {
	private Transaction[] transactions;
	private int transactionIndex;
	private double balance;

	public AbsAccount (double balance) {
		transactions = new Transaction[100];
		this.balance = balance;
		this.transactionIndex = 0;
	}
	
	public void swipeCard(String date, String description, double paidMoney) {}
	
	public void insertTransaction(String date, String description, double amount){
		if (this.getBalance() >= amount) {
			balance = balance-amount;
			Transaction transaction = new Transaction(date, description, amount, balance);
			transactions[transactionIndex]=transaction;
			transactionIndex++;
			System.out.println("Insert Transaction");
		} else {
			System.out.println("Transaction Denied");
		}
		
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
	
	public void printAllTransactions() {
		for (int i=0; i<transactionIndex; i++) {
			System.out.println(transactions[i]);
		}
	}
}
