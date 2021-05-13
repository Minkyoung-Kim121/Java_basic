package a.b.c;
	

public class ValueTest_2{

	public static int maxValue(int a, int b, int c){

		int max = a;
		if (b > max) 
		{
			max = b;
		}
		if (c > max)
		{
			max = c;
		}

		return max;
	}

	public static int minValue(int a, int b, int c){
	
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;

		return min;
	}

	public static int maxArr(int a[]){
		// a[0] = 1;
		// b[1] = 2;
		// c[2] = 3;
		int aLen = a.length;
		int max = a[0];
		for (int i=0; i < aLen; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}

		return max;
	}

	// �ּҰ� 
	public static int minArr(int a[]){
		// int a[] = {1, 2, 3};
		// a[0] = 1;
		// a[1] = 2;
		// a[2] = 3;
		int aLen = a.length;
		int min = a[0];
		for (int i=0; i < aLen; i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}

		return min;
	}


	public static void main(String args[]){
	
		if (args.length == 3)
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			System.out.println("�ִ밪 >>> : " + ValueTest.maxValue(a, b, c));
			System.out.println("�ּҰ� >>> : " + ValueTest.minValue(a, b, c));
			int max = ValueTest.maxValue(a, b, c);
			System.out.println("�ִ밪 max >>> : " + max);
			int min = ValueTest.minValue(a, b, c);
			System.out.println("�ִ밪 min >>> : " + min);

			int iVal[] = {a, b, c}; // new int[]{a, b, c}
			int maxArr = ValueTest.maxArr(iVal);
			System.out.println("�ִ밪 maxArr >>> : " + maxArr);
			int minArr = ValueTest.minArr(iVal);
			System.out.println("�ּҰ� minArr >>> : " + minArr);

		}else{
			System.out.println("�ƱԸ�Ʈ�� 3�� �־ �����ؾ� �մϴ�. �迭�� ���̰� 3 �̾�� �մϴ�. ");
		}
	}
}