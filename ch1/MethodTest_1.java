package com.bigdata30.ch1;

public class MethodTest_1{

	public static int calcuMethod(int xx, int yy){
		System.out.println("calcuMethod() 함수 시작 >>> : ");
		int sum = xx + yy;
		System.out.println("calcuMethod() 함수 끝 >>> : ");
		return sum;
	} // end of calcuMethod()


	public static void main(String a[]){
		System.out.println("main() 함수 시작 >>> : ");
		int x = 1;
		int y = 2;
		int sum =MethodTest_1.calcuMethod(x, y);
		
		System.out.println("sum >>> : "+sum);
		System.out.println("main() 함수 끝 >>> : ");
	} // end of main()
} // end of MethodTest_1 class


/*
javac -d . MethodTest_1.java : 컴파일
java com.bigdata30.ch1.MethodTest_1 : 실행 


jvm 이 하는 일 
1. static 키워드 붙은 넘들(변수, 함수)를 메모리에 올린다. 
	public static int calcuMethod(int xx, int yy)
	public static void main(String a[])
2. 클래스에 있는 자원을 메모리에 올리면 그 다음 일은 
   main() 함수를 호출한다.
   요기가 시작점이다. 
3. main() 함수 가 시작 하니 

   첫번째 라인에 
   System.out.println("main() 함수 시작 >>> : ");
   출력 하시오 
4. int x = 1; int y = 2; 지역변수 초기화 
5. MethodTest_1.calcuMethod(x, y); static 함수 호출 
6. 5라인에 있는 
   calcuMethod(x, y) {} 함수가 일을 시작 한다. 
7. calcuMethod(int xx, int yy) 
   첫라인에서 
   System.out.println("calcuMethod() 함수 시작 >>> : ");
   출력 
   두번째 라인에서 
   int sum = xx + yy;
   계산 
   세번째 라인에서 
   System.out.println("calcuMethod() 함수 끝 >>> : ");
   출력
   네번째 라인에서 
   return sum
   sum 에 값 담아서 리턴 하라고 함 
	calcuMethod(int xx, int yy) 끝
8. 17라인 에서
   MethodTest_1.calcuMethod(x, y); 함수의 결과 
   리턴값을 가지고 와서 
   int sum 에 대입한다. 	
9. 19라인 출력 
10. 20라인 출력 
11. main() 함수 끝 
12. 프로그램 종료 

*/