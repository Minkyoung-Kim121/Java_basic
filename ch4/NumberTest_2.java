package a.b.c;

import java.util.Scanner;

public class NumberTest_2{

	public static void main(String args[]){
		int answer = (int)(Math.random()*100) + 1;

		int input = 0; // ��ĳ�ʸ� �Ἥ �ִ°�
		int count = 0; // ���� Ÿ�� count �� �� ���̴�

		Scanner sc = new Scanner(System.in);

// for ��

	for (int i=0; i < 10; i++)
	{	
		count++;
		System.out.println("++ 1 �� 100���� ���� �Է��ϼ��� ++");
		input = sc.nextInt();

			if (answer < input)
			{	System.out.println(" �� ���� ���� �Է��ϼ��� !!\n");
			}else if (answer > input)
			{
				System.out.println(" �� ū ���� �Է��ϼ��� !!\n");
			}else{
				System.out.println(" GOOD !!");	
				System.out.println(" �õ�Ƚ���� " + count + " �� �Դϴ�.");
				break;
				
			}

			if (count == 10) // count �� 10�� �Ǹ� ������ �ϴϱ� if ���ǹ��� �ϳ� �� ��.
							// ��ġ �����غ���
			{
				System.out.println(" �ٺ� !! �� �� : " + answer);
				break;
			}
		}
	}

}


//Q) 10 ���� �Ѿ�� �ٺ��� ��� �������
//		for (int i=0; i >10; i++)
//		{
//			System.out.println(" ���� �ٺ��� ���� �׸��ϼ���!!");
//			break;
//		}



/*
		do
		{
			count++;
			System.out.println(" 1 �� 100���� ���� �Է��ϼ��� !!");
			
			input = sc.nextInt();
			
			if (answer > input)
			{
				System.out.println(" �� ū ���� �Է��ϼ��� !! \n");
			}
			else if (answer < input)
			{
				System.out.println(" �� ���� ���� �Է��ϼ��� !!\n");
			}
			else{
				System.out.println(" GOOD !!");	
				System.out.println(" �õ�Ƚ���� " + count + " �� �Դϴ�.");	
				break;
			}
		}
		while (true);
*/




	
