package a.b.c;
import java.util.Scanner;

public class WhileTest_3{

// 변수 

// 생성자

// 함수() : 참조변수로 사용하기

// main()
	public static void main(String a[]){
		System.out.println("main() 시작");

		Scanner sc = new Scanner(System.in);
		
		int n = 0; // -> do while 문에서 무한 루프를 돈다.
				   //    do{}while(n <= 0);
		System.out.println("숫자를 입력하세요 >>> : ");

		do
		{
			System.out.println("n의 값 >>> : ");
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
		System.out.println("n의 합은 >>> : " + sum);
	
	} // end of main()

} // end of WhileTest_3 class