package a.b.c;

public class ArrayTest_1{

	public static void main(String args[]){
		
		// �ڹٿ��� ���ڿ��� ������ �迭�̴�.
		String s = "abc";
		System.out.println("s >>> : " + s);
		/*
		char c[] = {'a', 'b', 'c'};
		String ss = new String(c);
		System.out.println("ss >>> : " + ss);
		*/

	//��1)s���� a�� ����ϼ���.
	System.out.println("" + s.charAt(0));
	//��1-1)s���� b�� ����ϼ���.
	System.out.println("" + s.charAt(1));
	//��1-2)s���� c�� ����ϼ���.
	System.out.println("" + s.charAt(2));
	//��2)���ڿ��� ���̸� ����ϼ���.
	System.out.println("s.length() >>> : " + s.length());
	//-> String Ŭ������ ���ڿ� ���̴� length() �Լ��� ���ϰ�, 
	//   �迭�� ���̴� length ����(�ʵ�)�� ���Ѵ�.

	for (int i=0; i < s.length(); i++ )
	{
		System.out.println("charAt("+i+") >>> : " + s.charAt(i));
	}
	/*���ڿ��� �迭
		System.out.println("" + s[0]);
		*/
	} // end of main()
} // end of ArrayTest_1 class