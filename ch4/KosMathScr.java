/*
2020-10-23
1. ��Ģ���� ���α׷� ����� + - x /
2. ���Ŭ���� BigDecimal
3. ��Ģ������ ����ڵ�� ����ϱ� 
4. �����ʹ� �Ǽ��� �����ϱ� 
5. ������ ������ �Ǽ��� �����ϱ�
6. ������ �Ǽ� �Ҽ����� 3�ڸ��� ���� 
7. �Ҽ����� ROUND_DOWN ��� 
8. ������ ��ǲ�� Scanner �Ǵ� ����� �μ��� 
   ���� �����ؼ� �ϱ� (������ ������ 3 �Ǵ� 2)
9. ��Ģ������ �Լ��� �����ϱ� 
10. �Լ��� �������̽����� �����ؼ� Ŭ�������� �����ϱ� 
................ ���ڶ�� ���� ���� �ϱ� ...

ù��° �� �� 
��� ���α׷��� �� �� �ΰ� �����ϰ� 
Ŭ���� ������ ��� �� �� �ΰ� �����ϰ� 
�Լ��� ��� �� �� �ΰ� �����ϰ� 
��Ű�� �� Ŭ���� �����ϱ� 

��Ű�� : �����迡�� ����ũ �ؾ� �Ѵ�. : �����ο���
      : ��Ű���� �⺻ ���� ������ �����ϴ�.
	  : �ڹٿ����� ����ϴ� ������ ������ �����ϰ� ����ؾ� �Ѵ�. 
	  : ��Ű�� ��ũ �����ڴ� .(dot) �� ����Ѵ�. 
	  : a.b.c : a/b/c

a.b.c
ȭ�� Ŭ���� : a.b.c.KosMathScr
KosMathScr
add()
subtract
multiply()
divide()

����ϴ� �������̽� : a.b.c.KosMath
KosMath
add()
subtract
multiply()
divide()

����ϴ� �������̽��� ����� ����ü Ŭ���� : a.b.c.KosMathImp
KosMathImpl
add()
subtract
multiply()
divide()

*/

package a.b.c;

import java.util.Scanner;
import java.math.BigDecimal;

public class KosMathScr{

	public BigDecimal add(String dX, String dY){
		System.out.println("KosMathScr add �Լ� ���� >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bAdd = km.add(dX, dY);

		System.out.println("KosMathScr add �Լ� �� >>> : ");

		return bAdd;
	}
	public BigDecimal subtract(String dX, String dY){
		System.out.println("KosMathScr subtract �Լ� ���� >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bSub = km.subtract(dX, dY);

		System.out.println("KosMathScr subtract �Լ� �� >>> : ");

		return bSub;
	}
	public BigDecimal multiply(String dX, String dY){
		System.out.println("KosMathScr multiply �Լ� ���� >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bMul = km.multiply(dX, dY);

		System.out.println("KosMathScr multiply �Լ� �� >>> : ");

		return bMul;
	}
	public BigDecimal divide(String dX, String dY){
		System.out.println("KosMathScr divide �Լ� ���� >>> : ");
		
		KosMath km = new KosMathImpl();
		BigDecimal bDiv = km.divide(dX, dY);

		System.out.println("KosMathScr divide �Լ� �� >>> : ");

		return bDiv;
	}

	public static void main(String args[]){
		System.out.println("���� �Լ� ���� >>> : ");
		// ������ �ޱ� : Scanner Ŭ���� �̿�
		// �����͸� ���� �ϱ� 
		System.out.println("��Ģ���� ���α׷��Դϴ�. !!");
		System.out.println("���α׷��� �����Ϸ��� q �Ǵ� Q ��������");
		System.out.println("������ �����ϼ��� >>> :: ");		
		
		while (true)
		{		
			Scanner sc = new Scanner(System.in);
			System.out.println("x�� �ֱ� �Ǽ��� >>> :: ");
			String dX = sc.next();
			System.out.println("x >>> :: " + dX);
			System.out.println("y�� �ֱ� �Ǽ��� >>> :: ");
			String dY = sc.next();
			System.out.println("y >>> :: " + dY);
			System.out.println("�����ڸ��� �������� + - * /");
			
			char oper = sc.next().charAt(0);
			System.out.println("oper >>> : " + oper);
			
			if (0x2b == oper)
			{
				System.out.println("oper >>> : " + oper);
				// �Լ��� ȣ���ϱ� : ���ϱ� ���� ���ϱ� ������ 
				KosMathScr km = new KosMathScr();
				// ���ϱ� 
				try
				{
					BigDecimal dAdd = km.add(dX, dY);
					System.out.println("dAdd >>> : " + dAdd);					
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (0x2D == oper)
			{
				System.out.println("oper >>> : " + oper);
				KosMathScr km = new KosMathScr();
				// ����
				// subtract
				try
				{
					BigDecimal dSub = km.subtract(dX, dY);
					System.out.println("dSub >>> : " + dSub);					
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (0x2A == oper)
			{
				System.out.println("oper >>> : " + oper);
				KosMathScr km = new KosMathScr();
				// ���ϱ�
				// multiply()
				try
				{
					BigDecimal dMul = km.multiply(dX, dY);
					System.out.println("dMul >>> : " + dMul);
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}				
			}
			if (0x2F == oper)
			{
				System.out.println("oper >>> : " + oper);
				KosMathScr km = new KosMathScr();
				// ������ 
				// divide()
				try
				{
					BigDecimal dDiv = km.divide(dX, dY);
					System.out.println("dDiv >>> : " + dDiv);
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}					
			}

			if (0x71 == oper || 0x51 == oper)
			{
				System.out.println("oper >>> : " + oper);
				break;
				// System.exit(0);
			}
		}
	}
}



