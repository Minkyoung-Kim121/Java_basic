package a.b.c;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Source Destination(Target)
Stream
int / out
inbound / outbound

protocol : ��� �Ծ�.
port : ���ø����̼��� ����Ų��.
		��ǻ�Ϳ��� ���α׷�(���ø����̼�)�� port�� ã�ư���.
		Oracle DBMS : 1521 port
		MS-SQL Server : 1433 port
ip : ��ǻ�͸� ����Ų�� 
	(�Ѵ��� ��ǻ��(����)�� 4���� ip ���� �� �ִ�.)
	�Ѵ��� ��ǻ�Ϳ� network ī�带 4�� ���� �� �ִ�. (������ 4��)
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
		
		//������ �о
		FileInputStream fis = new FileInputStream("IOTest_2.java");
		System.out.println("fis >>  " + fis);

		//���ϻ����Ͽ�
		FileOutputStream fos = new FileOutputStream("IOTest_2.bak");
		System.out.println("fos >>  " + fos);

		int data = 0;
		//������ ���Ͽ� ����
		while((data = fis.read()) != -1){
			System.out.print((char)data);
			fos.write(data); 
		}

	
	}
}