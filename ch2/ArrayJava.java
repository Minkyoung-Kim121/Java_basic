package com.bigdata30.ch2;

public class ArrayJava{

	public static void main(String args[]){
		
		/*
			자바에서 배열은 연산자 []를 사용한다. <-특성
			자바에서 배열은 object(객체)이다.
			자바에서 배열을 사용하려면 new 연산자를 사용해야한다. <-규칙
			자바에서 배열은 Data Type 이 동일해야한다.
			자바에서 배열은 참조변수를 사용한다.
			자바에서 배열을 선언할 때는, 요소(element)의 개수를 지정해야한다.
			자바에서 배열의 데이터를 사용하려면 참조변수[index(첨자)]를 사용해야한다.
			자바에서 배열의 index는 꼭 0부터 시작한다.
			
			자바에서 지원하는 배열의 종류
			1차원 배열 -> int i[] = new int[]
			2차원 배열 -> int[] ii[] = new int[][]
			다차원 배열
		*/
		// <int형 데이터 배열을 선언하는 방법>
		int i[] = new int[3];
		System.out.println("i >>> : " + i);
		// int형 배열의 개수(요소 수/element의 개수)를 알기 위해 length변수를 사용한다.
		// 배열의 길이를 구하세요 -> length
		// 하위 코드에서 i.length 구문을 출력하면, 3이 나오는데
		//                                이는 방이 3개 있다는 의미.
		//                                (요소가 들어갈 공간이 3개 있다.)
		System.out.println("i.length >>> : " + i.length);
		int iLen = i.length;
		System.out.println("iLen >>> : " + iLen);
		// 배열의 index
		// 현재 int형 배열이 3개의 방을 가지고 있는데,
		//     각 방에 있는 데이터를 index로 콘솔에 출력해 보시오.
		System.out.println("i[0] >>> : " + i[0]);
		System.out.println("i[1] >>> : " + i[1]);
		System.out.println("i[2] >>> : " + i[2]);
		//->출력하면, 각 데이터가 0이 나오는데
		//         이 값은 배열을 선언하고 int i[] new 인스턴스 new int[3] 하는 과정에서
		//         생성자(위와 같은 경우는 default Constructor)가 int형
		//         Data Type의 default Value인 0으로 초기화 했다.

		// <배열 초기화하기>
		i[0] = 1;
		// 참조변수 i가 가리키는 배열의 방(요소) 중 첫번째 방에 1을 대입하세요라는 의미
		System.out.println("i[0] = 1 >>> : " + i[0]);
		i[1] = 2;
		System.out.println("i[1] = 2 >>> : " + i[1]);
		i[2] = 3;
		System.out.println("i[2] = 3 >>> : " + i[2]);
		//
		int ii[] = new int[]{1, 2, 3}; // int[3] -> 방개수 3이 생략.
		
		System.out.println("ii[0] >>> : " + ii[0]);
		System.out.println("ii[1] >>> : " + ii[1]);
		System.out.println("ii[2] >>> : " + ii[2]);
		int iiLen = ii.length;
		for (int k=0; k < iiLen; k++)
		{
			System.out.println("ii["+k+"] >>> : " + ii[k]);
		}
		int iii[] = {1, 2, 3}; // new int[] 생략.
		System.out.println("iii[0] >>> : " + iii[0]);
		System.out.println("iii[1] >>> : " + iii[1]);
		System.out.println("iii[2] >>> : " + iii[2]);
		int iiiLen = iii.length;
		System.out.println("iiiLen >>> : " + iiiLen);
		for (int j=0; j <= iiiLen; j++ )
		{
		/* 암기 -> 
		System.out.println("iii["+j+"] >>> : " + iii[j]);
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at com.bigdata30.ch2.ArrayJava.main(ArrayJava.java:67)
		*/

		
		}
	}
}