package a.b.c;

import java.util.HashMap;
import java.util.ArrayList;

public class HashMapTest_2{

	public static void main(String args[]){
		

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("�̸�", "�踸��");
		hm.put("����", "8");
		hm.put("�ּ�", "��⵵ �����ν�");

		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("�̸�", "��ĥ��");
		hm1.put("����", "4");
		hm1.put("�ּ�", "��⵵ ������");

		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("�̸�", "�ڷ��");
		hm2.put("����", "11");
		hm2.put("�ּ�", "����� ���۱�");


//		�迭�� ���弼�� HashMap<String, String> �̶�� �����������Ἥ aList��� = ��õ����Ϳ��ø��ϴ� ���޿������ڸ�
		ArrayList<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		aList.add(hm);
		aList.add(hm1);
		aList.add(hm2);
		System.out.println("aList >>> : " + aList); 
		// -> hm, hm1, hm2 �� �ϳ��� ��� �迭 �ȿ� ����.
		// -> [hm, hm1, hm2]
		// -> [{�̸�=�踸��, �ּ�=��⵵ �����ν�, ����=8},
		//     {�̸�=��ĥ��, �ּ�=��⵵ ������, ����=4},
		//     {�̸�=�ڷ��, �ּ�=����� ���۱�, ����=11}]

		HashMap<String, String> map = (HashMap<String, String>)aList.get(0);
		String name = map.get("�̸�");
		String age = map.get("����");
		String addr = map.get("�ּ�");
		System.out.println( name + " : " + age + " : " + addr);

		HashMap<String, String> map1 = (HashMap<String, String>)aList.get(1);
		String name1 = map1.get("�̸�");
		String age1 = map1.get("����");
		String addr1 = map1.get("�ּ�");
		System.out.println( name1 + " : " + age1 + " : " + addr1);

		HashMap<String, String> map2 = (HashMap<String, String>)aList.get(2);
		String name2 = map2.get("�̸�");
		String age2 = map2.get("����");
		String addr2 = map2.get("�ּ�");
		System.out.println( name2 + " : " + age2 + " : " + addr2);


		System.out.println("################");
		for (int i=0; i < aList.size(); i++)
		{
			System.out.println( "aList.size() >>> : " +aList.size()); // -> aList.size() >>> : 3
			HashMap<String, String> map3 = (HashMap<String, String>)aList.get(i);
			String name3 =map3.get("�̸�");
			String age3 = map3.get("����");
			String addr3 = map3.get("�ּ�");
//			String addr3 = (String)map3.get("�ּ�"); (String)�� �ٿ��� �Ǵ� ������ ���� <String> �߱� ����
			System.out.println( name3 + " : " + age3 + " : " + addr3);
			

		}
		System.out.println("################");

















	} // end of main()


} // end of HashMapTest_2 class