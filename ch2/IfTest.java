package com.bigdata30.ch2;

/*
Flow Control
A)if문 : 분기문이라고 한다.★
    정의)논리연산/연산(조건식)의 결과가 true일 때만 수행된다.★
    특징)함수 안에서 사용한다. (함수 안은 인터프리터 방식)★
	정리)if 문의 결과가 false 일때만 else 절이 수행된다.  -암기★
		-> if 문에 있는 수행조건의 결과가 false 일때만 else 절이 수행된다.  -암기★
		-> if 문의 수행조건에 해당이 안 되는 것은 아무 관계가 없다.  -암기★
*/
public class IfTest{

	public static void main(String args[]){
		System.out.println("main() 함수 시작");
		if (true)
		{
			System.out.println("if 문 연산 결과가 true 이다.");
		}
		System.out.println("if(true) 문 다음 ");
		if (false)
		{
			System.out.println("if 문 연산 결과가 true 일때만 수행된다.");
		}else{
			System.out.println("if 문 연산 결과가 false 일때만 수행된다.");
		}
		if (true){
			System.out.println("if 문 연산 결과가 true 이다.2222 ");
		}
		System.out.println("if(false) 문 다음 ");

	} // end of main()
} // end of IfTest class