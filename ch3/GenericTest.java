package a.b.c;

import java.util.ArrayList;
public class GenericTest{
//ArrayList �̿�� (<> ���� �Ͱ� �� ���� �� ����)

	public static void main(String args[]){
	// ���׸� <>
		ArrayList<String> aList = new ArrayList<String>();
		System.out.println("aList �������� >>> : " + aList.toString());
		aList.add("�踸��");
		System.out.println("aList �������� >>> : " + aList.toString());
//		aList.add(String.valueOf(8)); ->//String �ʱ�ȭ�� �ؾ��ϴµ�(<String> : String �� ���) int���̱� ������ 
//										int������ �ϵ���, String ���� �ϵ��� �ؾ��ϴµ�,
//		System.out.println("aList �������� >>> : " + aList.toString());
		aList.add("8"); // -> int�� String ���� ����ȯ ""�� �ٿ���
						// -> ����ȯ�� ������� �ص� ������, ���� -> ���ڸ� �� ���� �̷��� �ض�.
		System.out.println("aList �������� >>> : " + aList.toString());
//		aList.add(8.toString()); -> x
//		System.out.println("aList �������� >>> : " + aList.toString());
		aList.add("010-7676-7676");
		System.out.println("aList �������� >>> : " + aList.toString());
		aList.add("����� ���۱�");
		System.out.println("aList �������� >>> : " + aList.toString());

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
		System.out.println("aList1 �������� >>> : " + aList1.toString());
		aList1.add("��ĥ��");
		System.out.println("aList1 �������� >>> : " + aList1.toString());
		aList1.add(String.valueOf(4));
		System.out.println("aList1 �������� >>> : " + aList1.toString());
		aList1.add("010-1212-3434");
		System.out.println("aList1 �������� >>> : " + aList1.toString());
		aList1.add("��⵵ �����ν�");
//		aList1.add(��⵵); -> error 
		System.out.println("aList1 �������� >>> : " + aList1.toString());

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