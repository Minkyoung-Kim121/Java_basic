package a.b.c;


public class ThreadTest_2 extends Thread{
// Thread �� ����ؼ� ����ߴ�.

	// ���� ����
	int seqNum;
	
	// ThreadTest_3() �Լ�
	public void ThreadTest_3(int seqNum){
		this.seqNum = seqNum;
	}

	// run() �Լ�
	public void run(){
		synchronized(this){
		// synchronized Ű���� : (*) *���� ���� ������ ���� �ǵ帮�� ������.
			System.out.println(this.seqNum + "Thread Start >>> : ");
			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
			}
			System.out.println(this.seqNum + "Thread End >>> : ");
		}	
	}

	// main() �Լ�
	public static void main(String args[]){
		
		for (int i=0; i < 20; i++)  
		// int �� 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19 �� ����.
		{
			ThreadTest_2 tt2 = new ThreadTest_2();
			// ThreadTest_2  Ŭ������ new Ű����, �����ڸ� �̿��ؼ� �ν��Ͻ� �ߴ�.
			System.out.println("tt2 >>> : " + tt2);
			tt2.start();  //  -> tt2.run()
		}

	}
}

/*   for (int i=0; i < 20; i++)   �� ��,
C:\00.KOSMO72\00.JExam\ch6>java a.b.c.ThreadTest_2
tt2 >>> : Thread[Thread-0,5,main]
tt2 >>> : Thread[Thread-1,5,main]
0Thread Start >>> :
0Thread Start >>> :
tt2 >>> : Thread[Thread-2,5,main]
tt2 >>> : Thread[Thread-3,5,main]
0Thread Start >>> :
0Thread Start >>> :
tt2 >>> : Thread[Thread-4,5,main]
tt2 >>> : Thread[Thread-5,5,main]
0Thread Start >>> :
0Thread Start >>> :
tt2 >>> : Thread[Thread-6,5,main]
tt2 >>> : Thread[Thread-7,5,main]
0Thread Start >>> :
0Thread Start >>> :
tt2 >>> : Thread[Thread-8,5,main]
tt2 >>> : Thread[Thread-9,5,main]
0Thread Start >>> :
0Thread Start >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
0Thread End >>> :
*/