package a.b.c;

import java.util.Scanner;
public class ExceptionTest_4{

	public static void main(String args[]){ // -> 메인 밖으로 던지지 마라 throws Exception ---> x
		//int x = 1;
		//int y = 0;
		// 변수의 위치 : 해당 변수를 재사용할 것인지 / 아닌지에 따라 위치가 정해진다.
		//               -> 변수의 활용성, 활용 범위에 따라 위치를 정한다.
		//               + 글로벌하게 (범위를 넓게) 사용하면 변수를 컨트롤 하기 힘들어진다.		
		
		System.out.println("콘솔에 데이터를 입력하세요 >>> : ");
		Scanner sc = new Scanner(System.in); // Scanner 사용하면 콘솔에 찍어볼 수 있다. -> 이를 로그(log)를 찍는다고 한다.
		// Q) Scanner 사용법 숙지하기
		try
		{
			int x = sc.nextInt(); // -> int x = 1; 대신에 콘솔에 숫자를 집접 입력 가능하도록,
								  //               계속 다른 숫자를 찍어보도록 sc.nextInt();사용
			System.out.println("x >>> : " + x);
			int y = sc.nextInt();
			System.out.println("y >>> : " + y);	
			/*
			Exception in thread "main" java.lang.ArithmeticException: / by zero
			 at a.b.c.ExceptionTest_4.main(ExceptionTest_4.java:10)
			*/
			int z = x / y;
			System.out.println(x  + " / " + y + " >>> : " + z); // -> 2 / 1 >>> : 2
			/*
			콘솔에 데이터를 입력하세요 >>> :
			2
			x >>> : 2
			1
			y >>> : 1
			2 / 1 >>> : 2
			*/

		}

		catch (Exception e) // Arithmeticexception -> 사용x 대신 최상위클래스인 Exception  사용해라.
		{
			System.out.println("e.getMessage() >>> " + e.getMessage());
			// 2 / 1 >>> : 2 (에러x 경우)
			// e.getMessage() >>> / by zero (에러o 경우)
		}finally{ // -> 잘 쓰지는 않지만 특정하게 쓰는 곳이 정해져있다. 무조건 수행된다는 정도만 알고 있자.
			System.out.println("finally 블럭은 catch 블럭의 수행 여부와 관계없이 무조건 수행된다. >>> : ");
		}
		System.out.println("try catch 블럭 이후 >>> : ");

	} // end of main()


} // end of ExceptionTest_4 class