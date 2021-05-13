package com.bigdata30.ch2;

public class IfTest_1{

	public static void main(String args[]){

/*
A)boolean 키워드의 특징) 교재 p.375
					 기본 자료형
					 i byte : true , false
					 지역변수
	1) Wrapper 클래스) Boolean
	2) default값) false
  
*/
		boolean bool = false;

		if (bool)
		{
			System.out.println(" bool = false");
		}else{
			System.out.println(" else 111 ");
		}
		
		//! : not 연산자 (반대 연산자)★
		//!bool -> !(bool = false) -> true 결과 값이 나옴.
		if (!bool)
		{
			System.out.println(" !bool = false = true");
		}else{
			System.out.println(" else 222 ");
		}
	} // end of main()
} // end of IfTest_1 class