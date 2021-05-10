package a.b.c;

import java.util.StringTokenizer;
public class SplitTest_1{

// charSplit() 함수 이용 방법
// charSplit 함수를 호출할 때 어떻게 호출할 건가?
// public static void charSplit(){} // ->  static 붙여서 1-1)호출했다?
	public void charSplit(String sVal){ //-> new 붙여서 호출했는데, sVal을 받아서 불러야 하니까 (!)!에 넣었다. (+데이터타입도 써서 String)
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);
		// -> charSplit(String sVal) sVal >>> : abc@def@ghi@jkl@mno

		if (sVal !=null && sVal.length() > 0) //-> sVal 이 빈 값이 아니고(데이터가 있다) 동시에 길이가 0 이상일때
		{
			String sChar[] = sVal.split("@^");// -> sVal을 Split("@") 함수를 이용해서 구분자 @ 기준으로 쪼개고, sChar[] 문자 배열로 쪼갠다.

			//2) char 배열로 쪼개서 콘솔에 출력하세요
			for (int i=0; i < sChar.length; i++)
			{
				System.out.println("sChar["+i+"] >>> : " + sChar[i]);
			}
			/* 문자로 쪼개기
			System.out.println("sChar[0] >>> : " + sChar[0]);
			System.out.println("sChar[0].charAt(0) >>> : " + sChar[0].charAt(0));
			*/
		}

	}


// Tokenizer() 함수 이용 방법
	public void charToken(String sVal){ // -> charToken() 함수는 구분자(delimiter)대로 다 쪼갠다.
		// cf. charSplit("@") 함수는 구분자 @ 기준으로 쪼개준다.

		System.out.println("charToken(String sVal) sVal >>> : " + sVal);
		// -> charToken(String sVal) sVal >>> : a b^c@d ef@g|h^i@jk|l@m^no

		if (sVal !=null && sVal.length() > 0) // -> !=null && 반드시 해줘야 한다. : 안해줘도 돌아가지만,
		//                   문자(데이터)가 들어있을때 돌아가게 하기때문에, 보다 안정적으로 프로그램을 짤 수 있다.
		{
			System.out.println("sVal.length() >>> : " + sVal.length()); // -> sVal.length() >>> : 29
			StringTokenizer st = new StringTokenizer(sVal, "@r^ |"); // -> @r^ | 구분자를 기준으로 쪼개주세요
			for (int i=0; st.hasMoreTokens(); i++ ) // 정수 i는 0부터 시작해서 
			{
				System.out.println(i + "번째 : " + st.nextToken());

				/*
				0번째 : a
				1번째 : b
				2번째 : c
				3번째 : d
				4번째 : e
				5번째 : f
				6번째 : g
				7번째 : h
				8번째 : i
				9번째 : j
				10번째 : k
				11번째 : l
				12번째 : m
				13번째 : n
				14번째 : o
				*/
			}

		}
	}



	public static void main(String args[]){
		
		String sVal = "a b^c,d erf,g|h^i,jrk|l,m^nro";
		System.out.println("sVal >>> : " + sVal);
		// -> sVal >>> : abc,def,ghi,jkl,mno
		sVal = sVal.replace(',','@'); // replace() ->  , 문자(char)를 @(char)로 바꾼다는 함수
		System.out.println("sVal >>> : " + sVal);
//		System.out.println("sVal.length >>> : " + sVal.length);

		// charSplit 함수를 1)호출해서 sVal 문자열을
		// char 2)배열로 쪼개서 콘솔에 출력하세요
		// 함수는 split() 함수를 이용합니다.

		SplitTest_1 st1 = new SplitTest_1();// ->  new 붙여서 아규먼트, 매개변수 사용해서 1-2)호출했다?
		st1.charSplit(sVal); // -> charSplit() 함수를 호출했다. 
		// ->sVal 받으러 위로 올라가자

		st1.charToken(sVal); // -> charToken() 함수를 호출했다. 

	} // end of main()



} // end of SplitTest_1 class