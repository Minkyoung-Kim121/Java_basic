package a.b.c.d;

import java.util.Date;
public class A extends B implements C{

/* -> extends 만 하면(인스턴스를 안 하면), 오버라이딩을 x -> error
A.java:3: error: A is not abstract and does not override abstract method b() in B
public class A extends B{
       ^
1 error
*/

// 상속 관계에서 자원사용하기
// 클래스 상속)
//         자식클래스 선언해서 자식참조변수 선언 (자식 참조변수 = new 자식) -> 자식 인스턴스 하기
//                                    (자식.참조변수)로 자원 사용하기
// 인터페이스 상속)
//         부모클래스 선언해서 (부모 참조변수 선언 = new 자식) 인스턴스하기
//                      (부모.참조변수로) 부모에 선언된 자원을 참조해서
//                      참조된 자원을 오버라이딩하여 구현된 자원을 사용하기
	//변수
	
	//생성자

	// 함수
	public void a(){
		System.out.println("A class a() 함수");
	}

	@Override // 자바에서 @문자열 쓰는 행위를 어노테이션(annotation)이라고 한다.
			  // 기능 : 행위를 표시하는 것, 행위를 하라고 하는 것
			  // @override : 해당 함수를 상위 클래스에서 오버라이딩 했다는 것을 의미.
	public void b(){
		System.out.println("A class b() 함수");
	} // -> extends B class -> b()함수 + {}

	@Override // -> 영어로는 주석의 의미지만, 자바에서는 주석이 x
	public void c(){
		System.out.println("A class c() 함수");
	}
	
	@Override
	public void cc(){
		System.out.println("A class cc() 함수");
	}

	// main
	public static void main(String args[]){
	
	A aa = new A(); // -> (자식 참조변수 = new 자식)
	aa.a(); // -> 함수가 들어있는 클래스를 다 따로따로 인스턴스해야한다.

	C ccc = new A(); // -> new B 안된다. : B가 abstract 이기 때문
					 //                  (추상 클래스는 인스턴스 불가능.)
					 // -> 앞에 있는 클래스를 가져와야 
					 // (부모 참조변수 선언 = new 자식)
	ccc.c(); // -> (부모.참조변수로)자원 사용
	ccc.cc();
	C.cM();
	ccc.ccM();

//  B b = new B(); -> 추상 클래스는 인스턴스를 할 수 없다.
	B b = new A(); 
	b.b();
	String bb = B.bb();
	System.out.println("b >>> " + bb);
	java.util.Date bbb = B.getInstance();
	System.out.println("bbb >>> : " + bbb);
//	System.out.println("new java.util.Date() >>> : " + new java.util.Date());
	System.out.println("new Date() >>> : " + new Date());
	
	}

}

abstract class B
{
	public abstract void b();
	public static String bb()
	{
		return "bb()";
	}
	public static Date getInstance()
	{
		return new Date();
	}
}

interface C
{
	public void c(); // -> public abstract void c(); 
	public abstract void cc(); // -> interface 클래스에 있는 함수는 abstract를 사용하든 안 하든 추상클래스다.
	public static void cM(){
		System.out.println("cM() >>> : ");
	}
	public default void ccM(){
		System.out.println("ccM() >>> : ");
	}
}