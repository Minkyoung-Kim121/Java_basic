package a.b.c;

import java.util.Scanner;
public class ExceptionTest_5{


	public static void main(String args[]){ // -> ���� ������ ������ ���� throws Exception ---> x
		//    main() �Լ��� �Ű������� ��Ʈ�� �迭(String args[])�� ����Ͽ��µ�
		//    �� ������ ����� �μ� ��� �̶�� �Ѵ�.
		//    �̴� �ֿܼ��� �ܺ� �����͸� �޾ƿ��� ������ �ϸ�
		//          ���ڿ�, ���� �� �޾ƿ� �����ʹ� �ش� �Լ��� �����ϰ� ����ؾ� �Ѵ�.
		

		// ��1) ����� �μ��� �����͸� �޾Ƽ�
		//	   ���ڷ� ��ȯ�Ͽ� ����� ������. (cf.������ ����ȯ�� ������ Scanner Ŭ������ ����)
		// String args[] = {"1", "1"};
		// java a.b.c.ExceptionTset_5 1 1
		// Integer.parseInt();

		int argsLen = args.length; // ��Ʈ�� ���ڿ��� ���̴� length(), �迭�� ���̴� length �ʵ�� �����´�.

		if (argsLen == 2) // -> if �� true �� ���ư���. argsLen �迭�� 2����.

		{
			// C:\00.KOSMO72\00.JExam\ch3>java a.b.c.ExceptionTest_5 1 1
			// String args[] = {"1", "1"}; -> �迭 �� ��
			// ����� �μ� �޾ƿ��� 
			System.out.println("args.length >>> : " + args.length); // -> 2
			String sX = args[0];
			// ù��° ��Ҹ� ����Ϸ��� -> ��������[�ε���] : args[0]
			System.out.println("sX >>> : " + sX);
			String sY = args[1];
			System.out.println("sY >>> : " + sY);
			
			/*
			C:\00.KOSMO72\00.JExam\ch3>java a.b.c.ExceptionTest_5 1 1
			: argsLen �迭�� �� ���̱� ������ java Ŭ������ �ڿ� int ���� �� ���� Ÿ�����ؼ� ��� 1 1 (�� ���ڴ� sX, sY�� ���Եȴ�.)
			args.length >>> : 2
			sX >>> : 1
			sY >>> : 1
			x >>> : 1
			y >>> : 1
			1 / 1 >>> : 1
			*/


/* �߿�!!! ���� -> ���ڰ� ��ȯ�� �� �� �� �Ͼ�� ���� : NumberFormatException
e >>> java.lang.NumberFormatException: For input string: "��"
*/

			try
				{
				// ����� �μ��� �޾ƿ� �����͸� ���ڷ� ��ȭ�ϱ� 
				// Integer.parseInt() �Լ��� 
				int x = Integer.parseInt(sX);
				// Integer.parseInt() : String ���ڸ� int�� ��ȯ�ϴ� �Լ�.
				//                 ��Ȯ�� ����, ���ڼ��ڸ� ���ڷ� ��ȯ�ϴ� �Լ�
				//                 ex) "11" -> 11 (����o)
				//                 ex) "��"  -> NumberFormatException (�Ұ���)
				System.out.println("x >>> : " + x);			
				int y = Integer.parseInt(sY);;
				System.out.println("y >>> : " + y);			
				int z = x / y;
				System.out.println(x + " / " +  y + " >>> : " + z);

				}

			catch (Exception e) // Arithmeticexception -> ���x ��� �ֻ���Ŭ������ Exception  ����ض�.
				{
					System.out.println("e >>> " + e);
				}finally{ // -> �� ������ ������ Ư���ϰ� ���� ���� �������ִ�. ������ ����ȴٴ� ������ �˰� ����.
					System.out.println("finally ���� catch ���� ���� ���ο� ������� ������ ����ȴ�. >>> : ");
				}


		}else{
			

		}

		
		System.out.println("try catch �� ���� >>> : ");

	} // end of main()


} // end of ExceptionTest_5 class


/*
Exception
	CheckedException : ������ �� ���� �߻�
		RuntimeException�� ������� �ʴ� ����
		IOException,SQLException

Unchecked Exception : ���� �� ���� �߻�(������ �� ���� �߻� ��)
	RuntimeException�� ����ϴ� ����
	NullPointerException : �ڹ� ���� ���� ����� ����.
	                     : ��ü(��������, ����)�� ����ϰ� ������ �� ��ü�� ���� ��
						   �����͸� ������ �� �� �����Ͱ� ��� ���� ����
						   NullPointerException�� �߻��ϸ� 
						   �ش� �ҽ� �� ������ ������ ã���� ����.
						   -> �Լ� �ȿ����� ���������� ����̱� ������, �Լ�(10-20�� �� 15��)���� ������ �߻��ϸ�
						   									10������ ���ư��� ���� ����.
															ȣ���� �������� �Ǿ������״� �������� ������
															->�α׸� �� ������ ���� �ʹ� ����.
*/