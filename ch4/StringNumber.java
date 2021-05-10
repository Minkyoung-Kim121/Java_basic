package a.b.c;


public class StringNumber{

	public static boolean checkNum(String str){
		System.out.println("str >>> : " + str);
		boolean bool = false; // false 로 초기화
		char charInput = ' '; // 빈문자로 초기화
		int nCnt = 0; // 0으로 정수 초기화
		System.out.println("str.length() >>> : " + str.length()); // 4
		for (int i=0; i < str.length(); i++)
		{
			
			charInput = str.charAt(i);
			if (charInput >= 0x30 && charInput <= 0x39) // 숫자 0에서 9 사이
			{
				// 숫자
			}else{
				
				nCnt++; // nCnt 가 0에서 9사이가 아닐때 1씩 증가
				System.out.println("nCnt >>> : " + nCnt);
			}
		}

		if (nCnt > 0)
		{
			bool = false;
		
		}else{
			
			bool = true;
		}

		return bool;

	}

	public static void main(String args[]){
		
		// 정규식 : Regular Expression
		// Validation
		
		String str = "10aa";
		boolean bool = StringNumber.checkNum(str);
		System.out.println("bool >>> : " + bool); // bool >>> : false



	}


}

// Integer.toHexString -> ArrayTest_3.java
// .toLowerCase();
// .sLAscii(); : 아스키코드 출력하기