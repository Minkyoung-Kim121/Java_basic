package com.bigdata30.ch1;

// 메인 함수가 있는 콘솔 어플리케이션
// java 는 모든 자원이 object 이어야 한다. 
public class VariableTest{
	
	public static void main(String args[]){
		// byte : 자료형(데이터 타입, 기초 자료형, primitive type)을 
		// 선언했다. 	
		// b : 변수명 b 를 선언했다. 
		//   byte 데이터 타입을 b 변수명으로 사용하겠다고 선언 했다. 
		// = 대입 연산자 : 오른 쪽에 있는 값(리터럴)을 왼쪽 b 변수에 
		//               대입(초기화, intializatioin) 하세요
		// ; : 문장(statement) 종결 연산자 
		// 문장을 항시 종결 연산자로 끝내야 한다. 
		byte b = 1;
		// 콘솔에 출력하는 구문
		// 자바에서 문자열은 "" 로 묶는다. 
		// + : 더하기 연산자는 문자열을 더할 수도 있고 숫자도 더할 수 있다.
		// 문자열 + 숫자를 하면 문자열로 더한다. 
		// 문자열 + 숫자를 하면 연산 결과는 문자열이다. 
		/*
			b >>> : 1
			3
			1+2 = 12
			1+2 = 3
		*/
		System.out.println("b >>> : " + b);
		System.out.println(1 + 2);
		System.out.println("1+2 = " + 1 + 2);
		System.out.println("1+2 = " + (1 + 2));
		//System.out.println(java.lang.Byte.MAX_VALUE);
		// java lang 패키지에 있는 클래스는
		// java lang 패키지명을 사용하지 않아도 사용가능하다.
		// 변수에 static 키워드가 붙어 있으면 
		// 클래스이름.변수명 으로 사용이 가능하다. 
		System.out.println("Byte.MAX_VALUE >>> : " + Byte.MAX_VALUE);
		//System.out.println(java.lang.Byte.MIN_VALUE);
		System.out.println("Byte.MIN_VALUE >>> : " + Byte.MIN_VALUE);
	
		// static byte MAX_VALUE  
		// static 키워드는 뒤에 오는 변수를 메모리에 올려달라는 키워드
		// 그러면 jvm(Java Virtual Machine)이 해당 자원을 
		// 메모리에 올려준다. 
		// byte 해당 자원의 리턴형이 byte 이다. 
		// MAX_VALUE : 변수인데 이런 변수를 상수(Constant Variable) 
		// 라고 한다. 
		// 상수 변수명은 항시 대문자 이면 _(under soare, under bar)를 
		// 붙여서 사용한다. 
		// 상수는 변경하면 안된다.(일부러 변경하면 변경이 되기도 함)
		byte bateMAX = Byte.MAX_VALUE;
		System.out.println("bateMAX >>> : " + bateMAX);
		// static byte MIN_VALUE  
		byte bateMIN = Byte.MIN_VALUE;
		System.out.println("bateMIN >>> : " + bateMIN);
	
		//byte bMax = 128; 이건 넘어가서는 안된다.
		byte bMax = 127;
		System.out.println("bMax >>> : " + bMax);
		// static String toBinaryString(int i) 
		System.out.println("toBinaryString(bMax) >>> : " 
			               + Integer.toBinaryString(bMax));
		// static String toOctalString(int i)  
		System.out.println("toOctalString(bMax) >>> : " 
		                   + Integer.toOctalString(bMax));
		// static String toHexString(int i)  
		System.out.println("toHexString(bMax) >>> : " 
		                   + Integer.toHexString(bMax));
		
	} // end of main()
} // end of VariableTest class



