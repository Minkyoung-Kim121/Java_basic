package a.b.c;

public class WhileTest_2{

// 변수 

// 생성자

// 함수() : 참조변수로 사용하기

// main()
	public static void main(String[] a){
		System.out.println("main() 시작");

		int i = 0; //-> 지역 변수: 맨 위에 선언해야 아래쪽에서도 계속해서 받아서 사용 가능하다.
		System.out.println("while(true) 시작");
		while (true)
		{
			System.out.println("while loop >>> : " + i);
			if (i == 10)
			{
				System.out.println("if >>> : " + i);
				System.out.println("if >>> : " + i + " break >>> : ");
				break; // -> break 뒤에는 작성하면 x
				
			}
			i++;
		}
		System.out.println("while(true) 끝");
		System.out.println("이후 루틴 시작");

		while (i <= 10)
		{
			System.out.println("while(i <= 10) >>> : " + i); // -> while(i <= 10) >>> : 10
			i++;
		}

		int k = 0; // -> 지역변수를 중간에 넣으면 위에는 안 써짐.
		for (; k <= 10; k++)
		{
			System.out.println("for (; k <= 10; k++) >>> : " + k);
			if (k == 3) // -> k == 3 일때만 돈다.
			{
				System.out.println("if (k == 3) >>> :" + k);
				break;
			}
		}
		System.out.println("k >>> :" + k);

		for (int m=0; m <= k; m++) // -> for() 내부에서 찍은 지역변수는 for 안에서만 사용하겠다는 의미
								   //    for() 범위 밖으로 나가면 안써짐.
		{
			System.out.println("for (int m=0; m <= k; m++) >>> : " + m);
			if (m == 5) // -> if(true) 일 때만 돈다.
						//    m == 5 일때만 돈다.
			{
				System.out.println("if (m == 5) >>> :" + m); // 도는지 안도는지 출력해봐야.
				break;
			}
		}
//		System.out.println("m >>> : " + m); -> 출력 x

		
	} // end of main()

} // end of WhileTest_2 class