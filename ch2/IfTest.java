package com.bigdata30.ch2;

/*
Flow Control
A)if�� : �б⹮�̶�� �Ѵ�.��
    ����)������/����(���ǽ�)�� ����� true�� ���� ����ȴ�.��
    Ư¡)�Լ� �ȿ��� ����Ѵ�. (�Լ� ���� ���������� ���)��
	����)if ���� ����� false �϶��� else ���� ����ȴ�.  -�ϱ��
		-> if ���� �ִ� ���������� ����� false �϶��� else ���� ����ȴ�.  -�ϱ��
		-> if ���� �������ǿ� �ش��� �� �Ǵ� ���� �ƹ� ���谡 ����.  -�ϱ��
*/
public class IfTest{

	public static void main(String args[]){
		System.out.println("main() �Լ� ����");
		if (true)
		{
			System.out.println("if �� ���� ����� true �̴�.");
		}
		System.out.println("if(true) �� ���� ");
		if (false)
		{
			System.out.println("if �� ���� ����� true �϶��� ����ȴ�.");
		}else{
			System.out.println("if �� ���� ����� false �϶��� ����ȴ�.");
		}
		if (true){
			System.out.println("if �� ���� ����� true �̴�.2222 ");
		}
		System.out.println("if(false) �� ���� ");

	} // end of main()
} // end of IfTest class