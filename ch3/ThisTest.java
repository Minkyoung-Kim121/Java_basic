package a.b.c;

public class ThisTest{
	// 변수 선언
	String str;
	int iVal;

	// 생성자 1 매개변수가 x
	public ThisTest(){
	// public ThisTest(){} -> ThisTest 클래스의 생성자.
	// 생성자 오버로딩   ???
	// this() 함수 -> 다른 생성자를 호출 가능하다.
		this("속삭이는 몽자", 3); 
		// 생성자 안에, this() 함수; 사용
		// this() 함수 안에 "속삭이는 몽자", 3 선언??
		System.out.println("ThisTest() >>> : ");
		// ThisTest() >>> : ?? 왜 공백??
	}

	// 생성자 2 매개변수가 String 1개(str)
	public ThisTest(String str){
		// this() 함수는 클래스에서 오버로딩된 다른 생성자를 호출한다.
		// 생성자의 매개변수를 맞춰서 써야
		this(27);
		// -> this()함수 안에 int형 27이 있기 때문에 String이 아닌 int, 즉 33행을 출력.
		// -> 만약 this(문자열) : String인 39행 출력.
		// -> 생성자 안에 첫번째 줄에 써야. 29행에 쓰면 오류.
		//this() 함수는 생성자의 첫번째 문장으로만 써야 한다.
		//(생성자 안에서 첫번째로 1개만 쓸 수 있음)
		System.out.println("ThisTest(String str) >>> : " + str);
		// ThisTest(String str) >>> : 김민경
		this.str = str;
	}

	// 생성자 3 매개변수가 int 1개(iVal)
	public ThisTest(int iVal){
		System.out.println("ThisTest(int iVal) >>> : " + iVal + "세");
		// ThisTest(String str, int iVal) >>> : 김민경:27세
		this.iVal = iVal;
		// iVal 로 초기화;
	}

	// 생성자 4 매개변수가 String 1개(str), int 1개(iVal) -> 총 2개
	public ThisTest(String str, int iVal){
		System.out.println("ThisTest(String str, int iVal) >>> : " + str + ":" + iVal + "세");
		// ThisTest(String str, int iVal) >>> : 김민경:27세
		this.str = str;
		// str로 초기화;
		this.iVal = iVal;
		// iVal로 초기화;
	}

	//함수
	public void thisPrint(){
		System.out.println(this + "주소값주소값"); //   ..?
	}

	//main()
	public static void main(String args[]){
		ThisTest tt = new ThisTest();
		// () 매개변수가 없는 생성자1 호출
		System.out.println("tt.str >>> : " + tt.str);
		// tt.str >>> : 속삭이는 몽자
		System.out.println("tt.iVal >>> : " + tt.iVal);
		// tt.iVal >>> : 3
		System.out.println("tt >>> : " + tt);
		// tt >>> : a.b.c.ThisTest@15db9742
		tt.thisPrint();
		// a.b.c.ThisTest@15db9742
		// .thisPrint() 함수 : 주소값을 반환하는 함수

		ThisTest tt1 = new ThisTest("김민경");
		// ("String") 매개변수가 1개(str) 있는 생성자 2 호출
		System.out.println("tt1.str >>> : " + tt1.str);
		// tt1.str >>> : 김민경
		System.out.println("tt1.iVal >>> : " + tt1.iVal);
		// tt1.iVal >>> : 27
		System.out.println("tt1 >>> : " + tt1);
		// tt1 >>> : a.b.c.ThisTest@6d06d69c   주소값
		tt1.thisPrint();
		// a.b.c.ThisTest@6d06d69c

		ThisTest tt2 = new ThisTest("김민경", 27);
		// ("String", int) 매개변수가 2개(str, iVal) 있는 생성자 3 호출
		//  호출했으니까 ThisTest(str, iVal){} 생성자로 올라가서 그 안의 내용 돌아간다.
		System.out.println("tt2.str >>> : " + tt2.str);
		// tt2.str >>> : 김민경
		System.out.println("tt2.iVal >>> : " + tt2.iVal);
		// tt2.iVal >>> : 27
		System.out.println("tt2 >>> : " + tt2);
		// tt2 >>> : a.b.c.ThisTest@7852e922
		tt2.thisPrint();
		// a.b.c.ThisTest@7852e922

	}
}