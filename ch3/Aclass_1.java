package a.b.c;

import a.b.c.d.BbClass_1; // import ��Ű���� Ŭ������

/*
<���>
Ŭ���� ����� ���� ���(Single Inheritance)
extends Ű���� ���
���� ����� �ǹ̴� extends Ű���� �ڿ� Ŭ������ �ϳ��� �´�.

����� �ڹ� ���� �����ϸ�
is a relationship
A extends B -> A�� B�̴�.
*/

public class Aclass_1 extends AaClass_1{
// single inheritance ->Ŭ������ �ΰ� ���� �� �ȴ�.
// ex) public class Aclass_1 extends Aaclass_1, Bbclass_1 -> x
	
// ������


// main()
	public static void main(String args[]){
		System.out.println("Aclass_1() ������");
		
	// Aclass_1���� ���� ��Ű���� �ִ� 
	// Aaclass_1 Ŭ������ ����ϱ� ����
	// Ŭ���� ����� ���
	// �ڹٿ��� Ŭ���� ����� extends Ű���带 ����ϸ�
	// ���� ���(single inheritance)�̴�.
	// �ڽ�Ŭ���� extends �θ�Ŭ���� <- ���·� ����Ѵ�.
	// �ڽ�Ŭ�������� ��� ���·� ������ ����
	// �ڽ� Ŭ������ new �����ڷ� �ν��Ͻ��ؼ� ����Ѵ�.

	// �ڽ� Ŭ������ �����ϰ�
	// ���������� ������ ��
	// new ������ �ϸ�
	// �ڽ� Ŭ������ ã�Ƽ� �ν��Ͻ� �Ϸ��� �õ��ϴµ�
	// ��Ӱ����̸�
	// �θ� Ŭ������ �����ڸ� ���� ã�Ƽ� �޸𸮿� �ø���.
	// �ڽ� Ŭ������ �����ڸ� �޸𸮿� �ø���.
	Aclass_1 ac1 = new Aclass_1();
	// �ν��Ͻ��� �Ϸ�Ǹ�
	// �ڽ� Ŭ������ ���� ������
	// �θ� Ŭ������ �ڿ��� ����� �� �ִ�.
	ac1.AaClass_1();
	// ���� �ڽ� Ŭ���� Aclass_1����
	// aaClass_1()�Լ��� ���µ�
	// ����ϰ� �ִ� �θ� Ŭ������ ã�ư���
	// �ش� �Լ��� �ִ��� ã��
	// �Լ��� ������ ȣ���Ѵ�. -> ��� ���迡���� �Ʒ����� ���� ã���� ��.
	
	ac1.aaClass_1();

	} // end of main()

} // end of AClass_1 class

class AaClass_1 extends  a.b.c.d.BbClass_1
{
	public void AaClass_1(){
		
		System.out.println("AaClass_1 ������");
	}
	
	public void aaClass_1(){
		
		System.out.println("AaClass_1 aaClass_1() �Լ�");
	}
}

/*

*/