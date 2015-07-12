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
	
	public double getBalance() {
		return this.balance;
	}
	
	public void withdraw(String date, String description, double amount) {
		if (this.balance >= amount) {
			this.balance -= amount;
			Transaction transaction = new Transaction(date, description, amount, balance);
			transactions[transactionIndex]=transaction;
			transactionIndex++;
		} else
			System.out.println("The amount can not exceed the available balance");
	}
	
	public void deposit(String date, String description, double amount) {
		this.balance += amount;
		Transaction transaction = new Transaction(date, description, amount, balance);
		transactions[transactionIndex]=transaction;
		transactionIndex++;
	}
	
	public void printAllTransactions() {
		for (int i=0; i<transactionIndex; i++) {
			System.out.println(transactions[i]);
		}
	}
	
	public void transfer(IAccount account, String date, double amount) {
		this.withdraw(date, "Transfer", amount);
		account.deposit(date, "Transfer", amount);
			
	}
}
