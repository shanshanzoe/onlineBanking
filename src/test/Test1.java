package test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedWriter writer = null;
		try {
			String timeLog = "sb";
					
//					new SimpleDateFormat("yyyyMMdd_HHmmss")
//					.format(Calendar.getInstance().getTime());
			File temp3 = new File(timeLog);
			System.out.println(temp3.getCanonicalPath());
			writer = new BufferedWriter(new FileWriter(temp3));
			writer.write("hello world");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {

			}
		}

	}

}
