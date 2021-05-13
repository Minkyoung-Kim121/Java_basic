package a.b.c;

public class IfTest_5_3{

// 변수
	// 상수 사용해보기 <상수 쓰는 규칙>
	public static final char GRADE_A = 'A';
	public static final char GRADE_B = 'B';
	public static final char GRADE_C = 'C';
	public static final char GRADE_F = 'F';
	// -> 자바에서 해당 프로그램의 변경하면 안 되는 문자, 숫자는 상수로 처리 한다.
	//    (보통 대문자로 쓴다 / 여러_단어를_연결할_때_)
	//    상수로 선언하여 초기화 한 뒤 사용한다.(사용하기 전에 초기화)
	//    상수는 final(예약어)를 사용하여 선언한다.


// 생성자

// 함수()
	public static char gradeFun(int point){
		
		// char grade = ' ';
		char grade =  '\u0000';

		if (90 <= point)
		{
			grade = GRADE_A; // ->상수 대입.
		}
		else if (89 <= point)
		{
			grade = GRADE_B;
		}
		else if (70 <= point)
		{
			grade = GRADE_C;
		}else{
			grade = GRADE_F;	
		}

		return grade;
	}
// main()
	public static void main(String args[]){
		// 정수를 명령행 인수로 받아서 정합성 체크(Validation)하여, 로직 구현하기

		int argsLen = args.length;
		System.out.println("argsLen >>> : " + argsLen);

		if (argsLen == 1)
		{
			String sVal = args[0];
			System.out.println("sVal >>> : " + sVal);

			if (sVal !=null && sVal.length() > 0)
			{
				int point = Integer.parseInt(sVal);
				char grade = IfTest_5_2.gradeFun(point);
				System.out.println("학점 >>> : " + grade);
			}
		}else{
			System.out.println("점수를 KEY-IN 하세요 >>> : ");
		}
	} // end of main()
		
} // end of IfTest_5_3 class
