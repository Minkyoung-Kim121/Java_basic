 package a.b.c;


 public class StringBufferTest{


// StringBufferTest(가변배열) p.370
	public static void main(String args[]){
		// 자바에서 문자열을 구할때는 StringBuffer 클래스의 append() 함수를 써서 구한다.
		// cf. StringTest.java
		//                                       참조변수.append();

		StringBuffer sb = new StringBuffer("java"); // 참조변수 sb <- "java"
		System.out.println("sb >>> : " + sb); // -> sb >>> : java
		System.out.println("sb >>> : " + System.identityHashCode(sb)); // -> sb >>> : 366712642

		sb.append(" and");
		sb.append(" android");
		sb.append(" programming is fun???");
		System.out.println("sb >>> : " + sb);
		// -> sb >>> : java and android programming is fun???
		System.out.println("sb >>> : " + System.identityHashCode(sb)); // -> sb >>> : 366712642
	// 주소값이 똑같은 이유 : 메모리가 새로 생성되는 것이 아니라, 하나의 메모리에 계속 연결되기 때문이다.
	//                    (연산 전 메모리 주소와 연산 후 메모리 주소가 같다.)
//		String str = sb;
/*-> 변경 못 한다.
StringBufferTest.java:21: error: incompatible types: StringBuffer cannot be converted to String
                String str = sb; 
                             ^
1 error
*/
		String str = sb.toString(); // -> toString() 함수 invoke. 
	// 문자열을 변경한 후에, buffer 에 .toString(); 을 하면 다시 문자열로 반환 가능
		System.out.println("str >>> : " + str);
		// -> str >>> : java and android programming is fun???
		System.out.println("str >>> : " + System.identityHashCode(str));
		// -> str >>> : 1829164700

//		String str1 = (String)sb;
//		System.out.println("str1 >>> : " + str1);
//		System.out.println("st1r >>> : " + System.identityHashCode(str1));
/*-> 변경 못 한다.
StringBufferTest.java:32: error: incompatible types: StringBuffer cannot be converted to String
                String str1 = (String)sb;
                                      ^
1 error
*/

		String str1 = str + "\n스트링클래스 불변성 이해하기 ㄱ"; // -> + "웅앵웅"을 했더니 주소값이 또 바뀌었다.
		System.out.println("str1 >>> : " + str1);
		System.out.println("str1 >>> : " + System.identityHashCode(str1));
		// -> st1r >>> : 2018699554
/*
str >>> : 1829164700
str1 >>> : java and android programming is fun???
스트링클래스 불변성 이해하기 ㄱ
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
/*     final 키워드를 쓰면 문자 변경이 x
StringBufferTest.java:69: error: cannot assign a value to final variable c
                c = 'd';
                ^
1 error
*/

		final String s = "a";
//		s = "d";
		System.out.println("s >>> : " + s);
/*     final 키워드를 쓰면 문자열 변경이 x
StringBufferTest.java:79: error: cannot assign a value to final variable s
                s = "d";
                ^
1 error
*/

	} // end of main()


 } // end of StringBufferTest class