package a.b.c;

import java.util.Scanner;
import java.math.BigDecimal;
import a.b.c.KmkMathImple;

public class KmkMathScr{
	
	// Q) String ���� ������ �� ����???
	//   => Ŭ���̾�Ʈ�� ��? �� ���̰� ����. BigDecimal �� ��ٰ� String �� �� �δٰ� ���� ��, �ѹ��� �ٲٸ� ��������.
	//     ó�� ���鼭�� ���ϴ� ���ε带 �����غ���.
/*
	public String add(String x, String y){
// 3. ��Ģ������ ����ڵ�� ����ϱ�      ��� �ڵ�?

		return "";
	}

	public String subtract(String x, String y){

		return "";
	}

	public String multiply(String x, String y){

		return "";
	}

	public String divide(String x, String y){
	// -> �̹� �ҷ��� Ŭ���� KmkMathImple �ȿ� add() �Լ��� BigDecimal �� �����߱� ������ �ؿ� ó�� 
	//    �� BigDecimal �� ���� �ʿ䰡 x
		return "";
	}

*/



	public static void main(String args[]){

		KmkMathImple kkm = new KmkMathImple(); //  ��� x ---> �ڿ��� ���� ��.
		//kkm.add(); // -> �� ȣ�� �ƴ��� ������ �ý��ۿ��� ����ؾ��ϴµ�,
		//������ �� �Լ��� KmKMathImple.java �� �ֱ� ������,
		//�׸��� ���� �ȿ� ȣ���߱� ������ ���� Ŭ������ �̹� ��� ������ �����̱� ������ ���⿡�� ����� ���� ���� �ƴ϶�,
		//�Լ� ������ Ŭ������ ���� ��� Ȯ������.
		
		//kkm.subtract();
		//kkm.multiply();
		//kkm.divide();

		Scanner sc = new Scanner(System.in);
		int input = 0;
		// ������ int �� �޾ƾ� �ϴµ�, BigDecimal�� ���ڼ��� ("����")�� �����͸� �޾ƾ� �ϱ� ������,
		// ó������ String �� ���� ���� ����.
		input = sc.nextInt(); // .nextInt() �� int ���̱� ������ int�� �޾ƾ�.
		// **.nextInt(); ->>> �ֿܼ� �Է��϶�� ��.
		String input1 = String.valueOf(input);
		System.out.println("input1 >>> : " + input1);
		input = sc.nextInt();
		String input2 = String.valueOf(input);
		System.out.println("input2 >>> : " + input2);


//		BigDecimal add1 = new BigDecimal();        ->   BigDecimal �� �޸𸮿� ��� �÷����ϴµ�,
//														��� �ø����ΰ�?


//		Scanner sc = new Scanner(System.in);
//		double input = 0.0;

//		input = sc.nextInt();

/*
for (int i=0; i  ; i++)// ���� ������ ��� ����
		{
			System.out.println(.ROWND_DOWN());
		}
*/
		
		
		/* ��� ���� ���� ����, ����� ������ �������� break ������ ���� �ؼ� �����غ���

		while (true)
		{
			if (0x2B == opr){
				System.out.println("���ϱ�");
			}
		}
		
		*/

	}
}




/*
1. ��Ģ���� ���α׷� ����� + - x /


2. ���Ŭ���� Bigdecimal

3. ��Ģ������ ����ڵ�� ����ϱ�
��� �ڵ�?

4. �����ʹ� �Ǽ��� �����ϱ�
double ���� ����
5. ������ ������ �Ǽ��� �����ϱ�
���ϵ� double 0.0
6. ������ �Ǽ� �Ҽ����� 3�ڸ��� ����
.ROWND_DOWN()
7. �Ҽ����� ROWND_DOWN ���

System.out.println(Ȯ���غ���);

8. ������ ��ǲ�� Scanner �Ǵ� ����� �μ��� ������ �����ؼ� �ϱ�
������ ������ 3(������ ���� �����ͷ� ����ϰ�) �Ǵ� 2(���ڸ�)

9. ��Ģ������ �Լ��� �����ϱ�
add()
subtract()
multiply()
divide()
10. �Լ��� �������̽����� �����ؼ� Ŭ�������� �����ϱ�
���� ����
interface?????????????????
{} ����ü�� ���� ������ �ȿ� �־�???
??�Լ���?
9���� ��Ģ���� �Լ�?

interface class{
add()
negate()
multiply()
divide()
}
   ????

ù��° �� ��
��� ���α׷��� �� ���ΰ� �����ϰ�
Ŭ���� ������ ��� �� ���ΰ� �����ϰ�
�Լ��� ��� �� ���ΰ� �����ϰ�
��Ű�� �� Ŭ���� �����ϱ�
KmkMathScr  -> class name 
*/


