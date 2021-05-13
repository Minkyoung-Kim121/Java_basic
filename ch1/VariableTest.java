package com.bigdata30.ch1;

// ���� �Լ��� �ִ� �ܼ� ���ø����̼�
// java �� ��� �ڿ��� object �̾�� �Ѵ�. 
public class VariableTest{
	
	public static void main(String args[]){
		// byte : �ڷ���(������ Ÿ��, ���� �ڷ���, primitive type)�� 
		// �����ߴ�. 	
		// b : ������ b �� �����ߴ�. 
		//   byte ������ Ÿ���� b ���������� ����ϰڴٰ� ���� �ߴ�. 
		// = ���� ������ : ���� �ʿ� �ִ� ��(���ͷ�)�� ���� b ������ 
		//               ����(�ʱ�ȭ, intializatioin) �ϼ���
		// ; : ����(statement) ���� ������ 
		// ������ �׽� ���� �����ڷ� ������ �Ѵ�. 
		byte b = 1;
		// �ֿܼ� ����ϴ� ����
		// �ڹٿ��� ���ڿ��� "" �� ���´�. 
		// + : ���ϱ� �����ڴ� ���ڿ��� ���� ���� �ְ� ���ڵ� ���� �� �ִ�.
		// ���ڿ� + ���ڸ� �ϸ� ���ڿ��� ���Ѵ�. 
		// ���ڿ� + ���ڸ� �ϸ� ���� ����� ���ڿ��̴�. 
		/*
			b >>> : 1
			3
			1+2 = 12
			1+2 = 3
		*/
		System.out.println("b >>> : " + b);
		System.out.println(1 + 2);
		System.out.println("1+2 = " + 1 + 2);
		System.out.println("1+2 = " + (1 + 2));
		//System.out.println(java.lang.Byte.MAX_VALUE);
		// java lang ��Ű���� �ִ� Ŭ������
		// java lang ��Ű������ ������� �ʾƵ� ��밡���ϴ�.
		// ������ static Ű���尡 �پ� ������ 
		// Ŭ�����̸�.������ ���� ����� �����ϴ�. 
		System.out.println("Byte.MAX_VALUE >>> : " + Byte.MAX_VALUE);
		//System.out.println(java.lang.Byte.MIN_VALUE);
		System.out.println("Byte.MIN_VALUE >>> : " + Byte.MIN_VALUE);
	
		// static byte MAX_VALUE  
		// static Ű����� �ڿ� ���� ������ �޸𸮿� �÷��޶�� Ű����
		// �׷��� jvm(Java Virtual Machine)�� �ش� �ڿ��� 
		// �޸𸮿� �÷��ش�. 
		// byte �ش� �ڿ��� �������� byte �̴�. 
		// MAX_VALUE : �����ε� �̷� ������ ���(Constant Variable) 
		// ��� �Ѵ�. 
		// ��� �������� �׽� �빮�� �̸� _(under soare, under bar)�� 
		// �ٿ��� ����Ѵ�. 
		// ����� �����ϸ� �ȵȴ�.(�Ϻη� �����ϸ� ������ �Ǳ⵵ ��)
		byte bateMAX = Byte.MAX_VALUE;
		System.out.println("bateMAX >>> : " + bateMAX);
		// static byte MIN_VALUE  
		byte bateMIN = Byte.MIN_VALUE;
		System.out.println("bateMIN >>> : " + bateMIN);
	
		//byte bMax = 128; �̰� �Ѿ���� �ȵȴ�.
		byte bMax = 127;
		System.out.println("bMax >>> : " + bMax);
		// static String toBinaryString(int i) 
		System.out.println("toBinaryString(bMax) >>> : " 
			               + Integer.toBinaryString(bMax));
		// static String toOctalString(int i)  
		System.out.println("toOctalString(bMax) >>> : " 
		                   + Integer.toOctalString(bMax));
		// static String toHexString(int i)  
		System.out.println("toHexString(bMax) >>> : " 
		                   + Integer.toHexString(bMax));
		
	} // end of main()
} // end of VariableTest class



