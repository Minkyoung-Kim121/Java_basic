package a.b.c;
import java.util.Scanner;

public class Switch2{

// ����
	public static final char MEDAL_GOLD = 'G';
	public static final char MEDAL_SILVER= 'S';
	public static final char MEDAL_BRONZE = 'B';
	public static final char MEDAL_A = 'A';

// ������

// �Լ�()

// main()
	public static void main(String args[]){ // p.102 ���� ����
		System.out.println("main() ����");
		Scanner sc = new Scanner(System.in);

		int ranking = 1; // int �ʱ�ȭ 1
						 // ranking ��������

		char medalColor = '\u0000'; // char �ʱ�ȭ '\u0000'
									// medalColor ��������
		System.out.println(" �Է��ϼ��� >>> : ");

		switch (ranking)
		{
		case 1: medalColor = SwitchTest.MEDAL_GOLD; // -> 'G';
				break;
		case 2: medalColor = SwitchTest.MEDAL_SILVER;
				break;
		case 3: medalColor = SwitchTest.MEDAL_BRONZE;
				break;
		default:
				medalColor = SwitchTest.MEDAL_A;
		}
		System.out.println(ranking + "�� �޴��� ������" + medalColor + "�Դϴ�.");

	} // end of main()

} // end of Switch2 class