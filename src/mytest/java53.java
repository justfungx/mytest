package mytest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class java53 {

	public static void main(String[] args) {
	try{
		URL url = new URL("http://iii.org.tw");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.connect();
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
String line;
		while ((line = reader.readLine())!=null){
			System.out.println(line);
		}
	}catch (Exception e){
		
	}
		

	}

}
