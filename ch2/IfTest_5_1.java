package a.b.c;

public class IfTest_5_1{

	// ��� ����غ��� <��� ���� ��Ģ>
	public static final char GRADE_A = 'A';
	public static final char GRADE_B = 'B';
	public static final char GRADE_C = 'C';
	public static final char GRADE_F = 'F';
	// -> �����ϸ� �� �Ǵ� ����, ���ڴ� ����� ó�� �Ѵ�.
	
	public static void main(String args[]){
		
		int point = 60;
		char grade = '\u0000'; // char �ʱ�ȭ �� ��

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
		System.out.println("���� >>> : " + grade);

	} // end of main()
}