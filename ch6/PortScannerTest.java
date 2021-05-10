package a.b.c;

import java.net.Socket;
// public class Socket extends Object implements Closeable
//  Socket 클래스는 두 점(?) 을(의 통신을 위한) 이어주기 위한 것.
//  Socket 은 port 로 통신하는 자바 객체
//  컴퓨터와 소켓은 집과 방문의 관계
import java.net.InetAddress;

public class PortScannerTest extends Thread{

	protected static final int SIZE = 16;
	// 변경할 수 없는 값 int SIZE = 16 선언;
	protected InetAddress target;

	protected int id;

	public PortScannerTest(InetAddress target, int id){
		super("Port Scanner #" + id);
		this.target = target;
		this.id = id;
	}


	public void run(){
		int port =0;
		Socket s = null;

		for (int i=0; i < SIZE; i++)
		{
			try
			{
				port = SIZE * id + i;
				s = new Socket(target, port);
				System.out.println("Port #" + " is open");
			}
			catch (Exception ioe)
			{
			}finally{
				try
				{
					s.close();
				}
				catch (Exception ignored)
				{
				}
			}
		}
	}

	public static void main(String[] args){
		
		if (args.length != 1)
		{
			System.err.println("Usage : java PortScannerTest [ip/hostname]");
			System.exit(1);
		}

		InetAddress addr = null;
		try
		{
			addr = InetAddress.getByName(args[0]);
		}
		catch (Exception uhe)
		{
			System.err.println("Invalid target!!");
			System.err.println(2);
		}

		for (int i=0; i < SIZE; i++)
		{
			new PortScannerTest(addr, i).start();
		}
	}
}