package a.b.c;

import java.net.InetAddress;
import java.net.UnknownHostException;
// UnknownHostException    ?? 

/*
��ȭ��(���̾�� : firewall)
	  �̸� ���ǵ� ���� ��Ģ�� ����ؼ� ������ ������ ��Ʈ��ũ Ʈ������ ����͸�, �����ϴ� ����
	�� �ϴ� ��Ʈ��ũ ���� �ý���.
	  �Ϲ������� �ŷ��� �� �ִ� ���� ��Ʈ��ũ�� 
	�ŷ��� �� ���� �ܺ� ��Ʈ��ũ��(ex) Internet)�� �庮���� �����ȴ�.
	  ���� �ٸ� ��Ʈ��ũ�� ������ �����͸� ��� �Ǵ� �ź��ϰų�, �˿� �� �����ϴ� 
	�ϵ���� Ȥ�� ����Ʈ���� ��ġ�� ���Ѵ�.
	    ��ȭ���� ���� �ǵ�, ��Ģ�� �ִ�. ��Ģ:~~�� �����Ѵ� �ϰ� ����ϴ� ��.
���Ͻü���(Proxy Server)
	  Ŭ���̾�Ʈ�� �ٸ� ��Ʈ��ũ ���񽺿� ���������� ������ �� �ְ� �ϴ� 
	��ǻ�� �ý��� Ȥ�� �������α׷��� ���Ѵ�.
	(�� �� ���Ͻü����� ���� Ŭ���̾�Ʈ�� ���������� ���� �����ϴ�.)
	     ��ȭ���� ���Ͻü����� �������� �˾ƾ�
��Ŷ(packet-����   :  package(��ȭ��) + bucket(���) �� �ռ���)
	  ���� ������� ��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ����̴�.
	�̸� ��Ŷ ����̶� �Ѵ�.
	  ������(����)�� ���� ũ��� �ڸ� ���̸�,
	��������� ���/������/Ʈ���Ϸ�(����, ������, ����)�� �����ȴ�.
	  ��Ʈ��ũ ����(Layer 3)���� ���ǵǴ� ������ �����̰�,
		   Layer 3 : ������ ������?
	�� �ܿ��� OSI�� �� �������� �ְ� �޴� ������ ������ ��� ��Ŷ�̶� �Ѵ�.
	  ���ͳ�(Internet)������ IP �����ͱ׷��� ��Ŷ�̶� �Ѵ�.
	  ��ǻ�� ��� ������ �ܼ��� �������� ����Ʈ, ���ڿ�, ��Ʈ�� 
	  �����Ͽ� �����͸� �����ϴ� ����̴�.
��(Ping : Packet Internet Groper)
	  IP ��Ʈ��ũ�� ���� Ư���� ȣ��Ʈ�� ���� ���θ� �׽�Ʈ�ϴ� �� ���̴�
	  ��ǻ�� ��Ʈ��ũ ���� �� �ϳ��̴�.
	  ICMP echo ��Ŷ �̿�
	       IT ��� �� �˾ƾ�!
	ex)  ping -c 5 www.example.com
*/

public class InetAddressTest{

	public static void main(String args[]) throws UnknownHostException{
		
		InetAddress addr00 = InetAddress.getLocalHost();
		System.out.println("addr00 >>> : " + addr00);  
		// addr00 >>> : DESKTOP-2HL3KS8/192.168.219.145

		InetAddress addr0 = InetAddress.getByName("www.naver.com");
		System.out.println("addr0 >>> : " + addr0);  
		// addr0 >>> : www.naver.com/125.209.222.142
		System.out.println("addr0 >>> : " + addr0.getHostName());  
		// addr0 >>> : www.naver.com
		System.out.println("addr0 >>> : " + addr0.getHostAddress());
		// addr0 >>> : 125.209.222.142
	
		InetAddress addr1 = InetAddress.getByName("127.0.0.1");
		System.out.println("addr1 >>> : " + addr1);  // addr1 >>> : /127.0.0.1
		System.out.println("addr1 >>> : " + addr1.getHostName());  
		// addr1 >>> : 127.0.0.1
		System.out.println("addr1 >>> : " + addr1.getHostAddress());
		// addr1 >>> : 127.0.0.1

		InetAddress addr2 = InetAddress.getByName("192.168.219.145");
		System.out.println("addr2 >>> : " + addr2);  // addr2 >>> : /192.168.219.145
		System.out.println("addr2 >>> : " + addr2.getHostName());  
		// addr2 >>> : DESKTOP-2HL3KS8
		System.out.println("addr2 >>> : " + addr2.getHostAddress());
		// addr2 >>> : 192.168.219.145

		InetAddress addr3 = InetAddress.getByName("localhost");
		System.out.println("addr3 >>> : " + addr3);  // addr3 >>> : /192.168.219.145
		System.out.println("addr3 >>> : " + addr3.getHostName());  
		// addr3 >>> : localhost/127.0.0.1
		System.out.println("addr3 >>> : " + addr3.getHostAddress());
		// addr3 >>> : 127.0.0.1

		InetAddress addr4 = InetAddress.getByName("DESKTOP-2HL3KS8");
		System.out.println("addr4 >>> : " + addr4);  
		// addr4 >>> : DESKTOP-2HL3KS8/192.168.219.145
		System.out.println("addr4 >>> : " + addr4.getHostName());  
		// addr4 >>> : DESKTOP-2HL3KS8
		System.out.println("addr4 >>> : " + addr4.getHostAddress());
		// addr4 >>> : 192.168.219.145


	


	}


}