/*
2020-10-23
1. 사칙연산 프로그램 만들기 + - x /
2. 사용클래스 BigDecimal
3. 사칙연산자 헥사코드로 사용하기 
4. 데이터는 실수로 연산하기 
5. 데이터 연산결과 실수로 리턴하기
6. 연산결과 실수 소수점은 3자리로 통일 
7. 소수점은 ROUND_DOWN 사용 
8. 데이터 인풋은 Scanner 또는 명령행 인수로 
   본인 선택해서 하기 (데이터 갯수는 3 또는 2)
9. 사칙연산은 함수로 구현하기 
10. 함수는 인터페이스에서 선언해서 클래스에서 구현하기 
................ 모자라는 것은 질문 하기 ...

첫번째 할 일 
어떻게 프로그램을 할 것 인가 생각하고 
클래스 구조를 어떻게 할 것 인가 생각하고 
함수를 어떻게 할 것 인가 생각하고 
패키지 및 클래스 설계하기 

패키지 : 전세계에서 유니크 해야 한다. : 도메인역순
      : 패키지는 기본 폴더 구조와 동일하다.
	  : 자바에서만 사용하는 폴더로 구조로 이해하고 사용해야 한다. 
	  : 패키지 링크 연산자는 .(dot) 만 사용한다. 
	  : a.b.c : a/b/c

a.b.c
화면 클래스 : a.b.c.KosMathScr
KosMathScr
add()
subtract
multiply()
divide()

계산하는 인터페이스 : a.b.c.KosMath
KosMath
add()
subtract
multiply()
divide()

계산하는 인터페이스를 상속한 구현체 클래스 : a.b.c.KosMathImp
KosMathImpl
add()
subtract
multiply()
divide()

*/

package a.b.c;

import java.util.Scanner;
import java.math.BigDecimal;

public class KosMathScr{

	public BigDecimal add(String dX, String dY){
		System.out.println("KosMathScr add 함수 시작 >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bAdd = km.add(dX, dY);

		System.out.println("KosMathScr add 함수 끝 >>> : ");

		return bAdd;
	}
	public BigDecimal subtract(String dX, String dY){
		System.out.println("KosMathScr subtract 함수 시작 >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bSub = km.subtract(dX, dY);

		System.out.println("KosMathScr subtract 함수 끝 >>> : ");

		return bSub;
	}
	public BigDecimal multiply(String dX, String dY){
		System.out.println("KosMathScr multiply 함수 시작 >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bMul = km.multiply(dX, dY);

		System.out.println("KosMathScr multiply 함수 끝 >>> : ");

		return bMul;
	}
	public BigDecimal divide(String dX, String dY){
		System.out.println("KosMathScr divide 함수 시작 >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bDiv = km.divide(dX, dY);

		System.out.println("KosMathScr divide 함수 끝 >>> : ");

		return bDiv;
	}

	public static void main(String args[]){
		System.out.println("메인 함수 시작 >>> : ");
		// 데이터 받기 : Scanner 클래스 이용
		// 데이터를 선언 하기 
		System.out.println("사칙연산 프로그램입니다. !!");
		System.out.println("프로그램을 종료하려면 q 또는 Q 넣으세요");
		System.out.println("연산을 시작하세요 >>> :: ");		
		
		while (true)
		{		
			Scanner sc = new Scanner(System.in);
			System.out.println("x값 넣기 실수로 >>> :: ");
			String dX = sc.next();
			System.out.println("x >>> :: " + dX);
			System.out.println("y값 넣기 실수로 >>> :: ");
			String dY = sc.next();
			System.out.println("y >>> :: " + dY);
			System.out.println("연산자를를 넣으세요 + - * /");
			
			char oper = sc.next().charAt(0);
			System.out.println("oper >>> : " + oper);
			
			if (0x2b == oper)
			{
				System.out.println("oper >>> : " + oper);
				// 함수를 호출하기 : 더하기 빼기 곱하기 나누기 
				KosMathScr km = new KosMathScr();
				// 더하기 
				try
				{
					BigDecimal dAdd = km.add(dX, dY);
					System.out.println("dAdd >>> : " + dAdd);					
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (0x2D == oper)
			{
				System.out.println("oper >>> : " + oper);
				KosMathScr km = new KosMathScr();
				// 빼기
				// subtract
				try
				{
					BigDecimal dSub = km.subtract(dX, dY);
					System.out.println("dSub >>> : " + dSub);					
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (0x2A == oper)
			{
				System.out.println("oper >>> : " + oper);
				KosMathScr km = new KosMathScr();
				// 곱하기
				// multiply()
				try
				{
					BigDecimal dMul = km.multiply(dX, dY);
					System.out.println("dMul >>> : " + dMul);
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}				
			}
			if (0x2F == oper)
			{
				System.out.println("oper >>> : " + oper);
				KosMathScr km = new KosMathScr();
				// 나누기 
				// divide()
				try
				{
					BigDecimal dDiv = km.divide(dX, dY);
					System.out.println("dDiv >>> : " + dDiv);
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}					
			}

			if (0x71 == oper || 0x51 == oper)
			{
				System.out.println("oper >>> : " + oper);
				break;
				// System.exit(0);
			}
		}
	}
}



