package a.b.c;

public class OperTest{

	public static void main(String args[]){
	
		// 비교 연산자 & 함수
		// 자바에서는 숫자만 비교 : byte, short, char, int long, float, double
		// == : 상등연산자, 등가연산자
		boolean b0 = 1 ==1;
		System.out.println("b0 >>> : "+ b0);
		if (2 ==2)
		{
			System.out.println("2 == 2 >>> : true");
		}
		char c = 'A';
		System.out.println("c >>> : "+ c);
		System.out.println("c >>> : 0x"+ Integer.toHexString(c));
		//c >>> : A
		//c >>> : 0x41
		boolean b1 = 'A' == 0x41;
		System.out.println("b1 >>> : "+ b1);
		boolean b2 = c == 0x41;
		System.out.println("b2 >>> : "+ b2);
		
		System.out.println("Z >>> : 0x"+ Integer.toHexString('Z'));
		// Z >>> : 0x5a

		// 영문자 대문자 A~Z : from to 구간 만들기
		//System.out.println("c >>> : 0x"+ Integer.toHexString('A'));
		// A >>> : 0x41
		//System.out.println("c >>> : 0x"+ Integer.toHexString('Z'));
		// Z >>> : 0x5a
		if (c >= 0x41 && c <= 0x5a)
			{
			System.out.println("c >>> : 0x"+ Integer.toHexString(c));
		}

		// 영문자 소문자 a~z : from to 구간 만들기
		char cc = 'a';
		System.out.println("z >>> : 0x"+ Integer.toHexString('a'));
		// a >>> : 0x61
		System.out.println("z >>> : 0x"+ Integer.toHexString('z'));
		// z >>> : 0x7a
		if (cc>=0x61 && cc<=0x7a)
		{
			System.out.println("cc >>> : 0x"+ Integer.toHexString(cc));
		}

		// 숫자 정수 0 ~ 9 : from to 구간 만들기
		String sc = "09";
		char csc0 = sc.charAt(0);
		char csc9 = sc.charAt(1);
		System.out.println("csc0 >>> : 0x" + Integer.toHexString(csc0));
		System.out.println("csc9 >>> : 0x" + Integer.toHexString(csc9));
		if (csc0 >= 0x30 && csc0 <= 0x39)
		{
			System.out.println("csc0 >>> : 0x" + Integer.toHexString(csc0));
		}


		boolean bb0 = 'a' == 'b';
		System.out.println("bb0 >>> : "+ bb0);
		boolean bb1 = 'a' == 'a';
		System.out.println("bb1 >>> : "+ bb1);
		if ( 'a' == 'a')
		{
			System.out.println("bb1 >>> : "+ bb1);
		}



		// 문자열 비교 지양(자바에서는 : == : 상등연산자(등가연산자))
		// 상등 연산자는 절대 문자열을 사용하면 안된다.
		// 결과 true(주소값까지 같아서)
		boolean b3 = "aa" == "aa";
		System.out.println("b3 >>> : "+ b3);
	

		// 주소값 비교
		// 결과 false(주소값 다름)
		String s0 = "abc";
		String s1 = new String("abc");
		boolean b4 = s0 == s1;
		System.out.println("b4 >>> : "+ b4);

		// 자바에서 문자열 비교는 꼭 equals 함수를 사용한다.
		// == (상등연산자, 등가연산자)는 문자열 비교에 사용하지 마세요(76라인)
		boolean b5 = s0.equals(s1);
		System.out.println("b5 >>> : "+ b5);
		// java.util.objects.equals() : jdk 1.7 이후에 사용하기

		// 결론
		// 자바에서 
		// 문자열 비교는 : String().equals()
		// 숫자 비교는 : == (상등연산자, 등가연산자)
		//단 : 자바스크립트에서는 == 문자열, 숫자 비교해도 된다.


	}//end of main()
}//end of ATest class

