package a.b.c;

//import a.b.c.d.*(wild card);
//클래스 임포트 할때) 클래스 이름을 명시적으로 기술한다.
//          이유) 가독성 때문.

//javac -d . PublicTest.java AA.java BB.java <-한꺼번에 컴파일 하는 것
import a.b.c.d.AA;
	 //문1)BB 클래스에 있는 bb()함수를 참조변수 bb로 호출하세요.★
	 //답1-1)★
import a.b.c.d.e.BB;

public class PublicTest{

	public static void main(String args[]){

		// a.b.c.d.AA aa = new a.b.c.d.AA();★
		AA aa = new AA();
		aa.aa();
	 //답1-2)★
	 	BB bb = new BB();
		bb.bb();

	} // end of main()
} // end of PublicTest class

/*
AA.java
package a.b.c.d;
public class AA{
	// 사용자 정의 기본 생성자
	public AA(){
		System.out.println("AA() 생성자 ");
	}
	public void aa(){
		System.out.println("aa() 함수 ");	
	}
} // end of AA class
*/

/*
BB.java
package a.b.c.d.e;
public class BB{
	// 사용자 정의 기본 생성자
	public BB(){
		System.out.println("BB() 생성자 ");
	}
	public void bb(){
		System.out.println("bb() 함수 ");
	}
} // end of BB class
*/