package a.b.c;

//import a.b.c.d.*(wild card);
//Ŭ���� ����Ʈ �Ҷ�) Ŭ���� �̸��� ��������� ����Ѵ�.
//          ����) ������ ����.

//javac -d . PublicTest.java AA.java BB.java <-�Ѳ����� ������ �ϴ� ��
import a.b.c.d.AA;
	 //��1)BB Ŭ������ �ִ� bb()�Լ��� �������� bb�� ȣ���ϼ���.��
	 //��1-1)��
import a.b.c.d.e.BB;

public class PublicTest{

	public static void main(String args[]){

		// a.b.c.d.AA aa = new a.b.c.d.AA();��
		AA aa = new AA();
		aa.aa();
	 //��1-2)��
	 	BB bb = new BB();
		bb.bb();

	} // end of main()
} // end of PublicTest class

/*
AA.java
package a.b.c.d;
public class AA{
	// ����� ���� �⺻ ������
	public AA(){
		System.out.println("AA() ������ ");
	}
	public void aa(){
		System.out.println("aa() �Լ� ");	
	}
} // end of AA class
*/

/*
BB.java
package a.b.c.d.e;
public class BB{
	// ����� ���� �⺻ ������
	public BB(){
		System.out.println("BB() ������ ");
	}
	public void bb(){
		System.out.println("bb() �Լ� ");
	}
} // end of BB class
*/