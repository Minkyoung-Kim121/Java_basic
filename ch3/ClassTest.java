package a.b.c;

import java.lang.Object; // Object 는 생략 가능 ??
import java.util.ArrayList;
import java.util.Date;

// public abstact class 클래스이름 : 추상클래스 - 추상함수
// public interface 클래스 이름 : 인터페이스 클래스 : 추상 함수 : 메소드()
// 상속 : 단일상속 extends / 다중상속 implements

// 일반 클래스
public class ClassTest extends Object{ // 부모 Object 를 자식 ClassTest 가 상속받아서 자원을 쓴다.
	// 변수
	// 상수
	public static final String XXX_XXX = "문자웅앵웅상수";
	public static final int XXX_XXY = 1; // 숫자상수
	
	// 멤버변수
	String sVal;
	int iVal;

	// 전역변수 ??
	public String sVal1;
	public int iVal1;

	// 클래스변수, 스태틱변수
	public static String sVal2;
	public static int iVAl2;

	// 은닉화 : encapsulation
	private String sVal3; // 접근제한자 : private -> 해당, 현재 클래스 안에서만 사용 가능
						  //           public -> 다른 패키지에서 끌어다가도 쓸 수 있다.
	private String iVal3;

	// 생성자 : 클래스와 똑같은 이름의 메소드를 정의하면 그게 생성자이다.
	//        부모에 생성자가 있다면, 자식은 반드시 부모의 생성자를 실행시키도록 자바에서는 강제하고 있다.
	//        ex)     클래스명(){}
	//        ex)     public ClassTest(){}
	public ClassTest(){
		this(11);
		
	}

	public ClassTest(String sVal){
		this("황영석", 11);
		this.sVal = sVal;
	}

	public ClassTest(int iVal){
		super();
		this.iVal = iVal;
	}

	public ClassTest(String sVal, int iVal){
		this.sVal = sVal;
		this.iVal = iVal;
	}


	// 함수
	public void aM(){
		
	}

	public String bM(){
		return "";
	}

	public static void aaM(){
		
	}

	public static String bbM(){
		return "";
	}

	// main()
	public static void main(String args[]){
		ClassTest ct0 = new ClassTest();
		ClassTest ct1 = new ClassTest(22);
		ClassTest ct2 = new ClassTest("테스트");	


	}


}