package com.bigdata30.ch1;

// 사용자 정의로 만든 클래스 : 이름은 VarDefaultValue

/*
A)자바 콘솔 어플리케이션 로드 순서
1.컴파일을 한다.(javac -d . VarDefaultValue.java)
2.실행.(java com.bigdata30.ch1.VarDefaultValue)
3.ClassLoader 클래스에서 init()함수를 호출한다.
4.init()함수에 링크된 인스턴스하고 싶은 클래스의 main()함수를 호출한다. <-main()이 시작점.
5.해당 클래스의 소스 파일에 기본 생성자(클래스이름())의 코드가 작성/기술 되어 있지 않으면
  jvm(자바버쳘머신)이 메모리상에서 기본 생성자(default contructor)를 만들기 때문에,
  위의 기본 생성자는 멤버변수로 선언된 변수를 default value로 초기화하는 역할을 한다.
즉, 자바는 생성자가 없으면 일을 못한다.

B)클래스 시작 규칙) main() 호출 -> 생성자() 호출 (반드시 지켜야 하는 규칙)
생성자()호출의 역할) 해당 자원의 멤버변수 초기화 : default value(기본값)
즉,new 하든/안 하든 무조건 default value(기본값) 설정해야 한다.

B-1)디폴트 값/기본값(default value) : 암기
byte, short, int, long : 0
char : 빈문자 : ' ', '\u0000' <-유니코드로 빈문자를 표현한 것.
float, double : 0.0
boolean : false
String 및 참조형 변수 : null

C)기본 생성자란?
C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javap com.bigdata30.ch1.VarDefaultValue
Compiled from "VarDefaultValue.java"
public class com.bigdata30.ch1.VarDefaultValue {
  int i;
  public com.bigdata30.ch1.VarDefaultValue(); <-기본 생성자의 모습!
  public static void main(java.lang.String[]);
}
*/

public class VarDefaultValue{

	int i;

	// 생성자()
	// 자바코드 작성 시 규칙) 무조건 매개변수가 없는 기본 생성자를 꼭 소스코드에 기술해야 한다.
	//                   교재 p.154
	VarDefaultValue(){
		System.out.println("사용자 정의로 만든 매개변수가 없는 기본생성자");
	 }
	
	public static void main(String args[]){
	
		VarDefaultValue vdv = new VarDefaultValue();
		System.out.println("참조변수 vdv 로 멤버변수 i를 호출한다. >>> : " + vdv.i);

	} // end of main()
} // end of VarDefaultValue class