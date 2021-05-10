package a.b.c;

public class ThreadTest_4 implements Runnable{
	// Runnable �������̽��� ����ؼ� Thread Ŭ���� ���

	int seqNum;

	public ThreadTest_4(int seqNum){
		this.seqNum = seqNum;
	}

	public void run(){
		System.out.println(this.seqNum + " Thread Start >>> : ");
		try
		{			
			Thread.sleep(3000);			
		}
		catch (Exception e){}

		System.out.println(this.seqNum + " Thread End >>> : ");
	}
	
	public static void main(String args[]){
	
		for (int i=0; i < 10; i++ )
		{
			Thread t = new Thread(new ThreadTest_4(i));
			System.out.println("t >>> : " + t);
			t.start();
		}

		System.out.println("main() �� >>> : ");
	}
}