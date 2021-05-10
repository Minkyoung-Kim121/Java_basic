package a.b.c;

import java.util.Scanner;
import java.math.BigDecimal;
import a.b.c.KmkMathImple;

public class KmkMathScr{
	
	// Q) String 으로 리턴을 한 이유???
	//   => 클라이언트의 돈? 이 차이가 난다. BigDecimal 을 썼다가 String 이 더 싸다고 했을 때, 한번에 바꾸면 난리난다.
	//     처음 배우면서도 일하는 마인드를 생각해보자.
/*
	public String add(String x, String y){
// 3. 사칙연산자 헥사코드로 사용하기      헥사 코드?

		return "";
	}

	public String subtract(String x, String y){

		return "";
	}

	public String multiply(String x, String y){

		return "";
	}

	public String divide(String x, String y){
	// -> 이미 불러온 클래스 KmkMathImple 안에 add() 함수를 BigDecimal 로 정의했기 때문에 밑에 처럼 
	//    또 BigDecimal 을 붙일 필요가 x
		return "";
	}

*/



	public static void main(String args[]){

		KmkMathImple kkm = new KmkMathImple(); //  상속 x ---> 자원을 쓰는 것.
		//kkm.add(); // -> 잘 호출 됐는지 보려면 시스템웅앵 출력해야하는데,
		//어차피 이 함수는 KmKMathImple.java 에 있기 때문에,
		//그리고 메인 안에 호출했기 때문에 위의 클래스가 이미 출력 가능한 상태이기 때문에 여기에서 출력을 보는 것이 아니라,
		//함수 선언한 클래스에 가서 출력 확인하자.
		
		//kkm.subtract();
		//kkm.multiply();
		//kkm.divide();

		Scanner sc = new Scanner(System.in);
		int input = 0;
		// 원래는 int 로 받아야 하는데, BigDecimal을 문자숫자 ("숫자")로 데이터를 받아야 하기 때문에,
		// 처음부터 String 을 쓰는 것이 좋다.
		input = sc.nextInt(); // .nextInt() 는 int 형이기 때문에 int로 받아야.
		// **.nextInt(); ->>> 콘솔에 입력하라는 뜻.
		String input1 = String.valueOf(input);
		System.out.println("input1 >>> : " + input1);
		input = sc.nextInt();
		String input2 = String.valueOf(input);
		System.out.println("input2 >>> : " + input2);


//		BigDecimal add1 = new BigDecimal();        ->   BigDecimal 이 메모리에 없어서 올려야하는데,
//														어떻게 올릴것인가?


//		Scanner sc = new Scanner(System.in);
//		double input = 0.0;

//		input = sc.nextInt();

/*
for (int i=0; i  ; i++)// 범위 설정을 어떻게 하지
		{
			System.out.println(.ROWND_DOWN());
		}
*/
		
		
		/* 계속 돌게 하지 말고, 계산이 끝나면 나가도록 break 나가기 까지 해서 실행해보자

		while (true)
		{
			if (0x2B == opr){
				System.out.println("더하기");
			}
		}
		
		*/

	}
}




/*
1. 사칙연산 프로그램 만들기 + - x /


2. 사용클래스 Bigdecimal

3. 사칙연산자 헥사코드로 사용하기
헥사 코드?

4. 데이터는 실수로 연산하기
double 변수 선언
5. 데이터 연산결과 실수로 리턴하기
리턴도 double 0.0
6. 연산결과 실수 소수점은 3자리로 통일
.ROWND_DOWN()
7. 소수점은 ROWND_DOWN 사용

System.out.println(확인해보자);

8. 데이터 인풋은 Scanner 또는 명령행 인수로 본인이 선택해서 하기
데이터 개수는 3(연산자 까지 데이터로 취급하고) 또는 2(숫자만)

9. 사칙연산은 함수로 구현하기
add()
subtract()
multiply()
divide()
10. 함수는 인터페이스에서 선언해서 클래스에서 구현하기
질문 가능
interface?????????????????
{} 구현체를 만들어서 구현부 안에 넣어???
??함수를?
9번의 사칙연산 함수?

interface class{
add()
negate()
multiply()
divide()
}
   ????

첫번째 할 일
어떻게 프로그램을 할 것인가 생각하고
클래스 구조를 어떻게 할 것인가 생각하고
함수를 어떻게 할 것인가 생각하고
패키지 및 클래스 설계하기
KmkMathScr  -> class name 
*/


