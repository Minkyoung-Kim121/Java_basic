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
	
		// new Ű����(������)�� Ŭ������ �޸𸮿� �ø� �� ����Ѵ�. 
		// jvm�� new Ű���带 ������ �ڿ� ���� Ŭ������ �޸𸮿� �ø���. 
		// Ŭ���� �ν��Ͻ� ��� �Ѵ�. 


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