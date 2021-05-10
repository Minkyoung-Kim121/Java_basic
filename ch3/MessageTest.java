package a.b.c;

public class MessageTest
{
	//변수
	//생성자
	//함수
	//main()
	public static void main(String args[]){
		
		//부모클래스 선언 부모클래스 참조 = new 자식클래스() 인스턴스
		MessageInterface mKor = new MessageKorImpl();
		mKor.sayHello("한글");

		MessageInterface mEng = new MessageKorImpl();
		mEng.sayHello("English");

		MessageInterface mKor1 = new MessageKorImpl();
		mKor1.sayHello("한글");
	}
}