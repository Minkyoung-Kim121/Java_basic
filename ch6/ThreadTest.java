package a.b.c;

// import java.lang.Thread;
public class ThreadTest extends Thread{
// public class Thread extends Object implements Runnable

	// a() 함수
	public static void a(){
		System.out.println("난 a() 함수 입니다.");
		try
		{
			Thread.sleep(2000);
			// 2초 동안 자다가, 2초가 되면 자동으로 일어나세요.
			// .sleep() 함수   자다가 자동으로 일어나는 함수??
			// Thread 클래스에서는 .sleep() 함수만 사용해라.
		}
		catch (InterruptedException i)
		// InterruptedException : 
		{
			System.out.println("i >>> : " + i);
		}
		System.out.println("2초 자고 일어나세요ㅠ");		
	}
	
	// run()
	public void run(){
		// Thread.run() 함수 : 시키려는 일의 내용을 run() 함수에 입력해야한다. (start()   x)
		System.out.println("run() >>> : start() 함수를 호출하면 run() 함수가 호출된다.");
		System.out.println("run() 함수 블럭에 내가 제어하고자 하는 일을 시킨다.");
		try
		{
			Thread.sleep(3000);
			// 3초 동안 자다가, 3초가 되면 자동으로 일어나세요.
		}
		catch (InterruptedException i)
		{
			System.out.println("i >>> : " + i);
		}
		System.out.println("3초 자고 일어나세요ㅠ");
		ThreadTest.a();  // ThreadTest 클래스에 있는 a() 함수 호출
		//tt.a();
		System.out.println("ThreadTest.a() 호출한 이후 >>> : ");
	}
	public static void main(String args[]){
		
		new ThreadTest().start();
		// ThreadTest를 함수로 만들어서 new 키워드를 이용해서 호출했다.   생성자
		// ThreadTest()를 .start()해라.
		// .start() 함수   start() 하면 run() 으로 간다. 무조건

		/*
		ThreadTest tt = new ThreadTest();
		tt.start();
		*/

	}
}