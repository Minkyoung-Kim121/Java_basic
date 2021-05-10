package a.b.c;

public class ThreadRunnableTest implements Runnable{
//  Runnable �������̽��� �����ؼ� Thread�� ����ϴ� ���.
//  ��) �θ� Ŭ����(Runnable)�κ��� ��ӹ��� �ڽ� Ŭ����(ThreadRunnableTest) ����
//     Thread ��� ����
//  ��) Thread Ŭ������ method() ��� �Ұ�.

// cf. extends Thread    ��� ���.
//  ��) Thread Ŭ������ method() �ٷ� ��� ����.
//  ��) ��� Ŭ������ �ٸ� Ŭ�����κ��� ����� �޾ƾ��ϴ� ��쿡�� ��� �Ұ�.
	
	public void run(){
		System.out.println("run() �Լ�");
	}
	
	public static void main(String args[]){
		
		ThreadRunnableTest trt = new ThreadRunnableTest();
		// new Ű����� �������� trt �� �����, ThreadRunnableTest() �ν��Ͻ�
		Thread t = new Thread(new ThreadRunnableTest());
		// Thread Ŭ������ ����ϱ� ����,
		// Thread() ������ �ȿ� ThreadRunnableTest() Ŭ���� �����ڸ� 
		// �ν��Ͻ� �� ���� �־, �������� t �� new Ű���带 ���.
		System.out.println("t >>> : " + t);
		// t >>> : Thread[Thread-0,5,main]
		System.out.println("t.getId() >>> : " + t.getId());
		// t.getId() >>> : 10
		System.out.println("t.getName() >>> : " + t.getName());
		// t.getName() >>> : Thread-0
		System.out.println("t.getPriority() >>> : " + t.getPriority());
		// t.getPriority() >>> : 5
		System.out.println("t.isAlive() >>> : " + t.isAlive());
		// t.isAlive() >>> : false

		Thread t1 = new Thread(trt);
		System.out.println("t1 >>> : " + t1);
		// t1 >>> : Thread[Thread-1,5,main]
		System.out.println("t1.getId() >>> : " + t1.getId());
		// t1.getId() >>> : 11
		System.out.println("t1.getPriority() >>> : " + t1.getPriority());
		// t1.getPriority() >>> : 5
		System.out.println("t1.isAlive() >>> : " + t1.isAlive());
		// t1.isAlive() >>> : false
	}
}