package a.b.c;


public class StringNumber{

	public static boolean checkNum(String str){
		System.out.println("str >>> : " + str);
		boolean bool = false; // false �� �ʱ�ȭ
		char charInput = ' '; // ���ڷ� �ʱ�ȭ
		int nCnt = 0; // 0���� ���� �ʱ�ȭ
		System.out.println("str.length() >>> : " + str.length()); // 4
		for (int i=0; i < str.length(); i++)
		{
			
			charInput = str.charAt(i);
			if (charInput >= 0x30 && charInput <= 0x39) // ���� 0���� 9 ����
			{
				// ����
			}else{
				
				nCnt++; // nCnt �� 0���� 9���̰� �ƴҶ� 1�� ����
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
		
		// ���Խ� : Regular Expression
		// Validation
		
		String str = "10aa";
		boolean bool = StringNumber.checkNum(str);
		System.out.println("bool >>> : " + bool); // bool >>> : false



	}


}

// Integer.toHexString -> ArrayTest_3.java
// .toLowerCase();
// .sLAscii(); : �ƽ�Ű�ڵ� ����ϱ�