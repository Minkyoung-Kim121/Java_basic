package a.b.c;

public class ForTest{

	public static void main(String args[]){

		/*
		for (초기화식; 조건식; 증감식)
		{
			수행문;
		}
		*/
		/*
		for (; ; )
		{
			System.out.println(">>>>>>");
		}
		*/
		/* -> for 문은 true 일때만 돈다.
		for (; false ; )
		{
			System.out.println(">>>>>>");
		}
		1 error
		*/

		// int i = 0 -> int형 데이터타입을 사용하며 변수명은 i 이다.
		// i (지역)변수의 사용범위는 for{} 내부이다.
		// i는 0으로 초기화했다.
		// <조건식>
		// i < 5 -> i값은 0,1,2,3,4 까지만 true.
		// <증감식>
		// i++ : 후위 증감연산자
		// i = i + 1 (나중에 설명)
		// int형 데이터를 0부터 4까지 다섯개를 콘솔에 출력하세요.

		for (int i=0; i > 5; i++ )
		{
			System.out.println("hello" + i);
		}
	} //end of main()
} //end of ForTest class