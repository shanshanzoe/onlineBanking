package model;

import java.io.Serializable;

public class CreditCard implements IAccount, Serializable{
	private double totalCredit;
	private double currentBalance; // the money has been used
	private double availCredit; // available Credit
	private Transaction[] transactions;
	private int transactionIndex;
	private String accName;

	public CreditCard(String accName, double totalCredit) {
		this.totalCredit = totalCredit;
		this.availCredit = totalCredit;
		this.currentBalance = totalCredit - availCredit; // 0
		transactions = new Transaction[100];
		transactionIndex = 0;
		this.accName = accName;
	}

	public void swipeCard(String date, String description, double paidMoney) { // update
	// double paidMoneyValue=paidMoney;
	// String dateValue=date;
	// String descriptionValue= description;
		if ((this.getBalance() + paidMoney) < availCredit) {
			currentBalance += paidMoney;
			availCredit = totalCredit - currentBalance;
			insertTransaction(date, description, paidMoney);
		} else {
			System.out.println("Transaction Denied");
		}
		
	}

	public void insertTransaction(String date, String description, double paidMoney) {
		Transaction transaction = new Transaction(date, description, paidMoney, availCredit);
		transactions[transactionIndex] = transaction;
		transactionIndex++;
	}
	
	public void insertTransaction(Transaction transaction){
		transactions[transactionIndex] = transaction;
		transactionIndex++;
	}
	
	public double getBalance(){
		return this.currentBalance;
	}
	
	public void deposit(String date, String description, double amount) {
		this.currentBalance -= amount;
		availCredit = totalCredit - currentBalance;
		Transaction transaction = new Transaction(date, description, amount, availCredit);
		transactions[transactionIndex] = transaction;
		transactionIndex++;
	}
	
	public void withdraw(String date, String description, double amount) {
		System.out.println("You cannot withdraw from a credit account");
	}
	
	public void printAllTransactions() {
		for (int i=0; i<transactionIndex; i++) {
			System.out.println(transactions[i]);
		}
	}
	
	public void transfer(IAccount account, String date, double amount) {
		
	}
	
	public String getAccName() {
		return this.accName;
	}
}
