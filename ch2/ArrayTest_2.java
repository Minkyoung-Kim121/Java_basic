package a.b.c;

public class ArrayTest_2{

	public static void main(String args[]){
		
		// �ڹٿ��� ���ڿ��� ������ �迭�̴�.
	//��1) for��, String Ŭ������ charAt() �Լ��� �̿��ؼ� �� ���ڸ� ����ϼ���.
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// �迭 �Ǵ� for���� ����ϱ� ������ �� ��� ��ü�� ���̸� ���ؼ� �Ѵ�.
		int sLen = s.length();
		System.out.println("sLen >>> : " + sLen);

	//��1-1) ->for�� �̿�
		for (int i=0; i < sLen; i++)
		{
			System.out.println("s.charAt("+i+") >>> : " + s.charAt(i));
		}
	//��1-2) ->CharAt()�Լ� �̿�
			System.out.println("" + s.charAt(0)); // <- A
			System.out.println("" + s.charAt(1)); // <- B
			System.out.println("" + s.charAt(25)); // <- Z

	} // end of main()
} // end of ArrayTest_1 class