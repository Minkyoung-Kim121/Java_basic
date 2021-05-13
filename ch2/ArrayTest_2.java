package a.b.c;

public class ArrayTest_2{

	public static void main(String args[]){
		
		// 자바에서 문자열은 문자의 배열이다.
	//문1) for문, String 클래스의 charAt() 함수를 이용해서 각 문자를 출력하세요.
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// 배열 또는 for문을 사용하기 전에는 꼭 대상 객체의 길이를 구해서 한다.
		int sLen = s.length();
		System.out.println("sLen >>> : " + sLen);

	//답1-1) ->for문 이용
		for (int i=0; i < sLen; i++)
		{
			System.out.println("s.charAt("+i+") >>> : " + s.charAt(i));
		}
	//답1-2) ->CharAt()함수 이용
			System.out.println("" + s.charAt(0)); // <- A
			System.out.println("" + s.charAt(1)); // <- B
			System.out.println("" + s.charAt(25)); // <- Z

	} // end of main()
} // end of ArrayTest_1 class