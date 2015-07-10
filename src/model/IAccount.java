package model;

public interface IAccount {
	public double getBalance();
	public void swipeCard(String date, String description, double paidMoney);
	public void insertTransaction(String date, String description, double amount);
	public void withdraw(double amount);
	public void deposit(double amount);
}
