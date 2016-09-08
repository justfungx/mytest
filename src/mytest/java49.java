package mytest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class java49 {

	public static void main(String[] args) {
String data = "ho hey";
byte[] buf =data.getBytes();
//訊息傳送
try{
	DatagramSocket socket = new DatagramSocket();
	DatagramPacket packet = new DatagramPacket(buf,buf.length,
			InetAddress.getByName("10.1.6.255"),8888);
	socket.send(packet);
	socket.close();
	System.out.println("send OK");
}catch(Exception e ){
	e.printStackTrace();
}


	}

}
