package com.bigdata30.ch2;

// <�䱸����>
// ��Ģ���� �ܼ� ���ø����̼��� ������.
// �����ʹ� ������ ����Ѵ�.
// �����ʹ� Scanner Ŭ������ �޴´�.(�����ʹ� 2���� ���.)
// �����ʹ� ��������� �ʱ�ȭ �Ͽ� ����Ѵ�.
// ������� �ʱ�ȭ�� �����ڸ� �̿��Ѵ�.
// �����ڴ� ���ø����̼ǿ��� �ʱ�ȭ �Ͽ� ����Ѵ�.
// ��Ģ������ ������ �Լ��� �������ּ���.
// �Լ��� ���������� �����մϴ�.(�Լ��� ���� ����� ��)

import java.util.Scanner;

public class MathTest_3{
	// �������
	int x;
	int y;

	public MathTest_3(int x, int y){
		this.x = x;
		this.y = y;
	}

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
		if (true)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("�ֿܼ� �����͸� �Է��Ͻÿ� >>> : ");
			int x = sc.nextInt();
			System.out.println("x >>> : " + x);
			int y = sc.nextInt();
			System.out.println("y >>> : " + y);

			MathTest_3 mt3 = new MathTest_3(x, y);
			System.out.println("���ϱ� >>> : " + mt3.addMethod(x,y));
			System.out.println("���� >>> : " + mt3.subMethod(x,y));
			System.out.println("���ϱ� >>> : " + mt3.mulMethod(x,y));
			System.out.println("������ >>> : " + mt3.divMethod(x,y));
			// ���� �� �޾Ƽ� ����غ���
			int add = mt3.addMethod(x,y);
			System.out.println("���ϱ� >>> : " + add);
			int sub = mt3.subMethod(x,y);
			System.out.println("���� >>> : " + sub);
			int mul = mt3.mulMethod(x,y);
			System.out.println("���ϱ� >>> : " + mul);
			int div = mt3.divMethod(x,y);
			System.out.println("������ >>> : " + div);
		}else{
			System.out.println("��Ģ���꿡 �ʿ��� ������ 2���� �Է����ּ��� >>> : ");
		}
		
	} // end of main()
} // end of MathTest_3 class