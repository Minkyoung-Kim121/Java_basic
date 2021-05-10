package a.b.c;

public class StringNumber_1 {
	
	// 숫자 카운트
	public static int checkNum(String str){
		System.out.println("checkNum() >>> : " + str);
		// 문자로 하나하나 쪼개기
		/* -> 원래는 이렇게 써도 되지만, 데이터가 엄청나게 많다보면 하나하나 입력해야하니, for문과 if문을 써서 출력하는 것을 연습하자.
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(8));
*/
		int iii = 0; // for 문 안에 선언하면 밖에서 못 쓰니까 밖에서 초기화 한 것
					 // iii는 int 이기 때문에 0으로 초기화;

		for (int i=0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i)); // 하나씩 뽑아낸것
			int ii = str.charAt(i);

			if (0x39 >= ii && ii >= 0x30) // 16진수를 표현하는 방식 : 0x 웅앵웅
										  // 
										  // 
			{
				System.out.println("if() 조건문이 잘 수행 되었을 때 >>> : " + iii);
				iii++;
			}
		}

		return iii;
	}


	// 영문자 소문자 카운트
	public static int checkAlpaS(String str){
		System.out.println("checkAlpaS() >>> : " + str); // -> 함수 잘 불러왔는지 출력해보는 것.
		
		int nCnt1 = 0;
		if (str !=null && str.length() > 0)
		{
			System.out.println("if() 조건문이 잘 수행 되었을 때 >>> : " + str);
			for (int i=0; i  < str.length(); i++)
			{
				char i2 = '\u0000';
				i2 = str.charAt(i);
				System.out.println("쪼개기 >>> : " + i2);
				nCnt1++;
			}
		}
		

		return nCnt1;
	}

	// 영문자 대문자 카운트 : String str = "124ABcDef"; 안에 있는 영문자 대문자가 몇 개 인지 세어보아라.
	public static int checkAlpaL(String str){
		System.out.println("checkAlpaL() 호출되었니 >>> : " + str);

		int nCnt2 = 0;
		
		for (int i=0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
			int dd = str.charAt(i);
//			System.out.println("for 문 잘 돌 때 >>> : " + dd);

		}


		

		return nCnt2;
	}


	public static void main(String args[]){
		
		// 정규식 : Regular Expression
		// Validation
		String str = "124ABcDef";
		


//		StringNumber_1.checkNum(str); // ->str 인자, 아규먼트 ---> 한번 호출을 했으니 주석 처리, 만약 안 하면 계속 돈다
// 카운트를 리턴해서 콘솔에 출력하시오.
		int cegg = StringNumber_1.checkNum(str);
		System.out.println("cegg >>> : " + cegg); // 0 -> for문 -> 3
		
		int cegl = StringNumber_1.checkAlpaS(str);// -> static 이 붙었기 때문에 클래스명.자원; 해서 호출하는 것
										//            여기에서는 자원이 checkAlpas()함수 이기 때문에 이렇게 썼고,
										// 위에 문자열인 str 변수를 선언했기 때문에 함수 안에다가 str 을 써준 것임.
		System.out.println("cegl >>> : " + cegl); // 조건문 잘 쓰고 난 후 소문자 카운트 결과값 나올 것이다.

		int cegl2 = StringNumber_1.checkAlpaL(str); //-> 리턴이 int 를 받아서0
										// 함수 호출하면 자꾸 출력되니까, 헷갈리니까 자원을 하나씩 호출해서 쓰자!
		System.out.println("cegl2 >>> : " + cegl2);


	}

}

/*
.charAt();
System.out.println();
.length();
for(int i=0
*/