package a.b.c;

import java.net.Socket;
// public class Socket extends Object implements Closeable
//  Socket Ŭ������ �� ��(?) ��(�� ����� ����) �̾��ֱ� ���� ��.
//  Socket �� port �� ����ϴ� �ڹ� ��ü
//  ��ǻ�Ϳ� ������ ���� �湮�� ����
import java.net.InetAddress;

public class PortScannerTest extends Thread{

	protected static final int SIZE = 16;
	// ������ �� ���� �� int SIZE = 16 ����;
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