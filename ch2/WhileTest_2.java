package a.b.c;

public class WhileTest_2{

// ���� 

// ������

// �Լ�() : ���������� ����ϱ�

// main()
	public static void main(String[] a){
		System.out.println("main() ����");

		int i = 0; //-> ���� ����: �� ���� �����ؾ� �Ʒ��ʿ����� ����ؼ� �޾Ƽ� ��� �����ϴ�.
		System.out.println("while(true) ����");
		while (true)
		{
			System.out.println("while loop >>> : " + i);
			if (i == 10)
			{
				System.out.println("if >>> : " + i);
				System.out.println("if >>> : " + i + " break >>> : ");
				break; // -> break �ڿ��� �ۼ��ϸ� x
				
			}
			i++;
		}
		System.out.println("while(true) ��");
		System.out.println("���� ��ƾ ����");

		while (i <= 10)
		{
			System.out.println("while(i <= 10) >>> : " + i); // -> while(i <= 10) >>> : 10
			i++;
		}

		int k = 0; // -> ���������� �߰��� ������ ������ �� ����.
		for (; k <= 10; k++)
		{
			System.out.println("for (; k <= 10; k++) >>> : " + k);
			if (k == 3) // -> k == 3 �϶��� ����.
			{
				System.out.println("if (k == 3) >>> :" + k);
				break;
			}
		}
		System.out.println("k >>> :" + k);

		for (int m=0; m <= k; m++) // -> for() ���ο��� ���� ���������� for �ȿ����� ����ϰڴٴ� �ǹ�
								   //    for() ���� ������ ������ �Ƚ���.
		{
			System.out.println("for (int m=0; m <= k; m++) >>> : " + m);
			if (m == 5) // -> if(true) �� ���� ����.
						//    m == 5 �϶��� ����.
			{
				System.out.println("if (m == 5) >>> :" + m); // ������ �ȵ����� ����غ���.
				break;
			}
		}
//		System.out.println("m >>> : " + m); -> ��� x

		
	} // end of main()

} // end of WhileTest_2 class