package a.b.c;


public class StringTest{

	public static void main(String args[]){
		
		String s0 = new String("abc");
		System.out.println("s0 >>> : " + s0);// -> s0 >>> : abc
		System.out.println("s0 >>> : " + System.identityHashCode(s0));// -> s0 >>> : 366712642
		String s1 = new String("abc");
		System.out.println("s1 >>> : " + s1);// -> s1 >>> : abc
		System.out.println("s1 >>> : " + System.identityHashCode(s1));// -> s1 >>> : 1829164700
		//=> String("abc") �� �Ȱ��Ƶ� �ּҰ��� �ٸ��� ������. 
		// cf. StringBufferTest.java -> �ּҰ��� �Ȱ��� ������.
		// + ��Ʈ�� ���ڿ��� ���� �� ==(��� ������ ���x) , .equals( ) ���.

		boolean bool0 = s0 == s1;
		System.out.println("bool0 >>> : " + bool0); // -> bool0 >>> : false
//		if (bool0) 
//   =>  �Ȱ����Ŵ�. ���� ������ �����ϸ鼭  �ؿ� ó�� �ڵ带 �Ķ�. or ���Ÿ��� ��ڻ��(??) ����
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

		// ��Ʈ�� Ŭ������ �Һ���(immutable) �Ӽ��� �ִ�.
		// ó���� �ʱ�ȭ �� ���ڿ��� ���� ���� �ʴ´�.
		String javaStr = new String("java");
		String androidStr = new String("androidStr");
		System.out.println(javaStr);
		System.out.println("javaStr >>> : " + System.identityHashCode(javaStr));
		// -> javaStr >>> : 1311053135


		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("javaStr >>> : " + System.identityHashCode(javaStr));
		 // -> javaStr >>> : 118352462

		// ������ �׳� �ְ� ���ڿ��� ���ο� ���ڸ� ����ȯ �ϸ�,
		//  �ٿ��� �ϴµ�(javaStr+androidStr), �� ���̰� �׳� �ΰ�, ���Ӱ� �ø���.
		//	   -> ���� ���� �ϴ� ���� �ƴϴ�.

	} // end of main()

} // end of StringTest class




