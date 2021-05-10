 package a.b.c;


 public class StringBufferTest{


// StringBufferTest(�����迭) p.370
	public static void main(String args[]){
		// �ڹٿ��� ���ڿ��� ���Ҷ��� StringBuffer Ŭ������ append() �Լ��� �Ἥ ���Ѵ�.
		// cf. StringTest.java
		//                                       ��������.append();

		StringBuffer sb = new StringBuffer("java"); // �������� sb <- "java"
		System.out.println("sb >>> : " + sb); // -> sb >>> : java
		System.out.println("sb >>> : " + System.identityHashCode(sb)); // -> sb >>> : 366712642

		sb.append(" and");
		sb.append(" android");
		sb.append(" programming is fun???");
		System.out.println("sb >>> : " + sb);
		// -> sb >>> : java and android programming is fun???
		System.out.println("sb >>> : " + System.identityHashCode(sb)); // -> sb >>> : 366712642
	// �ּҰ��� �Ȱ��� ���� : �޸𸮰� ���� �����Ǵ� ���� �ƴ϶�, �ϳ��� �޸𸮿� ��� ����Ǳ� �����̴�.
	//                    (���� �� �޸� �ּҿ� ���� �� �޸� �ּҰ� ����.)
//		String str = sb;
/*-> ���� �� �Ѵ�.
StringBufferTest.java:21: error: incompatible types: StringBuffer cannot be converted to String
                String str = sb; 
                             ^
1 error
*/
		String str = sb.toString(); // -> toString() �Լ� invoke. 
	// ���ڿ��� ������ �Ŀ�, buffer �� .toString(); �� �ϸ� �ٽ� ���ڿ��� ��ȯ ����
		System.out.println("str >>> : " + str);
		// -> str >>> : java and android programming is fun???
		System.out.println("str >>> : " + System.identityHashCode(str));
		// -> str >>> : 1829164700

//		String str1 = (String)sb;
//		System.out.println("str1 >>> : " + str1);
//		System.out.println("st1r >>> : " + System.identityHashCode(str1));
/*-> ���� �� �Ѵ�.
StringBufferTest.java:32: error: incompatible types: StringBuffer cannot be converted to String
                String str1 = (String)sb;
                                      ^
1 error
*/

		String str1 = str + "\n��Ʈ��Ŭ���� �Һ��� �����ϱ� ��"; // -> + "���޿�"�� �ߴ��� �ּҰ��� �� �ٲ����.
		System.out.println("str1 >>> : " + str1);
		System.out.println("str1 >>> : " + System.identityHashCode(str1));
		// -> st1r >>> : 2018699554
/*
str >>> : 1829164700
str1 >>> : java and android programming is fun???
��Ʈ��Ŭ���� �Һ��� �����ϱ� ��
st1r >>> : 2018699554
*/

/*
		final char[] cVal = new char[]{'a', 'b', 'c'};
		System.out.println("cVal >>> : " + cVal);
		cVal[0] = 'd';
		System.out.println("cVal[0] >>> : "+ cVal[0]);
		char[] cVal1 = new char[]{'a', 'b', 'c'};
*/

		final char c = 'a';
//		c = 'd';
		System.out.println("c >>> : " + c);
/*     final Ű���带 ���� ���� ������ x
StringBufferTest.java:69: error: cannot assign a value to final variable c
                c = 'd';
                ^
1 error
*/

		final String s = "a";
//		s = "d";
		System.out.println("s >>> : " + s);
/*     final Ű���带 ���� ���ڿ� ������ x
StringBufferTest.java:79: error: cannot assign a value to final variable s
                s = "d";
                ^
1 error
*/

	} // end of main()


 } // end of StringBufferTest class