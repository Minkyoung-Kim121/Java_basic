package a.b.c;

public class OperTest{

	public static void main(String args[]){
	
		// �� ������ & �Լ�
		// �ڹٿ����� ���ڸ� �� : byte, short, char, int long, float, double
		// == : ������, �������
		boolean b0 = 1 ==1;
		System.out.println("b0 >>> : "+ b0);
		if (2 ==2)
		{
			System.out.println("2 == 2 >>> : true");
		}
		char c = 'A';
		System.out.println("c >>> : "+ c);
		System.out.println("c >>> : 0x"+ Integer.toHexString(c));
		//c >>> : A
		//c >>> : 0x41
		boolean b1 = 'A' == 0x41;
		System.out.println("b1 >>> : "+ b1);
		boolean b2 = c == 0x41;
		System.out.println("b2 >>> : "+ b2);
		
		System.out.println("Z >>> : 0x"+ Integer.toHexString('Z'));
		// Z >>> : 0x5a

		// ������ �빮�� A~Z : from to ���� �����
		//System.out.println("c >>> : 0x"+ Integer.toHexString('A'));
		// A >>> : 0x41
		//System.out.println("c >>> : 0x"+ Integer.toHexString('Z'));
		// Z >>> : 0x5a
		if (c >= 0x41 && c <= 0x5a)
			{
			System.out.println("c >>> : 0x"+ Integer.toHexString(c));
		}

		// ������ �ҹ��� a~z : from to ���� �����
		char cc = 'a';
		System.out.println("z >>> : 0x"+ Integer.toHexString('a'));
		// a >>> : 0x61
		System.out.println("z >>> : 0x"+ Integer.toHexString('z'));
		// z >>> : 0x7a
		if (cc>=0x61 && cc<=0x7a)
		{
			System.out.println("cc >>> : 0x"+ Integer.toHexString(cc));
		}

		// ���� ���� 0 ~ 9 : from to ���� �����
		String sc = "09";
		char csc0 = sc.charAt(0);
		char csc9 = sc.charAt(1);
		System.out.println("csc0 >>> : 0x" + Integer.toHexString(csc0));
		System.out.println("csc9 >>> : 0x" + Integer.toHexString(csc9));
		if (csc0 >= 0x30 && csc0 <= 0x39)
		{
			System.out.println("csc0 >>> : 0x" + Integer.toHexString(csc0));
		}


		boolean bb0 = 'a' == 'b';
		System.out.println("bb0 >>> : "+ bb0);
		boolean bb1 = 'a' == 'a';
		System.out.println("bb1 >>> : "+ bb1);
		if ( 'a' == 'a')
		{
			System.out.println("bb1 >>> : "+ bb1);
		}



		// ���ڿ� �� ����(�ڹٿ����� : == : ������(�������))
		// ��� �����ڴ� ���� ���ڿ��� ����ϸ� �ȵȴ�.
		// ��� true(�ּҰ����� ���Ƽ�)
		boolean b3 = "aa" == "aa";
		System.out.println("b3 >>> : "+ b3);
	

		// �ּҰ� ��
		// ��� false(�ּҰ� �ٸ�)
		String s0 = "abc";
		String s1 = new String("abc");
		boolean b4 = s0 == s1;
		System.out.println("b4 >>> : "+ b4);

		// �ڹٿ��� ���ڿ� �񱳴� �� equals �Լ��� ����Ѵ�.
		// == (������, �������)�� ���ڿ� �񱳿� ������� ������(76����)
		boolean b5 = s0.equals(s1);
		System.out.println("b5 >>> : "+ b5);
		// java.util.objects.equals() : jdk 1.7 ���Ŀ� ����ϱ�

		// ���
		// �ڹٿ��� 
		// ���ڿ� �񱳴� : String().equals()
		// ���� �񱳴� : == (������, �������)
		//�� : �ڹٽ�ũ��Ʈ������ == ���ڿ�, ���� ���ص� �ȴ�.


	}//end of main()
}//end of ATest class

