package a.b.c;

import java.util.HashMap;
import java.util.ArrayList;

public class HashMapTest_2{

	public static void main(String args[]){
		

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이름", "김만두");
		hm.put("나이", "8");
		hm.put("주소", "경기도 의정부시");

		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("이름", "김칠리");
		hm1.put("나이", "4");
		hm1.put("주소", "경기도 의정부");

		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("이름", "박루루");
		hm2.put("나이", "11");
		hm2.put("주소", "서울시 동작구");


//		배열을 만드세요 HashMap<String, String> 이라는 데이터형을써서 aList라는 = 즉시데이터에올립니다 웅앵웅생성자를
		ArrayList<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		aList.add(hm);
		aList.add(hm1);
		aList.add(hm2);
		System.out.println("aList >>> : " + aList); 
		// -> hm, hm1, hm2 를 하나씩 묶어서 배열 안에 넣음.
		// -> [hm, hm1, hm2]
		// -> [{이름=김만두, 주소=경기도 의정부시, 나이=8},
		//     {이름=김칠리, 주소=경기도 의정부, 나이=4},
		//     {이름=박루루, 주소=서울시 동작구, 나이=11}]

		HashMap<String, String> map = (HashMap<String, String>)aList.get(0);
		String name = map.get("이름");
		String age = map.get("나이");
		String addr = map.get("주소");
		System.out.println( name + " : " + age + " : " + addr);

		HashMap<String, String> map1 = (HashMap<String, String>)aList.get(1);
		String name1 = map1.get("이름");
		String age1 = map1.get("나이");
		String addr1 = map1.get("주소");
		System.out.println( name1 + " : " + age1 + " : " + addr1);

		HashMap<String, String> map2 = (HashMap<String, String>)aList.get(2);
		String name2 = map2.get("이름");
		String age2 = map2.get("나이");
		String addr2 = map2.get("주소");
		System.out.println( name2 + " : " + age2 + " : " + addr2);


		System.out.println("################");
		for (int i=0; i < aList.size(); i++)
		{
			System.out.println( "aList.size() >>> : " +aList.size()); // -> aList.size() >>> : 3
			HashMap<String, String> map3 = (HashMap<String, String>)aList.get(i);
			String name3 =map3.get("이름");
			String age3 = map3.get("나이");
			String addr3 = map3.get("주소");
//			String addr3 = (String)map3.get("주소"); (String)안 붙여도 되는 이유는 위에 <String> 했기 때문
			System.out.println( name3 + " : " + age3 + " : " + addr3);
			

		}
		System.out.println("################");

















	} // end of main()


} // end of HashMapTest_2 class