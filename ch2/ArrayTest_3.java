package a.b.c;

public class ArrayTest_3{

//��) �پ��� ���� �ǽ��غ���.
	// ��1)ASCII ���̺�ǥ�� �ֿܼ� ����ϼ��� (��, 16������)
	// ��1-1) // <- �빮�ڷ� ��µ�.
	public static void sLAscii(String sL){
		System.out.println("ArrayTest_3 sLAscii(String sL) �Լ� ���� ");
		System.out.println("sL >>> : " + sL);
		int sLlen = sL.length();
		for (int i=0; i < sLlen; i++ )
		{
			char csL = sL.charAt(i);
			System.out.println("sL.charAt("+i+") >>> : " 
				                    + csL + " : " 
				                    + Integer.toHexString(csL));
		}
		System.out.println("ArrayTest_3 sLAscii(String sL) �Լ� �� ");
	}
	// ��1-2) // <- �ҹ��ڷ� ��µ�.
	public static void sSAscii(String sS){
		System.out.println("ArratyTest_3 sSAscii(String sS) �Լ� ���� ");
		System.out.println("sS >>> : " + sS);
		int sSlen = sS.length();
		for (int i=0; i < sSlen; i++ )
		{
			char csS = sS.charAt(i);
			System.out.println("sS.charAt("+i+") >>> : " 
				                     + csS + " : "
								     + Integer.toHexString(csS));
		}

		System.out.println("ArratyTest_3 sSAscii(String sS) �Լ� �� ");
	}
	// ��1-3) // <- ���ڷ� ��µ�.
	public static void sNAscii(String sN){
		System.out.println("ArrayTest_3 sNAscii(String sN) �Լ� ���� ");
		System.out.println("sN >>> : " + sN);
		int sNlen = sN.length();
		for (int i=0; i < sNlen; i++ )
		{
			char csN = sN.charAt(i);
			System.out.println("sN.charAt("+i+") >>> : " 
				                     + csN + " : "
								     + Integer.toHexString(csN));
		}

		System.out.println("ArrayTest_3 sNAscii(String sN) �Լ� �� ");

	}
	// ��1-4) // <- ��Ģ���� ���
	public static void sOAscii(String sO){
		System.out.println("ArrayTest_3 sOAscii(String sO) �Լ� ���� ");
		System.out.println("sO >>> : " + sO);
		int sOlen = sO.length();
		for (int i=0; i < sOlen; i++ )
		{
			char csO = sO.charAt(i);
			System.out.println("sO.charAt("+i+") >>> : " 
				                     + csO + " : "
								     + Integer.toHexString(csO));
		}

		System.out.println("ArrayTest_3 sOAscii(String sO) �Լ� �� ");
	}
	// ��1-5) // <- Ư����ȣ ���
	public static void sQAscii(String sQ){
		System.out.println("ArrayTest_3 sQAscii(String sQ) �Լ� ���� ");
		System.out.println("sQ >>> : " + sQ);
		int sQlen = sQ.length();
		for (int i=0; i < sQlen; i++ )
		{
			char csQ = sQ.charAt(i);
			System.out.println("sQ.charAt("+i+") >>> : " 
				                     + csQ + " : "
								     + Integer.toHexString(csQ));
		}
		System.out.println("ArrayTest_3 sQAscii(String sQ) �Լ� �� ");
	}

	public static void main(String args[]){
	//��) �پ��� ���� �ǽ��غ���.
		// ��1)ASCII ���̺�ǥ�� �ֿܼ� ����ϼ��� (��, 16������)
		// ��1-1)������ �빮��
		String sL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// ��1-2)������ �ҹ���
		String sS = sL.toLowerCase();
		// ��1-3)���� ����
		String sN = "0123456789";
		// ��1-4)��Ģ ������
		String sO = "+x-/";
		// ��1-5)Ư����ȣ
		String sQ = "!@#$%^&";

		// ������ �빮�� �ƽ�Űǥ ����ϱ� 
		// ArrayTest_3 Ŭ�������� static �Լ� sLAscii()�� �ƱԸ�Ʈ sl�� �̿��Ͽ�, 
		//    ArrayTest_3�� �ִ� sLAscii(String sL) �Ű������� String sL�� �Լ��� ȣ���Ѵ�.
		ArrayTest_3.sLAscii(sL);
		ArrayTest_3.sSAscii(sS);
		ArrayTest_3.sNAscii(sN);
		ArrayTest_3.sOAscii(sO);
		ArrayTest_3.sQAscii(sQ);

		//��1 �߰�) �Լ��� �ʹ� ���� ��
		//��1 �߰�) �Լ� �ϳ��� ����� ������ �ƽ�Ű�ڵ带 ���� �ҷ�����
		System.out.println("ArrayTest_3.sLAscii() �Լ� �ϳ��� �� �ҷ�����");
		ArrayTest_3.sLAscii(sL);
		ArrayTest_3.sSAscii(sS);
		ArrayTest_3.sNAscii(sN);
		ArrayTest_3.sOAscii(sO);
		ArrayTest_3.sQAscii(sQ);
	
	} // end of main()
} // end of ArrayTest_3 class