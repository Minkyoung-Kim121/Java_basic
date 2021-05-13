package a.b.c;
import java.util.Scanner;
public class ForTest_2{

//문3)   스캐너 클래스를 이용하여 n값을 받아,
//   n까지의 더하기 값을 콘솔에 출력하세요.
//   리턴형 int, 함수 이름은 sumMath()
//   함수에서 n값은 매개변수로 받아서 콘솔에 출력

// 변수

// 생성자
public ForTest_2(){}
// 함수()

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
		// for (초기화; 조건식; 증감식)
		// 초기화 -> 변수에 값을 대입하는 것. 이를 위해서는 데이터 타입 필요.
/*
		for (int i=0; i > 10; i++) // for (int i=10; i < 10; i++)
								   // for (int i=0; i >= 9; i++)
		{
			System.out.println(" >>> : " + i);
		}
		
		//문1)p.114
		int nnn = 10;
		int isum = 0;

		for (int i=1; i <= nnn; i++) // 배열의 시작점은 무조건 0부터 시작x
		{
			isum += i; // ?
			System.out.println("" + isum + "");
		}
// double -> 근사치 
*/

//문2)스캐너 클래스를 이용하여 n값을 받아, n까지의 더하기 값을 콘솔에 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("콘솔에 값을 넣어주세요 >>> : ");
		int n = sc.nextInt();
		System.out.println("입력한 값: >>> :" + n);
		int sum = 0;
/*
		for (int i=1; i <= nn; i++) // 배열의 시작점은 무조건 0부터 시작x
		{
			System.out.println(">>> : " + i);
			sum += i; // ?
		}		
*/
	ForTest_2 ft2 = new ForTest_2();
	sum = ft2.sumMath(n); // 위에 함수 호출
	System.out.println("" + sum + "");

	int s = ForTest_2.sumMath(n);
	System.out.println("" + s + "");

	} // end of main()

}