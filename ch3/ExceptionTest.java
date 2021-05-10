package a.b.c;


public class ExceptionTest{

	public void aM() throws Exception{
		System.out.println("aM() 함수");

		new Thread().sleep(1000);
	}

	public static void main(String args[]) throws Exception{

		try 
		{
			// 사고가 생겼다.
		int x = 1;
		int y = 0;
		int z = x / y; // -> 원래대로 라면 나눗셈이 실행x (int y = 0  이기 때문)

		System.out.println("z >>> : " + z); // -> 항상 리턴값 받아서 쓰는것을 연습해야 한다.
		System.out.println("x / y >>> : " + (x / y)); // -> 연습용 (쓰면 x)
//		System.out.println(1 / -1); -> 위의 행과 같은 말이다. 

		}

		catch (ArithmeticException a){

//예1)		catch (Exception a){

			// ArithmeticException -> 산술 연산 중 발생할 수 있는 예외, 즉 0으로 숫자 나누기와 같은 경우 발생
			//                        runTimeException의 하위 항목이며 다시 말해, 실행 (컴파일x)시 나오는 오류
			//                        즉, 컴파일 시 나오지 않기 때문에 직접 확인해야.
			System.out.println("a >>> : " + a.getMessage());
		}

//예1)		catch ( ArithmeticException e )     -> 처리했으니까 또 잡지 말라는 얘기
/*예1)
C:\00.KOSMO72\00.JExam\ch3>javac -d . ExceptionTest.java
ExceptionTest.java:36: error: exception ArithmeticException has already been caught
                catch (ArithmeticException a
                ^
1 error
*/

// try catch 구문에서 p.488
// catch 절은 여러개를 쓸 수 있는데, Exception의 하위 클래스부터 기술한다. 

		catch ( Exception e )
			/* try 절에서 발생할 예외를 처리할 클래스의 예외 타입을 선언하는 곳 */
			 // -> Exception class : 예외 클래스의 최상위 클래스
		{
			// 사고 처리를 한다.
			// 예외를 처리하는 부분
//			System.out.println("e >>> : " + e); // -> 사용 금지
//			System.out.println("e <<<>>> : " + e); // -> 사용 금지
			System.out.println("e.getMessage() >>> " + e.getMessage()); // -> 이것만 쓰는 것.
//			e.printStackTrace(); // -> 사용 금지 (오류 발생시 수행속도만 저하시킨다.)
		}
		
		System.out.println("try catch 블럭 이후 ");
		ExceptionTest et = new ExceptionTest();
		et.aM();

	}




}