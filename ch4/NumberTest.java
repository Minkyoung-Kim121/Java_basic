package a.b.c;

import java.util.Scanner;

public class NumberTest{

	public static void main(String args[]){
		/*
		double d = Math.random();
		System.out.println("d >>> : " + d);
		d = d*52;
		System.out.println("d >>> : " + d);
		int i = (int)d;
		System.out.println("i >>> : " + i);		
		*/
		int answer = (int)(Math.random()*100) + 1;
		System.out.println(" answer >>> : " + answer);

		int input = 0;
		int count = 0;

		Scanner sc = new Scanner(System.in);
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

	}
}