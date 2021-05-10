package a.b.c;
public class InvokeTest{

//�Լ�
	public void aM() throws Exception { // ->  throws Exception ��������� �׻� �ۼ�����.
		System.out.println("aM() �Լ� ����");
		System.out.println("aM()");
		bM(); // -> ��� �ȴ�. �Լ� 4���� �����ϸ��ؼ� �޸𸮿� �÷����� ����.
		System.out.println("aM() �Լ� ��");
	}

	public void bM() throws Exception {
		System.out.println("bM() �Լ� ����");
		System.out.println("bM()");
		// error �߻� : e >>> : java.lang.ArithmeticException: / by zero
		int[] iVal = new int[5];
		for (int i=0; i <= iVal.length; i++)
		{
			iVal[i] = i;
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
			// "+i+" -> �迭 iVal[i] ���� ��� ������ (5��)�� ������������ ����Ͻÿ�.
		}
		cM();
		System.out.println("bM() �Լ� ��");

	}
	
	public String cM() throws Exception {
		System.out.println("cM() �Լ� ����");
		System.out.println("cM()");
		dM();
		System.out.println("cM() �Լ� ��");
		return "";

	}

	public String dM() throws Exception {
		System.out.println("dM() �Լ� ����");
		System.out.println("dM()");

		int x = 1;
		int y = 0;
		// error �߻� -> ArithmeticException a
		int z = x / y;
		/* javac  �� �� ���� java �����ϴϱ� ���� �߻�.
		-> �Լ� �ȿ��� �ذ�x -> main()���� ������ (throws Exception ����ؼ�)
		Exception in thread "main" java.lang.ArithmeticException: / by zero
        at a.b.c.InvokeTest.dM(InvokeTest.java:39)
        at a.b.c.InvokeTest.cM(InvokeTest.java:26)
        at a.b.c.InvokeTest.bM(InvokeTest.java:18)
        at a.b.c.InvokeTest.aM(InvokeTest.java:10)
        at a.b.c.InvokeTest.main(InvokeTest.java:65)
		*/

		System.out.println("z >>> : " + z);
		System.out.println("dM() �Լ� ��");
		return null;

	}


// �ܼ� ���ø����̼�(main()�� �������� ���ø����̼�)
// main()���� �����ؼ� main()���� ������.
// main() -> ��� ���α׷��� ���ٰ� �ᱹ ������, �� �������� �����Ѵ�.(���ƿ´�.)
	public static void main(String args[]){
		
		System.out.println("main() ���� >>> : ");

		try
		{
			InvokeTest it = new InvokeTest();

			System.out.println("it �������� >>> : " + it);
			//	System.out.println("it.aM() >>> : " + it.aM());
			/* 
				-> C:\00.KOSMO72\00.JExam\ch3>javac -d . InvokeTest.java
				InvokeTest.java:35: error: 'void' type not allowed here
			*/
			// it ���������� aM() �Լ� ȣ���ߴ�.
			it.aM(); // -> aM() �Լ��� void �̱� ������ �׳� ����ؾ� �Ѵ�.


		}
		catch (Exception e)
		{
			// System.out.println("e >>> : " + e);           -> �̰� �����������������������ƶ�
			// -> e >>> : java.lang.ArrayIndexOutOfBoundsException: 5 ��� ��µǱ� ������(?) ��������,
			//           "e.getMessage() >>> : " + e.getMessage()   -> �� ���޿� ���.

			System.out.println("e.getMessage() >>> : " + e.getMessage());
			// -> e.getMessage() >>> : 5

		}

			System.out.println("main() �� >>> : ");

	} // end of main()

} // end of ExceptionTest_1 class