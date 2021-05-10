package a.b.c;

public class ThreadTest_3 extends Thread{

	int seqNum;

	public ThreadTest_3(int seqNum){
		this.seqNum = seqNum;
	}

	public void run(){
		synchronized(this){
			System.out.println(this.seqNum + " Thread Start >>> : ");
			try
			{			
				Thread.sleep(3000);			
			}
			catch (Exception e){}
			System.out.println(this.seqNum + " Thread End >>> : ");
		}
	}
	
	public static void main(String args[]){
	
		for (int i=0; i < 20; i++ )
		{
			ThreadTest_3 tt3 = new ThreadTest_3(i);
			System.out.println("tt3 >>> : " + tt3);
			tt3.start();
		}

		System.out.println("main() ³¡ >>> : ");
	}
}