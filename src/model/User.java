package model;

import java.io.Serializable;

public class User implements Serializable {
	private String username;
	private CheckingAcc[] checkingAcc;
	private SavingAcc[] savingAcc;
	private CreditCard[] creditCard;

	public User() {

	}

	public User(String username, CheckingAcc[] checkingAcc, SavingAcc[] savingAcc,
			CreditCard[] creditCard) {
		this.username = username;
		this.checkingAcc = checkingAcc;
		this.savingAcc = savingAcc;
		this.creditCard = creditCard;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void getCheckingAcc (String name) {
		for (int i = 0; i < checkingAcc.length; i++) {
			if (checkingAcc[i].getAccName().equals(name)) {
				System.out.println("Account Name: " + checkingAcc[i].getAccName());
				System.out.print("Balance: ");
				System.out.println(checkingAcc[i].getBalance());
				System.out.println("Transactions: ");
				checkingAcc[i].printAllTransactions();
				break;
			}
		}
	}

	public void setCheckingAcc(CheckingAcc[] checkingAcc) {
		this.checkingAcc = checkingAcc;
	}

	public void getSavingAcc(String name) {
		for (int i = 0; i < savingAcc.length; i++) {
			if (savingAcc[i].getAccName().equals(name)) {
				System.out.println("Account Name: " + savingAcc[i].getAccName());
				System.out.print("Balance: ");
				System.out.println(savingAcc[i].getBalance());
				System.out.println("Transactions: ");
				savingAcc[i].printAllTransactions();
				break;
			}
		}
	}

	public void setSavingAcc(SavingAcc[] savingAcc) {
		this.savingAcc = savingAcc;
	}

	public void getCreditCard(String name) {
		for (int i = 0; i < creditCard.length; i++) {
			if (creditCard[i].getAccName().equals(name)) {
				System.out.println("Account Name: " + creditCard[i].getAccName());
				System.out.print("Balance: ");
				System.out.println(creditCard[i].getBalance());
				System.out.println("Transactions: ");
				creditCard[i].printAllTransactions();
				break;
			}
		}
	}

	public void setCreditCard(CreditCard[] creditCard) {
		this.creditCard = creditCard;
	}

//	public boolean verifyPassword(String pass) {
//		if (pass.equals(password))
//			return true;
//		else
//			return false;
//	}

}
