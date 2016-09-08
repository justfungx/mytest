package mytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class java52 {

	public static void main(String[] args) {
		try {
			ServerSocket server = 
				new ServerSocket(9999);
			Socket socket = server.accept();
			
			FileOutputStream fout = 
				new FileOutputStream("up/kk.jpg");
			
			InputStream in = socket.getInputStream();
			int c;
			while ( (c = in.read()) != -1){
				fout.write(c);
			}
			in.close();
			//圖片接收
			
			fout.flush();
			fout.close();
			socket.close();
			System.out.println("New call get!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}