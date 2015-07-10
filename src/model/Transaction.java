package model;

public class Transaction {
	private String date;
	private String description;
	private double amount;
	private double balance;


	public Transaction(String date, String description, double amount, double balance) {
		this.date = date;
		this.description = description;
		this.amount = amount;
		this.balance = balance;

	}
	
	public void setDate(String date){
		this.date = date;
	}
	
	public String getDate(){
		return date;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setAmount(double amount){
		this.amount=amount;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setBalance(double balance){
		 this.balance= balance;
	}
	
	
	@Override
	public String toString(){
		String print="";
		print = print+"Date: "+date+";";
		print = print+"Description: "+description+ ";";
		print = print+"Amount: "+amount+";";
		print = print+"Available Balance: "+ balance;
		return print;
	}
 
}
