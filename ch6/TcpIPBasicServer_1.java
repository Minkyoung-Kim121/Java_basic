package a.b.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;

public class TcpIPBasicServer extends Thread{

	private ServerSocket ss;

	public TcpIPBasicServer() throws IOException{
		System.out.println(">>> :  서버 시작.");
		// 소켓 통신할 때 0 ~ 1024 포트는 사용하면 않됨
		// well known port 라고 해서 이미 사용이 정의된 포트이다. 
		ss = new ServerSocket( 7070
			                  ,200
					          ,InetAddress.getByName("127.0.0.1"));
		// ss.setSoTimeout(100000);
	}
	
	public void run(){
		while (true)
		{
			try
			{
				System.out.println(">>> : 클라이언트 접속 대기." + ss);			
				Socket sc = ss.accept();
				System.out.println(">>> : 클라이언트 접속 성공." + sc);

				BufferedReader in = 
				new BufferedReader(new InputStreamReader(sc.getInputStream()));
				PrintWriter out = 
				new PrintWriter(new OutputStreamWriter(sc.getOutputStream()));

				// 클라이언트 소켓으로부터 받은 메시지를 화면에 출력
				System.out.println("[클라이언트]" + in.readLine());
				// 클라이언트 소켓에 메시지 전송
				String msg = "서버에 접속하신 것을 환영합니다.!!";
				out.println(msg);
				out.flush();
				System.out.println("[서버]" + msg);
			}			
			catch (Exception e)
			{
				System.out.println("e >>> : " + e.getMessage());
				break;
			}
		}
	}
	public static void main(String args[]){

		try
		{
			TcpIPBasicServer tbs = new TcpIPBasicServer();
			Thread t = new Thread(tbs);
			// Thread t = new new TcpIPBasicServer();
			t.start();
		}
		catch (IOException e)
		{
			System.out.println("e >>> : " + e.getMessage());
		}	
	}
}