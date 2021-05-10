package a.b.c;

import a.b.c.d.BbClass; // import 패키지명 클래스명
public class Aclass{

	public static void main(String args[]){
		
		// Aaclass 에서 1)같은 패키지 내부에 있는
		// AaClass를 사용하기 위하여 new 연산자를 이용해 인스턴스 함.
		AaClass aa = new AaClass();
		// 참조변수 aa로 
		// AaClass 에 있는 aaClass()를 호출 함(invoke)
		aa.aaClass();
	
		// Aclass 에서 2)다른 패키지에 있는
		// Aclass a.b.c
		// Bbclass a.b.c.d
		// Bbclass를 사용하기 위해서 new 연산자를 이용해 인스턴스 함.
		// 선행) 다른 패키지에 있는 클래스 import 하기 -> import 랑 new 의 차이.
		a.b.c.d.BbClass bb = new a.b.c.d.BbClass();
		BbClass bb1 = new BbClass();
		// 참조변수 bb로
		// bbClass에 있는 bbClass()를 호출 함(invoke)
		bb.bbClass();
		bb1.bbClass();
// 컴파일은 Aclass BbClass 동시에, 실행은 Aclass


	} // end of main()

} // end of BbClass class

class AaClass
{
	public AaClass(){
		
		System.out.println("AaClass 생성자");
	}
	
	public void aaClass(){
		
		System.out.println("AaClass aaClass() 함수");
	}
}