package a.b.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest_1{

	public static void main(String args[]){
		
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("hm 참조변수 >>> : " + hm);
		hm.put("이름", "김칠리");
		hm.put("나이", "4");
		hm.put("직업", "털뭉치");
		System.out.println("hm 참조변수 >>> : " + hm);
		String name = hm.get("이름");
		String age = hm.get("나이");
		String job = hm.get("직업");
		System.out.println("name >>> : " + name);
		System.out.println("age >>> : " + age);
		System.out.println("job >>> : " + job);

		// Iterator로 뽑은 데이터
		Iterator<String> keys = hm.keySet().iterator();
		// -> String key = (String) keys.next(); 대신 <String> 데이터 타입 정해줌.
		while (keys.hasNext())
		{
			String key = keys.next(); // -> String key = (String) keys.next();
			String value = hm.get(key);
			System.out.println(key + " : " + value);
		}

		// keySet()로 뽑은 데이터
		for (String key1 : hm.keySet())
		{
			String value1 = hm.get(key1);
			System.out.println(key1 + " : " + value1);
		}

		// Entry로 뽑은 데이터
		for (Map.Entry<String, String> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	} // end of main()



} // end of HashMapTest_1 class









