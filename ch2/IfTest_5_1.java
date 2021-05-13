package a.b.c;

public class IfTest_5_1{

	// 상수 사용해보기 <상수 쓰는 규칙>
	public static final char GRADE_A = 'A';
	public static final char GRADE_B = 'B';
	public static final char GRADE_C = 'C';
	public static final char GRADE_F = 'F';
	// -> 변경하면 안 되는 문자, 숫자는 상수로 처리 한다.
	
	public static void main(String args[]){
		
		int point = 60;
		char grade = '\u0000'; // char 초기화 한 것

		if (90 <= point)
		{
			grade = 'A';
		}else if (89 <= point)
		{
			grade = 'B';
		}else if (70 <= point)
		{
			grade = 'C';
		}else{
			grade = 'F';
		}
		System.out.println("학점 >>> : " + grade);

	} // end of main()
}