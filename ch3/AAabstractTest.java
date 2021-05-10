package a.b.c;

abstract class AAabstractClass{

	public abstract void aaM();

}

public class AAabstractTest extends AAabstractClass
{
	//변수
	//생성자
	//함수
	public void aaM(){
		System.out.println("aaM()");
	}
	//메인
	public static void main(String args[]){

	//함수 안에는 일반적으로 함수를 쓰는게 아니다.
	AAabstractClass aaa = new AAabstractTest();
	aaa.aaM();
	
	}
}