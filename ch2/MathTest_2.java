package com.bigdata30.ch2;

// <�䱸����>
// ��Ģ���� �ܼ� ���ø����̼��� ������.
// �����ʹ� ������ ����Ѵ�.
// �����ʹ� ����� �μ��� �޴´�.(�����ʹ� 2���� ���.)
// �����ڴ� ���ø����̼ǿ��� �ʱ�ȭ �Ͽ� ����Ѵ�.
// ��Ģ������ ������ �Լ��� �������ּ���.
// �Լ��� static Ű����� ���� �����մϴ�.(����ƽ �Լ��� �ٲٶ�� ��)
public class MathTest_2{

	// ���ϱ�
	public static int addMethod(int x, int y){
		return x + y;
	}
	// ����
	public static int subMethod(int x, int y){
		return x - y;
	}
	// ���ϱ�
	public static int mulMethod(int x, int y){
		return x * y;
	}
	// ������
	public static int divMethod(int x, int y){
		return x / y;
	}

	public static void main(String args[]){
		// Validation : if���� ����Ѵ�. (�������� ���ݿ� �°�)
		if (2 == args.length)
		{
			System.out.println("" + args[0]);
			System.out.println("" + args[1]);

			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("x >>> : " + x);
			System.out.println("y >>> : " + y);
			/*
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x * y);
			System.out.println(x / y);
			*/
			MathTest_2 mt1 = new MathTest_2();
			System.out.println("���ϱ� >>> : " + MathTest_2.addMethod(x,y));
			System.out.println("���� >>> : " + MathTest_2.subMethod(x,y));
			System.out.println("���ϱ� >>> : " + MathTest_2.mulMethod(x,y));
			System.out.println("������ >>> : " + MathTest_2.divMethod(x,y));
			// ���� �� �޾Ƽ� ����غ���
			int add = MathTest_2.addMethod(x,y);
			System.out.println("���ϱ� >>> : " + add);
			int sub = MathTest_2.subMethod(x,y);
			System.out.println("���� >>> : " + sub);
			int mul = MathTest_2.mulMethod(x,y);
			System.out.println("���ϱ� >>> : " + mul);
			int div = MathTest_2.divMethod(x,y);
			System.out.println("������ >>> : " + div);
		}else{
			System.out.println("��Ģ���꿡 �ʿ��� ������ 2���� �Է����ּ��� >>> : ");
		}
		
	} // end of main()
} // end of MathTest_2 class