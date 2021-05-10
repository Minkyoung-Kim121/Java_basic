package a.b.c;

public class ArrayTest_3{

	public static void sLAscii(String sL){
		System.out.println("ArrayTest_3 sLAscii(String sL) �Լ� ���� ");
		System.out.println("sL >>> : " + sL);
		int sLlen = sL.length();
		for (int i=0; i < sLlen; i++ )
		{
			char csL = sL.charAt(i);
			System.out.println("sL.charAt("+i+") >>> : " 
				                + csL + " : " 
								+ "Ox" + Integer.toHexString(csL));
		}
		System.out.println("ArrayTest_3 sLAscii(String sL) �Լ� �� ");
	}
	public static void sSAscii(String sS){
		System.out.println("ArrayTest_3 sSAscii(String sS) �Լ� ���� ");
		System.out.println("sS >>> : " + sS);
		int sSlen = sS.length();
		for (int i=0; i < sSlen; i++ )
		{
			char csS = sS.charAt(i);
			System.out.println("sS.charAt("+i+") >>> : " 
				                + csS + " : " 
								+ "Ox" + Integer.toHexString(csS));
		}
		System.out.println("ArrayTest_3 sSAscii(String sS) �Լ� �� ");
	}
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
		
		// ASCII ���̺� ǥ�� �ܼ� ����ϱ� �� 16���� �� .....
		// ������ �빮��
		String sL = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// ������ �ҹ���
		String sS = sL.toLowerCase();
		// ���� ����
		String sN = "0123456789";
		// ��Ģ ������
		String sO = "+x-/";
		// Ư�� ��ȣ 
		String sQ = "!@#$%^&";

		// ������ �빮�� �ƽ�Űǥ ����ϱ� 
		// ArrayTest_3 Ŭ���� ���� static �Լ� sLAscii() �� �ƱԸ�Ʈ sL �̿��ؼ� 
		// ArrayTest_3 �� �ִ� sLAscii(String sL) �Ű������� String sL�� �Լ��� ȣ�� �Ѵ�. 
		ArrayTest_3.sLAscii(sL);
		ArrayTest_3.sSAscii(sS);
		ArrayTest_3.sNAscii(sN);
		ArrayTest_3.sOAscii(sO);
		ArrayTest_3.sQAscii(sQ);
		
		// �Լ� �ϳ��� ����� ������ �ƽ�Ű �ڵ带 �� �ҷ����� 
		System.out.println("ArrayTest_3.sLAscii() �Լ� �ϳ��� �� �ҷ�����");
		ArrayTest_3.sLAscii(sL);
		ArrayTest_3.sLAscii(sS);
		ArrayTest_3.sLAscii(sN);
		ArrayTest_3.sLAscii(sO);
		ArrayTest_3.sLAscii(sQ);
	}
}