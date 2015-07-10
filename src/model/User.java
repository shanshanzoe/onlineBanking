package model;

public class User {
	
	//private Profile profile;    // for future implementation
      private CreditCard[] creditCards;
      private int creditCardIndex;
      private CheckingAcc[] checkingAccs;
      private int checkingIndex;
      private SavingAcc[] savingAccs;
      private int savingIndex;
      
      
      public User(){
    	  creditCards = new CreditCard [10];
    	  checkingAccs = new CheckingAcc [10];
    	  savingAccs= new SavingAcc[10];  
    	  creditCardIndex=0;
    	  checkingIndex=0;
    	  savingIndex=0;
      }
      
      
	  
    

}
