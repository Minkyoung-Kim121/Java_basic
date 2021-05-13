package a.b.c;

public class WhileTest{


	public static void main(String[] a){

		do
		{
			System.out.println(">>>");
		}
		while (false);
/*	
		while (true) // -> >>> 무한반복
					 //    while() 은 연산의 결과값이 true일때만 돈다.
					 //    do() 와는 성격이 완전 다르다.
		{
			System.out.println(">>>");
		}


	do 
	{
		System.out.println(">>>"); // -> >>> 
								   //    false 일 때 돈다.
	}
	
	while (false);
	
*/
	} // end of main()
} // end of WhileTest class