package a.b.c;

public class ForTest{

	public static void main(String args[]){

		/*
		for (�ʱ�ȭ��; ���ǽ�; ������)
		{
			���๮;
		}
		*/
		/*
		for (; ; )
		{
			System.out.println(">>>>>>");
		}
		*/
		/* -> for ���� true �϶��� ����.
		for (; false ; )
		{
			System.out.println(">>>>>>");
		}
		1 error
		*/

		// int i = 0 -> int�� ������Ÿ���� ����ϸ� �������� i �̴�.
		// i (����)������ �������� for{} �����̴�.
		// i�� 0���� �ʱ�ȭ�ߴ�.
		// <���ǽ�>
		// i < 5 -> i���� 0,1,2,3,4 ������ true.
		// <������>
		// i++ : ���� ����������
		// i = i + 1 (���߿� ����)
		// int�� �����͸� 0���� 4���� �ټ����� �ֿܼ� ����ϼ���.

		for (int i=0; i > 5; i++ )
		{
			System.out.println("hello" + i);
		}
	} //end of main()
} //end of ForTest class