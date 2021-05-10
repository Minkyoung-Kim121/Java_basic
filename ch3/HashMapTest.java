package a.b.c;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest{

	public static void main(String args[]){
/*
		ArrayList al = new ArrayList();
		System.out.println("al �������� >>> : " + al); // -> al �������� >>> : []

		Vector vt = new Vector();
		System.out.println("vt �������� >>> : " + vt); // -> vt �������� >>> : []
*/
		HashMap hm = new HashMap();
		System.out.println("hm �������� >>> : " + hm); // -> hm �������� >>> : {}

		// put(K key, V value)
		hm.put("�̸�", "�踸��");
		System.out.println("hm �������� >>> : " + hm); // -> hm �������� >>> : {�̸�=�踸��}
		hm.put("�̸�", "�踸�� �ɳɳɳɳ�");
		System.out.println("hm �������� >>> : " + hm); // -> hm �������� >>> : {�̸�=�踸�� �ɳɳɳɳ�}

		hm.put("����", 8);
		System.out.println("hm �������� >>> : " + hm); // -> hm �������� >>> : {�̸�=�踸�� �ɳɳɳɳ�, ����=8}
		hm.put("����", 8);
		System.out.println("hm �������� >>> : " + hm); // -> hm �������� >>> : {�̸�=�踸�� �ɳɳɳɳ�, ����=8}

		hm.put("�ּ�", "��⵵ ������");
		System.out.println("hm �������� >>> : " + hm);
		// -> hm �������� >>> : {�̸�=�踸�� �ɳɳɳɳ�, �ּ�=��⵵ ������, ����=8}
		hm.put("�ּ�", "��⵵ ������ ������");
		System.out.println("hm �������� >>> : " + hm);
		// -> hm �������� >>> : {�̸�=�踸�� �ɳɳɳɳ�, �ּ�=��⵵ ������ ������, ����=8}

		int hmSize = hm.size();
		System.out.println("hmSize >>> : "+ hmSize); // -> hmSize >>> : 3

		System.out.println("hm.get('�̸�')" + hm.get("�̸�")); // -> hm.get('�̸�')�踸�� �ɳɳɳɳ�
		String name =(String)hm.get("�̸�");
		System.out.println("name >>> : " + name); // -> name >>> : �踸�� �ɳɳɳɳ�

		System.out.println("hm.get('����')" + hm.get("����")); // -> hm.get('����')8
		int age = ((Integer)hm.get("����")).intValue();
		System.out.println("age >>> : " + age); // -> age >>> : 8

		System.out.println("hm.get('�ּ�')" + hm.get("�ּ�")); // -> hm.get('�ּ�')��⵵ ������ ������
		String addr =(String)hm.get("�ּ�");
		System.out.println("addr >>> : " + addr); // -> addr >>> : ��⵵ ������ ������


		System.out.println("hm.keySet() >>> :" + hm.keySet()); // -> hm.keySet() >>> :[�̸�, �ּ�, ����]
		System.out.println("hm.values() >>> :" + hm.values());
		// -> hm.values() >>> :[�踸�� �ɳɳɳɳ�, ��⵵ ������ ������, 8]
		System.out.println("hm.entrySet() >>> :" + hm.entrySet());
		// -> hm.entrySet() >>> :[�̸�=�踸�� �ɳɳɳɳ�, �ּ�=��⵵ ������ ������, ����=8]

		// hm.keySet() -> �̸�, ����, �ּ� ������ 3��
		// .iterator() -> hm.keySet() �Լ����� ������ [�̸�, ����, �ּ�] �����͸�
		//                Iterator keys ���������� �����Ѵ�.
		//                �ٸ� ���δ� Iterator keys ���������� 
		//                hm.keySet() �Լ����� ������ [�̸�, ����, �ּ�] �����͸� ��Ī�Ѵ�.
		Iterator keys = hm.keySet().iterator();
		System.out.println("keys >>> : " + keys);
		// -> keys >>> : java.util.HashMap$KeyIterator@15db9742

		// [Ŀ���� �տ��� �����. (�����Ͱ� �ִ���) �̸�, �ּ�, ����]
		
		// Iterator �������� keys�� �̿��ؼ� 
		// ���ͷ����Ϳ� ����ִ� �����͸� hasNext() �Լ��� Ȯ���Ѵ�.
		while (keys.hasNext()) // -> true �� ����. false �� �����.
		{
			String key = (String)keys.next();
			System.out.println("key >>> : " + key);
			// set() setter
			// get() getter
			// has ()
//			key >>> : �̸�
//			key >>> : �ּ�
//			key >>> : ����
			String value = ""; // value �� �� �׷��ϱ� null (����) �� �ʱ�ȭ �� ��.

			if ("�̸�".equals(key))
			{
				System.out.println("key �̸� >>> : " + key);
				String name1 = (String)hm.get(key);
				System.out.println("name1 >>> : " + name1);
				value = name1;
//				keys = null;
			}

			if ("�ּ�".equals(key))
			{
				System.out.println("key ���� >>> : " + key);
				String addr1 = (String)hm.get(key);
				System.out.println("addr1 >>> : " + addr1);
				value = addr1;
			}

			if ("����".equals(key))
			{
				System.out.println("key ���� >>> : " + key);
//				int age1 = (int)hm.get(key); // ->  int ����ȯ�� �Ǵٸ� �� 
				int age1 = ((Integer)hm.get(key)).intValue();
				// -> ���̴� int���̱� ������ ����ȯ �ؾ�.ArrayListTest.java ����
				System.out.println("age1 >>> : " + age1);
				value = String.valueOf(age1); // -> GenericTest.java 12�� ����
//				value = "age1"; -> age1 ��ü�� ���ڿ��� ���� ���̱� ������ �ֿܼ� ����ϸ�
								// age1 ��((Integer)hm.get(key)).intValue()�� ������ ���� �ƴ϶�
								// age1 ��ü�� ��µ�.
			}

		System.out.println(key + " : " + value);
// if() ����� �̸�-�ּ�-���� ������ ��µǰ�, �Է��� ��� ������ ���� x HashMap�̱� ����. ���� x
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











