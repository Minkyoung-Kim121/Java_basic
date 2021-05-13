package com.bigdata30.ch2;

// <요구사항>
// 사칙연산 콘솔 어플리케이션을 만들어라.
// 데이터는 정수만 사용한다.
// 데이터는 Scanner 클래스로 받는다.(데이터는 2개만 사용.)
// 데이터는 멤버변수로 초기화 하여 사용한다.
// 멤버변수 초기화는 생성자를 이용한다.
// 연산자는 어플리케이션에서 초기화 하여 사용한다.
// 사칙연산을 리턴형 함수로 구현해주세요.
// 함수는 참조변수로 참조합니다.(함수를 만들어서 쓰라는 뜻)

import java.util.Scanner;

public class MathTest_3{
	// 멤버변수
	int x;
	int y;

	public MathTest_3(int x, int y){
		this.x = x;
		this.y = y;
	}

	// 더하기
	public int addMethod(int x, int y){
		return x + y;
	}
	// 빼기
	public int subMethod(int x, int y){
		return x - y;
	}
	// 곱하기
	public int mulMethod(int x, int y){
		return x * y;
	}
	// 나누기
	public int divMethod(int x, int y){
		return x / y;
	}

	public static void main(String args[]){

		// Validation : if문을 사용한다. (데이터의 성격에 맞게)
		if (true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
			int x = sc.nextInt();
			System.out.println("x >>> : " + x);
			int y = sc.nextInt();
			System.out.println("y >>> : " + y);

			MathTest_3 mt3 = new MathTest_3(x, y);
			System.out.println("더하기 >>> : " + mt3.addMethod(x,y));
			System.out.println("빼기 >>> : " + mt3.subMethod(x,y));
			System.out.println("곱하기 >>> : " + mt3.mulMethod(x,y));
			System.out.println("나누기 >>> : " + mt3.divMethod(x,y));
			// 리턴 값 받아서 출력해보기
			int add = mt3.addMethod(x,y);
			System.out.println("더하기 >>> : " + add);
			int sub = mt3.subMethod(x,y);
			System.out.println("빼기 >>> : " + sub);
			int mul = mt3.mulMethod(x,y);
			System.out.println("곱하기 >>> : " + mul);
			int div = mt3.divMethod(x,y);
			System.out.println("나누기 >>> : " + div);
		}else{
			System.out.println("사칙연산에 필요한 데이터 2개를 입력해주세요 >>> : ");
		}
		
	} // end of main()
} // end of MathTest_3 class