package com.bigdata30.ch1;

public class IntVariable{

	public static void main(String args[]){

		int i = 1;
		System.out.println("i >>> : " + i);


		// int 데이터 타입 Max 값 콘솔에 출력하기 
		// 방법 1
		System.out.println("Interger.MAX_VALUE >>> : " 
			                + Integer.MAX_VALUE);
		
		// 방법 2
		int iMax = Integer.MAX_VALUE;
		System.out.println("iMax >>> : " + iMax);

		// int 데이터 타입 MIN 값 콘솔에 출력하기 
		// 방법 1
		System.out.println("Integer.MIN_VALUE >>> : " 
			               + Integer.MIN_VALUE);

		// 방법 2
		int iMin = Integer.MIN_VALUE;
		System.out.println("iMin >>> : " + iMin);

		// int 데이터 타입 Max 값을 구해서
		// 10진수, 2진수, 8진수, 16진수를 콘솔에 출력하시오
		int iiMax = Integer.MAX_VALUE;
		System.out.println("iiMax >>> : " + iiMax);
		System.out.println("toBinaryString(iiMax) >>> : " 
			               + Integer.toBinaryString(iiMax));
		System.out.println("toOctalString(iiMax) >>> : " 
		                   + Integer.toOctalString(iiMax));
		System.out.println("toHexString(iiMax) >>> : " 
		                   + Integer.toHexString(iiMax));




	} // end of main()
}// end of IntVariable class

	