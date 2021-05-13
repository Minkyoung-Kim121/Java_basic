package a.b.c;

public class PublicTest_1{

	public void aa(){
		System.out.println("aa() 함수 ");
	}
	public void bb(){
		System.out.println("bb() 함수 ");
	}
	
	public static void main(String args[]){
	
		PublicTest_1 pt_1 = new PublicTest_1();
		pt_1.aa();
		pt_1.bb();

	} // end of main()
} // end of PublicTest_1 class