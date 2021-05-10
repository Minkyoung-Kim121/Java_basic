package a.b.c;

public class ThreadTest_6{

	public static void main(String args[]){
		
		Runnable r = new SyncTest();
		// Runnable
		// :  Interface Runnable
		//    이 인터페이스는 기능 인터페이스로, 따라서 람다 식 또는 메서드 참조의 할당 대상으로 사용할 수 있다.
		//    The class must define a method of no arguments called run.
		//    Runnable is implemented by class Thread.
		// class SyncTest 를 사용하기 위해 new 생성자로 호출;
		// Runnable r ->  class SyncTest의 run() 실행
		// Thread 클래스를 사용하기 위해 Runnable 으로 사용자정의클래스를 상속해야한다. 
		// 하지만, 상속하지 않아도
		// new Thread().sleep(2000);
		// start();
		// public void run(){}
		//    이렇게 사용해도 상관 없다.
		/* Thread 의 운영방식     JVM 이 일을 하는데, cpu 가 통제를 하기에 영향을 받는다.
								(자바는 jvm 과 cpu 별개로 도는데(일을 하는데), cpu가 일을 하는 것은 아니지만
								 통제의 영향권 안에 든다.)
		Thread 클래스 최소 단위는 Thread(함수가 아니다)
		<Thread 사용 규칙>
		Runnable r = 사용자정의클래스();
		Thread t = new Thread(r);
		t.start();
		void run(){};
		*/
		// new Thread.sleep(2000);    -> Thread는 sleep() 함수만 사용해라.
		Thread t1 = new Thread(r);
		// Thread 클래스를 사용하기 위해 new 생성자로 인스턴스 했고,
		// Thread t1 은 아규먼트 r을 넣어서 확인.
		Thread t2 = new Thread(r);

		t1.start();
		// .start() 함수로 t1(Thread(SyncTest(의 run())))을 실행.
		t2.start();
		// start() 함수는 run() 을 호출한다.
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
	// balance   잔액

	public void withdraw(int money){
		// withdraw   인출

		if (balance >= money) // balance (1000) 이 money 보다 크거나 같을때,
		{
			try
			{
				Thread.sleep(1000); 
				//   1초 잠들었다가 자동으로 깨어난다.
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
	// BankAccount 클래스 사용하기 위해 ac 참조변수 사용. new 생성자로 만듦
	// 참조변수 ac  ->  BackAccount 의 withdraw()
	public void run(){
		// run()   : start() 하면 실행되는 함수
		
		while(ac.balance > 0) {
		// ac.balance    
			
			int money = (int) (Math.random() * 3 + 1) * 100;
			// money는 Math.random() 함수를 int로 형변환 한 것.   
			//  -> .random() 의 결과는 double 이기 때문에.
			// .random() 함수는 0 ~ 1까지의 난수
			//  :  Returns a double value with a positive sign,
			// greater than or equal to 0.0 and less than 1.0.
			// Math.random()   ->  Math 클래스의 random() 을 사용할 것이다.
			// Math.random() * 3 + 1   
			//Q)   -> 0.0 ~ 1.0 사이의 난수에  3을 곱하고    ?  3을 왜 곱해   ??
			//   +1을 해라(0.*** 의 소수이기 때문에 1 이상의 실수를 만들기 위한 준비)
			//   * 100  하는 이유는 100원 단위로 맞추기 위해.
			ac.withdraw(money);
			// 참조변수 ac 에 .withdraw() 함수 사용
			System.out.println("balance >>> : " + ac.balance);

		}
	}
}