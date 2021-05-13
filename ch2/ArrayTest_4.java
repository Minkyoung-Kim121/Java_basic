package a.b.c;

// <명령행 인수 사용법>
/*
	C:\00.KOSMO72\00.JExam\ch2>java a.b.c.ArrayTest_4
	Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0 <- 0은 하나도 없다는 의미.
	at a.b.c.ArrayTest_4.main(ArrayTest_4.java:10)
*/
/*
	C:\00.KOSMO72\00.JExam\ch2>java a.b.c.ArrayTest_4 11 <- 11(명령행 인수)을 붙여서 실행하면 돌아간다.
	args[0] >>> : 11
*/
		// String args[] -> 스트링 클래스 배열
		// 첫번째 요소를 사용하려면 -> 참조변수[인덱스] : args[0]

	// <회원가입>
	// 이름, 아이디, 패스워드, 전화번호, 주소 -> 항목 5개 필수*
	// 아이디는 길이가 8이어야한다.
	// 패스워드 길이가 8이어야한다.
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

			// 아이디 길이 체크 8
			if (8 == args[1].length() && 8 == args[2].length())
			{
				System.out.println("args[1] >>> : " + args[1]);
				ArrayTest_4 at4 = new ArrayTest_4( args[0]
				                              ,args[1]
				                              ,args[2]
				                              ,args[3]
				                              ,args[4]);
				System.out.println("이름 >>> : " + at4.mName);
				System.out.println("아이디 >>> : " + at4.mId);
				System.out.println("패스워드 >>> : " + at4.mPw);
				System.out.println("전화번호 >>> : " + at4.mHp);
				System.out.println("주소 >>> : " + at4.mAddr);
			}

			
		}else{
			System.out.println("회원가입 항목 5개를 다 쓰셔야 합니다. >>> : ");
		}
		

	} // end of mian()
} // end of ArrayTest_4 class