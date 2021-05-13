package com.bigdata30.ch2;

public class IfTest_3{

	//<리턴형이 boolean인 함수>
	public boolean boolTest(){
		// 지역변수
		boolean bool = false;
/* -> 주석 풀고 컴파일+실행, 주석 달고 컴파일+실행 하면 결과값이 다르게 나온다.
		if (!bool){
			bool = true;
		}
*/
		return bool;
	}

	public static void main(String args[]){
		
		// IfTest_3 클래스를 i3 참조변수로 사용하기 위해 매개변수가 없는 생성자로 인스턴스 했다.
		//    ->잘 수행되면 : i3 참조변수로 boolTest() 함수를 호출 할 수 있다.
		IfTest_3 i3 = new IfTest_3();
		
		// i3 참조변수로 boolTest() 함수를 호출한 결과값이 boolean이다.
		// -> boolean 지역변수 bool 변수명으로 i3.boolTest() 리턴값을 받을 수 있다.
		// => bool 값에 따라 if 문이 수행된다.

		boolean bool = i3.boolTest();

		if (bool)
		{
			System.out.println("함수가 잘 수행 되었습니다.");
		}else{
			System.out.println("함수가 잘 수행되지 않았습니다.");
		}
	} // end of main()

} // end of IfTest_3 class