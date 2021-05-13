package com.bigdata30.ch2;

public class IfTest_4{

	// 사용자 정의 기본 생성자
	public IfTest_4(){}

	// 리턴형이 boolean 함수
	public static boolean boolTest(int x, int y){
		// 지역변수
		boolean bool = false;

		if (x < y){
			bool = true;
		}

		return bool;
	}

	public static void main(String args[]){
		
		int x = 1;
		int y = 2;

		IfTest_4 i4 = new IfTest_4();
		boolean bool = i4.boolTest(x, y);

		if (bool)
		{
			System.out.println("함수가 잘 수행 되었습니다.");
		}else{
			System.out.println("함수가 잘 수행 되지 않았습니다.");	
		}
	}
}