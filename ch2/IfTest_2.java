package com.bigdata30.ch2;

public class IfTest_2{

	public static void main(String args[]){

		// 1 > 2 : �� �����ڸ� ����� ���� ũ�⸦ ���� ��.
		// �ڵ� �� �� �˾ƾߡ�
		boolean bool = 1 > 2;
		System.out.println(" bool >>> : " + bool);
		if (bool)
		{
			System.out.println(" bool --> true");
		}

		if (1 >2)
		{
			System.out.println(" bool --> true ");
		}

		boolean bool1 = 1 < 2;
		System.out.println("bool1 >>> : " + bool1);
		if (bool1)
		{
			System.out.println("bool1 --> true");
		}

		
		//char : 2byte(16bit) -> 0�� ������ ���� ���� 16bit
		//int : 4byte(32bit) -> 0�� �߽����� ��ȣ��Ʈ - �� ��ȣ��Ʈ + �� ���� ���� �� ����.
		boolean bool2 = 'a' > 'A';
		System.out.println("bool2 >>> : " + bool2);
		//<�Ϲ���/������ ����ȯ> implicit casting ��
		int aS = 'a';
		System.out.println("aS >>> : " + aS);
		//static String toHexString(int i)
		System.out.println("'a' : 16���� : 0x" + Integer.toHexString('a')); // �ڵ� ����ȯ : char a �� int�� ����ȯ ��
		System.out.println("aS : 16���� : 0x" + Integer.toHexString(aS)); // �ڵ� ����ȯ : char A �� int�� ����ȯ ��
		int aL = 'A';
		System.out.println("aL >>> : " + aL);
		System.out.println("'A' : 16���� : 0x" + Integer.toHexString('A'));
		System.out.println("aL : 16���� : 0x" + Integer.toHexString(aS));
		boolean bool3 = 97 > 65; // 10����
		System.out.println("bool3 >>> : " + bool3);
		boolean bool4 = 0x61 > 0x41; // 16����
		System.out.println("bool4 >>> : " + bool4);
		if (bool2) 
		{
			System.out.println("bool2 --> true ");
		}else{
			System.out.println("bool2 --> false ");
		}
		if (0x61 > 0x41) 
		{
			System.out.println(" true ");
		}else{
			System.out.println(" false ");
		}
	} // end of main()
} // end of IfTest_2 class
//p.92, p.64