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
			System.out.println(" >> Ŭ���̾�Ʈ ����.");
			Socket sClient = new Socket("127.0.0.1", 7070);
			System.out.println(" >> ������ ���� ����.");
		
			BufferedReader in = 
			new BufferedReader(new InputStreamReader(sClient.getInputStream()));
			PrintWriter out = 
			new PrintWriter(new OutputStreamWriter(sClient.getOutputStream()));

			// ���� ���Ͽ� �޽��� ����
			String msg = "�ȳ��ϼ��� Ŭ���̾�Ʈ �Դϴ�..!!";
			out.println(msg);
			out.flush();
			System.out.println("[Ŭ���̾�Ʈ]" + msg);

			// ���� �������κ��� ���� �޽����� ȭ�鿡 ���
			System.out.println("[����]" + in.readLine());
			sClient.close();
		}
		catch (IOException e)
		{
			System.out.println(" ������ : " + e.getMessage());
		}
	
	}
}