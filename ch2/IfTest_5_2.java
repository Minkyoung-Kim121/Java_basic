package a.b.c;

public class IfTest_5_2{

// 변수
	// 상수 사용해보기 <상수 쓰는 규칙> 문자상수
	public static final char GRADE_A = 'A';
	public static final char GRADE_B = 'B';
	public static final char GRADE_C = 'C';
	public static final char GRADE_F = 'F';
	// -> 변경하면 안 되는 문자, 숫자는 상수로 처리 한다.

// 생성자

// 함수()
	public static char gradeFun(int point){
		
		char grade =  '\u0000';

		if (90 <= point)
		{
			grade = GRADE_A;
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
		
		int point = 60;
		char grade = IfTest_5_2.gradeFun(point);
		System.out.println("학점 >>> : " + grade);
		

	} // end of main()
		
} // end of IfTest_5_2 class
