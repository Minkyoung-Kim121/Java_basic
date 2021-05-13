package com.bigdata30.ch2;

public class IfTest_2{

	public static void main(String args[]){

		// 1 > 2 : 비교 연산자를 사용해 수의 크기를 비교한 것.
		// 코드 쓸 줄 알아야★
		boolean bool = 1 > 2;
		System.out.println(" bool >>> : " + bool);
		if (bool)
		{
			System.out.println(" bool --> true");
		}

		if (1 >2)
		{
			System.out.println(" bool --> true ");
		}

		boolean bool1 = 1 < 2;
		System.out.println("bool1 >>> : " + bool1);
		if (bool1)
		{
			System.out.println("bool1 --> true");
		}

		
		//char : 2byte(16bit) -> 0을 포함한 양의 정수 16bit
		//int : 4byte(32bit) -> 0을 중심으로 부호비트 - 와 부호비트 + 의 양쪽 값을 다 가짐.
		boolean bool2 = 'a' > 'A';
		System.out.println("bool2 >>> : " + bool2);
		//<암묵적/묵시적 형변환> implicit casting ★
		int aS = 'a';
		System.out.println("aS >>> : " + aS);
		//static String toHexString(int i)
		System.out.println("'a' : 16진수 : 0x" + Integer.toHexString('a')); // 자동 형변환 : char a 가 int로 형변환 됨
		System.out.println("aS : 16진수 : 0x" + Integer.toHexString(aS)); // 자동 형변환 : char A 가 int로 형변환 됨
		int aL = 'A';
		System.out.println("aL >>> : " + aL);
		System.out.println("'A' : 16진수 : 0x" + Integer.toHexString('A'));
		System.out.println("aL : 16진수 : 0x" + Integer.toHexString(aS));
		boolean bool3 = 97 > 65; // 10진수
		System.out.println("bool3 >>> : " + bool3);
		boolean bool4 = 0x61 > 0x41; // 16진수
		System.out.println("bool4 >>> : " + bool4);
		if (bool2) 
		{
			System.out.println("bool2 --> true ");
		}else{
			System.out.println("bool2 --> false ");
		}
		if (0x61 > 0x41) 
		{
			System.out.println(" true ");
		}else{
			System.out.println(" false ");
		}
	} // end of main()
} // end of IfTest_2 class
//p.92, p.64