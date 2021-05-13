package com.bigdata30.ch1;

// ����� ���Ƿ� ���� Ŭ���� : �̸��� VarDefaultValue

/*
A)�ڹ� �ܼ� ���ø����̼� �ε� ����
1.�������� �Ѵ�.(javac -d . VarDefaultValue.java)
2.����.(java com.bigdata30.ch1.VarDefaultValue)
3.ClassLoader Ŭ�������� init()�Լ��� ȣ���Ѵ�.
4.init()�Լ��� ��ũ�� �ν��Ͻ��ϰ� ���� Ŭ������ main()�Լ��� ȣ���Ѵ�. <-main()�� ������.
5.�ش� Ŭ������ �ҽ� ���Ͽ� �⺻ ������(Ŭ�����̸�())�� �ڵ尡 �ۼ�/��� �Ǿ� ���� ������
  jvm(�ڹٹ��x�ӽ�)�� �޸𸮻󿡼� �⺻ ������(default contructor)�� ����� ������,
  ���� �⺻ �����ڴ� ��������� ����� ������ default value�� �ʱ�ȭ�ϴ� ������ �Ѵ�.
��, �ڹٴ� �����ڰ� ������ ���� ���Ѵ�.

B)Ŭ���� ���� ��Ģ) main() ȣ�� -> ������() ȣ�� (�ݵ�� ���Ѿ� �ϴ� ��Ģ)
������()ȣ���� ����) �ش� �ڿ��� ������� �ʱ�ȭ : default value(�⺻��)
��,new �ϵ�/�� �ϵ� ������ default value(�⺻��) �����ؾ� �Ѵ�.

B-1)����Ʈ ��/�⺻��(default value) : �ϱ�
byte, short, int, long : 0
char : ���� : ' ', '\u0000' <-�����ڵ�� ���ڸ� ǥ���� ��.
float, double : 0.0
boolean : false
String �� ������ ���� : null

C)�⺻ �����ڶ�?
C:\00.KOSMO72\00.JExam\com\bigdata30\ch1>javap com.bigdata30.ch1.VarDefaultValue
Compiled from "VarDefaultValue.java"
public class com.bigdata30.ch1.VarDefaultValue {
  int i;
  public com.bigdata30.ch1.VarDefaultValue(); <-�⺻ �������� ���!
  public static void main(java.lang.String[]);
}
*/

public class VarDefaultValue{

	int i;

	// ������()
	// �ڹ��ڵ� �ۼ� �� ��Ģ) ������ �Ű������� ���� �⺻ �����ڸ� �� �ҽ��ڵ忡 ����ؾ� �Ѵ�.
	//                   ���� p.154
	VarDefaultValue(){
		System.out.println("����� ���Ƿ� ���� �Ű������� ���� �⺻������");
	 }
	
	public static void main(String args[]){
	
		VarDefaultValue vdv = new VarDefaultValue();
		System.out.println("�������� vdv �� ������� i�� ȣ���Ѵ�. >>> : " + vdv.i);

	} // end of main()
} // end of VarDefaultValue class