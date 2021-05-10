package a.b.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpBasicServer{

	public static void main(String args[]){

		try
		{
			System.out.println(" >> 서버 시작.");
			// 소켓 통신할 때 0 ~ 1024 포트는 사용하면 않됨
			// well known port 라고 해서 이미 사용이 정의된 포트이다. 
			ServerSocket ss = new ServerSocket(7070);
			System.out.println(" >> 클라이언트 접속 대기.");

			// 클라이언트 접속 때까지 대기
			Socket sc = ss.accept();
			System.out.println(" >> 클라이언트 접속 성공.");

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
			sc.close();
		}
		catch (IOException e)
		{
			System.out.println(" 에러가 : " + e.getMessage());
		}	
	}
}