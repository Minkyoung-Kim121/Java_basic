package com.bigdata30.ch2;

// <�䱸����>
// ��Ģ���� �ܼ� ���ø����̼��� ������.
// �����ʹ� ������ ����Ѵ�.
// �����ʹ� ����� �μ��� �޴´�.(�����ʹ� 2���� ���.)
// �����ڴ� ���ø����̼ǿ��� �ʱ�ȭ �Ͽ� ����Ѵ�.
public class MathTest{

	public static void main(String args[]){

		// Validation : if���� ����Ѵ�. (�������� ���ݿ� �°�)
		System.out.println("" + args[0]);
		System.out.println("" + args[1]);
		// �ܼ� ���ø����̼� �ܺο��� �޾ƿ��� �����ʹ� String �迭�̴�. (���ڿ�)
		// ��Ģ������ �ϱ� ���ؼ��� ����(����)�� �ʿ�.(���ڴ� ��Ģ������ �ȵȴ�.)
		// ->���ڿ��� ���ڷ� ġȯ(����ȯ) �ؾ��Ѵ�.
		// ��, ���ڿ��� ���ڼ��ڿ��� �Ѵ�.
		// Integer.parseInt(String s)

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		System.out.println("x >>> : " + x);
		System.out.println("y >>> : " + y);
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
	} // end of main()
} // end of MathTest class