package a.b.c;
import java.util.Scanner;

public class WhileTest_1{

	// ���� 

	// ������ 
	public WhileTest_1(){}

	//�Լ�() : ���������� ����ϱ�
	public int sumMath(int n){

		int iVal = 1; // �ʱ�ȭ
		int sum = 0;

		while (iVal <= n)
		{
			sum += iVal;
			iVal++;		
		}
		


		return sum;

	} // end of sumMath()

	// main()
	public static void main(String[] a){

		Scanner sc = new Scanner(System.in);
//		int n = 10; -> �� �����͸� �ޱ� ���� 
		int n = sc.nextInt();
		int sum = 0;
//		int iVal = 1;
/*
		while (iVal <= n)
		{
			sum += iVal;
			iVal++;
		}
		System.out.println(">>> : " + sum);
*/
		WhileTest_1 wt1 = new WhileTest_1();
		sum = wt1.sumMath(n);
		System.out.println(">>> : " + sum);

	} // end of main()

} // end of WhileTest_1 class