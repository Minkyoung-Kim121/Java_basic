package a.b.c;


public class InvokeTest_1{
	
	public boolean aM(){
		System.out.println("InvokeTest_1 aM() ���� ");
		boolean bool = false; // -> boolean ������Ÿ�� false �ʱ�ȭ

		InvokeController ci = new InvokeController(); // -> InvokeController(); (�� int��) ������ ȣ��
		int iVal = ci.invokeC(); // ->, int invokeC(); iVal ���������� �����ؼ� invokeC() ȣ��.
		// -> ���� ���� invokeC() �� ���Ƿ� ��������.

		if (iVal > 0) // Q)  boolean �ε� �� int�� �����ϳ�!?
		// 
		{
			System.out.println("iVal >>> true");
			bool = true;
		}else{
			System.out.println("iVal >>> false"); // -> iVal >>> false ��� why..?
		// Q)  iVal >>> false ��� why..? 
		//       boolean �� false ��?? ����
			bool = false;
		}

		System.out.println("InvokeTest_1 aM() �� ");
		return bool;
	}


	public static void main(String args[]){
		System.out.println("main() ���� ");
		InvokeTest_1 it1 = new InvokeTest_1(); // -> it1 ���������� �̿��Ͽ� InvokeTest_1(); ������ ȣ��
		//											�����ڴ� �Ű����� ���� �⺻ �����ڷ�
		System.out.println("it1 >>> : " + it1); // -> it1 >>> : a.b.c.InvokeTest_1@15db9742

		boolean bool = it1.aM(); // -> boolean ������ Ÿ������ aM(); ȣ���ߴ�.
		// -> ���� ���� aM() �Լ��� ���Ƿ� �ö���.

		if (bool)
		{
			System.out.println("bool �� �� �Դϴ�.");
		}else{
			System.out.println("bool �� ���� �Դϴ�."); // -> ���
		}

		System.out.println("main() �� ");

	} // end of main()

} // end of InvokeTest_1 class


class InvokeController
{
	public int invokeC(){
		System.out.println("InvokeController invokeC() ���� ");

		InvokeService is = new InvokeService(); // -> is ���������� �̿��Ͽ� InvokeService(); (������) ȣ��

		int iVal = is.invokeS(); // -> invokeS() ȣ��.
		// -> ���� ���� invokeS() �� ���Ƿ� ��������.

		System.out.println("InvokeController invokeC() �� ");

		return iVal;
	}
}


class InvokeService
{
	public int invokeS(){
		System.out.println("InvokeService invokeS() ���� ");
		InvokeDAO idao = new InvokeDAO(); // -> invokeDAO();�� idao�� ����ؼ� �ν��Ͻ��ߴ�.
		int iVal = idao.invokeD(); // -> invokeD() ȣ��.
		System.out.println("InvokeService invokeS() �� ");
		return iVal; // ->int iVal  �� ����.
	
	}
}


class InvokeDAO
{
	public int invokeD(){
		System.out.println("InvokeDAO invokeD() ���� ");
		System.out.println("InvokeDAO invokeD() �� ");
		return 0;
	}
}
