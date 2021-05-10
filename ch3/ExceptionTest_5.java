package a.b.c;

import java.util.Scanner;
public class ExceptionTest_5{


	public static void main(String args[]){ // -> 메인 밖으로 던지지 마라 throws Exception ---> x
		//    main() 함수의 매개변수인 스트링 배열(String args[])를 사용하였는데
		//    이 내용을 명령행 인수 사용 이라고 한다.
		//    이는 콘솔에서 외부 데이터를 받아오는 역할을 하며
		//          문자열, 숫자 등 받아온 데이터는 해당 함수를 적절하게 사용해야 한다.
		

		// 문1) 명령행 인수로 데이터를 받아서
		//	   숫자로 변환하여 출력해 보세요. (cf.데이터 형변환이 없으면 Scanner 클래스가 유용)
		// String args[] = {"1", "1"};
		// java a.b.c.ExceptionTset_5 1 1
		// Integer.parseInt();

		int argsLen = args.length; // 스트링 문자열의 길이는 length(), 배열의 길이는 length 필드로 가져온다.

		if (argsLen == 2) // -> if 는 true 만 돌아간다. argsLen 배열이 2개다.

		{
			// C:\00.KOSMO72\00.JExam\ch3>java a.b.c.ExceptionTest_5 1 1
			// String args[] = {"1", "1"}; -> 배열 두 개
			// 명령행 인수 받아오기 
			System.out.println("args.length >>> : " + args.length); // -> 2
			String sX = args[0];
			// 첫번째 요소를 사용하려면 -> 참조변수[인덱스] : args[0]
			System.out.println("sX >>> : " + sX);
			String sY = args[1];
			System.out.println("sY >>> : " + sY);
			
			/*
			C:\00.KOSMO72\00.JExam\ch3>java a.b.c.ExceptionTest_5 1 1
			: argsLen 배열이 두 개이기 때문에 java 클래스명 뒤에 int 정수 두 개를 타이핑해서 출력 1 1 (이 숫자는 sX, sY에 대입된다.)
			args.length >>> : 2
			sX >>> : 1
			sY >>> : 1
			x >>> : 1
			y >>> : 1
			1 / 1 >>> : 1
			*/


/* 중요!!! 문자 -> 숫자가 변환이 안 될 때 일어나는 에러 : NumberFormatException
e >>> java.lang.NumberFormatException: For input string: "일"
*/

			try
				{
				// 명령행 인수로 받아온 데이터를 숫자로 변화하기 
				// Integer.parseInt() 함수로 
				int x = Integer.parseInt(sX);
				// Integer.parseInt() : String 숫자를 int로 변환하는 함수.
				//                 정확히 말해, 문자숫자를 숫자로 변환하는 함수
				//                 ex) "11" -> 11 (가능o)
				//                 ex) "일"  -> NumberFormatException (불가능)
				System.out.println("x >>> : " + x);			
				int y = Integer.parseInt(sY);;
				System.out.println("y >>> : " + y);			
				int z = x / y;
				System.out.println(x + " / " +  y + " >>> : " + z);

				}

			catch (Exception e) // Arithmeticexception -> 사용x 대신 최상위클래스인 Exception  사용해라.
				{
					System.out.println("e >>> " + e);
				}finally{ // -> 잘 쓰지는 않지만 특정하게 쓰는 곳이 정해져있다. 무조건 수행된다는 정도만 알고 있자.
					System.out.println("finally 블럭은 catch 블럭의 수행 여부와 관계없이 무조건 수행된다. >>> : ");
				}


		}else{
			

		}

		
		System.out.println("try catch 블럭 이후 >>> : ");

	} // end of main()


} // end of ExceptionTest_5 class


/*
Exception
	CheckedException : 컴파일 시 에러 발생
		RuntimeException을 상속하지 않는 예외
		IOException,SQLException

Unchecked Exception : 실행 시 에러 발생(컴파일 시 에러 발생 ㄴ)
	RuntimeException을 상속하는 예외
	NullPointerException : 자바 언어에서 가장 어려운 에러.
	                     : 객체(참조변수, 변수)를 사용하고 싶은데 그 객체가 없을 때
						   데이터를 쓰려고 할 때 데이터가 없어서 나는 에러
						   NullPointerException이 발생하면 
						   해당 소스 뒤 쪽으로 에러를 찾으러 간다.
						   -> 함수 안에서는 인터프리터 방식이기 때문에, 함수(10-20행 중 15행)에서 에러가 발생하면
						   									10행으로 돌아가서 쭉쭉 봐라.
															호출이 여기저기 되어있을테니 여기저기 봐야함
															->로그를 안 찍으면 볼게 너무 많다.
*/