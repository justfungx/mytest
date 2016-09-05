package mytest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class java38 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
					new FileInputStream("dir1/Book1.csv");
			InputStreamReader irs = new InputStreamReader(fin);
			BufferedReader br = new BufferedReader(irs);
			
			String line;
			while ((line = br.readLine()) != null){
				String[] row = line.split(",");
				System.out.println("Name:" + row[0] + 
					"\t Tel:" + row[1] + 
					"\t Addr.:" + row[2]);
			}
			
			fin.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}