package com.bigdata30.ch1;
// �ڹٴ� ����, ��, ������ ����̴�.
// {} : �극�̽� ������ ������ �ִ�.(�� �ȿ��� ����� �� �� �� �ִ�.)

// public class VarTest{} : ����� ���Ƿ� ���� Ŭ����.
//                          '�� Ŭ���� �̸��� VarTest�̴�.'
// ���� ���¿��� VarTest Ŭ������ �ִ� �ڿ�(������)�� ������� int i �̴�.
// ��������� ��ȿ������ Ŭ���� ����(VarTest{})�̴�.
// ���� p.191

public class VarTest{
	// ����
	// ������� : �Լ� �۰� Ŭ���� �ȿ��� ������ ������ ���������� �Ѵ�.
	// ������� ��Ģ) ���������� �̿��ؾ� �� �� �ִ�.
	//             ���������� new Ű���带 �̿��� �����.
	//����) Ŭ������ �ν��Ͻ��ؼ� ��������(new)�� ����� �������� �����ϸ� ��� �����ϴ�.
	//static int i;
	int i;
	// static ������ �ٸ� ���� Ŭ���� ������� �Ѵ�.
	static int ii;
	// �������
	int iii;


	public static void main(String args[]){
		// ����
		// �������� : �Լ� �ȿ��� ������ ������ �ǹ�. (�� �ʱ�ȭ�� �ʿ��ϴ�.)
		// �������� ��Ģ) ���������� �����ϰ� ������ �ʱ�ȭ �� �ص� �ȴ�.
		//             but, ����Ϸ��� �ϸ� �ݵ�� �ʱ�ȭ�� �ʼ�!
		//����) ���������� �Լ� �ȿ��� �¾�� �Լ� �ȿ��� ����Ѵ�.
		//     �������� ����̶�) �����ڰ� ���ִ� ���� �ƴ϶� jvm�� �������÷��͸� �̿��Ͽ� ���ִ� ��.
		int i = 1;

		/*
		System.out.println("" + i); <- �̷��� �����ؼ� ������ ���� �� �ݵ�� ������ ����.
			C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javac -d . VarTest.java
			VarTest.java:13: error: variable i might not have been initialized
							System.out.println("" + i);
													^
			1 error
		*/
		System.out.println("�������� int i >>> : " + i);
		//System.out.println("������� int i >>> : " + VarTest.i);
		VarTest vt = new VarTest();
		System.out.println("new �ν��Ͻ��� ���������� ������� int i�� " 
			                + "�����ؼ� ����Ѵ�. >>> : " + vt.i);
		System.out.println("Ŭ�������� >>> : " + VarTest.ii);
		/*
			C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javac -d . VarTest.java
			VarTest.java:48: error: non-static variable iii cannot be referenced from a static context
                System.out.println("������� int iii >>> : " + iii);
                                                           ^
			1 error
		*/
		//System.out.println("������� int iii >>> : " + iii);
		System.out.println("������� int iii >>> : " + vt.iii);

	} // end of main()

} // end of VarTest class