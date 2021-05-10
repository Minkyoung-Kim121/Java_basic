package a.b.c;


public class InvokeTest_1{
	
	public boolean aM(){
		System.out.println("InvokeTest_1 aM() 시작 ");
		boolean bool = false; // -> boolean 데이터타입 false 초기화

		InvokeController ci = new InvokeController(); // -> InvokeController(); (는 int형) 생성자 호출
		int iVal = ci.invokeC(); // ->, int invokeC(); iVal 참조변수로 선언해서 invokeC() 호출.
		// -> 나는 이제 invokeC() 를 살피러 내려가자.

		if (iVal > 0) // Q)  boolean 인데 왜 int를 선언하냐!?
		// 
		{
			System.out.println("iVal >>> true");
			bool = true;
		}else{
			System.out.println("iVal >>> false"); // -> iVal >>> false 출력 why..?
		// Q)  iVal >>> false 출력 why..? 
		//       boolean 이 false 라서?? 왜죠
			bool = false;
		}

		System.out.println("InvokeTest_1 aM() 끝 ");
		return bool;
	}


	public static void main(String args[]){
		System.out.println("main() 시작 ");
		InvokeTest_1 it1 = new InvokeTest_1(); // -> it1 참조변수를 이용하여 InvokeTest_1(); 생성자 호출
		//											생성자는 매개변수 없는 기본 생성자로
		System.out.println("it1 >>> : " + it1); // -> it1 >>> : a.b.c.InvokeTest_1@15db9742

		boolean bool = it1.aM(); // -> boolean 데이터 타입으로 aM(); 호출했다.
		// -> 나는 이제 aM() 함수를 살피러 올라가자.

		if (bool)
		{
			System.out.println("bool 이 참 입니다.");
		}else{
			System.out.println("bool 이 거짓 입니다."); // -> 출력
		}

		System.out.println("main() 끝 ");

	} // end of main()

} // end of InvokeTest_1 class


class InvokeController
{
	public int invokeC(){
		System.out.println("InvokeController invokeC() 시작 ");

		InvokeService is = new InvokeService(); // -> is 참조변수를 이용하여 InvokeService(); (생성자) 호출

		int iVal = is.invokeS(); // -> invokeS() 호출.
		// -> 나는 이제 invokeS() 를 살피러 내려가자.

		System.out.println("InvokeController invokeC() 끝 ");

		return iVal;
	}
}


class InvokeService
{
	public int invokeS(){
		System.out.println("InvokeService invokeS() 시작 ");
		InvokeDAO idao = new InvokeDAO(); // -> invokeDAO();를 idao를 사용해서 인스턴스했다.
		int iVal = idao.invokeD(); // -> invokeD() 호출.
		System.out.println("InvokeService invokeS() 끝 ");
		return iVal; // ->int iVal  로 리턴.
	
	}
}


class InvokeDAO
{
	public int invokeD(){
		System.out.println("InvokeDAO invokeD() 시작 ");
		System.out.println("InvokeDAO invokeD() 끝 ");
		return 0;
	}
}
