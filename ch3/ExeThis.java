package a.b.c;

public class ExeThis{

// ����
// ������
// �Լ�() -> �ڿ� 4��

	public static void aaM(){	
		System.out.println("static aaM() >>> : ");
	/*    System.out.println("static aaM() >>> : " + this);
	// -> static ���� this �� ����� �� x
	ExeThis.java:10: error: non-static variable this cannot be referenced from a static context
                System.out.println("static aaM() >>> : " + this);
                                                           ^
	1 error
	*/
	ExeThis et2 = new ExeThis(); // -> �������� et2�� ����ؼ� ExeThis();������ �ν��Ͻ�.
	et2.aM(); // -> et2 �������� �̿��Ͽ� �Լ�aM() ȣ��.

	}

	public void aM(){
		
		System.out.println("aM() >>> : " + this);
		bM();
	}

	public void bM(){
		
		System.out.println("bM() >>> : " + this);
		cM();
	}

	public void cM(){
		
		System.out.println("cM() >>> : " + this);
		dM();
	}

	public void dM(){
		
		System.out.println("dM() >>> : " + this);
	}

// main()
	public static void main(String args[]){
		ExeThis.aaM();
	// -> static ���� �Լ��� Ŭ������.�ڿ�; �� �ؼ� ȣ���Ѵ�.
	//                ex) ExeThis.aaM();
		ExeThis et = new ExeThis();
		System.out.println("Exethis ��������� Ŭ���� �������� >>> : " + et);
		// -> Exethis ��������� Ŭ���� �������� >>> : a.b.c.ExeThis@6d06d69c
		et.aM(); // -> aM() �Լ��� invoke(ȣ��)

		ExeThis et1 = new ExeThis();
		System.out.println("Exethis ��������� Ŭ���� �������� >>> : " + et1);
		// -> Exethis ��������� Ŭ���� �������� >>> : a.b.c.ExeThis@7852e922    et �� et1 �� �ٸ���.
		et1.aM();

		ExeThis.aaM();
		
		System.out.println("new Exethis() >>> : " + new ExeThis());
		new ExeThis().aM(); // -> new �� �ν��Ͻ��ؼ� ȣ���ؾ��Ѵ�.

//		System.out.println("new Exethis().aM() >>> : " + new ExeThis().aM());
	/*     void Ÿ���� �Լ� aM() ��� �� ����
	ExeThis.java:63: error: 'void' type not allowed here
                System.out.println("new Exethis().aM() >>> : " + new ExeThis().aM());
                                   ^
	1 error
	*/


	} // end of main()

} // end of ExeThis class