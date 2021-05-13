package a.b.c;

public class ValueTest_1{

	// main() 함수에 있는 매개변수 : String args[] -> 스트링 배열
	// 명령행 인수 
	public static void main(String args[]){
	
		String s0 = args[0];
		System.out.println("args[0] >>> : " + s0);
		String s1 = args[1];
		System.out.println("args[1] >>> : " + s1);
//		String s2 = args[2];
//		System.out.println("args[2] >>> : " + s2);
		System.out.println(s0 + s1);
		// Integer.parseInt() 함수 -> 문자숫자를 숫자로 변환하는 함수이다.
		//                          단, 위 함수는 문자숫자만 변환한다.
		//                          (문자를 변환하는 것은 아니다.)

	/*
	C:\00.KOSMO72\00.JExam\ch2>java a.b.c.ValueTest_1 일 이
	args[0] >>> : 일
	args[1] >>> : 이
	일이
	Exception in thread "main" java.lang.NumberFormatException: For input string: "일"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at a.b.c.ValueTest_1.main(ValueTest_1.java:23)	
	*/
		int i0 = Integer.parseInt(s0);
		int i1 = Integer.parseInt(s1);
		System.out.println(i0 + i1);

		
	/* 스트링배열
		System.out.println();
		String s[] = {"111", "222", "ccc"};
		for (int i=0; i < s.length; i++)
		{
			System.out.println("s["+i+"] >>> : " + s[i]);
		}
	*/
	}
}