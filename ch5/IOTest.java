package a.b.c;

import java.util.Scanner;

/*<IT ���>  �����̶� ���� �ϱ��ؾ� �Ѵ�.
Source Destination(Target)
Stream 
in / out 
inbound / outbound

protocol : ��� �Ծ� �̴�. 

port : ���ø����̼��� ����Ų��.
       ��ǻ�Ϳ��� ���α׷�(���ø����̼�)�� port �� ã�ư���. 
	   Oracle DBMS : 1521 port 
	   MS-SQL Server : 1433 port
ip : ��ǻ�͸� ����Ų��. 
     (�Ѵ��� ����(����)�� 4���� ip �� ���� �� �ִ�.)
	 �Ѵ��� ���Ϳ� network ī�带 4�� ���� �� ���� (���� �� 4��)
tcp : 

ipconfig 
ipconfig /all
netstat
ping
MAC address 

IPv4 : 32bit
IPv6 : 128bit
*/
public class IOTest{
	public static void main(String args[]){
		System.out.println("IO �׽�Ʈ ���� : ");
		Scanner sc = new Scanner(System.in); // scanner �Լ� ���Ŷ�� ���� sc ����������
		int data = sc.nextInt(); // int data �� �Է��ϼ���
		System.out.println("binary >> " + Integer.toBinaryString(data));
		// �� int data �� �ֿܼ� �Է��ϸ�, int data �� �Է��� ���ڸ� String ���� ��ȯ�ؼ� ������ش�.

		System.out.println("IO �׽�Ʈ ���� : ");
		Scanner sc1 = new Scanner(System.in); // scanner �� �� ���� ���� sc1 ���������� ����ϰڴٰ� ��.
		String dataS = sc1.nextLine(); // �̹����� String dataS �� �Է����ּ���
		System.out.println("���� >> " + dataS); // dataS �� ���
		
		for(int i = 0; i< dataS.length(); i++){ 
			// int i�� 0���� ���� �����ϰ�, dataS.length()(dataS �� ����) ���� ���� �� i �ϳ��� ���������ּ���.
			char c = dataS.charAt(i);  //  dataS �� �Է��� ���� ���ڷ� �ɰ���
									   //  .charAt(i)  -> i�� �Ҹ��� ���ڷ� �ɰ��� ��� �ȴ�. 1�� �����ϸ鼭
			System.out.println("binary >> :\n" + c  // \n �� �� ���
								+ (byte)c   // c �� byte �� ����ȯ
								+ Integer.toBinaryString((byte)c));  // byte �� ����ȯ�� c�� String ���� �� ��ȯ
		}
	}
}

// ��ĳ�� �Լ� ����
// import java.util.Scanner �Ѵ�.
// ������ ���� �ȿ�(�ַ� ����)-���������͹�� 
// Scanner �������� sc = new Scanner();     new Ű���带 ����ؼ� Scanner Ŭ������ �Լ��� ���� ���
// Scanner sc = new Scanner(System.in);   System.in    �Է��϶�� �ǹ�
// ��ĳ�� Ŭ������ �Լ��� ���� ����� �غ� �Ǿ��ٸ�, �ܼ� â�� �Է��ϴ� ��? �� �־��!!
// �׷��� 
// .nextInt(); �Լ��� ����Ѵ�.
// ������Ÿ�� int �������� data = ������ ������ �������� sc�� nextInt(); �Լ� ���.
// ���� 
// int data = sc.nextInt();      �� ������ ����Ǹ� �ֿܼ����� �����͸� �Է��Ѵ�.
// �Է��ϴ� ĭ? ��? �� �߰��Ϸ��� int data(����) = sc.nextInt(); �� �߰��ϰ� ���� ��ŭ �ۼ��ؾ� �Ѵ�.