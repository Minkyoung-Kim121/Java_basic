package a.b.c;

import a.b.c.d.BbClass; // import ��Ű���� Ŭ������
public class Aclass{

	public static void main(String args[]){
		
		// Aaclass ���� 1)���� ��Ű�� ���ο� �ִ�
		// AaClass�� ����ϱ� ���Ͽ� new �����ڸ� �̿��� �ν��Ͻ� ��.
		AaClass aa = new AaClass();
		// �������� aa�� 
		// AaClass �� �ִ� aaClass()�� ȣ�� ��(invoke)
		aa.aaClass();
	
		// Aclass ���� 2)�ٸ� ��Ű���� �ִ�
		// Aclass a.b.c
		// Bbclass a.b.c.d
		// Bbclass�� ����ϱ� ���ؼ� new �����ڸ� �̿��� �ν��Ͻ� ��.
		// ����) �ٸ� ��Ű���� �ִ� Ŭ���� import �ϱ� -> import �� new �� ����.
		a.b.c.d.BbClass bb = new a.b.c.d.BbClass();
		BbClass bb1 = new BbClass();
		// �������� bb��
		// bbClass�� �ִ� bbClass()�� ȣ�� ��(invoke)
		bb.bbClass();
		bb1.bbClass();
// �������� Aclass BbClass ���ÿ�, ������ Aclass


	} // end of main()

} // end of BbClass class

class AaClass
{
	public AaClass(){
		
		System.out.println("AaClass ������");
	}
	
	public void aaClass(){
		
		System.out.println("AaClass aaClass() �Լ�");
	}
}