package a.b.c;

/*
�������̽� Ŭ������
�ҿ����� �߻�Ŭ������ ������ Ŭ������ �����̸�
�������̽��� ����� Ŭ�������� ����ü�� �ϼ��Ͽ� ����϶�� �ǹ̰� �ִ�.
�������̽��� ����� Ŭ������
�������̽��� �ִ� �Լ�(�߻��Լ� -> {}�� ���� �Լ�) ��θ�
����� Ŭ������ �������̵�(overrinding)�ؼ�
�Լ��� {}�� ����� ����ؾ� �Ѵ�.

<���> �������̽� ���
���� ���
�������̽� ����� Ű����� implements
���߻����
 -> �ڽ�Ŭ���� implements �ڿ� �������̽� �̸�(�θ�)�� ,(csv:comma-separaten values) �����ڷ�
���� �� �����ϴ� ���̴�. ex) lalalal.csv
csv -> Concurrent Versioning System.
ex) A implements Ainterface_1, Binterface();, Cinterface

����ϴ� ����
-> �ڿ��� ����ϱ� ���ؼ�

�������̽����� �������̽� ����� ����� ���� extends Ű���带 ����Ѵ�.
interface Cinerface extends Dinterface

*/
public class AInterface implements Ainterface_1, Binterface, Cinterface{

	public void a(){
		System.out.println("Ainterface_1 �������̽� Ŭ�������� �������̵��� a()�Լ� �Դϴ�.");
		System.out.println("Ainterface_1 �������̽� Ŭ�������� a()�Լ��� {}�� ���µ�");
		System.out.println("�������̵��� a()�Լ��� AInterFace �ڽ� Ŭ�������� a() �Լ��� {}�� �߰��Ͽ� �����ؾ� �Ѵ�.");
	
	}
	public void aa(){
	
		System.out.println("aa()");

	}
	public void b(){
	
		System.out.println("b()");

	}
	public void c(){
	
		System.out.println("c()");

	}
	public void d(){
	
		System.out.println("d()");

	}

	public static void main(String args[]){
	
	AInterface ai = new AInterface(); // -> �ڽ� Ŭ������ new Ű���带 �̿��ؼ� �ν��Ͻ� ��.
									  // -> �ڽ��� ���������ؼ� �ڽ��� �ν��Ͻ� �� ��.
									  //    extends �� ������� �� ���
	ai.a();
	ai.aa();
	ai.b();
	ai.c();
	ai.d();
	
	Ainterface_1 ai1 = new AInterface(); // -> �̰� �� ���ϴ�
										 // -> �θ� ���������ؼ� �ڽ��� �ν��Ͻ� �� ��.
										 //    interface ����� Ư¡ (implements Ű���� ���)
	ai1.a();

	}
}


// �������̽� ����, ����Ϸ��� �ϸ�
// �θ�, �ڽ� Ŭ���� �־��
// new Ű���� �̿��ؼ� �ڽ� Ŭ������ �ν��Ͻ�


interface Ainterface_1
{
	// �������̽� Ŭ������ �����ϴ� �Լ��� 
	// {} (�극�̽�) ���� ���� ���� �ʴ�.
	public void a();
	public void aa();
}

interface Binterface
{
	public void b();
}

interface Cinterface extends Dinterface
{
	public void c();
}

interface Dinterface
{
	public void d();
}