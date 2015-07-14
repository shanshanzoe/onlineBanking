package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class setUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction checkingTran1 = new Transaction ("09092013", "food", 200, 1000);
		Transaction savingTran = new Transaction("09012015", "deposit", 2000, 2000);
		Transaction creditTran = new Transaction ("01192015", "gas", 200, 1000);
		Transaction checkingTran2 = new Transaction ("09102013", "stuff", 100, 900);
		
		
		CheckingAcc checking1 = new CheckingAcc("Checking -1234", 1000);
		checking1.insertTransaction(checkingTran1);
		checking1.swipeCard("09012013", "fruit", 20);
		
		CheckingAcc checking2 = new CheckingAcc("Checking -2234", 900);
		checking2.insertTransaction(checkingTran2);
		
		SavingAcc saving1 = new SavingAcc("Saving -4567", 2000);
		saving1.insertTransaction(savingTran);
		
		CreditCard credit1 = new CreditCard("Credit -2233", 1000);
		credit1.insertTransaction(creditTran);
		
		CheckingAcc[] checkingAccounts = new CheckingAcc [2];
		checkingAccounts[0] = checking1;
		checkingAccounts[1] = checking2;

		
		SavingAcc[] savingAccounts = new SavingAcc [1];
		savingAccounts[0] = saving1;
		
		CreditCard[] creditCards = new CreditCard [1];
		creditCards[0] = credit1;
		
		User Shanshan = new User ("shanshan", checkingAccounts, savingAccounts, creditCards);
		
		//Create new hashmap
		HashMap<String, User> user = new HashMap<String, User>();
		
		//Put elements into the hashmap
		user.put("Shanshan", Shanshan);
		//System.out.print(Shanshan.getUsername());
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt"));
			
			oos.writeObject(user);
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
			HashMap<String, User> temp = (HashMap<String, User>) ois.readObject();
			temp.get("Shanshan");
			((User)temp.get("Shanshan")).getCheckingAcc("Checking -1234");
			
		} catch(Exception e) {
			System.out.print(e.getMessage());
		}
	}
}
