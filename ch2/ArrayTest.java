package a.b.c;

public class ArrayTest{

	public static void main(String args[]){
		
		// �ڹٿ��� ���ڿ��� "" (���� �����̼�)���� ��� ǥ���Ѵ�.
		// �ڹٿ��� ���ڴ� '' (�̱� �����̼�)���� ��� ǥ���Ѵ�.
		// String ���ڿ� abc�� ������ �Ϸù�ȣ(index/÷��)�� ������.
		// index �� ÷��
		// ���(element)
		// index 0      -1 : �����Ͱ� ���ٴ� �ǹ�
		String s = "abc";
		System.out.println("abc >>> : " + s);

		// public char charAt(int index)
		char cValue0 = s.charAt(0);
		System.out.println("cValue0 >>> : " + cValue0);
		char cValue1 = s.charAt(1);
		System.out.println("cValue1 >>> : " + cValue1);
		char cValue2 = s.charAt(2);
		System.out.println("cValue2 >>> : " + cValue2);
	} // end of main()
} // end of ArrayTest class