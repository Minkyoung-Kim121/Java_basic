package a.b.c;

// 어떤 클래스를 import 하는지 붙이는 이유 -> 가독성 때문
import java.util.Scanner;

public class ScannerTest{

	public static void main(String args[]){

		// java.util.Scanner sc = new java.util.Scanner(System.in);
		// -> 자바 콘솔 프로그램 외부에서 데이터를 입력 받아서 사용할 때,
		//    main() 함수의 매개변수인 스트링 배열(String args[])를 사용하였는데
		//    이 내용을 명령행 인수 사용 이라고 한다.
		// 쓰는 이유) 어플리케이션이 발전하면서 명령행 인수 사용 방법이 불편하다고 하여
		//          jdk 1.5 부터 추가된 클래스이다. 이는 콘솔에서 외부 데이터를 받아오는 역할을 하며
		//          문자열, 숫자 등 받아온 데이터는 해당 함수를 적절하게 사용해야 한다.
		// System.in : 외부 데이터를 받아온다.

		// 명령행 인수 와 Scanner class 의 차이
		// ->데이터 형변환이 없(명령행 인수x)기 때문에 Scanner 클래스가 유용하다.
		Scanner sc = new Scanner(System.in);

		System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
		// 정수(를 받아오려면) : 스캐너 클래스 참조변수.nextInt();
		int i = sc.nextInt();
		System.out.println("i >>> : " + i);

		System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
		// 실수(를 받아오려면) : 스캐너 클래스 참조변수.doubleInt();
		double d = sc.nextDouble();
		System.out.println("d >>> : " + d);

		System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
		// 문자열(을 받아오려면) : 스캐너 클래스 참조변수.next();
		String s1 = sc.next();
		System.out.println("s1 >>> : " + s1);

		System.out.println("콘솔에 데이터를 입력하시오 >>> : ");
		// 문자열(을 받아오려면) : 스캐너 클래스 참조변수.nextLine();
		String s = sc.nextLine();
		System.out.println("s >>> : " + s);
	
	} // end of main()
} // end of ScannerTest class