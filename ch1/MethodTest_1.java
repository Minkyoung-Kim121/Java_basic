package com.bigdata30.ch1;

public class MethodTest_1{

	public static int calcuMethod(int xx, int yy){
		System.out.println("calcuMethod() �Լ� ���� >>> : ");
		int sum = xx + yy;
		System.out.println("calcuMethod() �Լ� �� >>> : ");
		return sum;
	} // end of calcuMethod()


	public static void main(String a[]){
		System.out.println("main() �Լ� ���� >>> : ");
		int x = 1;
		int y = 2;
		int sum =MethodTest_1.calcuMethod(x, y);
		
		System.out.println("sum >>> : "+sum);
		System.out.println("main() �Լ� �� >>> : ");
	} // end of main()
} // end of MethodTest_1 class


/*
javac -d . MethodTest_1.java : ������
java com.bigdata30.ch1.MethodTest_1 : ���� 


jvm �� �ϴ� �� 
1. static Ű���� ���� �ѵ�(����, �Լ�)�� �޸𸮿� �ø���. 
	public static int calcuMethod(int xx, int yy)
	public static void main(String a[])
2. Ŭ������ �ִ� �ڿ��� �޸𸮿� �ø��� �� ���� ���� 
   main() �Լ��� ȣ���Ѵ�.
   ��Ⱑ �������̴�. 
3. main() �Լ� �� ���� �ϴ� 

   ù��° ���ο� 
   System.out.println("main() �Լ� ���� >>> : ");
   ��� �Ͻÿ� 
4. int x = 1; int y = 2; �������� �ʱ�ȭ 
5. MethodTest_1.calcuMethod(x, y); static �Լ� ȣ�� 
6. 5���ο� �ִ� 
   calcuMethod(x, y) {} �Լ��� ���� ���� �Ѵ�. 
7. calcuMethod(int xx, int yy) 
   ù���ο��� 
   System.out.println("calcuMethod() �Լ� ���� >>> : ");
   ��� 
   �ι�° ���ο��� 
   int sum = xx + yy;
   ��� 
   ����° ���ο��� 
   System.out.println("calcuMethod() �Լ� �� >>> : ");
   ���
   �׹�° ���ο��� 
   return sum
   sum �� �� ��Ƽ� ���� �϶�� �� 
	calcuMethod(int xx, int yy) ��
8. 17���� ����
   MethodTest_1.calcuMethod(x, y); �Լ��� ��� 
   ���ϰ��� ������ �ͼ� 
   int sum �� �����Ѵ�. 	
9. 19���� ��� 
10. 20���� ��� 
11. main() �Լ� �� 
12. ���α׷� ���� 

*/