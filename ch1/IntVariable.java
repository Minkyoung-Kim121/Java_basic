package com.bigdata30.ch1;

public class IntVariable{

	public static void main(String args[]){

		int i = 1;
		System.out.println("i >>> : " + i);


		// int ������ Ÿ�� Max �� �ֿܼ� ����ϱ� 
		// ��� 1
		System.out.println("Interger.MAX_VALUE >>> : " 
			                + Integer.MAX_VALUE);
		
		// ��� 2
		int iMax = Integer.MAX_VALUE;
		System.out.println("iMax >>> : " + iMax);

		// int ������ Ÿ�� MIN �� �ֿܼ� ����ϱ� 
		// ��� 1
		System.out.println("Integer.MIN_VALUE >>> : " 
			               + Integer.MIN_VALUE);

		// ��� 2
		int iMin = Integer.MIN_VALUE;
		System.out.println("iMin >>> : " + iMin);

		// int ������ Ÿ�� Max ���� ���ؼ�
		// 10����, 2����, 8����, 16������ �ֿܼ� ����Ͻÿ�
		int iiMax = Integer.MAX_VALUE;
		System.out.println("iiMax >>> : " + iiMax);
		System.out.println("toBinaryString(iiMax) >>> : " 
			               + Integer.toBinaryString(iiMax));
		System.out.println("toOctalString(iiMax) >>> : " 
		                   + Integer.toOctalString(iiMax));
		System.out.println("toHexString(iiMax) >>> : " 
		                   + Integer.toHexString(iiMax));




	} // end of main()
}// end of IntVariable class

	