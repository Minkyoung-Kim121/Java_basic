package a.b.c;
import java.util.Scanner;

public class SwitchTest{

// 변수
	public static final char MEDAL_GOLD = 'G';
	public static final char MEDAL_SILVER= 'S';
	public static final char MEDAL_BRONZE = 'B';
	public static final char MEDAL_A = 'A';

// 생성자
public char switchM(){
	

	return ' '; // char 는 빈문자 초기화
}
// 함수()
	



// main()
	public static void main(String args[]){ // p.102 예제 참고
		System.out.println("main() 시작");
		Scanner nc = new Scanner(System.in);

//		int ranking = 1; // int 초기화 1
						 // ranking 지역변수
		int ranking = nc.nextInt(); // ranking 지역변수
		char medalColor = '\u0000'; // char 초기화 '\u0000'
									// medalColor 지역변수
		System.out.println(" 입력하세요 >>> : ");

		switch (ranking)
		{
		case 1: medalColor = SwitchTest.MEDAL_GOLD; // -> 'G';
				break;
		case 2: medalColor = SwitchTest.MEDAL_SILVER;
				break;
		case 3: medalColor = SwitchTest.MEDAL_BRONZE;
				break;
		default:
				medalColor = SwitchTest.MEDAL_A;
		}
		System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");

	} // end of main()

} // end of SwitchTest class