package a.b.c;

public class ExeThis{

// 변수
// 생성자
// 함수() -> 자원 4개

	public static void aaM(){	
		System.out.println("static aaM() >>> : ");
	/*    System.out.println("static aaM() >>> : " + this);
	// -> static 에는 this 를 사용할 수 x
	ExeThis.java:10: error: non-static variable this cannot be referenced from a static context
                System.out.println("static aaM() >>> : " + this);
                                                           ^
	1 error
	*/
	ExeThis et2 = new ExeThis(); // -> 참조변수 et2를 사용해서 ExeThis();생성자 인스턴스.
	et2.aM(); // -> et2 참조변수 이용하여 함수aM() 호출.

	}

	public void aM(){
		
		System.out.println("aM() >>> : " + this);
		bM();
	}

	public void bM(){
		
		System.out.println("bM() >>> : " + this);
		cM();
	}

	public void cM(){
		
		System.out.println("cM() >>> : " + this);
		dM();
	}

	public void dM(){
		
		System.out.println("dM() >>> : " + this);
	}

// main()
	public static void main(String args[]){
		ExeThis.aaM();
	// -> static 붙은 함수는 클래스명.자원; 을 해서 호출한다.
	//                ex) ExeThis.aaM();
		ExeThis et = new ExeThis();
		System.out.println("Exethis 사용자정의 클래스 참조변수 >>> : " + et);
		// -> Exethis 사용자정의 클래스 참조변수 >>> : a.b.c.ExeThis@6d06d69c
		et.aM(); // -> aM() 함수를 invoke(호출)

		ExeThis et1 = new ExeThis();
		System.out.println("Exethis 사용자정의 클래스 참조변수 >>> : " + et1);
		// -> Exethis 사용자정의 클래스 참조변수 >>> : a.b.c.ExeThis@7852e922    et 와 et1 은 다르다.
		et1.aM();

		ExeThis.aaM();
		
		System.out.println("new Exethis() >>> : " + new ExeThis());
		new ExeThis().aM(); // -> new 로 인스턴스해서 호출해야한다.

//		System.out.println("new Exethis().aM() >>> : " + new ExeThis().aM());
	/*     void 타입인 함수 aM() 출력 시 오류
	ExeThis.java:63: error: 'void' type not allowed here
                System.out.println("new Exethis().aM() >>> : " + new ExeThis().aM());
                                   ^
	1 error
	*/


	} // end of main()

} // end of ExeThis class