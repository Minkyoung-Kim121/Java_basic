package a.b.c;

import java.util.Scanner;
public class ExceptionTest_4{

	public static void main(String args[]){ // -> ���� ������ ������ ���� throws Exception ---> x
		//int x = 1;
		//int y = 0;
		// ������ ��ġ : �ش� ������ ������ ������ / �ƴ����� ���� ��ġ�� ��������.
		//               -> ������ Ȱ�뼺, Ȱ�� ������ ���� ��ġ�� ���Ѵ�.
		//               + �۷ι��ϰ� (������ �а�) ����ϸ� ������ ��Ʈ�� �ϱ� ���������.		
		
		System.out.println("�ֿܼ� �����͸� �Է��ϼ��� >>> : ");
		Scanner sc = new Scanner(System.in); // Scanner ����ϸ� �ֿܼ� �� �� �ִ�. -> �̸� �α�(log)�� ��´ٰ� �Ѵ�.
		// Q) Scanner ���� �����ϱ�
		try
		{
			int x = sc.nextInt(); // -> int x = 1; ��ſ� �ֿܼ� ���ڸ� ���� �Է� �����ϵ���,
								  //               ��� �ٸ� ���ڸ� ������ sc.nextInt();���
			System.out.println("x >>> : " + x);
			int y = sc.nextInt();
			System.out.println("y >>> : " + y);	
			/*
			Exception in thread "main" java.lang.ArithmeticException: / by zero
			 at a.b.c.ExceptionTest_4.main(ExceptionTest_4.java:10)
			*/
			int z = x / y;
			System.out.println(x  + " / " + y + " >>> : " + z); // -> 2 / 1 >>> : 2
			/*
			�ֿܼ� �����͸� �Է��ϼ��� >>> :
			2
			x >>> : 2
			1
			y >>> : 1
			2 / 1 >>> : 2
			*/

		}

		catch (Exception e) // Arithmeticexception -> ���x ��� �ֻ���Ŭ������ Exception  ����ض�.
		{
			System.out.println("e.getMessage() >>> " + e.getMessage());
			// 2 / 1 >>> : 2 (����x ���)
			// e.getMessage() >>> / by zero (����o ���)
		}finally{ // -> �� ������ ������ Ư���ϰ� ���� ���� �������ִ�. ������ ����ȴٴ� ������ �˰� ����.
			System.out.println("finally ���� catch ���� ���� ���ο� ������� ������ ����ȴ�. >>> : ");
		}
		System.out.println("try catch �� ���� >>> : ");

	} // end of main()


} // end of ExceptionTest_4 class