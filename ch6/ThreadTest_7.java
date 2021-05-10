package a.b.c;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTest_7{

	public static void main(String args[]){
		
		Runnable r = new SyncTest_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
}

/*
C:\00.KOSMO72\00.JExam\ch6>java a.b.c.ThreadTest_7
balance >>> : \ 900 : 출금시간 >>> : 2020.10.30 03:09:07
balance >>> : \ 600 : 출금시간 >>> : 2020.10.30 03:09:09
balance >>> : \ 500 : 출금시간 >>> : 2020.10.30 03:09:10
balance >>> : \ 400 : 출금시간 >>> : 2020.10.30 03:09:11
balance >>> : \ 200 : 출금시간 >>> : 2020.10.30 03:09:12
balance >>> : \ 100 : 출금시간 >>> : 2020.10.30 03:09:13
balance >>> : \ 0 : 출금시간 >>> : 2020.10.30 03:09:14
*/

class BankAccount_1{

	int balance = 1000;

	public synchronized void withdraw(int money){
		// synchronized 키워드  : 동기화하는 키워드
		//                      동기화) 일이 끝날 때까지 (서로) 붙잡고 있는 것
		//    두 개 이상의 쓰레드가 하나의 자원을 공유할 때 자원을 보호하기 위해 사용한다.
		//    공유 자원에 접근할 때 다른 쓰레드가 접근하지 못하도록 해당 자원을 잠금(lock)해버리는 기능을 가지고 있다.
		//    자원의 사용이 끝나면 unlock을 하여 다른 쓰레드가 접근할 수 있도록 한다.
		//    자바에서는 메서드 앞에 synchronized를 붙여 동기화를 할 수 있다.
		// : 동기화는 객체에 대한 동기화로 이루어진다.
		//   같은 객체에 대한 모든 동기화 블럭은 한 시점에 오직 한 thread만이 블럭 안으로 접근(실행) 하도록 한다.
		//   블럭에 접근을 시도하는 다른 thread들은 블럭 안의 thread가 실행을 마치고 블럭을 벗어날 때까지 블록(blocked)
		//   상태가 된다.
		/*
		<synchronized 사용방법>
		1. synchronized void 함수()
		2. static synchronized void 함수()
		3. synchronized(this){}
		4. static synchronized(this){}
		*/
		/*
		동기화 : 해당 스레드가 작업을 마칠 때까지 다른 스레드가 실행되지 못한다.
			  스레드1이 작업을 마친 뒤에야 스레드2가 작업을 할 수 있다.
			  이렇게 한번에 한 작업만 가능하게 하여 
			  한 계좌에서 2명이 출금해도 balance(잔고)값이 정확히 나온다.
			  동기화를 지원하지 않는다면 
			  스레드1이 출금(withdraw)할때 다른 스레드2가 실행되어 balance값이 정확히 나오지 않게 된다.
		*/

		if (balance >= money)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
			}
			balance -= money;
		}

	} // withdraw
}


class SyncTest_1 implements Runnable{

	BankAccount_1 acl = new BankAccount_1();

	public void run(){
		
		synchronized(this){
			while (acl.balance > 0){

				// 100, 200, 300 중의 한 값을 임의로 선택해서 출금(withdraw)
				int money = (int) (Math.random() * 3 + 1) * 100;
				acl.withdraw(money);
				System.out.println("balance >>> : \\ " + acl.balance
									+ " : 출금시간 >>> : "
									+ CurrentTime_1.cTime());
			}
		}
	}
}


abstract class CurrentTime_1{

	public static String cTime(){
		
		long time = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
		String cTime = sdf.format(new Date(time));

		return cTime; // null;
	}
}

/*
두 스레드가 동시에 한 계좌에 접근하는 것이 목적인 코드인 듯한데 run() 함수 안에 while문 때문에
첫번째 스레드가 잔고가 0이 될때까지 반복문 돌리고 두번째 스레드는 출금은 못하게 되네요 
*/