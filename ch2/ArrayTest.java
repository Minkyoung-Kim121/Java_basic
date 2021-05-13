package a.b.c;

public class ArrayTest{

	public static void main(String args[]){
		
		// 자바에서 문자열은 "" (더블 쿼테이션)으로 묶어서 표현한다.
		// 자바에서 문자는 '' (싱글 쿼테이션)으로 묶어서 표현한다.
		// String 문자열 abc는 가상의 일련번호(index/첨자)를 가진다.
		// index 는 첨자
		// 요소(element)
		// index 0      -1 : 데이터가 없다는 의미
		String s = "abc";
		System.out.println("abc >>> : " + s);

		// public char charAt(int index)
		char cValue0 = s.charAt(0);
		System.out.println("cValue0 >>> : " + cValue0);
		char cValue1 = s.charAt(1);
		System.out.println("cValue1 >>> : " + cValue1);
		char cValue2 = s.charAt(2);
		System.out.println("cValue2 >>> : " + cValue2);
	} // end of main()
} // end of ArrayTest class