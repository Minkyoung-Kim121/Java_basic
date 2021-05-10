package a.b.c;


public class ClassName extends Object{

	public void aM(){
		System.out.println("aM()");
	}
	
	public static void main(String args[]){
		
		ClassName cn = new ClassName();
		System.out.println("cn �������� >>> : " + cn);
		System.out.println("cn.getClass() >>> : " + cn.getClass());
		System.out.println("cn.getClass().getName() >>> : " + cn.getClass().getName());

		Object obj = new ClassName();
		System.out.println("obj �������� >>> : " + obj);
		// �θ�Ŭ���� obj ���� �ڽ�Ŭ���� ClassName �� �������� ��
		// obj ���� ClassName ĳ���� �� ��
		// obj ���� ClassName ���� ��ü ����ȯ �Ѱ�

		ClassName cn1 = (ClassName)obj;
		System.out.println("cn1 �������� >>> : " + cn1);
		System.out.println("cn1.getClass() �������� >>> : " + cn1.getClass());
		System.out.println("cn1.getClass().getName() �������� >>> : " + cn1.getClass().getName());

		
		try
		{
			Class cc = Class.forName("a.b.c.ClassName");
			System.out.println("cc >>> : " + cc);
			ClassName cc11 = (ClassName)cc.newInstance();
			cc11.aM();
		}
		catch (Exception c)
		{
			System.out.println("c >>> : " + c);
		}

	}



}