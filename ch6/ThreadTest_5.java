package a.b.c;


class PriorityTest extends Thread{

	public PriorityTest(String name){
		
		setName(name);
		// setName() : �� �������� �̸��� �μ��� ������ ���� �̸��� ���̴�
	}

	public void run(){
		
		for (int i=0; i < 200000; i++)
		{

		}
		System.out.println(">>> : " + getName());
		// getName() : thread �̸� �ҷ����� �Լ�
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