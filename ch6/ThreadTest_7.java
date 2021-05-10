package a.b.c;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTest_7{

	public static void main(String args[]){
		
		Runnable r = new SyncTest_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
}

/*
C:\00.KOSMO72\00.JExam\ch6>java a.b.c.ThreadTest_7
balance >>> : \ 900 : ��ݽð� >>> : 2020.10.30 03:09:07
balance >>> : \ 600 : ��ݽð� >>> : 2020.10.30 03:09:09
balance >>> : \ 500 : ��ݽð� >>> : 2020.10.30 03:09:10
balance >>> : \ 400 : ��ݽð� >>> : 2020.10.30 03:09:11
balance >>> : \ 200 : ��ݽð� >>> : 2020.10.30 03:09:12
balance >>> : \ 100 : ��ݽð� >>> : 2020.10.30 03:09:13
balance >>> : \ 0 : ��ݽð� >>> : 2020.10.30 03:09:14
*/

class BankAccount_1{

	int balance = 1000;

	public synchronized void withdraw(int money){
		// synchronized Ű����  : ����ȭ�ϴ� Ű����
		//                      ����ȭ) ���� ���� ������ (����) ����� �ִ� ��
		//    �� �� �̻��� �����尡 �ϳ��� �ڿ��� ������ �� �ڿ��� ��ȣ�ϱ� ���� ����Ѵ�.
		//    ���� �ڿ��� ������ �� �ٸ� �����尡 �������� ���ϵ��� �ش� �ڿ��� ���(lock)�ع����� ����� ������ �ִ�.
		//    �ڿ��� ����� ������ unlock�� �Ͽ� �ٸ� �����尡 ������ �� �ֵ��� �Ѵ�.
		//    �ڹٿ����� �޼��� �տ� synchronized�� �ٿ� ����ȭ�� �� �� �ִ�.
		// : ����ȭ�� ��ü�� ���� ����ȭ�� �̷������.
		//   ���� ��ü�� ���� ��� ����ȭ ���� �� ������ ���� �� thread���� �� ������ ����(����) �ϵ��� �Ѵ�.
		//   ���� ������ �õ��ϴ� �ٸ� thread���� �� ���� thread�� ������ ��ġ�� ���� ��� ������ ���(blocked)
		//   ���°� �ȴ�.
		/*
		<synchronized �����>
		1. synchronized void �Լ�()
		2. static synchronized void �Լ�()
		3. synchronized(this){}
		4. static synchronized(this){}
		*/
		/*
		����ȭ : �ش� �����尡 �۾��� ��ĥ ������ �ٸ� �����尡 ������� ���Ѵ�.
			  ������1�� �۾��� ��ģ �ڿ��� ������2�� �۾��� �� �� �ִ�.
			  �̷��� �ѹ��� �� �۾��� �����ϰ� �Ͽ� 
			  �� ���¿��� 2���� ����ص� balance(�ܰ�)���� ��Ȯ�� ���´�.
			  ����ȭ�� �������� �ʴ´ٸ� 
			  ������1�� ���(withdraw)�Ҷ� �ٸ� ������2�� ����Ǿ� balance���� ��Ȯ�� ������ �ʰ� �ȴ�.
		*/

		if (balance >= money)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
			}
			balance -= money;
		}

	} // withdraw
}


class SyncTest_1 implements Runnable{

	BankAccount_1 acl = new BankAccount_1();

	public void run(){
		
		synchronized(this){
			while (acl.balance > 0){

				// 100, 200, 300 ���� �� ���� ���Ƿ� �����ؼ� ���(withdraw)
				int money = (int) (Math.random() * 3 + 1) * 100;
				acl.withdraw(money);
				System.out.println("balance >>> : \\ " + acl.balance
									+ " : ��ݽð� >>> : "
									+ CurrentTime_1.cTime());
			}
		}
	}
}


abstract class CurrentTime_1{

	public static String cTime(){
		
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
		String cTime = sdf.format(new Date(time));

		return cTime; // null;
	}
}

/*
�� �����尡 ���ÿ� �� ���¿� �����ϴ� ���� ������ �ڵ��� ���ѵ� run() �Լ� �ȿ� while�� ������
ù��° �����尡 �ܰ� 0�� �ɶ����� �ݺ��� ������ �ι�° ������� ����� ���ϰ� �ǳ׿� 
*/