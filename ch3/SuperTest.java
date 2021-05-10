package a.b.c;

class SuperClass{ // extends Object  //부모
	public String str = "aaa";

	//생성자
	public SuperClass(){
		this("모카 우유");
		System.out.println("SuperClass() >>> : ");
	}

	public SuperClass(String str){
		System.out.println("SuperClass(String str) >>> : " + str);

	}

	public SuperClass(String str, int iVal){
		System.out.println("SuperClass(String str, int iVal) >>> : " + iVal + "세");
	}

}


public class SuperTest extends SuperClass{ // -> SuperTest 자식, SuperClass 부모

	public String str ="bbb";
	//public String str;

	//생성자
	public SuperTest(){ // -> super() 함수는 상위클래스인 부모의 생성자를 불러옴.

		//this함수, super함수
		//1) 생성자 안에서만 사용한다
		//2) 꼭 생성자 블럭의 첫번째 statement로 쓰여야 함
		super(); // -> 함수 안에 빈문자이기 때문에 부모인 SuperClass 생성자의 모카우유 출력.
		System.out.println();
	}

	public SuperTest(String str){
		System.out.println("SuperTest(String str) >>> : ");
	}

	//함수
	public void printlnfo(){
		System.out.println("str >>> : " + str);
		System.out.println("super.str >>> : " + super.str); // -> 부모 클래스의 str 불러옴
//		System.out.println("super >>> : " + super); -> error '_' expected
	}

	//메인함수
	public static void main(String args[]){
		
		SuperTest st = new SuperTest(); // 매개변수를 찾아다니면서 호출함
		st.printlnfo();


	}
}