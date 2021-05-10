package a.b.c;
import java.util.Scanner;

//import java.util.Scanner;
public class NumberTest_3{

	public static int[] lotto(){
		
		int i[] = new int[6];
		System.out.println("i[] >>> : " + i);
		// for 문 써서 배열 출력해보고
		// 그 안 에서 Math.random() 함수 조건 , 범위 지정해서 i 변수 선언하고
		// for 문 또 돌려서 j 범위 설정, 
		// 결과 뽑아서 항상 확인해보자
		// 그 후 if 문 돌려서 중복값 제거
		// 중복값 제거 후 i-- 하나씩 마이너스 한 후
		// 마이너스 끝나면 break 써서 나가기

		// main() 안에서 돌려도 되고, 위에 처럼 자원 선언 호출해서 돌려도 괜찮다
		

		return i; // 결과값 출력
	}



	public static void main(String args[]){
		
		// 호출: 클래스명.함수();
		int[] ll = NumberTest_3.lotto();
		System.out.println("ll >>> : " + ll);
		
		int input = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

	}

}
	//	i = {1,2,3,4,5,6};
