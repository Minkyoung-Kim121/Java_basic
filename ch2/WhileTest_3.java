package a.b.c;
import java.util.Scanner;

public class WhileTest_3{

// ���� 

// ������

// �Լ�() : ���������� ����ϱ�

// main()
	public static void main(String a[]){
		System.out.println("main() ����");

		Scanner sc = new Scanner(System.in);
		
		int n = 0; // -> do while ������ ���� ������ ����.
				   //    do{}while(n <= 0);
		System.out.println("���ڸ� �Է��ϼ��� >>> : ");

		do
		{
			System.out.println("n�� �� >>> : ");
			n = sc.nextInt();
		}
		while (n <= 0);

		int sum = 0;
		int iVal = 1;
		while (iVal <= n)
		{
			sum += iVal;
			iVal++;
		}
		System.out.println("n�� ���� >>> : " + sum);
	
	} // end of main()

} // end of WhileTest_3 class