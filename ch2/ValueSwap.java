package a.b.c;

// 이 예제는 잘 몰라도 현재는 상관이 없으니 
// 부담 가지지 마시고 하셨으면 좋겠습니다.
// 이건 모른다고 우리 수업에 아무 지장 없습니다. .
public class ValueSwap{

	// swap
	public static void swap(int a[], int x, int y){
		
		int v = a[x];
		a[x] = a[y];
		a[y] = v;
	}

	// reverse
	public static void reverse(int a[]){
		int aLen = a.length;
		for (int i=0; i < aLen/2; i++ )
		{
			ValueSwap.swap(a, i, aLen-i-1);
		}
	}

	public static void main(String args[]){
	
		int a[] = {1, 2, 3, 4, 5, 6, 7};

		int aLen = a.length;
		System.out.println("aLen >>> : " + aLen);
		for (int i=0; i < aLen; i++ )
		{
			System.out.println("a["+i+"] >>> : " + a[i]);
		}

		// swap && reverse
		ValueSwap.reverse(a);

		System.out.println("swap && reverse >>> : ");
		System.out.println("aLen >>> : " + aLen);
		for (int i=0; i < aLen; i++ )
		{
			System.out.println("a["+i+"] >>> : " + a[i]);
		}

	}
}