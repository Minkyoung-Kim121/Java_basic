package a.b.c;

import java.util.StringTokenizer;
public class SplitTest_2{

	public void charSplit(String sVal){
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0)
		{
			String cChar[] = sVal.split("#");
			System.out.println("sVal.length() >>> : " +sVal.length()); // -> sVal.length() >>> : 19
			for (int i=0; i < cChar.length; i++)
			{
				System.out.println("cChar[i] >>> : " + cChar[i]);
				for (int ii=0; ii < cChar[i].length(); )
				{

				}
//				System.out.println("cChar[i].charAt(i) >>> : " + cChar[i].charAt(i));
			}
		}





	}



	public void charToken(String sVal){
		System.out.println("charToken(String sVal) sVal >>> : " + sVal);

		if (sVal !=null && sVal.length() > 0)
		{
			StringTokenizer ss = new StringTokenizer(sVal, "#");
			for (int i=0; ss.hasMoreTokens(); i++)
			{
				System.out.println(i + "��° : " + ss.nextToken());
			}
		}





	}



	public static void main(String args[]){
		
		String sVal = "ABC#DEF#GHI#JKL#MNO";
		System.out.println("sVal >>> : " + sVal);

		SplitTest_2 st2 = new SplitTest_2();
		st2.charSplit(sVal); // charSplit, �Լ��� ȣ��
		st2.charToken(sVal); //  charToken �Լ��� ȣ��

		// charSplit, charToken �Լ��� ȣ���ؼ�
		// sVal ���ڿ� String sVal �� char�� �ɰ��� �ֿܼ� ����ϼ���
		// �Լ��� split(), StringTokenizer Ŭ���� �� �Լ��� ����ϼ���.




	}



}