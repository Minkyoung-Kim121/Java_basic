package a.b.c;


import java.util.Scanner;

public class NumberTest_1{

	public static void main(String args[]){
	
//		Scanner sc = new Scanner(System.in);

//		int answer = (int)(Math.random()*100) + 1;
//		System.out.println(" answer >>> : " + answer);

		int mk[] = new int[6]; //mk[] 는 정수 6개짜리 배열

		for (int i=0;i < mk.length ; i++) // mk의 길이보다 작을때 i값을 하나씩 증가시키세요
		{
			mk[0] = (int)(Math.random()*40) + 1; // mk배열의 첫번째([0]) 는 
			mk[1] = (int)(Math.random()*40) + 1; // (int)(Math.random()*40) int 타입으로 강제 형변환
												//   random() -> public static double random()
												//            -> 리턴 : equal to 0.0 and less than 1.0.
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
	
// for 문


}