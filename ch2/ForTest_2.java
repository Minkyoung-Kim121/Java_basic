package a.b.c;
import java.util.Scanner;
public class ForTest_2{

//��3)   ��ĳ�� Ŭ������ �̿��Ͽ� n���� �޾�,
//   n������ ���ϱ� ���� �ֿܼ� ����ϼ���.
//   ������ int, �Լ� �̸��� sumMath()
//   �Լ����� n���� �Ű������� �޾Ƽ� �ֿܼ� ���

// ����

// ������
public ForTest_2(){}
// �Լ�()

	static int sumMath(int n){
		
		int sum = 0;

		for (int i=1; i <= n ; i++)
		{
			System.out.println(">>> : " + i);
			sum += i;
		}

		return sum;
	} // end of sumMath()



// main()
	public static void main(String[] a){
		// for (�ʱ�ȭ; ���ǽ�; ������)
		// �ʱ�ȭ -> ������ ���� �����ϴ� ��. �̸� ���ؼ��� ������ Ÿ�� �ʿ�.
/*
		for (int i=0; i > 10; i++) // for (int i=10; i < 10; i++)
								   // for (int i=0; i >= 9; i++)
		{
			System.out.println(" >>> : " + i);
		}
		
		//��1)p.114
		int nnn = 10;
		int isum = 0;

		for (int i=1; i <= nnn; i++) // �迭�� �������� ������ 0���� ����x
		{
			isum += i; // ?
			System.out.println("" + isum + "");
		}
// double -> �ٻ�ġ 
*/

//��2)��ĳ�� Ŭ������ �̿��Ͽ� n���� �޾�, n������ ���ϱ� ���� �ֿܼ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֿܼ� ���� �־��ּ��� >>> : ");
		int n = sc.nextInt();
		System.out.println("�Է��� ��: >>> :" + n);
		int sum = 0;
/*
		for (int i=1; i <= nn; i++) // �迭�� �������� ������ 0���� ����x
		{
			System.out.println(">>> : " + i);
			sum += i; // ?
		}		
*/
	ForTest_2 ft2 = new ForTest_2();
	sum = ft2.sumMath(n); // ���� �Լ� ȣ��
	System.out.println("" + sum + "");

	int s = ForTest_2.sumMath(n);
	System.out.println("" + s + "");

	} // end of main()

}