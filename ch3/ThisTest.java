package a.b.c;

public class ThisTest{
	// ���� ����
	String str;
	int iVal;

	// ������ 1 �Ű������� x
	public ThisTest(){
	// public ThisTest(){} -> ThisTest Ŭ������ ������.
	// ������ �����ε�   ???
	// this() �Լ� -> �ٸ� �����ڸ� ȣ�� �����ϴ�.
		this("�ӻ��̴� ����", 3); 
		// ������ �ȿ�, this() �Լ�; ���
		// this() �Լ� �ȿ� "�ӻ��̴� ����", 3 ����??
		System.out.println("ThisTest() >>> : ");
		// ThisTest() >>> : ?? �� ����??
	}

	// ������ 2 �Ű������� String 1��(str)
	public ThisTest(String str){
		// this() �Լ��� Ŭ�������� �����ε��� �ٸ� �����ڸ� ȣ���Ѵ�.
		// �������� �Ű������� ���缭 ���
		this(27);
		// -> this()�Լ� �ȿ� int�� 27�� �ֱ� ������ String�� �ƴ� int, �� 33���� ���.
		// -> ���� this(���ڿ�) : String�� 39�� ���.
		// -> ������ �ȿ� ù��° �ٿ� ���. 29�࿡ ���� ����.
		//this() �Լ��� �������� ù��° �������θ� ��� �Ѵ�.
		//(������ �ȿ��� ù��°�� 1���� �� �� ����)
		System.out.println("ThisTest(String str) >>> : " + str);
		// ThisTest(String str) >>> : ��ΰ�
		this.str = str;
	}

	// ������ 3 �Ű������� int 1��(iVal)
	public ThisTest(int iVal){
		System.out.println("ThisTest(int iVal) >>> : " + iVal + "��");
		// ThisTest(String str, int iVal) >>> : ��ΰ�:27��
		this.iVal = iVal;
		// iVal �� �ʱ�ȭ;
	}

	// ������ 4 �Ű������� String 1��(str), int 1��(iVal) -> �� 2��
	public ThisTest(String str, int iVal){
		System.out.println("ThisTest(String str, int iVal) >>> : " + str + ":" + iVal + "��");
		// ThisTest(String str, int iVal) >>> : ��ΰ�:27��
		this.str = str;
		// str�� �ʱ�ȭ;
		this.iVal = iVal;
		// iVal�� �ʱ�ȭ;
	}

	//�Լ�
	public void thisPrint(){
		System.out.println(this + "�ּҰ��ּҰ�"); //   ..?
	}

	//main()
	public static void main(String args[]){
		ThisTest tt = new ThisTest();
		// () �Ű������� ���� ������1 ȣ��
		System.out.println("tt.str >>> : " + tt.str);
		// tt.str >>> : �ӻ��̴� ����
		System.out.println("tt.iVal >>> : " + tt.iVal);
		// tt.iVal >>> : 3
		System.out.println("tt >>> : " + tt);
		// tt >>> : a.b.c.ThisTest@15db9742
		tt.thisPrint();
		// a.b.c.ThisTest@15db9742
		// .thisPrint() �Լ� : �ּҰ��� ��ȯ�ϴ� �Լ�

		ThisTest tt1 = new ThisTest("��ΰ�");
		// ("String") �Ű������� 1��(str) �ִ� ������ 2 ȣ��
		System.out.println("tt1.str >>> : " + tt1.str);
		// tt1.str >>> : ��ΰ�
		System.out.println("tt1.iVal >>> : " + tt1.iVal);
		// tt1.iVal >>> : 27
		System.out.println("tt1 >>> : " + tt1);
		// tt1 >>> : a.b.c.ThisTest@6d06d69c   �ּҰ�
		tt1.thisPrint();
		// a.b.c.ThisTest@6d06d69c

		ThisTest tt2 = new ThisTest("��ΰ�", 27);
		// ("String", int) �Ű������� 2��(str, iVal) �ִ� ������ 3 ȣ��
		//  ȣ�������ϱ� ThisTest(str, iVal){} �����ڷ� �ö󰡼� �� ���� ���� ���ư���.
		System.out.println("tt2.str >>> : " + tt2.str);
		// tt2.str >>> : ��ΰ�
		System.out.println("tt2.iVal >>> : " + tt2.iVal);
		// tt2.iVal >>> : 27
		System.out.println("tt2 >>> : " + tt2);
		// tt2 >>> : a.b.c.ThisTest@7852e922
		tt2.thisPrint();
		// a.b.c.ThisTest@7852e922

	}
}