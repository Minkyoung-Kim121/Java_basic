package a.b.c;

interface AAInter{ // 부모 클래스
/*
	public void aaM();

	public void bbM(String str);

	public String ccM();

	public void ddM();
*/

		public abstract void aaM();
		public abstract void bbM(String str);
		public abstract String ccM();
		public abstract void ddM();

}



public class AAInterTest implements AAInter // 자식 클래스, 자원이 더 많다. 부모한테 상속받아 사용하는 클래스
{
	// 변수 -> 항상 변수, 생성자, 함수, 메인 규칙 지켜서 써야!

	// 생성자

	// 함수

	public void aaM(){
		System.out.println("aaM()");
	}
		

	public void bbM(String str){
		System.out.println("bbM()" + str);
	}

	public String ccM(){
		System.out.println("ccM() >>> : ");

		return "ccM()";
	}

	public void ddM(){
		System.out.println("ddM() >>> : ");


	}

	// 메인
	public static void main(String args[]){ // -> 일반적으로 함수 안에는 함수를 쓰는게(또 선언하는게) 아니다.
		
		AAInter aai = new AAInterTest();
		aai.aaM();
		aai.bbM("아아아");
		String ccm = aai.ccM();// 리턴값 받아서 출력하기
//		System.out.println(aai.ccM()); -> 이렇게 쓰지말고 위 쪽 함수에서 
		aai.ddM();


	}
}

// 상속관계
