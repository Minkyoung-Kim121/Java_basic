package com.bigdata30.ch1;

public class MethodTest{

	// 함수 만들기
	// aMethod() 함수의 리턴형은 void
	public static void aMethod(){
		
	}
	//bMethod() 함수의 리턴형은 int
	public static int bMethod(){
		return 1;
	}
	// public : 접근제한자(Access Modifier)
	//          어떤 패키지에 있는 클레스에서 cMethod() 함수를 호출할 수 있다.
	// static : 바이트코드에서 jvm이 cMethod를 읽으면 
	//          바로 메모리에 올려준다.
	//          단 코드에 static 키워드 사용은 잘 사용해야 한다.
	// int : 리턴형(리턴 자료형, 리턴 데이터타입)
	//       cMethod() 함수의 결과 값을 int형으로 한다고 선언한 것
	//       함수 리턴형과 함수안의 return 키워드의 데이터 타입은 동일해야 한다.
	// cMethod : 함수 이름이 cMethod 
	// () : 함수의 매개변수를 넣는 공간 
	// (int i) : 함수의 매개변수를 int 데이터 타입으로 하고 
	//           변수명은 i 로 선언한다. 
	//           i 변수는 cMethod 함수(영역, 블럭, 스코프)에서 
	//           자유롭게 사용할 수 있다. 
	// {} : Cmethod() 함수 블럭 : 실제로 로직을 만드는 영역
	//      함수 블럭 안에서는 인터프리터 방식으로 동작 한다. 
	// return : 리턴 키워드 : 함수 내부에서 맨 마지막 라인에 사용한다. 일반적으로
	//          리턴 키워드 뒤에는 산식(문장)의 결과는 리턴형과
	//데이터 타입이 같아야 한다.
	public static int cMethod(int i){
		return i;
	}

	public static void main(String args[]){
		System.out.println("main() 함수는 해당 클래스의 시작점이다.");
		aMethod();
		MethodTest.bMethod();
		int i = MethodTest.bMethod();
		System.out.println("i >>> : " + i);
		int ii= MethodTest.cMethod(11);
		System.out.println("ii >>> : " + ii);

	} // end of main()
} // end of MethodTest class