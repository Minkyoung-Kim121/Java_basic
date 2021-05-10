package a.b.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;

public class TcpBasicClient{

	public static void main(String args[]){

		try
		{
			System.out.println(" >> 클라이언트 시작.");
			Socket sClient = new Socket("127.0.0.1", 7070);
			System.out.println(" >> 서버에 접속 성공.");
		
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(sClient.getInputStream()));
			PrintWriter out = 
			new PrintWriter(new OutputStreamWriter(sClient.getOutputStream()));

			// 서버 소켓에 메시지 전송
			String msg = "안녕하세요 클라이언트 입니다..!!";
			out.println(msg);
			out.flush();
			System.out.println("[클라이언트]" + msg);

			// 서버 소켓으로부터 받은 메시지를 화면에 출력
			System.out.println("[서버]" + in.readLine());
			sClient.close();
		}
		catch (IOException e)
		{
			System.out.println(" 에러가 : " + e.getMessage());
		}
	
	}
}