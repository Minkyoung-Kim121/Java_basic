package a.b.c;

public class A{

	//생성자 : 기본 생성자
	//   특징)리턴형이 있으면 안 된다.
	//       void가 있어도 안 된다.
	//       생성자 블럭에서 return 키워드도 사용하지 않는다.
	//       사용자(사람들이 만든 것) 정의 기본 생성자이다.
	//       기본 생성자는 매개변수가 없어야 한다.
	public A(){
		System.out.println("A() 생성자 >>> : ");
	}

	public static void main(String args[]){
		System.out.println("main() 함수 >>> : ");
		A a = new A();

	}
} // end of A class
/*
C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javap a.b.c.A
Compiled from "A.java"
public class a.b.c.A {
  public a.b.c.A();
  public static void main(java.lang.String[]);
}
*/