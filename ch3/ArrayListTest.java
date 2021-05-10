package a.b.c;

import java.util.Date;
import java.util.ArrayList;

// javac -Xlint -d . ArrayListTest.java

public class ArrayListTest{
	// main()
	public static void main(String args[]){
		
		//ArrayList<String> aList = new ArrayList<String>();
		ArrayList aList = new ArrayList();
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add("몽자");
		String s = String.valueOf(aList.get(0));
		System.out.println("s >>> : " + s);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add("재구");
		String s1 = aList.get(1)+""; //  -> ""; 사용 금지
		System.out.println("s1 >>> : " + s1);
//		System.out.println("aList 참조변수 >>> : " + aList);

		// ArrayList add() 함수에 정수 11을 저장하면
		// JVM이 정수 11을 new Integer(11) 을 해서 
		// 객체(Wrapper Class)로 저장한다.
		aList.add(11);
		int iVal = (int)aList.get(2); // -> 이건 생략된 버전 밑의 버전으로 코딩해야
		System.out.println("iVal >>> : " + iVal);

		// aList.get(2) 는 object로 저장되어 있고
		// 이것을 (Integer)aList.get(2) 로 Object 에서 Integer로 형변환을 한 다음에
		// .intValue() 함수로 정수로 치환한다.
		int iVall = ((Integer)aList.get(2)).intValue();
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add(new Integer(100));
		Integer ii = (Integer)aList.get(3);
		System.out.println("ii >>> : " + ii);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add(2.00);
		double d1 = (double)aList.get(4);
		System.out.println("d1 >>> : " + d1);
		double dd = ((Double)aList.get(4)).doubleValue();
		System.out.println("dd >>> : " + dd);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add(aList);
		Object aList1 = (Object)aList.get(5);
		//ArrayListTest aList1 = (ArrayListTest)aList.get(5);
		System.out.println("aList1 >>> : " + aList1);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add('ㅎ');
		char c = (char)aList.get(6);
		System.out.println("c >>> : " + c);
		char cc = Character.valueOf((Character)aList.get(6));
		System.out.println("cc >>> : " + cc);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add(new String("봉지"));
		String s8 = (String)aList.get(7);
		System.out.println("s8 >>> : " + s8);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add(new java.util.Date());
		Date d = (Date)aList.get(8);
		System.out.println("d >>> : " + d);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add("10번째");
		String s2 = (String)aList.get(9);
		System.out.println("s2 >>> : " + s2);
//		System.out.println("aList 참조변수 >>> : " + aList);

		aList.add(11);
		// int 형 데이터 11이 new Integer(11) 인스턴스해서 저장된다. -> jvm 이 이렇게 실행한다.
		//Integer iii = (int)aList.get(10);
		int iVal2 = (int)aList.get(11);
		System.out.println("iVal2 >>> : " + iVal2);
//		System.out.println("aList 참조변수 >>> : " + aList);

		int iVal3 = ((Integer /*Object 형을 Integer 형으로 형변환*/)aList.get(11)/*Object*/).intValue();
		System.out.println("iVal3 >>> : " + iVal3);

/*
		for (int i=0; i < aList.size(); i++)
		{
			System.out.println("aList.get("+i+") >>> : " + aList.get(i));
		}

*/
	} // end of main()


} // end of ArrayListTest class

/*
<E> element 의 약자, <여는 꺽쇠, >닫는 꺽쇠
<> : 제너릭 기술
<E> : escape 문자
: 이 element(객체)를 사용할 때는 이 요소(element)와 똑같은 data type 으로만 사용하세요.
빈 생성자를 만들면 데이터를 10개 담을 수 있음

*/