package a.b.c;

public class IfTest_5_3{

// ����
	// ��� ����غ��� <��� ���� ��Ģ>
	public static final char GRADE_A = 'A';
	public static final char GRADE_B = 'B';
	public static final char GRADE_C = 'C';
	public static final char GRADE_F = 'F';
	// -> �ڹٿ��� �ش� ���α׷��� �����ϸ� �� �Ǵ� ����, ���ڴ� ����� ó�� �Ѵ�.
	//    (���� �빮�ڷ� ���� / ����_�ܾ_������_��_)
	//    ����� �����Ͽ� �ʱ�ȭ �� �� ����Ѵ�.(����ϱ� ���� �ʱ�ȭ)
	//    ����� final(�����)�� ����Ͽ� �����Ѵ�.


// ������

// �Լ�()
	public static char gradeFun(int point){
		
		// char grade = ' ';
		char grade =  '\u0000';

		if (90 <= point)
		{
			grade = GRADE_A; // ->��� ����.
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
		// ������ ����� �μ��� �޾Ƽ� ���ռ� üũ(Validation)�Ͽ�, ���� �����ϱ�

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
				System.out.println("���� >>> : " + grade);
			}
		}else{
			System.out.println("������ KEY-IN �ϼ��� >>> : ");
		}
	} // end of main()
		
} // end of IfTest_5_3 class
