package com.bigdata30.ch2;

public class IfTest_4{

	// ����� ���� �⺻ ������
	public IfTest_4(){}

	// �������� boolean �Լ�
	public static boolean boolTest(int x, int y){
		// ��������
		boolean bool = false;

		if (x < y){
			bool = true;
		}

		return bool;
	}

	public static void main(String args[]){
		
		int x = 1;
		int y = 2;

		IfTest_4 i4 = new IfTest_4();
		boolean bool = i4.boolTest(x, y);

		if (bool)
		{
			System.out.println("�Լ��� �� ���� �Ǿ����ϴ�.");
		}else{
			System.out.println("�Լ��� �� ���� ���� �ʾҽ��ϴ�.");	
		}
	}
}