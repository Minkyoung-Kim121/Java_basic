package com.bigdata30.ch1;

public class MethodTest{

	// �Լ� �����
	// aMethod() �Լ��� �������� void
	public static void aMethod(){
		
	}
	//bMethod() �Լ��� �������� int
	public static int bMethod(){
		return 1;
	}
	// public : ����������(Access Modifier)
	//          � ��Ű���� �ִ� Ŭ�������� cMethod() �Լ��� ȣ���� �� �ִ�.
	// static : ����Ʈ�ڵ忡�� jvm�� cMethod�� ������ 
	//          �ٷ� �޸𸮿� �÷��ش�.
	//          �� �ڵ忡 static Ű���� ����� �� ����ؾ� �Ѵ�.
	// int : ������(���� �ڷ���, ���� ������Ÿ��)
	//       cMethod() �Լ��� ��� ���� int������ �Ѵٰ� ������ ��
	//       �Լ� �������� �Լ����� return Ű������ ������ Ÿ���� �����ؾ� �Ѵ�.
	// cMethod : �Լ� �̸��� cMethod 
	// () : �Լ��� �Ű������� �ִ� ���� 
	// (int i) : �Լ��� �Ű������� int ������ Ÿ������ �ϰ� 
	//           �������� i �� �����Ѵ�. 
	//           i ������ cMethod �Լ�(����, ��, ������)���� 
	//           �����Ӱ� ����� �� �ִ�. 
	// {} : Cmethod() �Լ� �� : ������ ������ ����� ����
	//      �Լ� �� �ȿ����� ���������� ������� ���� �Ѵ�. 
	// return : ���� Ű���� : �Լ� ���ο��� �� ������ ���ο� ����Ѵ�. �Ϲ�������
	//          ���� Ű���� �ڿ��� ���(����)�� ����� ��������
	//������ Ÿ���� ���ƾ� �Ѵ�.
	public static int cMethod(int i){
		return i;
	}

	public static void main(String args[]){
		System.out.println("main() �Լ��� �ش� Ŭ������ �������̴�.");
		aMethod();
		MethodTest.bMethod();
		int i = MethodTest.bMethod();
		System.out.println("i >>> : " + i);
		int ii= MethodTest.cMethod(11);
		System.out.println("ii >>> : " + ii);

	} // end of main()
} // end of MethodTest class