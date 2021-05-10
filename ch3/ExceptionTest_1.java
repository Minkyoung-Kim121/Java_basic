package a.b.c;


public class ExceptionTest_1{ // p.492    java.lang.ArrayIndexOutOfBoundsException

//����
//������
//�Լ�()
	public void aM(int[] iVal) throws Exception {// -> main() ���� throws �� ������ x
												 // -> error�� ������, �Լ��ȿ��� �ذ��Ϸ� ��������,
												 //    main()���� ������. (throws Exception�� �̿�)
												 //    ���� ��, try-catch �������� �޾ƶ�.(���� �ȿ���)
	// -> aM() �Լ��� �������� void, ���� Ÿ���� ������ �ʿ�� ������(����Ÿ�� �ʱ�ȭ �� �ص� ��),
								//    ������ �迭 5��(int[] iArr = new int[5];)�� �ִ´�.
	// -> �Լ��� 1�� (�ڿ��� 1��) : �Ű������� �迭([])�̴�.
		System.out.println("aM() >>> ���� "); // ->���������� ����� ����Ͽ� ������� ����� �����Ѵ�.
		System.out.println("iVal >>> : " + iVal);
		System.out.println("iVal.length >>> : " + iVal.length); // -> iVal.length >>> : 5
																// i = 0, 1, 2, 3, 4 -> 5��
		try
		{
			for (int i=0; i < iVal.length; i++) // -> ���� i ���� ���� �����ϸ� iVal.length ���� ���� �� ����.
			// -> �ڹٿ��� �迭[] �ε����� 0���� ����. (cf.����Ŭ�� 1����)
			
			// -> for() ���� 0�̵� 1�̵� ���x ����(�迭�� ��, �� �ε���)�� ���߱� ���� int i=1�� �����ϸ�, ��������.
			// for (int i=1; i <= iVal.length; i++)
			/* -> 4���ۿ� ��� �� �ȴ�.
			iVal[1] >>> : 1
			iVal.length >>> : 5
			iVal[2] >>> : 2
			iVal.length >>> : 5
			iVal[3] >>> : 3
			iVal.length >>> : 5
			iVal[4] >>> : 4
			iVal.length >>> : 5
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
					at a.b.c.ExceptionTest_1.aM(ExceptionTest_1.java:18)
					at a.b.c.ExceptionTest_1.main(ExceptionTest_1.java:29)
			*/
			{
			iVal[i] = i;
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
			}


		}
/*
		catch (ArrayIndexOutOfBoundsException a)
		{
			System.out.println("a.getMessage() >>> : " + a.getMessage());
		}
*/
		catch (Exception a)
		{
			System.out.println("a.getMessage() >>> : " + a.getMessage());
		}
		System.out.println("aM() >>> �� ");

	} // end of aM()


//main()
	public static void main(String args[]){
		System.out.println("main() >>> ����");
		int[] iArr = new int[5]; // -> �������� iArr�� ����Ͽ� ����(int) �ټ����� �迭�� ������
		System.out.println("iArr >>> : " + iArr); // -> iArr >>> : [I@15db9742] �ּҰ�

			try
			{
			ExceptionTest_1 et1 = new ExceptionTest_1();
			// -> ExceptionTest_1(); �����ڸ� et1 ���������� ����Ͽ� �ν��Ͻ�

			et1.aM(iArr);
			// iArr(ExceptionTest_1(); �����ڷ� ������ �ƱԸ�Ʈ) ����/�ƱԸ�Ʈ�� �����Ͽ� �Լ� aM()�� ȣ���Ѵ�.
			//                         ->  �׷��� ���� ���� aM() �Լ��� �鿩�� ���� �����Ѵ�!

			}
			catch (Exception e)
			{
			System.out.println("e >>> : " + e);
			}

		System.out.println("main() >>> ��");
	} // end of main()

} // end of ExceptionTest_1 class