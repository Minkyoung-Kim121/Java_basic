package com.bigdata30.ch1;
// 자바는 영역, 블럭, 스코프 언어이다.
// {} : 브레이스 영역은 권한이 있다.(그 안에서 맘대로 다 쓸 수 있다.)

// public class VarTest{} : 사용자 정의로 만든 클래스.
//                          '이 클래스 이름은 VarTest이다.'
// 현재 상태에서 VarTest 클래스에 있는 자원(구성원)은 멤버변수 int i 이다.
// 멤버변수의 유효범위는 클래스 내부(VarTest{})이다.
// 교재 p.191

public class VarTest{
	// 변수
	// 멤버변수 : 함수 밖과 클래스 안에서 선언한 변수는 멤버변수라고 한다.
	// 멤버변수 규칙) 참조변수를 이용해야 쓸 수 있다.
	//             참조변수는 new 키워드를 이용해 만든다.
	//정리) 클래스를 인스턴스해서 참조변수(new)를 사용해 변수명을 참조하면 사용 가능하다.
	//static int i;
	int i;
	// static 변수는 다른 말로 클래스 변수라고도 한다.
	static int ii;
	// 멤버변수
	int iii;


	public static void main(String args[]){
		// 변수
		// 지역변수 : 함수 안에서 선언한 변수를 의미. (꼭 초기화가 필요하다.)
		// 지역변수 규칙) 지역변수를 선언하고 나서는 초기화 안 해도 된다.
		//             but, 사용하려고 하면 반드시 초기화가 필수!
		//정리) 지역변수는 함수 안에서 태어나서 함수 안에서 사망한다.
		//     지역변수 사망이란) 개발자가 해주는 것이 아니라 jvm이 가비지컬렉터를 이용하여 해주는 것.
		int i = 1;

		/*
		System.out.println("" + i); <- 이렇게 저장해서 컴파일 했을 때 반드시 에러가 난다.
			C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javac -d . VarTest.java
			VarTest.java:13: error: variable i might not have been initialized
							System.out.println("" + i);
													^
			1 error
		*/
		System.out.println("지역변수 int i >>> : " + i);
		//System.out.println("멤버변수 int i >>> : " + VarTest.i);
		VarTest vt = new VarTest();
		System.out.println("new 인스턴스한 참조변수로 멤버변수 int i를 " 
			                + "참조해서 출력한다. >>> : " + vt.i);
		System.out.println("클래스변수 >>> : " + VarTest.ii);
		/*
			C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javac -d . VarTest.java
			VarTest.java:48: error: non-static variable iii cannot be referenced from a static context
                System.out.println("멤버변수 int iii >>> : " + iii);
                                                           ^
			1 error
		*/
		//System.out.println("멤버변수 int iii >>> : " + iii);
		System.out.println("멤버변수 int iii >>> : " + vt.iii);

	} // end of main()

} // end of VarTest class