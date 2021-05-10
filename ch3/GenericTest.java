package a.b.c;

import java.util.ArrayList;
public class GenericTest{
//ArrayList 이용법 (<> 쓰는 것과 안 쓰는 것 차이)

	public static void main(String args[]){
	// 제네릭 <>
		ArrayList<String> aList = new ArrayList<String>();
		System.out.println("aList 참조변수 >>> : " + aList.toString());
		aList.add("김만두");
		System.out.println("aList 참조변수 >>> : " + aList.toString());
//		aList.add(String.valueOf(8)); ->//String 초기화를 해야하는데(<String> : String 만 써라) int형이기 때문에 
//										int형으로 하든지, String 으로 하든지 해야하는데,
//		System.out.println("aList 참조변수 >>> : " + aList.toString());
		aList.add("8"); // -> int를 String 으로 형변환 ""를 붙여서
						// -> 형변환은 마음대로 해도 되지만, 숫자 -> 문자를 쓸 때는 이렇게 해라.
		System.out.println("aList 참조변수 >>> : " + aList.toString());
//		aList.add(8.toString()); -> x
//		System.out.println("aList 참조변수 >>> : " + aList.toString());
		aList.add("010-7676-7676");
		System.out.println("aList 참조변수 >>> : " + aList.toString());
		aList.add("서울시 동작구");
		System.out.println("aList 참조변수 >>> : " + aList.toString());

		String mname = aList.get(0);
		System.out.println("mname >>> : " + mname);
		String mage = aList.get(1);
		System.out.println("mage >>> : " + mage);
		String mhp = aList.get(2);
		System.out.println("mhp >>> : " + mhp);
		String maddr = aList.get(3);
		System.out.println("maddr >>> : " + maddr);


		for (int i=0; i < aList.size(); i++)
		{
			System.out.println("aList.get("+i+") >>> : " + aList.get(i));
		}


// ArrayList
		ArrayList aList1 = new ArrayList();
		System.out.println("aList1 참조변수 >>> : " + aList1.toString());
		aList1.add("김칠리");
		System.out.println("aList1 참조변수 >>> : " + aList1.toString());
		aList1.add(String.valueOf(4));
		System.out.println("aList1 참조변수 >>> : " + aList1.toString());
		aList1.add("010-1212-3434");
		System.out.println("aList1 참조변수 >>> : " + aList1.toString());
		aList1.add("경기도 의정부시");
//		aList1.add(경기도); -> error 
		System.out.println("aList1 참조변수 >>> : " + aList1.toString());

		String mname1 = (String)aList1.get(0);
		System.out.println("mname1 >>> : " + mname1);

		int mage1 = (int)aList1.get(1);
		System.out.println("mnage1 >>> : " + mage1);
		String mage11 = String.valueOf(aList1.get(1));
		System.out.println("mage11 >>> : " + mage11);

		String mhp1 = (String)aList1.get(2);
		System.out.println("mhp1 >>> : " + mhp1);
		String maddr1 = (String)aList1.get(3);
		System.out.println("maddr1 >>> : " + maddr1);

		for (int i=0; i < aList1.size(); i++)
		{
			System.out.println("aList1.get("+i+") >>> : " + aList1.get(i));
		}

	}


}