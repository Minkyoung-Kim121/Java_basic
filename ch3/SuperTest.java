package a.b.c;

class SuperClass{ // extends Object  //�θ�
	public String str = "aaa";

	//������
	public SuperClass(){
		this("��ī ����");
		System.out.println("SuperClass() >>> : ");
	}

	public SuperClass(String str){
		System.out.println("SuperClass(String str) >>> : " + str);

	}

	public SuperClass(String str, int iVal){
		System.out.println("SuperClass(String str, int iVal) >>> : " + iVal + "��");
	}

}


public class SuperTest extends SuperClass{ // -> SuperTest �ڽ�, SuperClass �θ�

	public String str ="bbb";
	//public String str;

	//������
	public SuperTest(){ // -> super() �Լ��� ����Ŭ������ �θ��� �����ڸ� �ҷ���.

		//this�Լ�, super�Լ�
		//1) ������ �ȿ����� ����Ѵ�
		//2) �� ������ ���� ù��° statement�� ������ ��
		super(); // -> �Լ� �ȿ� �����̱� ������ �θ��� SuperClass �������� ��ī���� ���.
		System.out.println();
	}

	public SuperTest(String str){
		System.out.println("SuperTest(String str) >>> : ");
	}

	//�Լ�
	public void printlnfo(){
		System.out.println("str >>> : " + str);
		System.out.println("super.str >>> : " + super.str); // -> �θ� Ŭ������ str �ҷ���
//		System.out.println("super >>> : " + super); -> error '_' expected
	}

	//�����Լ�
	public static void main(String args[]){
		
		SuperTest st = new SuperTest(); // �Ű������� ã�ƴٴϸ鼭 ȣ����
		st.printlnfo();


	}
}