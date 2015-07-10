package model;

public class CreditCard {
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
		currentBalance += paidMoney;
		availCredit = totalCredit - currentBalance;
		insertTransaction(date, paidMoney, description);

	}

	private void insertTransaction(String date, double paidMoney,
			String description) {
		Transaction transaction = new Transaction(date, description, paidMoney,
				availCredit);
		transactions[transactionIndex] = transaction;
		transactionIndex++;
	}

}
