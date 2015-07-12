/*package model;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class File {
	public static void main (String args []) throws IOException {
		Map<String, String> map = new HashMap<String, String>();
        BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("transaction.txt"));
			
			String line = "";
	        while ((line = in.readLine()) != null) {
	            String parts[] = line.split(":");
	            String date = parts[0].toString();
	            String description = parts[1].toString();
	            String amountText = parts[2].toString();
	            Double amount = Double.parseDouble(amountText);
	            String balanceText = parts[3].toString();
	            Double balance = Double.parseDouble(balanceText);
	            
	            Transaction transaction = new Transaction(date, description, amount, balance);
	            CheckingAcc card1 = new CheckingAcc(balance);
	            card1.insertTransaction(date, description, amount);
	        }  
		} finally {
			if (in != null) {
				in.close();
			}
		}
		
	}
}
*/
