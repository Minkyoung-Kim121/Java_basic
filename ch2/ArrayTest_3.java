package a.b.c;

public class ArrayTest_3{

//문) 다양한 예제 실습해보기.
	// 문1)ASCII 테이블표를 콘솔에 출력하세요 (단, 16진수만)
	// 문1-1) // <- 대문자로 출력됨.
	public static void sLAscii(String sL){
		System.out.println("ArrayTest_3 sLAscii(String sL) 함수 시작 ");
		System.out.println("sL >>> : " + sL);
		int sLlen = sL.length();
		for (int i=0; i < sLlen; i++ )
		{
			char csL = sL.charAt(i);
			System.out.println("sL.charAt("+i+") >>> : " 
				                    + csL + " : " 
				                    + Integer.toHexString(csL));
		}
		System.out.println("ArrayTest_3 sLAscii(String sL) 함수 끝 ");
	}
	// 문1-2) // <- 소문자로 출력됨.
	public static void sSAscii(String sS){
		System.out.println("ArratyTest_3 sSAscii(String sS) 함수 시작 ");
		System.out.println("sS >>> : " + sS);
		int sSlen = sS.length();
		for (int i=0; i < sSlen; i++ )
		{
			char csS = sS.charAt(i);
			System.out.println("sS.charAt("+i+") >>> : " 
				                     + csS + " : "
								     + Integer.toHexString(csS));
		}

		System.out.println("ArratyTest_3 sSAscii(String sS) 함수 끝 ");
	}
	// 문1-3) // <- 숫자로 출력됨.
	public static void sNAscii(String sN){
		System.out.println("ArrayTest_3 sNAscii(String sN) 함수 시작 ");
		System.out.println("sN >>> : " + sN);
		int sNlen = sN.length();
		for (int i=0; i < sNlen; i++ )
		{
			char csN = sN.charAt(i);
			System.out.println("sN.charAt("+i+") >>> : " 
				                     + csN + " : "
								     + Integer.toHexString(csN));
		}

		System.out.println("ArrayTest_3 sNAscii(String sN) 함수 끝 ");

	}
	// 문1-4) // <- 사칙연산 출력
	public static void sOAscii(String sO){
		System.out.println("ArrayTest_3 sOAscii(String sO) 함수 시작 ");
		System.out.println("sO >>> : " + sO);
		int sOlen = sO.length();
		for (int i=0; i < sOlen; i++ )
		{
			char csO = sO.charAt(i);
			System.out.println("sO.charAt("+i+") >>> : " 
				                     + csO + " : "
								     + Integer.toHexString(csO));
		}

		System.out.println("ArrayTest_3 sOAscii(String sO) 함수 끝 ");
	}
	// 문1-5) // <- 특수기호 출력
	public static void sQAscii(String sQ){
		System.out.println("ArrayTest_3 sQAscii(String sQ) 함수 시작 ");
		System.out.println("sQ >>> : " + sQ);
		int sQlen = sQ.length();
		for (int i=0; i < sQlen; i++ )
		{
			char csQ = sQ.charAt(i);
			System.out.println("sQ.charAt("+i+") >>> : " 
				                     + csQ + " : "
								     + Integer.toHexString(csQ));
		}
		System.out.println("ArrayTest_3 sQAscii(String sQ) 함수 끝 ");
	}

	public static void main(String args[]){
	//문) 다양한 예제 실습해보기.
		// 문1)ASCII 테이블표를 콘솔에 출력하세요 (단, 16진수만)
		// 답1-1)영문자 대문자
		String sL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// 답1-2)영문자 소문자
		String sS = sL.toLowerCase();
		// 답1-3)정수 숫자
		String sN = "0123456789";
		// 답1-4)사칙 연산자
		String sO = "+x-/";
		// 답1-5)특수기호
		String sQ = "!@#$%^&";

		// 영문자 대문자 아스키표 출력하기 
		// ArrayTest_3 클래스에서 static 함수 sLAscii()를 아규먼트 sl을 이용하여, 
		//    ArrayTest_3에 있는 sLAscii(String sL) 매개변수가 String sL인 함수를 호출한다.
		ArrayTest_3.sLAscii(sL);
		ArrayTest_3.sSAscii(sS);
		ArrayTest_3.sNAscii(sN);
		ArrayTest_3.sOAscii(sO);
		ArrayTest_3.sQAscii(sQ);

		//문1 추가) 함수가 너무 많을 때
		//답1 추가) 함수 하나로 선언된 변수의 아스키코드를 전부 불러오기
		System.out.println("ArrayTest_3.sLAscii() 함수 하나로 다 불러오기");
		ArrayTest_3.sLAscii(sL);
		ArrayTest_3.sSAscii(sS);
		ArrayTest_3.sNAscii(sN);
		ArrayTest_3.sOAscii(sO);
		ArrayTest_3.sQAscii(sQ);
	
	} // end of main()
} // end of ArrayTest_3 class