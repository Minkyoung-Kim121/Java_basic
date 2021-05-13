package com.bigdata30.ch1;

public class MethodTest_2{
	// 함수 만들기
	// aMethod() 함수의 리턴형 void
	// void 함수 : 함수에서 리턴을 하지 않을 때 사용한다.
	// 함수에는 리턴형(void 또는 자바 자료형)을 꼭 사용해야 한다. 
	public static void aMethod(){
		System.out.println("aMethod() 함수 시작.");
		System.out.println("aMethod() 함수 끝.");
		// return 0;
	}
	public static void main(String args[]){
		System.out.println("main() 함수를 해당 클래스의 시작점이다.");
		// static 키워드가 있는 함수 또는 변수는
		// 항시 클래스이름 또는 패키지이름+클래스이름(Name Space)를
		// 명시적으로 붙여서 해당 자원(함수 또는 변수)를 호출해야 한다. 
		MethodTest_2.aMethod();
		MethodTest.aMethod();
		System.out.println("main() 함수를 해당 클래스의 끝.");
	} // end of main()
} // end of MethodTest_2 class