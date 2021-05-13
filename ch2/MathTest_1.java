package com.bigdata30.ch2;

// <요구사항>
// 사칙연산 콘솔 어플리케이션을 만들어라.
// 데이터는 정수만 사용한다.
// 데이터는 명령행 인수로 받는다.(데이터는 2개만 사용.)
// 연산자는 어플리케이션에서 초기화 하여 사용한다.
// 사칙연산을 리턴형 함수로 구현해주세요.
// 함수는 참조변수로 참조합니다.
public class MathTest_1{

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

		if (2 == args.length)
		{
			System.out.println("" + args[0]);
			System.out.println("" + args[1]);

			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("x >>> : " + x);
			System.out.println("y >>> : " + y);
			/*
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x * y);
			System.out.println(x / y);
			*/
			MathTest_1 mt1 = new MathTest_1();
			System.out.println("더하기 >>> : " + mt1.addMethod(x,y));
			System.out.println("빼기 >>> : " + mt1.subMethod(x,y));
			System.out.println("곱하기 >>> : " + mt1.mulMethod(x,y));
			System.out.println("나누기 >>> : " + mt1.divMethod(x,y));
			// 리턴 값 받아서 출력해보기
			int add = mt1.addMethod(x,y);
			System.out.println("더하기 >>> : " + add);
			int sub = mt1.subMethod(x,y);
			System.out.println("빼기 >>> : " + sub);
			int mul = mt1.mulMethod(x,y);
			System.out.println("곱하기 >>> : " + mul);
			int div = mt1.divMethod(x,y);
			System.out.println("나누기 >>> : " + div);
		}else{
			System.out.println("사칙연산에 필요한 데이터 2개를 입력해주세요 >>> : ");
		}
		
	} // end of main()
} // end of MathTest_1 class