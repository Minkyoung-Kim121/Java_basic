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
		System.out.println(">>> :  ���� ����.");
		// ���� ����� �� 0 ~ 1024 ��Ʈ�� ����ϸ� �ʵ�
		// well known port ��� �ؼ� �̹� ����� ���ǵ� ��Ʈ�̴�. 
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
				System.out.println(">>> : Ŭ���̾�Ʈ ���� ���." + ss);			
				Socket sc = ss.accept();
				System.out.println(">>> : Ŭ���̾�Ʈ ���� ����." + sc);

				BufferedReader in = 
				new BufferedReader(new InputStreamReader(sc.getInputStream()));
				PrintWriter out = 
				new PrintWriter(new OutputStreamWriter(sc.getOutputStream()));

				// Ŭ���̾�Ʈ �������κ��� ���� �޽����� ȭ�鿡 ���
				System.out.println("[Ŭ���̾�Ʈ]" + in.readLine());
				// Ŭ���̾�Ʈ ���Ͽ� �޽��� ����
				String msg = "������ �����Ͻ� ���� ȯ���մϴ�.!!";
				out.println(msg);
				out.flush();
				System.out.println("[����]" + msg);
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