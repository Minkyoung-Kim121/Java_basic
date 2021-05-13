package a.b.c;

// <����� �μ� ����>
/*
	C:\00.KOSMO72\00.JExam\ch2>java a.b.c.ArrayTest_4
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 <- 0�� �ϳ��� ���ٴ� �ǹ�.
	at a.b.c.ArrayTest_4.main(ArrayTest_4.java:10)
*/
/*
	C:\00.KOSMO72\00.JExam\ch2>java a.b.c.ArrayTest_4 11 <- 11(����� �μ�)�� �ٿ��� �����ϸ� ���ư���.
	args[0] >>> : 11
*/
		// String args[] -> ��Ʈ�� Ŭ���� �迭
		// ù��° ��Ҹ� ����Ϸ��� -> ��������[�ε���] : args[0]

	// <ȸ������>
	// �̸�, ���̵�, �н�����, ��ȭ��ȣ, �ּ� -> �׸� 5�� �ʼ�*
	// ���̵�� ���̰� 8�̾���Ѵ�.
	// �н����� ���̰� 8�̾���Ѵ�.
public class ArrayTest_4{

	String mName;
	String mId;
	String mPw;
	String mHp;
	String mAddr;

	public ArrayTest_4(String mName
		                ,String mId
		                ,String mPw
		                ,String mHp
		                ,String mAddr){
		this.mName = mName;
		this.mId = mId;
		this.mPw = mPw;
		this.mHp = mHp;
		this.mAddr = mAddr;
	}

	public static void main(String args[]){
	
		System.out.println("args.length >>> : " + args.length);
		if (5 == args.length)
		{
			System.out.println("args[0] >>> : " + args[0]);
			System.out.println("args[1] >>> : " + args[1]);
			System.out.println("args[2] >>> : " + args[2]);
			System.out.println("args[3] >>> : " + args[3]);
			System.out.println("args[4] >>> : " + args[4]);

			// ���̵� ���� üũ 8
			if (8 == args[1].length() && 8 == args[2].length())
			{
				System.out.println("args[1] >>> : " + args[1]);
				ArrayTest_4 at4 = new ArrayTest_4( args[0]
				                              ,args[1]
				                              ,args[2]
				                              ,args[3]
				                              ,args[4]);
				System.out.println("�̸� >>> : " + at4.mName);
				System.out.println("���̵� >>> : " + at4.mId);
				System.out.println("�н����� >>> : " + at4.mPw);
				System.out.println("��ȭ��ȣ >>> : " + at4.mHp);
				System.out.println("�ּ� >>> : " + at4.mAddr);
			}

			
		}else{
			System.out.println("ȸ������ �׸� 5���� �� ���ž� �մϴ�. >>> : ");
		}
		

	} // end of mian()
} // end of ArrayTest_4 class