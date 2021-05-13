package a.b.c;

/*
A)extends키워드 특징
extends 키워드 : 클래스를 상속하는 키워드 (자바 클래스는 단일 상속이다.)
상속을 하면) 자식 클래스/부모 클래스로 나뉨.
subClass, superClass
childClass, parentClass

현실세계의 상속관계는
: 부모-자식 관계에서는 보통의 경우 부모가 재산이 많아서 자식에게 상속해준다.
자바세계의 상속관계는
: 자식이 부모의 것을 다 가지고 있어서 마음대로 사용해도 된다.
*/
// java.lang.Object 클래스가 부모
// a.b.c.Aclass 클래스가 자식
// a.b.c.Aclass 에서는 디폴트로 상속된 java.lang.Object 클래스의 자원을
// a.b.c.Aclass 에서 사용할 수 있다.
// java.lang.Object 클래스에는 superClass에는 11개의 함수와 Object() 생성자가 있다.
public class Aclass //extends java.lang.Object <-있든 없든! 이건 무조건 디폴트다.
//											   <- 자바랭오브젝트를 extends(상속)한다.
{

	public String acValue(){
		return "Aclass >>> : " + this;
		//this 라는 개념 어려운데 나중에 하자

	}
	public static void main(String args[]){

		Aclass ac = new Aclass();
		//★toString 쓰는 방법 나중에 더 공부하자
		System.out.println("ac.toString() >>> : " + ac.toString());
		System.out.println("ac >>> : java.lang.Object 클래스의 toString()함수가 생략된 것임" + ac);
		String acV = ac.acValue();

		System.out.println("acV >>> : " + acV);
//ac <- 나한테 없는 키워드를 썼다고 나한테 없는 것이 아니다. 오류가 안 났다면, 
//     어딘가에 존재하는 것. 상속을 계속해 올라가면서 찾아내야 한다.(내 코드라면!)
	
	} // end of main()
} // end of Aclass class