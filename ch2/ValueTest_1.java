package a.b.c;

public class ValueTest_1{

	// main() �Լ��� �ִ� �Ű����� : String args[] -> ��Ʈ�� �迭
	// ����� �μ� 
	public static void main(String args[]){
	
		String s0 = args[0];
		System.out.println("args[0] >>> : " + s0);
		String s1 = args[1];
		System.out.println("args[1] >>> : " + s1);
//		String s2 = args[2];
//		System.out.println("args[2] >>> : " + s2);
		System.out.println(s0 + s1);
		// Integer.parseInt() �Լ� -> ���ڼ��ڸ� ���ڷ� ��ȯ�ϴ� �Լ��̴�.
		//                          ��, �� �Լ��� ���ڼ��ڸ� ��ȯ�Ѵ�.
		//                          (���ڸ� ��ȯ�ϴ� ���� �ƴϴ�.)

	/*
	C:\00.KOSMO72\00.JExam\ch2>java a.b.c.ValueTest_1 �� ��
	args[0] >>> : ��
	args[1] >>> : ��
	����
	Exception in thread "main" java.lang.NumberFormatException: For input string: "��"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:580)
        at java.lang.Integer.parseInt(Integer.java:615)
        at a.b.c.ValueTest_1.main(ValueTest_1.java:23)	
	*/
		int i0 = Integer.parseInt(s0);
		int i1 = Integer.parseInt(s1);
		System.out.println(i0 + i1);

		
	/* ��Ʈ���迭
		System.out.println();
		String s[] = {"111", "222", "ccc"};
		for (int i=0; i < s.length; i++)
		{
			System.out.println("s["+i+"] >>> : " + s[i]);
		}
	*/
	}
}