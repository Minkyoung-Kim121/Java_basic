package a.b.c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest_1{

	public static void main(String args[]){
		
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("hm �������� >>> : " + hm);
		hm.put("�̸�", "��ĥ��");
		hm.put("����", "4");
		hm.put("����", "�й�ġ");
		System.out.println("hm �������� >>> : " + hm);
		String name = hm.get("�̸�");
		String age = hm.get("����");
		String job = hm.get("����");
		System.out.println("name >>> : " + name);
		System.out.println("age >>> : " + age);
		System.out.println("job >>> : " + job);

		// Iterator�� ���� ������
		Iterator<String> keys = hm.keySet().iterator();
		// -> String key = (String) keys.next(); ��� <String> ������ Ÿ�� ������.
		while (keys.hasNext())
		{
			String key = keys.next(); // -> String key = (String) keys.next();
			String value = hm.get(key);
			System.out.println(key + " : " + value);
		}

		// keySet()�� ���� ������
		for (String key1 : hm.keySet())
		{
			String value1 = hm.get(key1);
			System.out.println(key1 + " : " + value1);
		}

		// Entry�� ���� ������
		for (Map.Entry<String, String> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	} // end of main()



} // end of HashMapTest_1 class









