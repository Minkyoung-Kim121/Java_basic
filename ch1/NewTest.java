package com.bigdata30.ch1;

public class NewTest{

	int i = 1;
	double d = 1.5;
	int b(){ return 0; }
	String c(){ return ""; }
	
	public static void a(){
		System.out.println("hello");
	}

	public static void main(String args[]){
	
		// new 키워드(연산자)는 클래스를 메모리에 올릴 때 사용한다. 
		// jvm이 new 키워드를 읽으면 뒤에 오는 클래스를 메모리에 올린다. 
		// 클래스 인스턴스 라고 한다. 


		NewTest nt = new NewTest();
		System.out.println("nt >>> : " + nt);
		System.out.println("nt >>> : " + nt.i);
		System.out.println("nt >>> : " + nt.d);
		//System.out.println("nt >>> : " + nt.s);
		nt.a();
		System.out.println("nt >>> : " + nt.b());
		NewTest nt1 = new NewTest();
		System.out.println("nt1 >>> : " + nt1);

	} // end of main()
} // end of NewTest class