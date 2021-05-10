package a.b.c;

// import java.lang.Thread;
public class ThreadTest_1 extends Thread{
	
	public void run(){
		System.out.println("run() >>> : start() 함수를 호출하면"
									+ "run() 함수가 호출된다.");
		/*
		tt1.getName() >>> : Thread-0
		tt1.getPriority() >>> : 5
		tt1.isAlive() >>> : true  (false -> true)
		*/
		try
		{
			System.out.println("sleep() 실행 전 >>> : " + Thread.currentThread().isAlive());
			// sleep() 실행 전 >>> : true
			Thread.sleep(3000);
			// 3초동안 자고 자동으로 일어난다.
			System.out.println("sleep() 실행 후 >>> : " + Thread.currentThread().isAlive());
			// sleep() 실행 후 >>> : true
		}
		catch (Exception e)
		{
		}
		System.out.println("try 구절 이후 >>> : ");		
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
		//     start() 함수를 호출하면 run() 함수가 호출된다.
		System.out.println("tt1.getID() >>> : " + tt1.getId());
		//tt1.getID() >>> : 10   얘까지 실행되고, .start() -> 나머지는 run() 에서 출력된다.

		System.out.println("tt1.getName() >>> : " + tt1.getName());
		System.out.println("tt1.getPriority() >>> : " + tt1.getPriority());
		System.out.println("tt1.isAlive() >>> : " + tt1.isAlive());
		
		/*  함수의 쓰임
		.getID()  :
		.getName()  : 파일명 불러오기
		.getPriority()  : ()안의 내용을 String 으로 출력하기
		.isAlive()  : 해당 Thread 가 실행중이니? 아니니?    append
		.start() 함수를 호출하면  run() 함수가 호출된다.
		*/
	}

}