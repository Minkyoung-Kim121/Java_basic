package com.bigdata30.ch1;

public class MethodTest_2{
	// �Լ� �����
	// aMethod() �Լ��� ������ void
	// void �Լ� : �Լ����� ������ ���� ���� �� ����Ѵ�.
	// �Լ����� ������(void �Ǵ� �ڹ� �ڷ���)�� �� ����ؾ� �Ѵ�. 
	public static void aMethod(){
		System.out.println("aMethod() �Լ� ����.");
		System.out.println("aMethod() �Լ� ��.");
		// return 0;
	}
	public static void main(String args[]){
		System.out.println("main() �Լ��� �ش� Ŭ������ �������̴�.");
		// static Ű���尡 �ִ� �Լ� �Ǵ� ������
		// �׽� Ŭ�����̸� �Ǵ� ��Ű���̸�+Ŭ�����̸�(Name Space)��
		// ��������� �ٿ��� �ش� �ڿ�(�Լ� �Ǵ� ����)�� ȣ���ؾ� �Ѵ�. 
		MethodTest_2.aMethod();
		MethodTest.aMethod();
		System.out.println("main() �Լ��� �ش� Ŭ������ ��.");
	} // end of main()
} // end of MethodTest_2 class