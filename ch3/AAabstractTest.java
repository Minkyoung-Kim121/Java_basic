package a.b.c;

abstract class AAabstractClass{

	public abstract void aaM();

}

public class AAabstractTest extends AAabstractClass
{
	//����
	//������
	//�Լ�
	public void aaM(){
		System.out.println("aaM()");
	}
	//����
	public static void main(String args[]){

	//�Լ� �ȿ��� �Ϲ������� �Լ��� ���°� �ƴϴ�.
	AAabstractClass aaa = new AAabstractTest();
	aaa.aaM();
	
	}
}