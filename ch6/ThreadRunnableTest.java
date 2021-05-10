package a.b.c;

public class ThreadRunnableTest implements Runnable{
//  Runnable 인터페이스를 구현해서 Thread를 사용하는 방법.
//  장) 부모 클래스(Runnable)로부터 상속받은 자식 클래스(ThreadRunnableTest) 또한
//     Thread 사용 가능
//  단) Thread 클래스의 method() 사용 불가.

// cf. extends Thread    사용 방법.
//  장) Thread 클래스의 method() 바로 사용 가능.
//  단) 대상 클래스가 다른 클래스로부터 상속을 받아야하는 경우에는 사용 불가.
	
	public void run(){
		System.out.println("run() 함수");
	}
	
	public static void main(String args[]){
		
		ThreadRunnableTest trt = new ThreadRunnableTest();
		// new 키워드와 참조변수 trt 를 사용해, ThreadRunnableTest() 인스턴스
		Thread t = new Thread(new ThreadRunnableTest());
		// Thread 클래스를 사용하기 위해,
		// Thread() 생성자 안에 ThreadRunnableTest() 클래스 생성자를 
		// 인스턴스 한 것을 넣어서, 참조변수 t 와 new 키워드를 사용.
		System.out.println("t >>> : " + t);
		// t >>> : Thread[Thread-0,5,main]
		System.out.println("t.getId() >>> : " + t.getId());
		// t.getId() >>> : 10
		System.out.println("t.getName() >>> : " + t.getName());
		// t.getName() >>> : Thread-0
		System.out.println("t.getPriority() >>> : " + t.getPriority());
		// t.getPriority() >>> : 5
		System.out.println("t.isAlive() >>> : " + t.isAlive());
		// t.isAlive() >>> : false

		Thread t1 = new Thread(trt);
		System.out.println("t1 >>> : " + t1);
		// t1 >>> : Thread[Thread-1,5,main]
		System.out.println("t1.getId() >>> : " + t1.getId());
		// t1.getId() >>> : 11
		System.out.println("t1.getPriority() >>> : " + t1.getPriority());
		// t1.getPriority() >>> : 5
		System.out.println("t1.isAlive() >>> : " + t1.isAlive());
		// t1.isAlive() >>> : false
	}
}