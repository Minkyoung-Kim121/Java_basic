package com.bigdata30.ch2;

// <�䱸����>
// ��Ģ���� �ܼ� ���ø����̼��� ������.
// �����ʹ� ������ ����Ѵ�.
// �����ʹ� ����� �μ��� �޴´�.(�����ʹ� 2���� ���.)
// �����ڴ� ���ø����̼ǿ��� �ʱ�ȭ �Ͽ� ����Ѵ�.
// ��Ģ������ ������ �Լ��� �������ּ���.
// �Լ��� ���������� �����մϴ�.
public class MathTest_1{

	// ���ϱ�
	public int addMethod(int x, int y){
		return x + y;
	}
	// ����
	public int subMethod(int x, int y){
		return x - y;
	}
	// ���ϱ�
	public int mulMethod(int x, int y){
		return x * y;
	}
	// ������
	public int divMethod(int x, int y){
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
			MathTest_1 mt1 = new MathTest_1();
			System.out.println("���ϱ� >>> : " + mt1.addMethod(x,y));
			System.out.println("���� >>> : " + mt1.subMethod(x,y));
			System.out.println("���ϱ� >>> : " + mt1.mulMethod(x,y));
			System.out.println("������ >>> : " + mt1.divMethod(x,y));
			// ���� �� �޾Ƽ� ����غ���
			int add = mt1.addMethod(x,y);
			System.out.println("���ϱ� >>> : " + add);
			int sub = mt1.subMethod(x,y);
			System.out.println("���� >>> : " + sub);
			int mul = mt1.mulMethod(x,y);
			System.out.println("���ϱ� >>> : " + mul);
			int div = mt1.divMethod(x,y);
			System.out.println("������ >>> : " + div);
		}else{
			System.out.println("��Ģ���꿡 �ʿ��� ������ 2���� �Է����ּ��� >>> : ");
		}
		
	} // end of main()
} // end of MathTest_1 class