package a.b.c;

/*
인터페이스 클래스는
불완전한 추상클래스를 보완한 클래스의 형태이며
인터페이스를 상속한 클래스에서 구현체를 완성하여 사용하라는 의미가 있다.
인터페이스를 상속한 클래스는
인터페이스에 있는 함수(추상함수 -> {}가 없는 함수) 모두를
상속한 클래스로 오버라이딩(overrinding)해서
함수에 {}를 만들어 사용해야 한다.

<상속> 인터페이스 상속
다중 상속
인터페이스 상속의 키워드는 implements
다중상속은
 -> 자식클래스 implements 뒤에 인터페이스 이름(부모)을 ,(csv:comma-separaten values) 구분자로
여러 개 나열하는 것이다. ex) lalalal.csv
csv -> Concurrent Versioning System.
ex) A implements Ainterface_1, Binterface();, Cinterface

상속하는 이유
-> 자원을 사용하기 위해서

인터페이스에서 인터페이스 상속을 사용할 때는 extends 키워드를 사용한다.
interface Cinerface extends Dinterface

*/
public class AInterface implements Ainterface_1, Binterface, Cinterface{

	public void a(){
		System.out.println("Ainterface_1 인터페이스 클래스에서 오버라이딩된 a()함수 입니다.");
		System.out.println("Ainterface_1 인터페이스 클래스에서 a()함수는 {}가 없는데");
		System.out.println("오버라이딩된 a()함수는 AInterFace 자식 클래스에서 a() 함수에 {}를 추가하여 구현해야 한다.");
	
	}
	public void aa(){
	
		System.out.println("aa()");

	}
	public void b(){
	
		System.out.println("b()");

	}
	public void c(){
	
		System.out.println("c()");

	}
	public void d(){
	
		System.out.println("d()");

	}

	public static void main(String args[]){
	
	AInterface ai = new AInterface(); // -> 자식 클래스를 new 키워드를 이용해서 인스턴스 함.
									  // -> 자식을 참조변수해서 자식을 인스턴스 한 것.
									  //    extends 로 상속했을 때 사용
	ai.a();
	ai.aa();
	ai.b();
	ai.c();
	ai.d();
	
	Ainterface_1 ai1 = new AInterface(); // -> 이게 더 편하다
										 // -> 부모를 참조변수해서 자식을 인스턴스 한 것.
										 //    interface 상속의 특징 (implements 키워드 사용)
	ai1.a();

	}
}


// 인터페이스 만들어서, 사용하려고 하면
// 부모, 자식 클래스 있어야
// new 키워드 이용해서 자식 클래스를 인스턴스


interface Ainterface_1
{
	// 인터페이스 클래스에 선언하는 함수는 
	// {} (브레이스) 블럭을 갖고 있지 않다.
	public void a();
	public void aa();
}

interface Binterface
{
	public void b();
}

interface Cinterface extends Dinterface
{
	public void c();
}

interface Dinterface
{
	public void d();
}