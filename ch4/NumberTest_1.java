package a.b.c;


import java.util.Scanner;

public class NumberTest_1{

	public static void main(String args[]){
	
//		Scanner sc = new Scanner(System.in);

//		int answer = (int)(Math.random()*100) + 1;
//		System.out.println(" answer >>> : " + answer);

		int mk[] = new int[6]; //mk[] �� ���� 6��¥�� �迭

		for (int i=0;i < mk.length ; i++) // mk�� ���̺��� ������ i���� �ϳ��� ������Ű����
		{
			mk[0] = (int)(Math.random()*40) + 1; // mk�迭�� ù��°([0]) �� 
			mk[1] = (int)(Math.random()*40) + 1; // (int)(Math.random()*40) int Ÿ������ ���� ����ȯ
												//   random() -> public static double random()
												//            -> ���� : equal to 0.0 and less than 1.0.
			mk[2] = (int)(Math.random()*40) + 1;
			mk[3] = (int)(Math.random()*40) + 1;
			mk[4] = (int)(Math.random()*40) + 1;
			mk[5] = (int)(Math.random()*40) + 1;
		}


		for (int i=0; i < mk.length; i++)
		{
			System.out.println(i + " >>> : " + mk[i]);
		}

//		int input = 0;
//		int count = 0;



	}
	
// for ��


}