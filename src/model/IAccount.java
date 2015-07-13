package model;

public interface IAccount {
	public double getBalance();
	public void swipeCard(String date, String description, double paidMoney);
	public void withdraw(String date, String description, double amount);
	public void deposit(String date, String description, double amount);
	public void printAllTransactions();
	public void transfer(IAccount account, String date, double amount);
	public void insertTransaction(String date, String description, double amount);
}
