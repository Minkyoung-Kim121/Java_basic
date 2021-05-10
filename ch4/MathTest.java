package a.b.c;


public class MathTest{
	
	public static void main(String args[]){



//		��� E   �ڿ� �α��� ���� e ��
		System.out.println("E : " + Math.E); // E : 2.718281828459045

//		��� PI   ������
		System.out.println("PI >>> : " + Math.PI); // PI >>> : 3.141592653589793
		//Q) �Ҽ� ��°�ڸ� ���ķ� ���� ������ ���� ���� ������??
//		int PI1 = ???.Math((int) Math.PI);
//		System.out.println("PI1 >>> : " + Math.PI1);

//		max()   (a,b)   -> a�� b �� max ��
		int max = Math.max(200, 2); // 200
		System.out.println("max >>> : " +max);

//		min()   (a,b)   -> a�� b �� min ��
		int min = Math.min(1, 100); // 1
		System.out.println("min >>> : " + min);

//		abs()   (a)   -> a�� ���밪 (��ȣ��Ʈ ����) ��ȣ��Ʈ : + - ...
		int abs = Math.abs(-100);
		System.out.println("abs >>> : " + abs); // 100

		
//		pow()   (a, b)   -> (a)�� (b)����   ���� ����
		double pow = Math.pow(8, 4); 
		System.out.println("pow >>> : " + pow); // 4096.0

//		random()   ()   -> 0.0 - 1.0 ������ ����(������)  0.0���� 0.9 ������ ��µȴ�.
		double random = Math.random();
		System.out.println("random >>> : " + random); //  0.3510705859887501

		// Q)������ ������ ����Ϸ���...?
		int random1 = (int) Math.random();
		System.out.println("random1 >>> : " + random1); // 0 

//		round()   (a.bcd)   -> a.bcd�� �Ҽ��� ù ��° �ڸ����� �ݿø�
		double round = Math.round(45.24687);
		System.out.println("round >>> : " + round); // 45.0

//		ceil()   ���޹��� �Ǽ�(a.bcdf) ���� ���� ���� ����(0 =< a) �� ���� ū ���� ���� ��ȯ
		double ceil = Math.ceil(10.456);
		System.out.println("ceil >>> : " + ceil); // 11

//		floor()   (a.bcdf)   -> ���� ���� �Ǽ�(a.bcdf)���� ���� ���� ����(0 =< a) �� ���� ū ���� ��ȯ
		double floor = Math.floor(10.456);    //  10.456 ���� ���� ������ �� ���� ū 10�� ��ȯ.
		System.out.println("floor >>> : " + floor); // 10.0



		
	}
}