package com.bigdata30.ch1;

public class VarDefaultValue_2{
// 정리) 생성자는 5개,(main()은 제외)

	int i;
	String s;
	// 매개변수가 없는 기본 생성자
	public VarDefaultValue_2(){
		System.out.println("VarDefaultValue_2() >>> : ");
	}
	// 매개변수가 1개 있는 생성자
	public VarDefaultValue_2(int i){
		System.out.println("VarDefaultValue_2(int i) >>> : " + i);
		//this 키워드 : 모든 언어/스크립트(객체지향)에서 현재 자기 자신을 지칭한다.
		//this.i : 현재 인스턴스한 멤버변수를 지칭한다.
		//i : VarDefaultValue_2(int i)의 매개변수 i를 생성자에서 재사용하는 변수.(복사한 변수)
		//VarDefaultValue_2(int i)에서 i는 매개변수
		this.i = i;
	}
	// 매개변수가 2개 있는 생성자
	public VarDefaultValue_2(int i, String s){
		System.out.println("VarDefaultValue_2(int i, , String s) >>> : " + i);		
		System.out.println("VarDefaultValue_2(int i, , String s) >>> : " + s);		
		this.i = i;
		this.s = s;
	}
	public static void main(String args[]){	
		//참조변수 v_2로 매개변수가 없는 기본생성자를 호출한다.
		VarDefaultValue_2 v_2 = new VarDefaultValue_2();
		System.out.println("v_2.i >>> : " + v_2.i);
		System.out.println("v_2.s >>> : " + v_2.s);
		//참조변수 v_2_1로 매개변수가 1개 있는 생성자를 호출한다.
		VarDefaultValue_2 v_2_1 = new VarDefaultValue_2(10);
		System.out.println("v_2_1.i >>> : " + v_2_1.i);
		System.out.println("v_2_1.s >>> : " + v_2_1.s);
		//참조변수 v_2_2로 매개변수가 2개 있는 생성자를 호출한다.
		VarDefaultValue_2 v_2_2 = new VarDefaultValue_2(10, "테스트");
		System.out.println("v_2_2.i >>> : " + v_2_2.i);
		System.out.println("v_2_2.s >>> : " + v_2_2.s);

	} // end of main()
} // end of VarDefaultValue_2 class