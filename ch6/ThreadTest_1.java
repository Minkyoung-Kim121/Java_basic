package a.b.c;

// import java.lang.Thread;
public class ThreadTest_1 extends Thread{
	
	public void run(){
		System.out.println("run() >>> : start() �Լ��� ȣ���ϸ�"
									+ "run() �Լ��� ȣ��ȴ�.");
		/*
		tt1.getName() >>> : Thread-0
		tt1.getPriority() >>> : 5
		tt1.isAlive() >>> : true  (false -> true)
		*/
		try
		{
			System.out.println("sleep() ���� �� >>> : " + Thread.currentThread().isAlive());
			// sleep() ���� �� >>> : true
			Thread.sleep(3000);
			// 3�ʵ��� �ڰ� �ڵ����� �Ͼ��.
			System.out.println("sleep() ���� �� >>> : " + Thread.currentThread().isAlive());
			// sleep() ���� �� >>> : true
		}
		catch (Exception e)
		{
		}
		System.out.println("try ���� ���� >>> : ");		
	}

	public static void main(String args[]){
		
		ThreadTest_1 tt1 = new ThreadTest_1();
		System.out.println("tt1 >>> : " + tt1);
		// tt1 >>> : Thread[Thread-0,5,main]
		System.out.println("tt1.getID() >>> : " + tt1.getId());
		
		// tt1.getID() >>> : 10
		System.out.println("tt1.getName() >>> : " + tt1.getName());
		// tt1.getName() >>> : Thread-0
		System.out.println("tt1.getPriority() >>> : " + tt1.getPriority());
		// tt1.getPriority() >>> : 5
		System.out.println("tt1.isAlive() >>> : " + tt1.isAlive());
		// tt1.isAlive() >>> : false
		tt1.start();
		//     start() �Լ��� ȣ���ϸ� run() �Լ��� ȣ��ȴ�.
		System.out.println("tt1.getID() >>> : " + tt1.getId());
		//tt1.getID() >>> : 10   ����� ����ǰ�, .start() -> �������� run() ���� ��µȴ�.

		System.out.println("tt1.getName() >>> : " + tt1.getName());
		System.out.println("tt1.getPriority() >>> : " + tt1.getPriority());
		System.out.println("tt1.isAlive() >>> : " + tt1.isAlive());
		
		/*  �Լ��� ����
		.getID()  :
		.getName()  : ���ϸ� �ҷ�����
		.getPriority()  : ()���� ������ String ���� ����ϱ�
		.isAlive()  : �ش� Thread �� �������̴�? �ƴϴ�?    append
		.start() �Լ��� ȣ���ϸ�  run() �Լ��� ȣ��ȴ�.
		*/
	}

}