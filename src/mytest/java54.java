package mytest;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class java54 {

	public static void main(String[] args) {
		try{
			 //取得網頁服務內容
			URL url = new URL("http://pdfmyurl.com?url=http://tw.yahoo.com");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			
			//抓取後下載回資料夾
			InputStream in = conn.getInputStream();
			FileOutputStream fout = new FileOutputStream("dir1/in.pdf");
					
			byte [] buf = new byte [4096]; int len;
			while((len = in.read(buf)) != -1);{
				
			
			fout.write(buf, 0, len);;
			fout.flush();
			fout.close();
			in.close();
			System.out.println("OK");
			}
		}catch (Exception e){
			System.out.println(e.toString());
		}
			

		}

	}
