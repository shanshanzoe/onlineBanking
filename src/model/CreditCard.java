package model;

public class CreditCard implements IAccount{
	private double totalCredit;
	private double currentBalance; // the money has been used
	private double availCredit; // available Credit
	private Transaction[] transactions;
	private int transactionIndex;

	public CreditCard(double totalCredit) {
		this.totalCredit = totalCredit;
		this.availCredit = totalCredit;
		this.currentBalance = totalCredit - availCredit; // 0
		transactions = new Transaction[100];
		transactionIndex = 0;
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
		System.out.println("transaction");
	}
	
	public double getBalance(){
		return this.currentBalance;
	}
	
	public void deposit(double amount) {
		this.currentBalance -= amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("You cannot withdraw from a credit account");
	}
	
	public void printAllTransactions() {
		for (int i=0; i<transactionIndex; i++) {
			System.out.println(transactions[i]);
		}
	}

}
