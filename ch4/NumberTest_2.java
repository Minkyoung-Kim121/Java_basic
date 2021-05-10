package a.b.c;

import java.util.Scanner;

public class NumberTest_2{

	public static void main(String args[]){
		int answer = (int)(Math.random()*100) + 1;

		int input = 0; // 스캐너를 써서 넣는거
		int count = 0; // 정수 타입 count 를 쓸 것이다

		Scanner sc = new Scanner(System.in);

// for 문

	for (int i=0; i < 10; i++)
	{	
		count++;
		System.out.println("++ 1 과 100상의 값을 입력하세요 ++");
		input = sc.nextInt();

			if (answer < input)
			{	System.out.println(" 더 작은 수를 입력하세요 !!\n");
			}else if (answer > input)
			{
				System.out.println(" 더 큰 수를 입력하세요 !!\n");
			}else{
				System.out.println(" GOOD !!");	
				System.out.println(" 시도횟수는 " + count + " 번 입니다.");
				break;
				
			}

			if (count == 10) // count 가 10이 되면 나가야 하니까 if 조건문을 하나 더 씀.
							// 위치 생각해보자
			{
				System.out.println(" 바부 !! 답 은 : " + answer);
				break;
			}
		}
	}

}


//Q) 10 번이 넘어가면 바보를 어떻게 출력하지
//		for (int i=0; i >10; i++)
//		{
//			System.out.println(" 야이 바보야 게임 그만하세요!!");
//			break;
//		}



/*
		do
		{
			count++;
			System.out.println(" 1 과 100상의 값을 입력하세요 !!");
			
			input = sc.nextInt();
			
			if (answer > input)
			{
				System.out.println(" 더 큰 수를 입력하세요 !! \n");
			}
			else if (answer < input)
			{
				System.out.println(" 더 작은 수를 입력하세요 !!\n");
			}
			else{
				System.out.println(" GOOD !!");	
				System.out.println(" 시도횟수는 " + count + " 번 입니다.");	
				break;
			}
		}
		while (true);
*/




	
