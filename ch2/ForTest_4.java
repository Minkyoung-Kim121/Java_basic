package a.b.c;


public class ForTest_4{

// main()
	public static void main(String[] a){

	// ����� �μ��� ������ �޾Ƽ� 
	// 5��¥�� �ﰢ���� �ֿܼ� ����ϱ�
	// �Լ��� ������ ������.

	String n = a[0];
	int num = Integer.parseInt(n);

	for (int i=1; i <= num; i++)
	{
		for (int j=1; j <= num-i; j++)
		{
			System.out.print("("+i+","+j+")");
		}
		System.out.println();
	}

	for (int i=1; i <= num; i++)
	{
		for (int j=1; j <= i; j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}

		
	} // end of main()

} // end of ForTest_4 class