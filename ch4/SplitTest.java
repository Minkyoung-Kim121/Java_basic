package a.b.c;

// split(",");
// 
public class SplitTest {
	
	public static void main(String args[]){
		
		String sVal = "abc,def,ghi,jkl,mno"; // String ���ڿ� ������Ÿ���� sVal �� "abc,def,ghi,jkl,mno" �̴�.
		System.out.println("sVal >>> : " + sVal);// abc,def,ghi,jkl,mno

		String str[] = sVal.split(","); // delimiter : ������
		// ��Ʈ�� �迭 str ���������� ����ؼ� .split() �Լ� ��� -> split() �Լ��� �����ڴ� "," �� ����ϰڴ�.
		// ""�� �� ������ ��Ʈ������ �����߱� ����.
		// sVal = "abc,def,ghi,jkl,mno" -> ��, 5���� �迭 ....??
		// String str[] = {"abc,def,ghi,jkl,mno"}; �ٷ� ������ ��.
		System.out.println("str >>> : " + str); // str >>> : [Ljava.lang.String;@15db9742
		System.out.println("str.length >>> : " + str.length); // str.length >>> : 5

		
		// for ������ �ֿܼ� ����		
		
		// �迭�� ù ��° �ڿ� ���
		System.out.println("str[0] >>> : " + str[0]); // str[0] >>> : abc
		// ���ڿ� �迭 �ڿ��� ��Ʈ��(���ڿ�)�� char(����)�� �ɰ��� ����ϱ�
		System.out.println("str[0].charAt(0) >>> : " + str[0].charAt(0)); // >>> : a
		System.out.println("str[0].charAt(1) >>> : " + str[0].charAt(1)); // >>> : b
		System.out.println("str[0].charAt(2) >>> : " + str[0].charAt(2)); // >>> : c
		
		System.out.println("str[1] >>> : " + str[1]);
		System.out.println("str[1].charAt(0) >>> : " + str[1].charAt(0));
		System.out.println("str[1].charAt(1) >>> : " + str[1].charAt(1));
		System.out.println("str[1].charAt(2) >>> : " + str[1].charAt(2));

		System.out.println("str[2] >>> : " + str[2]);
		System.out.println("str[2].charAt(0) >>> : " + str[2].charAt(0));
		System.out.println("str[2].charAt(1) >>> : " + str[2].charAt(1));
		System.out.println("str[2].charAt(2) >>> : " + str[2].charAt(2));
//		System.out.println("str[2].charAt(3) >>> : " + str[2].charAt(3));
// -> String sVal = "abc,def,ghi,jkl,mno"; 
//    "abc" �� " abc" �� ���� �ʴ�. ���� ���� �ؽ�Ʈ�� �ν� -> abc �� 3��, abc �� 4��.

		System.out.println("str[3] >>> : " + str[3]);
		System.out.println("str[3].charAt(0) >>> : " + str[3].charAt(0));
		System.out.println("str[3].charAt(1) >>> : " + str[3].charAt(1));
		System.out.println("str[3].charAt(2) >>> : " + str[3].charAt(2));

		System.out.println("str[4] >>> : " + str[4]);
		System.out.println("str[4].charAt(0) >>> : " + str[4].charAt(0));
		System.out.println("str[4].charAt(1) >>> : " + str[4].charAt(1));
		System.out.println("str[4].charAt(2) >>> : " + str[4].charAt(2));


	}



}