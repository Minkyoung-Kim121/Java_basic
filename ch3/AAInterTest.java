package a.b.c;

interface AAInter{ // �θ� Ŭ����
/*
	public void aaM();

	public void bbM(String str);

	public String ccM();

	public void ddM();
*/

		public abstract void aaM();
		public abstract void bbM(String str);
		public abstract String ccM();
		public abstract void ddM();

}



public class AAInterTest implements AAInter // �ڽ� Ŭ����, �ڿ��� �� ����. �θ����� ��ӹ޾� ����ϴ� Ŭ����
{
	// ���� -> �׻� ����, ������, �Լ�, ���� ��Ģ ���Ѽ� ���!

	// ������

	// �Լ�

	public void aaM(){
		System.out.println("aaM()");
	}
		

	public void bbM(String str){
		System.out.println("bbM()" + str);
	}

	public String ccM(){
		System.out.println("ccM() >>> : ");

		return "ccM()";
	}

	public void ddM(){
		System.out.println("ddM() >>> : ");


	}

	// ����
	public static void main(String args[]){ // -> �Ϲ������� �Լ� �ȿ��� �Լ��� ���°�(�� �����ϴ°�) �ƴϴ�.
		
		AAInter aai = new AAInterTest();
		aai.aaM();
		aai.bbM("�ƾƾ�");
		String ccm = aai.ccM();// ���ϰ� �޾Ƽ� ����ϱ�
//		System.out.println(aai.ccM()); -> �̷��� �������� �� �� �Լ����� 
		aai.ddM();


	}
}

// ��Ӱ���
