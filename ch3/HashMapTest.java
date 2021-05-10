package a.b.c;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest{

	public static void main(String args[]){
/*
		ArrayList al = new ArrayList();
		System.out.println("al 참조변수 >>> : " + al); // -> al 참조변수 >>> : []

		Vector vt = new Vector();
		System.out.println("vt 참조변수 >>> : " + vt); // -> vt 참조변수 >>> : []
*/
		HashMap hm = new HashMap();
		System.out.println("hm 참조변수 >>> : " + hm); // -> hm 참조변수 >>> : {}

		// put(K key, V value)
		hm.put("이름", "김만두");
		System.out.println("hm 참조변수 >>> : " + hm); // -> hm 참조변수 >>> : {이름=김만두}
		hm.put("이름", "김만두 냥냥냥냥냥");
		System.out.println("hm 참조변수 >>> : " + hm); // -> hm 참조변수 >>> : {이름=김만두 냥냥냥냥냥}

		hm.put("나이", 8);
		System.out.println("hm 참조변수 >>> : " + hm); // -> hm 참조변수 >>> : {이름=김만두 냥냥냥냥냥, 나이=8}
		hm.put("나이", 8);
		System.out.println("hm 참조변수 >>> : " + hm); // -> hm 참조변수 >>> : {이름=김만두 냥냥냥냥냥, 나이=8}

		hm.put("주소", "경기도 의정부");
		System.out.println("hm 참조변수 >>> : " + hm);
		// -> hm 참조변수 >>> : {이름=김만두 냥냥냥냥냥, 주소=경기도 의정부, 나이=8}
		hm.put("주소", "경기도 의정부 용현동");
		System.out.println("hm 참조변수 >>> : " + hm);
		// -> hm 참조변수 >>> : {이름=김만두 냥냥냥냥냥, 주소=경기도 의정부 용현동, 나이=8}

		int hmSize = hm.size();
		System.out.println("hmSize >>> : "+ hmSize); // -> hmSize >>> : 3

		System.out.println("hm.get('이름')" + hm.get("이름")); // -> hm.get('이름')김만두 냥냥냥냥냥
		String name =(String)hm.get("이름");
		System.out.println("name >>> : " + name); // -> name >>> : 김만두 냥냥냥냥냥

		System.out.println("hm.get('나이')" + hm.get("나이")); // -> hm.get('나이')8
		int age = ((Integer)hm.get("나이")).intValue();
		System.out.println("age >>> : " + age); // -> age >>> : 8

		System.out.println("hm.get('주소')" + hm.get("주소")); // -> hm.get('주소')경기도 의정부 용현동
		String addr =(String)hm.get("주소");
		System.out.println("addr >>> : " + addr); // -> addr >>> : 경기도 의정부 용현동


		System.out.println("hm.keySet() >>> :" + hm.keySet()); // -> hm.keySet() >>> :[이름, 주소, 나이]
		System.out.println("hm.values() >>> :" + hm.values());
		// -> hm.values() >>> :[김만두 냥냥냥냥냥, 경기도 의정부 용현동, 8]
		System.out.println("hm.entrySet() >>> :" + hm.entrySet());
		// -> hm.entrySet() >>> :[이름=김만두 냥냥냥냥냥, 주소=경기도 의정부 용현동, 나이=8]

		// hm.keySet() -> 이름, 나이, 주소 데이터 3개
		// .iterator() -> hm.keySet() 함수에서 리턴한 [이름, 나이, 주소] 데이터를
		//                Iterator keys 참조변수에 대입한다.
		//                다른 말로는 Iterator keys 참조변수가 
		//                hm.keySet() 함수에서 리턴한 [이름, 나이, 주소] 데이터를 지칭한다.
		Iterator keys = hm.keySet().iterator();
		System.out.println("keys >>> : " + keys);
		// -> keys >>> : java.util.HashMap$KeyIterator@15db9742

		// [커서가 앞에서 물어본다. (데이터가 있는지) 이름, 주소, 나이]
		
		// Iterator 참조변수 keys를 이용해서 
		// 이터레이터에 들어있는 데이터를 hasNext() 함수로 확인한다.
		while (keys.hasNext()) // -> true 에 돈다. false 에 멈춘다.
		{
			String key = (String)keys.next();
			System.out.println("key >>> : " + key);
			// set() setter
			// get() getter
			// has ()
//			key >>> : 이름
//			key >>> : 주소
//			key >>> : 나이
			String value = ""; // value 를 널 그러니까 null (빈문자) 로 초기화 한 것.

			if ("이름".equals(key))
			{
				System.out.println("key 이름 >>> : " + key);
				String name1 = (String)hm.get(key);
				System.out.println("name1 >>> : " + name1);
				value = name1;
//				keys = null;
			}

			if ("주소".equals(key))
			{
				System.out.println("key 나이 >>> : " + key);
				String addr1 = (String)hm.get(key);
				System.out.println("addr1 >>> : " + addr1);
				value = addr1;
			}

			if ("나이".equals(key))
			{
				System.out.println("key 나이 >>> : " + key);
//				int age1 = (int)hm.get(key); // ->  int 형변환의 또다른 예 
				int age1 = ((Integer)hm.get(key)).intValue();
				// -> 나이는 int형이기 때문에 형변환 해야.ArrayListTest.java 참고
				System.out.println("age1 >>> : " + age1);
				value = String.valueOf(age1); // -> GenericTest.java 12행 참고
//				value = "age1"; -> age1 자체를 문자열로 만든 것이기 때문에 콘솔에 출력하면
								// age1 값((Integer)hm.get(key)).intValue()이 나오는 것이 아니라
								// age1 자체가 출력됨.
			}

		System.out.println(key + " : " + value);
// if() 출력은 이름-주소-나이 순으로 출력되고, 입력한 대로 나오는 것이 x HashMap이기 때문. 순차 x
		} // end of while()

		} // end of main()
			
	} // end of HashMapTest class
		



/*
		System.out.println("hmSize >>> : " + hmSize); // -> 3
		for (int i=0; i < hm.size(); i++)
		{
			System.out.println("hm.get("+i+")" + hm.get(i));
		} //-> hm.get(0)null
			// hm.get(1)null
			// hm.get(2)null
*/











