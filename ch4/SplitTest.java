package a.b.c;

// split(",");
// 
public class SplitTest {
	
	public static void main(String args[]){
		
		String sVal = "abc,def,ghi,jkl,mno"; // String 문자열 데이터타입의 sVal 은 "abc,def,ghi,jkl,mno" 이다.
		System.out.println("sVal >>> : " + sVal);// abc,def,ghi,jkl,mno

		String str[] = sVal.split(","); // delimiter : 구분자
		// 스트링 배열 str 참조변수를 사용해서 .split() 함수 사용 -> split() 함수의 구분자는 "," 로 사용하겠다.
		// ""를 쓴 이유는 스트링으로 선언했기 때문.
		// sVal = "abc,def,ghi,jkl,mno" -> 즉, 5개의 배열 ....??
		// String str[] = {"abc,def,ghi,jkl,mno"}; 바로 대입한 것.
		System.out.println("str >>> : " + str); // str >>> : [Ljava.lang.String;@15db9742
		System.out.println("str.length >>> : " + str.length); // str.length >>> : 5

		
		// for 문으로 콘솔에 찍어보기		
		
		// 배열의 첫 번째 자원 출력
		System.out.println("str[0] >>> : " + str[0]); // str[0] >>> : abc
		// 문자열 배열 자원의 스트링(문자열)을 char(문자)로 쪼개서 출력하기
		System.out.println("str[0].charAt(0) >>> : " + str[0].charAt(0)); // >>> : a
		System.out.println("str[0].charAt(1) >>> : " + str[0].charAt(1)); // >>> : b
		System.out.println("str[0].charAt(2) >>> : " + str[0].charAt(2)); // >>> : c
		
		System.out.println("str[1] >>> : " + str[1]);
		System.out.println("str[1].charAt(0) >>> : " + str[1].charAt(0));
		System.out.println("str[1].charAt(1) >>> : " + str[1].charAt(1));
		System.out.println("str[1].charAt(2) >>> : " + str[1].charAt(2));

		System.out.println("str[2] >>> : " + str[2]);
		System.out.println("str[2].charAt(0) >>> : " + str[2].charAt(0));
		System.out.println("str[2].charAt(1) >>> : " + str[2].charAt(1));
		System.out.println("str[2].charAt(2) >>> : " + str[2].charAt(2));
//		System.out.println("str[2].charAt(3) >>> : " + str[2].charAt(3));
// -> String sVal = "abc,def,ghi,jkl,mno"; 
//    "abc" 와 " abc" 는 같지 않다. 공백 또한 텍스트로 인식 -> abc 는 3개, abc 는 4개.

		System.out.println("str[3] >>> : " + str[3]);
		System.out.println("str[3].charAt(0) >>> : " + str[3].charAt(0));
		System.out.println("str[3].charAt(1) >>> : " + str[3].charAt(1));
		System.out.println("str[3].charAt(2) >>> : " + str[3].charAt(2));

		System.out.println("str[4] >>> : " + str[4]);
		System.out.println("str[4].charAt(0) >>> : " + str[4].charAt(0));
		System.out.println("str[4].charAt(1) >>> : " + str[4].charAt(1));
		System.out.println("str[4].charAt(2) >>> : " + str[4].charAt(2));


	}



}