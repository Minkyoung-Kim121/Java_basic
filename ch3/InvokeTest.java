package a.b.c;
public class InvokeTest{

//함수
	public void aM() throws Exception { // ->  throws Exception 명시적으로 항상 작성하자.
		System.out.println("aM() 함수 시작");
		System.out.println("aM()");
		bM(); // -> 출력 된다. 함수 4개를 컴파일링해서 메모리에 올려놨기 때문.
		System.out.println("aM() 함수 끝");
	}

	public void bM() throws Exception {
		System.out.println("bM() 함수 시작");
		System.out.println("bM()");
		// error 발생 : e >>> : java.lang.ArithmeticException: / by zero
		int[] iVal = new int[5];
		for (int i=0; i <= iVal.length; i++)
		{
			iVal[i] = i;
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
			// "+i+" -> 배열 iVal[i] 안의 모든 데이터 (5개)를 내림차순으로 출력하시오.
		}
		cM();
		System.out.println("bM() 함수 끝");

	}
	
	public String cM() throws Exception {
		System.out.println("cM() 함수 시작");
		System.out.println("cM()");
		dM();
		System.out.println("cM() 함수 끝");
		return "";

	}

	public String dM() throws Exception {
		System.out.println("dM() 함수 시작");
		System.out.println("dM()");

		int x = 1;
		int y = 0;
		// error 발생 -> ArithmeticException a
		int z = x / y;
		/* javac  할 때 말고 java 실행하니까 에러 발생.
		-> 함수 안에서 해결x -> main()으로 던지자 (throws Exception 사용해서)
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at a.b.c.InvokeTest.dM(InvokeTest.java:39)
        at a.b.c.InvokeTest.cM(InvokeTest.java:26)
        at a.b.c.InvokeTest.bM(InvokeTest.java:18)
        at a.b.c.InvokeTest.aM(InvokeTest.java:10)
        at a.b.c.InvokeTest.main(InvokeTest.java:65)
		*/

		System.out.println("z >>> : " + z);
		System.out.println("dM() 함수 끝");
		return null;

	}


// 콘솔 어플리케이션(main()이 시작점인 어플리케이션)
// main()에서 시작해서 main()으로 끝난다.
// main() -> 모든 프로그램은 돌다가 결국 시작점, 즉 메인으로 리턴한다.(돌아온다.)
	public static void main(String args[]){
		
		System.out.println("main() 시작 >>> : ");

		try
		{
			InvokeTest it = new InvokeTest();

			System.out.println("it 참조변수 >>> : " + it);
			//	System.out.println("it.aM() >>> : " + it.aM());
			/* 
				-> C:\00.KOSMO72\00.JExam\ch3>javac -d . InvokeTest.java
				InvokeTest.java:35: error: 'void' type not allowed here
			*/
			// it 참조변수로 aM() 함수 호출했다.
			it.aM(); // -> aM() 함수는 void 이기 때문에 그냥 출력해야 한다.


		}
		catch (Exception e)
		{
			// System.out.println("e >>> : " + e);           -> 이거 쓰지마ㅏㅏㅏㅏㅏㅏㅏㄹ아라
			// -> e >>> : java.lang.ArrayIndexOutOfBoundsException: 5 라고 출력되기 때문에(?) 쓰지말고,
			//           "e.getMessage() >>> : " + e.getMessage()   -> 겟 웅앵웅 써라.

			System.out.println("e.getMessage() >>> : " + e.getMessage());
			// -> e.getMessage() >>> : 5

		}

			System.out.println("main() 끝 >>> : ");

	} // end of main()

} // end of ExceptionTest_1 class