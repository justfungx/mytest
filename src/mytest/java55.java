package mytest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class java55 {

	public static void main(String[] args) {
		try{
			 //存入sql
			URL url = new URL("http://10.1.6.73/hey.php?cname=你好&tel=7533961&birthday=1999-02-03");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			conn.getInputStream();
			
			System.out.println("OK");
			
		}catch (Exception e){
			System.out.println(e.toString());
		}
			

		}

	}
