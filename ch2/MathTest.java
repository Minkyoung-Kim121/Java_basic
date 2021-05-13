package com.bigdata30.ch2;

// <요구사항>
// 사칙연산 콘솔 어플리케이션을 만들어라.
// 데이터는 정수만 사용한다.
// 데이터는 명령행 인수로 받는다.(데이터는 2개만 사용.)
// 연산자는 어플리케이션에서 초기화 하여 사용한다.
public class MathTest{

	public static void main(String args[]){

		// Validation : if문을 사용한다. (데이터의 성격에 맞게)
		System.out.println("" + args[0]);
		System.out.println("" + args[1]);
		// 콘솔 어플리케이션 외부에서 받아오는 데이터는 String 배열이다. (문자열)
		// 사칙연산을 하기 위해서는 숫자(정수)가 필요.(문자는 사칙연산이 안된다.)
		// ->문자열을 숫자로 치환(형변환) 해야한다.
		// 단, 문자열은 문자숫자여야 한다.
		// Integer.parseInt(String s)

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("x >>> : " + x);
		System.out.println("y >>> : " + y);
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	} // end of main()
} // end of MathTest class