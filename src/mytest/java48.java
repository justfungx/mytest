package mytest;

import java.lang.annotation.IncompleteAnnotationException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class java48 {

	public static void main(String[] args) {
		try{
			InetAddress ip = InetAddress.getByName("www.iii.org.tw");
			System.out.println(ip.getHostAddress());
		}catch(UnknownHostException e){
			System.out.println("UnknownHost");
		}
	}

}
