package com.bigdata30.ch1;

//문1)사용자 정의 VarDefaultValue_1 클래스에서 기본 자료형의 default value를 콘솔에 출력하시오.

public class VarDefaultValue_1{

	// 기본자료형
	byte b;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;

	public static void main(String args[]){
	
		VarDefaultValue_1 v_1 = new VarDefaultValue_1();
		System.out.println("b >>>> : " + v_1.b);
		System.out.println("c >>>> : " + v_1.c);
		System.out.println("s >>>> : " + v_1.s);
		System.out.println("i >>>> : " + v_1.i);
		System.out.println("l >>>> : " + v_1.l);
		System.out.println("f >>>> : " + v_1.f);
		System.out.println("d >>>> : " + v_1.d);
		System.out.println("bool >>>> : " + v_1.bool);
	} // end of main()
} // end of VarDefaultvalue_1 class