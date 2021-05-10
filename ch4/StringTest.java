package a.b.c;


public class StringTest{

	public static void main(String args[]){
		
		String s0 = new String("abc");
		System.out.println("s0 >>> : " + s0);// -> s0 >>> : abc
		System.out.println("s0 >>> : " + System.identityHashCode(s0));// -> s0 >>> : 366712642
		String s1 = new String("abc");
		System.out.println("s1 >>> : " + s1);// -> s1 >>> : abc
		System.out.println("s1 >>> : " + System.identityHashCode(s1));// -> s1 >>> : 1829164700
		//=> String("abc") 가 똑같아도 주소값이 다르게 찍힌다. 
		// cf. StringBufferTest.java -> 주소값이 똑같이 찍힌다.
		// + 스트링 문자열을 비교할 때 ==(상등 연산자 사용x) , .equals( ) 사용.

		boolean bool0 = s0 == s1;
		System.out.println("bool0 >>> : " + bool0); // -> bool0 >>> : false
//		if (bool0) 
//   =>  똑같은거다. 위의 과정을 인지하면서  밑에 처럼 코드를 쳐라. or 망신망신 대박사고(??) 엉엉
		if (s0 == s1)
		{
			System.out.println("s0 == s1 >>> : " + true);
		}else{

			System.out.println("s0 == s1 >>> : " + false); // s0 == s1 >>> : false
		}

		boolean bool1 = s0.equals(s1);
		System.out.println("bool1 >>> : " + bool1);// -> bool0 >>> : true
		if (s0.equals(s1))
		{
			System.out.println("s0.equals(s1) >>> : " + true); // s0.equals(s1) >>> : true
		}else{

			System.out.println("s0.equals(s1) >>> : " + false);
		}


		String s2 = "abc";
		System.out.println("s2 >>> : " + s2);
		System.out.println("s2 >>> : " + System.identityHashCode(s2));

		String s3 = "abc";
		System.out.println("s3 >>> : " + s3);
		System.out.println("s3 >>> : " + System.identityHashCode(s3));

		boolean bool2 = s2 == s3;
		System.out.println("bool2 >>> : " + bool2);

		if (s2 == s3)
		{
			System.out.println("s2 == s3 >>> : " + true);
		}else{
			
			System.out.println("s2 == s3 >>> : " + false);
		}

		boolean bool3 = s2.equals(s3);
		System.out.println("bool3 >>> : " + bool3);
		
		if (s2.equals(s3))
		{
			System.out.println("s2.equals(s3) >>> : " + true);
		}else{
			
			System.out.println("s2.equals(s3) >>> : " + false);
		}

		// 스트링 클래스는 불변성(immutable) 속성이 있다.
		// 처음에 초기화 한 문자열이 변경 되지 않는다.
		String javaStr = new String("java");
		String androidStr = new String("androidStr");
		System.out.println(javaStr);
		System.out.println("javaStr >>> : " + System.identityHashCode(javaStr));
		// -> javaStr >>> : 1311053135


		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("javaStr >>> : " + System.identityHashCode(javaStr));
		 // -> javaStr >>> : 118352462

		// 원본은 그냥 있고 문자열에 새로운 문자를 형변환 하면,
		//  붙여야 하는데(javaStr+androidStr), 안 붙이고 그냥 두고, 새롭게 올린다.
		//	   -> 원본 변경 하는 것이 아니다.

	} // end of main()

} // end of StringTest class




