package a.b.c;


class PriorityTest extends Thread{

	public PriorityTest(String name){
		
		setName(name);
		// setName() : 이 스레드의 이름이 인수와 같도록 변경 이름을 붙이다
	}

	public void run(){
		
		for (int i=0; i < 200000; i++)
		{

		}
		System.out.println(">>> : " + getName());
		// getName() : thread 이름 불러오는 함수
	}
}


public class ThreadTest_5{

	public static void main(String args[]){
		
		for (int i=1; i <= 10; i++)
		{
			Thread t = new PriorityTest("thread >>> : " + i);
			if (i != 5)
			{
				t.setPriority(Thread.MAX_PRIORITY);
			}else{
				t.setPriority(Thread.MIN_PRIORITY);
			}
			t.start();
		}


	}
}