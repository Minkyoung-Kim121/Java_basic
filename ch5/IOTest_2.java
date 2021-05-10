package a.b.c;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Source Destination(Target)
Stream
int / out
inbound / outbound

protocol : 통신 규약.
port : 어플리케이션을 가리킨다.
		컴퓨터에서 프로그램(어플리케이션)은 port로 찾아간다.
		Oracle DBMS : 1521 port
		MS-SQL Server : 1433 port
ip : 컴퓨터를 가리킨다 
	(한대의 컴퓨터(서버)에 4개의 ip 가질 수 있다.)
	한대의 컴퓨터에 network 카드를 4개 꼽을 수 있다. (슬롯이 4개)
tcp : 
ipconfig :
ipconfig /all :
netstat :
ping :
MAC address :

Ipv4 :
Ipv6 :
*/

public class IOTest_2{
	public static void main(String args[]) throws IOException{
		
		//파일을 읽어서
		FileInputStream fis = new FileInputStream("IOTest_2.java");
		System.out.println("fis >>  " + fis);

		//파일생성하여
		FileOutputStream fos = new FileOutputStream("IOTest_2.bak");
		System.out.println("fos >>  " + fos);

		int data = 0;
		//생성한 파일에 쓴다
		while((data = fis.read()) != -1){
			System.out.print((char)data);
			fos.write(data); 
		}

	
	}
}