package a.b.c.d;

import java.util.Date;
public class A extends B implements C{

/* -> extends �� �ϸ�(�ν��Ͻ��� �� �ϸ�), �������̵��� x -> error
A.java:3: error: A is not abstract and does not override abstract method b() in B
public class A extends B{
       ^
1 error
*/

// ��� ���迡�� �ڿ�����ϱ�
// Ŭ���� ���)
//         �ڽ�Ŭ���� �����ؼ� �ڽ��������� ���� (�ڽ� �������� = new �ڽ�) -> �ڽ� �ν��Ͻ� �ϱ�
//                                    (�ڽ�.��������)�� �ڿ� ����ϱ�
// �������̽� ���)
//         �θ�Ŭ���� �����ؼ� (�θ� �������� ���� = new �ڽ�) �ν��Ͻ��ϱ�
//                      (�θ�.����������) �θ� ����� �ڿ��� �����ؼ�
//                      ������ �ڿ��� �������̵��Ͽ� ������ �ڿ��� ����ϱ�
	//����
	
	//������

	// �Լ�
	public void a(){
		System.out.println("A class a() �Լ�");
	}

	@Override // �ڹٿ��� @���ڿ� ���� ������ ������̼�(annotation)�̶�� �Ѵ�.
			  // ��� : ������ ǥ���ϴ� ��, ������ �϶�� �ϴ� ��
			  // @override : �ش� �Լ��� ���� Ŭ�������� �������̵� �ߴٴ� ���� �ǹ�.
	public void b(){
		System.out.println("A class b() �Լ�");
	} // -> extends B class -> b()�Լ� + {}

	@Override // -> ����δ� �ּ��� �ǹ�����, �ڹٿ����� �ּ��� x
	public void c(){
		System.out.println("A class c() �Լ�");
	}
	
	@Override
	public void cc(){
		System.out.println("A class cc() �Լ�");
	}

	// main
	public static void main(String args[]){
	
	A aa = new A(); // -> (�ڽ� �������� = new �ڽ�)
	aa.a(); // -> �Լ��� ����ִ� Ŭ������ �� ���ε��� �ν��Ͻ��ؾ��Ѵ�.

	C ccc = new A(); // -> new B �ȵȴ�. : B�� abstract �̱� ����
					 //                  (�߻� Ŭ������ �ν��Ͻ� �Ұ���.)
					 // -> �տ� �ִ� Ŭ������ �����;� 
					 // (�θ� �������� ���� = new �ڽ�)
	ccc.c(); // -> (�θ�.����������)�ڿ� ���
	ccc.cc();
	C.cM();
	ccc.ccM();

//  B b = new B(); -> �߻� Ŭ������ �ν��Ͻ��� �� �� ����.
	B b = new A(); 
	b.b();
	String bb = B.bb();
	System.out.println("b >>> " + bb);
	java.util.Date bbb = B.getInstance();
	System.out.println("bbb >>> : " + bbb);
//	System.out.println("new java.util.Date() >>> : " + new java.util.Date());
	System.out.println("new Date() >>> : " + new Date());
	
	}

}

abstract class B
{
	public abstract void b();
	public static String bb()
	{
		return "bb()";
	}
	public static Date getInstance()
	{
		return new Date();
	}
}

interface C
{
	public void c(); // -> public abstract void c(); 
	public abstract void cc(); // -> interface Ŭ������ �ִ� �Լ��� abstract�� ����ϵ� �� �ϵ� �߻�Ŭ������.
	public static void cM(){
		System.out.println("cM() >>> : ");
	}
	public default void ccM(){
		System.out.println("ccM() >>> : ");
	}
}