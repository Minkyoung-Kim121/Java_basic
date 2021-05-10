package a.b.c;

// import java.lang.Thread;
public class ThreadTest extends Thread{
// public class Thread extends Object implements Runnable

	// a() �Լ�
	public static void a(){
		System.out.println("�� a() �Լ� �Դϴ�.");
		try
		{
			Thread.sleep(2000);
			// 2�� ���� �ڴٰ�, 2�ʰ� �Ǹ� �ڵ����� �Ͼ����.
			// .sleep() �Լ�   �ڴٰ� �ڵ����� �Ͼ�� �Լ�??
			// Thread Ŭ���������� .sleep() �Լ��� ����ض�.
		}
		catch (InterruptedException i)
		// InterruptedException : 
		{
			System.out.println("i >>> : " + i);
		}
		System.out.println("2�� �ڰ� �Ͼ�����");		
	}
	
	// run()
	public void run(){
		// Thread.run() �Լ� : ��Ű���� ���� ������ run() �Լ��� �Է��ؾ��Ѵ�. (start()   x)
		System.out.println("run() >>> : start() �Լ��� ȣ���ϸ� run() �Լ��� ȣ��ȴ�.");
		System.out.println("run() �Լ� ���� ���� �����ϰ��� �ϴ� ���� ��Ų��.");
		try
		{
			Thread.sleep(3000);
			// 3�� ���� �ڴٰ�, 3�ʰ� �Ǹ� �ڵ����� �Ͼ����.
		}
		catch (InterruptedException i)
		{
			System.out.println("i >>> : " + i);
		}
		System.out.println("3�� �ڰ� �Ͼ�����");
		ThreadTest.a();  // ThreadTest Ŭ������ �ִ� a() �Լ� ȣ��
		//tt.a();
		System.out.println("ThreadTest.a() ȣ���� ���� >>> : ");
	}
	public static void main(String args[]){
		
		new ThreadTest().start();
		// ThreadTest�� �Լ��� ���� new Ű���带 �̿��ؼ� ȣ���ߴ�.   ������
		// ThreadTest()�� .start()�ض�.
		// .start() �Լ�   start() �ϸ� run() ���� ����. ������

		/*
		ThreadTest tt = new ThreadTest();
		tt.start();
		*/

	}
}