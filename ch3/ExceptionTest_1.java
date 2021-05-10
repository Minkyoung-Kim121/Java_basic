package a.b.c;


public class ExceptionTest_1{ // p.492    java.lang.ArrayIndexOutOfBoundsException

//변수
//생성자
//함수()
	public void aM(int[] iVal) throws Exception {// -> main() 에서 throws 를 던지면 x
												 // -> error가 나오면, 함수안에서 해결하려 하지말고,
												 //    main()으로 던져라. (throws Exception를 이용)
												 //    던진 후, try-catch 구문으로 받아라.(메인 안에서)
	// -> aM() 함수에 리턴형은 void, 리턴 타입을 지정할 필요는 없으며(리턴타입 초기화 안 해도 끝),
								//    정수인 배열 5개(int[] iArr = new int[5];)을 넣는다.
	// -> 함수가 1개 (자원이 1개) : 매개변수는 배열([])이다.
		System.out.println("aM() >>> 시작 "); // ->인터프리터 방식을 사용하여 여기부터 출력을 시작한다.
		System.out.println("iVal >>> : " + iVal);
		System.out.println("iVal.length >>> : " + iVal.length); // -> iVal.length >>> : 5
																// i = 0, 1, 2, 3, 4 -> 5개
		try
		{
			for (int i=0; i < iVal.length; i++) // -> 정수 i 부터 돌기 시작하며 iVal.length 보다 작을 때 돈다.
			// -> 자바에서 배열[] 인덱스는 0부터 돈다. (cf.오라클은 1부터)
			
			// -> for() 문은 0이든 1이든 상관x 갯수(배열의 방, 즉 인덱스)를 맞추기 위해 int i=1로 선언하면, 에러난다.
			// for (int i=1; i <= iVal.length; i++)
			/* -> 4개밖에 출력 안 된다.
			iVal[1] >>> : 1
			iVal.length >>> : 5
			iVal[2] >>> : 2
			iVal.length >>> : 5
			iVal[3] >>> : 3
			iVal.length >>> : 5
			iVal[4] >>> : 4
			iVal.length >>> : 5
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
					at a.b.c.ExceptionTest_1.aM(ExceptionTest_1.java:18)
					at a.b.c.ExceptionTest_1.main(ExceptionTest_1.java:29)
			*/
			{
			iVal[i] = i;
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
			}


		}
/*
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("a.getMessage() >>> : " + a.getMessage());
		}
*/
		catch (Exception a)
		{
			System.out.println("a.getMessage() >>> : " + a.getMessage());
		}
		System.out.println("aM() >>> 끝 ");

	} // end of aM()


//main()
	public static void main(String args[]){
		System.out.println("main() >>> 시작");
		int[] iArr = new int[5]; // -> 참조변수 iArr을 사용하여 정수(int) 다섯개의 배열을 만들어라
		System.out.println("iArr >>> : " + iArr); // -> iArr >>> : [I@15db9742] 주소값

			try
			{
			ExceptionTest_1 et1 = new ExceptionTest_1();
			// -> ExceptionTest_1(); 생성자를 et1 참조변수를 사용하여 인스턴스

			et1.aM(iArr);
			// iArr(ExceptionTest_1(); 생성자로 선언한 아규먼트) 인자/아규먼트를 선언하여 함수 aM()를 호출한다.
			//                         ->  그러면 나는 이제 aM() 함수를 들여다 보러 가야한다!

			}
			catch (Exception e)
			{
			System.out.println("e >>> : " + e);
			}

		System.out.println("main() >>> 끝");
	} // end of main()

} // end of ExceptionTest_1 class