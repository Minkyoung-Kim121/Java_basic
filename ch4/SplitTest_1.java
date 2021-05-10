package a.b.c;

import java.util.StringTokenizer;
public class SplitTest_1{

// charSplit() �Լ� �̿� ���
// charSplit �Լ��� ȣ���� �� ��� ȣ���� �ǰ�?
// public static void charSplit(){} // ->  static �ٿ��� 1-1)ȣ���ߴ�?
	public void charSplit(String sVal){ //-> new �ٿ��� ȣ���ߴµ�, sVal�� �޾Ƽ� �ҷ��� �ϴϱ� (!)!�� �־���. (+������Ÿ�Ե� �Ἥ String)
		System.out.println("charSplit(String sVal) sVal >>> : " + sVal);
		// -> charSplit(String sVal) sVal >>> : abc@def@ghi@jkl@mno

		if (sVal !=null && sVal.length() > 0) //-> sVal �� �� ���� �ƴϰ�(�����Ͱ� �ִ�) ���ÿ� ���̰� 0 �̻��϶�
		{
			String sChar[] = sVal.split("@^");// -> sVal�� Split("@") �Լ��� �̿��ؼ� ������ @ �������� �ɰ���, sChar[] ���� �迭�� �ɰ���.

			//2) char �迭�� �ɰ��� �ֿܼ� ����ϼ���
			for (int i=0; i < sChar.length; i++)
			{
				System.out.println("sChar["+i+"] >>> : " + sChar[i]);
			}
			/* ���ڷ� �ɰ���
			System.out.println("sChar[0] >>> : " + sChar[0]);
			System.out.println("sChar[0].charAt(0) >>> : " + sChar[0].charAt(0));
			*/
		}

	}


// Tokenizer() �Լ� �̿� ���
	public void charToken(String sVal){ // -> charToken() �Լ��� ������(delimiter)��� �� �ɰ���.
		// cf. charSplit("@") �Լ��� ������ @ �������� �ɰ��ش�.

		System.out.println("charToken(String sVal) sVal >>> : " + sVal);
		// -> charToken(String sVal) sVal >>> : a b^c@d ef@g|h^i@jk|l@m^no

		if (sVal !=null && sVal.length() > 0) // -> !=null && �ݵ�� ����� �Ѵ�. : �����൵ ���ư�����,
		//                   ����(������)�� ��������� ���ư��� �ϱ⶧����, ���� ���������� ���α׷��� © �� �ִ�.
		{
			System.out.println("sVal.length() >>> : " + sVal.length()); // -> sVal.length() >>> : 29
			StringTokenizer st = new StringTokenizer(sVal, "@r^ |"); // -> @r^ | �����ڸ� �������� �ɰ��ּ���
			for (int i=0; st.hasMoreTokens(); i++ ) // ���� i�� 0���� �����ؼ� 
			{
				System.out.println(i + "��° : " + st.nextToken());

				/*
				0��° : a
				1��° : b
				2��° : c
				3��° : d
				4��° : e
				5��° : f
				6��° : g
				7��° : h
				8��° : i
				9��° : j
				10��° : k
				11��° : l
				12��° : m
				13��° : n
				14��° : o
				*/
			}

		}
	}



	public static void main(String args[]){
		
		String sVal = "a b^c,d erf,g|h^i,jrk|l,m^nro";
		System.out.println("sVal >>> : " + sVal);
		// -> sVal >>> : abc,def,ghi,jkl,mno
		sVal = sVal.replace(',','@'); // replace() ->  , ����(char)�� @(char)�� �ٲ۴ٴ� �Լ�
		System.out.println("sVal >>> : " + sVal);
//		System.out.println("sVal.length >>> : " + sVal.length);

		// charSplit �Լ��� 1)ȣ���ؼ� sVal ���ڿ���
		// char 2)�迭�� �ɰ��� �ֿܼ� ����ϼ���
		// �Լ��� split() �Լ��� �̿��մϴ�.

		SplitTest_1 st1 = new SplitTest_1();// ->  new �ٿ��� �ƱԸ�Ʈ, �Ű����� ����ؼ� 1-2)ȣ���ߴ�?
		st1.charSplit(sVal); // -> charSplit() �Լ��� ȣ���ߴ�. 
		// ->sVal ������ ���� �ö���

		st1.charToken(sVal); // -> charToken() �Լ��� ȣ���ߴ�. 

	} // end of main()



} // end of SplitTest_1 class