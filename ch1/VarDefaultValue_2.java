package com.bigdata30.ch1;

public class VarDefaultValue_2{
// ����) �����ڴ� 5��,(main()�� ����)

	int i;
	String s;
	// �Ű������� ���� �⺻ ������
	public VarDefaultValue_2(){
		System.out.println("VarDefaultValue_2() >>> : ");
	}
	// �Ű������� 1�� �ִ� ������
	public VarDefaultValue_2(int i){
		System.out.println("VarDefaultValue_2(int i) >>> : " + i);
		//this Ű���� : ��� ���/��ũ��Ʈ(��ü����)���� ���� �ڱ� �ڽ��� ��Ī�Ѵ�.
		//this.i : ���� �ν��Ͻ��� ��������� ��Ī�Ѵ�.
		//i : VarDefaultValue_2(int i)�� �Ű����� i�� �����ڿ��� �����ϴ� ����.(������ ����)
		//VarDefaultValue_2(int i)���� i�� �Ű�����
		this.i = i;
	}
	// �Ű������� 2�� �ִ� ������
	public VarDefaultValue_2(int i, String s){
		System.out.println("VarDefaultValue_2(int i, , String s) >>> : " + i);		
		System.out.println("VarDefaultValue_2(int i, , String s) >>> : " + s);		
		this.i = i;
		this.s = s;
	}
	public static void main(String args[]){	
		//�������� v_2�� �Ű������� ���� �⺻�����ڸ� ȣ���Ѵ�.
		VarDefaultValue_2 v_2 = new VarDefaultValue_2();
		System.out.println("v_2.i >>> : " + v_2.i);
		System.out.println("v_2.s >>> : " + v_2.s);
		//�������� v_2_1�� �Ű������� 1�� �ִ� �����ڸ� ȣ���Ѵ�.
		VarDefaultValue_2 v_2_1 = new VarDefaultValue_2(10);
		System.out.println("v_2_1.i >>> : " + v_2_1.i);
		System.out.println("v_2_1.s >>> : " + v_2_1.s);
		//�������� v_2_2�� �Ű������� 2�� �ִ� �����ڸ� ȣ���Ѵ�.
		VarDefaultValue_2 v_2_2 = new VarDefaultValue_2(10, "�׽�Ʈ");
		System.out.println("v_2_2.i >>> : " + v_2_2.i);
		System.out.println("v_2_2.s >>> : " + v_2_2.s);

	} // end of main()
} // end of VarDefaultValue_2 class