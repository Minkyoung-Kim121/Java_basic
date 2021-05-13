package com.bigdata30.ch2;

public class ArrayJava{

	public static void main(String args[]){
		
		/*
			�ڹٿ��� �迭�� ������ []�� ����Ѵ�. <-Ư��
			�ڹٿ��� �迭�� object(��ü)�̴�.
			�ڹٿ��� �迭�� ����Ϸ��� new �����ڸ� ����ؾ��Ѵ�. <-��Ģ
			�ڹٿ��� �迭�� Data Type �� �����ؾ��Ѵ�.
			�ڹٿ��� �迭�� ���������� ����Ѵ�.
			�ڹٿ��� �迭�� ������ ����, ���(element)�� ������ �����ؾ��Ѵ�.
			�ڹٿ��� �迭�� �����͸� ����Ϸ��� ��������[index(÷��)]�� ����ؾ��Ѵ�.
			�ڹٿ��� �迭�� index�� �� 0���� �����Ѵ�.
			
			�ڹٿ��� �����ϴ� �迭�� ����
			1���� �迭 -> int i[] = new int[]
			2���� �迭 -> int[] ii[] = new int[][]
			������ �迭
		*/
		// <int�� ������ �迭�� �����ϴ� ���>
		int i[] = new int[3];
		System.out.println("i >>> : " + i);
		// int�� �迭�� ����(��� ��/element�� ����)�� �˱� ���� length������ ����Ѵ�.
		// �迭�� ���̸� ���ϼ��� -> length
		// ���� �ڵ忡�� i.length ������ ����ϸ�, 3�� �����µ�
		//                                �̴� ���� 3�� �ִٴ� �ǹ�.
		//                                (��Ұ� �� ������ 3�� �ִ�.)
		System.out.println("i.length >>> : " + i.length);
		int iLen = i.length;
		System.out.println("iLen >>> : " + iLen);
		// �迭�� index
		// ���� int�� �迭�� 3���� ���� ������ �ִµ�,
		//     �� �濡 �ִ� �����͸� index�� �ֿܼ� ����� ���ÿ�.
		System.out.println("i[0] >>> : " + i[0]);
		System.out.println("i[1] >>> : " + i[1]);
		System.out.println("i[2] >>> : " + i[2]);
		//->����ϸ�, �� �����Ͱ� 0�� �����µ�
		//         �� ���� �迭�� �����ϰ� int i[] new �ν��Ͻ� new int[3] �ϴ� ��������
		//         ������(���� ���� ���� default Constructor)�� int��
		//         Data Type�� default Value�� 0���� �ʱ�ȭ �ߴ�.

		// <�迭 �ʱ�ȭ�ϱ�>
		i[0] = 1;
		// �������� i�� ����Ű�� �迭�� ��(���) �� ù��° �濡 1�� �����ϼ����� �ǹ�
		System.out.println("i[0] = 1 >>> : " + i[0]);
		i[1] = 2;
		System.out.println("i[1] = 2 >>> : " + i[1]);
		i[2] = 3;
		System.out.println("i[2] = 3 >>> : " + i[2]);
		//
		int ii[] = new int[]{1, 2, 3}; // int[3] -> �氳�� 3�� ����.
		
		System.out.println("ii[0] >>> : " + ii[0]);
		System.out.println("ii[1] >>> : " + ii[1]);
		System.out.println("ii[2] >>> : " + ii[2]);
		int iiLen = ii.length;
		for (int k=0; k < iiLen; k++)
		{
			System.out.println("ii["+k+"] >>> : " + ii[k]);
		}
		int iii[] = {1, 2, 3}; // new int[] ����.
		System.out.println("iii[0] >>> : " + iii[0]);
		System.out.println("iii[1] >>> : " + iii[1]);
		System.out.println("iii[2] >>> : " + iii[2]);
		int iiiLen = iii.length;
		System.out.println("iiiLen >>> : " + iiiLen);
		for (int j=0; j <= iiiLen; j++ )
		{
		/* �ϱ� -> 
		System.out.println("iii["+j+"] >>> : " + iii[j]);
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at com.bigdata30.ch2.ArrayJava.main(ArrayJava.java:67)
		*/

		
		}
	}
}