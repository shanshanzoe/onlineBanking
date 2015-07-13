package model;

public class User {
	private String username;
	private String password;
	private CheckingAcc checkingAcc;
	private SavingAcc savingAcc;
	private CreditCard creditCard;
	
      
      public User(){
    	   
      }


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public CheckingAcc getCheckingAcc() {
		return checkingAcc;
	}


	public void setCheckingAcc(CheckingAcc checkingAcc) {
		this.checkingAcc = checkingAcc;
	}


	public SavingAcc getSavingAcc() {
		return savingAcc;
	}


	public void setSavingAcc(SavingAcc savingAcc) {
		this.savingAcc = savingAcc;
	}


	public CreditCard getCreditCard() {
		return creditCard;
	}


	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
      
	
	public boolean verifyPassword(String pass){
		if(pass.equals(password))
			return true;
		else
			return false;
	}

}
