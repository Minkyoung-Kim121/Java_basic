package a.b.c;

public class StringNumber_1 {
	
	// ���� ī��Ʈ
	public static int checkNum(String str){
		System.out.println("checkNum() >>> : " + str);
		// ���ڷ� �ϳ��ϳ� �ɰ���
		/* -> ������ �̷��� �ᵵ ������, �����Ͱ� ��û���� ���ٺ��� �ϳ��ϳ� �Է��ؾ��ϴ�, for���� if���� �Ἥ ����ϴ� ���� ��������.
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(6));
		System.out.println(str.charAt(7));
		System.out.println(str.charAt(8));
*/
		int iii = 0; // for �� �ȿ� �����ϸ� �ۿ��� �� ���ϱ� �ۿ��� �ʱ�ȭ �� ��
					 // iii�� int �̱� ������ 0���� �ʱ�ȭ;

		for (int i=0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i)); // �ϳ��� �̾Ƴ���
			int ii = str.charAt(i);

			if (0x39 >= ii && ii >= 0x30) // 16������ ǥ���ϴ� ��� : 0x ���޿�
										  // 
										  // 
			{
				System.out.println("if() ���ǹ��� �� ���� �Ǿ��� �� >>> : " + iii);
				iii++;
			}
		}

		return iii;
	}


	// ������ �ҹ��� ī��Ʈ
	public static int checkAlpaS(String str){
		System.out.println("checkAlpaS() >>> : " + str); // -> �Լ� �� �ҷ��Դ��� ����غ��� ��.
		
		int nCnt1 = 0;
		if (str !=null && str.length() > 0)
		{
			System.out.println("if() ���ǹ��� �� ���� �Ǿ��� �� >>> : " + str);
			for (int i=0; i  < str.length(); i++)
			{
				char i2 = '\u0000';
				i2 = str.charAt(i);
				System.out.println("�ɰ��� >>> : " + i2);
				nCnt1++;
			}
		}
		

		return nCnt1;
	}

	// ������ �빮�� ī��Ʈ : String str = "124ABcDef"; �ȿ� �ִ� ������ �빮�ڰ� �� �� ���� ����ƶ�.
	public static int checkAlpaL(String str){
		System.out.println("checkAlpaL() ȣ��Ǿ��� >>> : " + str);

		int nCnt2 = 0;
		
		for (int i=0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
			int dd = str.charAt(i);
//			System.out.println("for �� �� �� �� >>> : " + dd);

		}


		

		return nCnt2;
	}


	public static void main(String args[]){
		
		// ���Խ� : Regular Expression
		// Validation
		String str = "124ABcDef";
		


//		StringNumber_1.checkNum(str); // ->str ����, �ƱԸ�Ʈ ---> �ѹ� ȣ���� ������ �ּ� ó��, ���� �� �ϸ� ��� ����
// ī��Ʈ�� �����ؼ� �ֿܼ� ����Ͻÿ�.
		int cegg = StringNumber_1.checkNum(str);
		System.out.println("cegg >>> : " + cegg); // 0 -> for�� -> 3
		
		int cegl = StringNumber_1.checkAlpaS(str);// -> static �� �پ��� ������ Ŭ������.�ڿ�; �ؼ� ȣ���ϴ� ��
										//            ���⿡���� �ڿ��� checkAlpas()�Լ� �̱� ������ �̷��� ���,
										// ���� ���ڿ��� str ������ �����߱� ������ �Լ� �ȿ��ٰ� str �� ���� ����.
		System.out.println("cegl >>> : " + cegl); // ���ǹ� �� ���� �� �� �ҹ��� ī��Ʈ ����� ���� ���̴�.

		int cegl2 = StringNumber_1.checkAlpaL(str); //-> ������ int �� �޾Ƽ�0
										// �Լ� ȣ���ϸ� �ڲ� ��µǴϱ�, �򰥸��ϱ� �ڿ��� �ϳ��� ȣ���ؼ� ����!
		System.out.println("cegl2 >>> : " + cegl2);


	}

}

/*
.charAt();
System.out.println();
.length();
for(int i=0
*/