package a.b.c;

import a.b.c.d.BbClass_1; // import 패키지명 클래스명

/*
<상속>
클래스 상속은 단일 상속(Single Inheritance)
extends 키워드 사용
단일 상속의 의미는 extends 키워드 뒤에 클래스가 하나만 온다.

상속을 자바 용어로 설명하면
is a relationship
A extends B -> A는 B이다.
*/

public class Aclass_1 extends AaClass_1{
// single inheritance ->클래스를 두개 쓰면 안 된다.
// ex) public class Aclass_1 extends Aaclass_1, Bbclass_1 -> x
	
// 생성자


// main()
	public static void main(String args[]){
		System.out.println("Aclass_1() 생성자");
		
	// Aclass_1에서 같은 패키지에 있는 
	// Aaclass_1 클래스를 사용하기 위해
	// 클래스 상속을 사용
	// 자바에서 클래스 상속은 extends 키워드를 사용하며
	// 단일 상속(single inheritance)이다.
	// 자식클래스 extends 부모클래스 <- 형태로 사용한다.
	// 자식클래스에서 상속 형태로 선언해 놓고
	// 자식 클래스를 new 연산자로 인스턴스해서 사용한다.

	// 자식 클래스를 선언하고
	// 참조변수를 선언한 뒤
	// new 연산을 하면
	// 자식 클래스를 찾아서 인스턴스 하려고 시도하는데
	// 상속관계이면
	// 부모 클래스의 생성자를 먼저 찾아서 메모리에 올린다.
	// 자식 클래스의 생성자를 메모리에 올린다.
	Aclass_1 ac1 = new Aclass_1();
	// 인스턴스가 완료되면
	// 자식 클래스의 참조 변수로
	// 부모 클래스의 자원을 사용할 수 있다.
	ac1.AaClass_1();
	// 현재 자식 클래스 Aclass_1에는
	// aaClass_1()함수가 없는데
	// 상속하고 있는 부모 클래스로 찾아가서
	// 해당 함수가 있는지 찾고
	// 함수가 있으면 호출한다. -> 상속 관계에서는 아래에서 위로 찾으러 감.
	
	ac1.aaClass_1();

	} // end of main()

} // end of AClass_1 class

class AaClass_1 extends  a.b.c.d.BbClass_1
{
	public void AaClass_1(){
		
		System.out.println("AaClass_1 생성자");
	}
	
	public void aaClass_1(){
		
		System.out.println("AaClass_1 aaClass_1() 함수");
	}
}

/*

*/