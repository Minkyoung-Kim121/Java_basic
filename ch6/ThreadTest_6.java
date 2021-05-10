package a.b.c;

public class ThreadTest_6{

	public static void main(String args[]){
		
		Runnable r = new SyncTest();
		// Runnable
		// :  Interface Runnable
		//    �� �������̽��� ��� �������̽���, ���� ���� �� �Ǵ� �޼��� ������ �Ҵ� ������� ����� �� �ִ�.
		//    The class must define a method of no arguments called run.
		//    Runnable is implemented by class Thread.
		// class SyncTest �� ����ϱ� ���� new �����ڷ� ȣ��;
		// Runnable r ->  class SyncTest�� run() ����
		// Thread Ŭ������ ����ϱ� ���� Runnable ���� ���������Ŭ������ ����ؾ��Ѵ�. 
		// ������, ������� �ʾƵ�
		// new Thread().sleep(2000);
		// start();
		// public void run(){}
		//    �̷��� ����ص� ��� ����.
		/* Thread �� ����     JVM �� ���� �ϴµ�, cpu �� ������ �ϱ⿡ ������ �޴´�.
								(�ڹٴ� jvm �� cpu ������ ���µ�(���� �ϴµ�), cpu�� ���� �ϴ� ���� �ƴ�����
								 ������ ����� �ȿ� ���.)
		Thread Ŭ���� �ּ� ������ Thread(�Լ��� �ƴϴ�)
		<Thread ��� ��Ģ>
		Runnable r = ���������Ŭ����();
		Thread t = new Thread(r);
		t.start();
		void run(){};
		*/
		// new Thread.sleep(2000);    -> Thread�� sleep() �Լ��� ����ض�.
		Thread t1 = new Thread(r);
		// Thread Ŭ������ ����ϱ� ���� new �����ڷ� �ν��Ͻ� �߰�,
		// Thread t1 �� �ƱԸ�Ʈ r�� �־ Ȯ��.
		Thread t2 = new Thread(r);

		t1.start();
		// .start() �Լ��� t1(Thread(SyncTest(�� run())))�� ����.
		t2.start();
		// start() �Լ��� run() �� ȣ���Ѵ�.
	}
}

/*
C:\00.KOSMO72\00.JExam\ch6>java a.b.c.ThreadTest_6
balance >>> : 700
balance >>> : 700
balance >>> : 400
balance >>> : 200
balance >>> : -100
balance >>> : -100
*/

class BankAccount{

	int balance = 1000;
	// balance   �ܾ�

	public void withdraw(int money){
		// withdraw   ����

		if (balance >= money) // balance (1000) �� money ���� ũ�ų� ������,
		{
			try
			{
				Thread.sleep(1000); 
				//   1�� �����ٰ� �ڵ����� �����.
			}
			catch (Exception e)
			{
			}
			balance -= money;
			
		}
	} // withdraw
}

class SyncTest implements Runnable{

	BankAccount ac = new BankAccount();
	// BankAccount Ŭ���� ����ϱ� ���� ac �������� ���. new �����ڷ� ����
	// �������� ac  ->  BackAccount �� withdraw()
	public void run(){
		// run()   : start() �ϸ� ����Ǵ� �Լ�
		
		while(ac.balance > 0) {
		// ac.balance    
			
			int money = (int) (Math.random() * 3 + 1) * 100;
			// money�� Math.random() �Լ��� int�� ����ȯ �� ��.   
			//  -> .random() �� ����� double �̱� ������.
			// .random() �Լ��� 0 ~ 1������ ����
			//  :  Returns a double value with a positive sign,
			// greater than or equal to 0.0 and less than 1.0.
			// Math.random()   ->  Math Ŭ������ random() �� ����� ���̴�.
			// Math.random() * 3 + 1   
			//Q)   -> 0.0 ~ 1.0 ������ ������  3�� ���ϰ�    ?  3�� �� ����   ??
			//   +1�� �ض�(0.*** �� �Ҽ��̱� ������ 1 �̻��� �Ǽ��� ����� ���� �غ�)
			//   * 100  �ϴ� ������ 100�� ������ ���߱� ����.
			ac.withdraw(money);
			// �������� ac �� .withdraw() �Լ� ���
			System.out.println("balance >>> : " + ac.balance);

		}
	}
}