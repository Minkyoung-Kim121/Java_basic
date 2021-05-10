package a.b.c;

import java.util.Date;
import java.util.ArrayList;

// javac -Xlint -d . ArrayListTest.java

public class ArrayListTest{
	// main()
	public static void main(String args[]){
		
		//ArrayList<String> aList = new ArrayList<String>();
		ArrayList aList = new ArrayList();
//		System.out.println("aList �������� >>> : " + aList);

		aList.add("����");
		String s = String.valueOf(aList.get(0));
		System.out.println("s >>> : " + s);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add("�籸");
		String s1 = aList.get(1)+""; //  -> ""; ��� ����
		System.out.println("s1 >>> : " + s1);
//		System.out.println("aList �������� >>> : " + aList);

		// ArrayList add() �Լ��� ���� 11�� �����ϸ�
		// JVM�� ���� 11�� new Integer(11) �� �ؼ� 
		// ��ü(Wrapper Class)�� �����Ѵ�.
		aList.add(11);
		int iVal = (int)aList.get(2); // -> �̰� ������ ���� ���� �������� �ڵ��ؾ�
		System.out.println("iVal >>> : " + iVal);

		// aList.get(2) �� object�� ����Ǿ� �ְ�
		// �̰��� (Integer)aList.get(2) �� Object ���� Integer�� ����ȯ�� �� ������
		// .intValue() �Լ��� ������ ġȯ�Ѵ�.
		int iVall = ((Integer)aList.get(2)).intValue();
//		System.out.println("aList �������� >>> : " + aList);

		aList.add(new Integer(100));
		Integer ii = (Integer)aList.get(3);
		System.out.println("ii >>> : " + ii);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add(2.00);
		double d1 = (double)aList.get(4);
		System.out.println("d1 >>> : " + d1);
		double dd = ((Double)aList.get(4)).doubleValue();
		System.out.println("dd >>> : " + dd);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add(aList);
		Object aList1 = (Object)aList.get(5);
		//ArrayListTest aList1 = (ArrayListTest)aList.get(5);
		System.out.println("aList1 >>> : " + aList1);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add('��');
		char c = (char)aList.get(6);
		System.out.println("c >>> : " + c);
		char cc = Character.valueOf((Character)aList.get(6));
		System.out.println("cc >>> : " + cc);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add(new String("����"));
		String s8 = (String)aList.get(7);
		System.out.println("s8 >>> : " + s8);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add(new java.util.Date());
		Date d = (Date)aList.get(8);
		System.out.println("d >>> : " + d);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add("10��°");
		String s2 = (String)aList.get(9);
		System.out.println("s2 >>> : " + s2);
//		System.out.println("aList �������� >>> : " + aList);

		aList.add(11);
		// int �� ������ 11�� new Integer(11) �ν��Ͻ��ؼ� ����ȴ�. -> jvm �� �̷��� �����Ѵ�.
		//Integer iii = (int)aList.get(10);
		int iVal2 = (int)aList.get(11);
		System.out.println("iVal2 >>> : " + iVal2);
//		System.out.println("aList �������� >>> : " + aList);

		int iVal3 = ((Integer /*Object ���� Integer ������ ����ȯ*/)aList.get(11)/*Object*/).intValue();
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
<E> element �� ����, <���� ����, >�ݴ� ����
<> : ���ʸ� ���
<E> : escape ����
: �� element(��ü)�� ����� ���� �� ���(element)�� �Ȱ��� data type ���θ� ����ϼ���.
�� �����ڸ� ����� �����͸� 10�� ���� �� ����

*/