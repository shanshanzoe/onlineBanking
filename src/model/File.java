/*package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class File {
	public static void main(String args[]) throws IOException {
		Map<String, User> map = new HashMap<String, User>();
		BufferedReader in = null;
		User user = new User();

		try {
			in = new BufferedReader(new FileReader("transaction.txt"));

			String line = "";
			while (line != null) {	
				line = in.readLine();
				if(line==null)
					break;
				switch (line) {
				case "#username":
					
					String username = in.readLine();
					//System.out.println(username);
					user.setUsername(username);
//					System.out.println(username);
					break;
					
				case "#password":
					String password = in.readLine();
					//System.out.println(password);
					user.setPassword(password);
					break;
					
				case "#checking":
					String checkingBalance = in.readLine();
					double cBalance = Double.parseDouble(checkingBalance);
					CheckingAcc checkingAcc = new CheckingAcc(cBalance);
					user.setCheckingAcc(checkingAcc);
					// read #transaction
					in.readLine();
					while (!(line = in.readLine()).startsWith("#")) {
						String []parts = line.split(":");
						String date = parts[0];
						String description = parts[1];
						String amountText = parts[2];
						double amount = Double.parseDouble(amountText);
						String balanceText = parts[3];
						double balance = Double.parseDouble(balanceText);
						Transaction transaction = new Transaction(date,
								description, amount, balance);
						//System.out.println(transaction);
						checkingAcc.insertTransaction(transaction);
					}

					break;
				case "#saving":
					String savingBalance = in.readLine();
					double sBalance = Double.parseDouble(savingBalance);
					SavingAcc savingAcc = new SavingAcc(sBalance);
					user.setSavingAcc(savingAcc);
					// read #transaction
					in.readLine();
					while (!(line = in.readLine()).startsWith("#")) {
						String parts[] = line.split(":");
						String date = parts[0].toString();
						String description = parts[1].toString();
						String amountText = parts[2].toString();
						double amount = Double.parseDouble(amountText);
						String balanceText = parts[3].toString();
						double balance = Double.parseDouble(balanceText);
						Transaction transaction = new Transaction(date,
								description, amount, balance);
						//System.out.println(transaction);
						savingAcc.insertTransaction(transaction);
					}
					break;
				case "#credit":
					String creditBalance = in.readLine();
					double crBalance = Double.parseDouble(creditBalance);
					CreditCard creditCard = new CreditCard(crBalance);
					user.setCreditCard(creditCard);
					// read #transaction
					in.readLine();
					while (!(line = in.readLine()).startsWith("#")) {
						String parts[] = line.split(":");
						String date = parts[0].toString();
						String description = parts[1].toString();
						String amountText = parts[2].toString();
						double amount = Double.parseDouble(amountText);
						String balanceText = parts[3].toString();
						double balance = Double.parseDouble(balanceText);
						Transaction transaction = new Transaction(date,
								description, amount, balance);
						//System.out.println(transaction);
						creditCard.insertTransaction(transaction);
					}
					break;
				default:
					break;
				}
				
			}

		} catch (Exception e){
			System.out.println(e);
		}finally {
			if (in != null) {
				in.close();
			}
		}
		// store object into hashmap
		map.put(user.getUsername(), user);

		// for test
		System.out.println("Enter your Username: ");
		Scanner scanIn = new Scanner(System.in);
		String username = scanIn.nextLine();

		if (map.containsKey(username)) {
			System.out.println("Enter your password: ");
			User selectedUser = map.get(username);
			String password = scanIn.nextLine();
			if (selectedUser.verifyPassword(password)) {
				System.out.println("success");
				System.out.println("checking: ");
				selectedUser.getCheckingAcc().printAllTransactions();
				System.out.println("saving: ");
				selectedUser.getSavingAcc().printAllTransactions();
				System.out.println("credit: ");
				selectedUser.getCreditCard().printAllTransactions();
			} else {
				System.err.println("password error!");
			}

		} else {
			System.err.println("there is no such username!");
		}

		scanIn.close();

	}

}*/
