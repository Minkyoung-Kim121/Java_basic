package a.b.c;

import java.net.InetAddress;
import java.net.UnknownHostException;
// UnknownHostException    ?? 

/*
방화벽(파이어월 : firewall)
	  미리 정의된 보안 규칙에 기반해서 들어오고 나가는 네트워크 트래픽을 모니터링, 제어하는 역할
	을 하는 네트워크 보안 시스템.
	  일반적으로 신뢰할 수 있는 내부 네트워크와 
	신뢰할 수 없는 외부 네트워크간(ex) Internet)의 장벽으로 구성된다.
	  서로 다른 네트워크를 지나는 데이터를 허용 또는 거부하거나, 검열 및 수정하는 
	하드웨어 혹은 소프트웨어 장치를 말한다.
	    방화벽은 막는 건데, 규칙이 있다. 규칙:~~만 들어가야한다 하고 허용하는 것.
프록시서버(Proxy Server)
	  클라이언트가 다른 네트워크 서비스에 간접적으로 접속할 수 있게 하는 
	컴퓨터 시스템 혹은 응용프로그램을 말한다.
	(이 때 프록시서버를 통해 클라이언트가 간접적으로 접속 가능하다.)
	     방화벽과 프록시서버의 차이점을 알아야
패킷(packet-소포   :  package(수화물) + bucket(덩어리) 의 합성어)
	  정보 기술에서 컴퓨터 네트워크가 전달하는 데이터의 형식화된 블록이다.
	이를 패킷 방식이라 한다.
	  데이터(정보)를 일정 크기로 자른 것이며,
	통상적으로 헤더/데이터/트레일러(몸통, 데이터, 꼬리)로 구성된다.
	  네트워크 계층(Layer 3)에서 정의되는 데이터 단위이고,
		   Layer 3 : 데이터 프레임?
	그 외에도 OSI의 각 계층에서 주고 받는 정보의 단위를 모두 패킷이라 한다.
	  인터넷(Internet)에서는 IP 데이터그램을 패킷이라 한다.
	  컴퓨터 통신 연결은 단순히 독립적인 바이트, 문자열, 비트를 
	  연속하여 데이터를 전송하는 방식이다.
핑(Ping : Packet Internet Groper)
	  IP 네트워크를 통해 특정한 호스트의 도달 여부를 테스트하는 데 쓰이는
	  컴퓨터 네트워크 도구 중 하나이다.
	  ICMP echo 패킷 이용
	       IT 용어 잘 알아야!
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