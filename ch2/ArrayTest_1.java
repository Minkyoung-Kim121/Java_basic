package a.b.c;

public class ArrayTest_1{

	public static void main(String args[]){
		
		// 자바에서 문자열은 문자의 배열이다.
		String s = "abc";
		System.out.println("s >>> : " + s);
		/*
		char c[] = {'a', 'b', 'c'};
		String ss = new String(c);
		System.out.println("ss >>> : " + ss);
		*/

	//문1)s에서 a를 출력하세요.
	System.out.println("" + s.charAt(0));
	//문1-1)s에서 b를 출력하세요.
	System.out.println("" + s.charAt(1));
	//문1-2)s에서 c를 출력하세요.
	System.out.println("" + s.charAt(2));
	//문2)문자열의 길이를 출력하세요.
	System.out.println("s.length() >>> : " + s.length());
	//-> String 클래스의 문자열 길이는 length() 함수로 구하고, 
	//   배열의 길이는 length 변수(필드)로 구한다.

	for (int i=0; i < s.length(); i++ )
	{
		System.out.println("charAt("+i+") >>> : " + s.charAt(i));
	}
	/*문자열의 배열
		System.out.println("" + s[0]);
		*/
	} // end of main()
} // end of ArrayTest_1 class