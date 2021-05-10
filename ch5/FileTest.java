package a.b.c;


import java.io.File;
import java.io.IOException;
// ANSI : ����ũ�μ���Ʈ�翡�� �ѱ� �ϼ��� �ڵ�� ����� �� Ÿ���� ANSI.?
public class FileTest{


	

	public static void main(String args[]) throws IOException {

		/*
			<File Ŭ����>     �ڹٿ��� ���� �� ���� ��ü�� �ٷ�� Ŭ����
			new File() : File Ŭ������ �ν��Ͻ� ����
			1. �޸�(Heap)�� File Ŭ������ �ν��Ͻ��� �����Ѵٴ� �ǹ�
			2. ���� �ϵ��ũ�� �ִ� �������� ����/����(���丮)�� �����ϴ� ���� �ƴϴ�.
			3. ���� ����/����(���丮)�� ����� ���ؼ� File Ŭ������ �Լ��� ȣ���ؼ� ����ؾ� �ȴ�.
			                                    ex) f.createNewFile()
		*/
		
		File f = new File("ccc");
		System.out.println("File Ŭ���� �������� f >>> : " + f);
		System.out.println("f.getName() >>> : " + f.getName());
		boolean sss = f.createNewFile(); // createNewFile() �Լ��� ������ throws IOException 
		// -> import java.io.IOException
		// ���� �ִ� ���丮�� ccc ���� ����.
		System.out.println("sss >>> : " + sss);

		boolean b = f.isDirectory();
		System.out.println("b >>> : " + b);
		boolean b1 = f.isFile();
		System.out.println("b1 >>> : " + b1);
		
		File f1 = new File("ddd.txt");
		System.out.println("File Ŭ���� �������� f1 >>> : " + f1);
		System.out.println("f1.getName() >>> : " + f1.getName());
		boolean www = f1.createNewFile(); // ddd.txt ����
		System.out.println("www >>> : " + www);
		boolean bb = f1.isDirectory();
		System.out.println("bb >>> : " + bb);
		boolean bb1 = f1.isDirectory();
		System.out.println("bb1 >>> : " + bb1);


		/*Q)  ���� ��ġ�� ���� �ٿ��ֱ��ϸ� ���ϼ��۷����Ͱ� �ݴ�� �Ǵµ�, �̴�� �����ϸ� x?
		File f22 = new File("C:\00.KOSMO72\00.JExam\ch5\fff1.txt");
		System.out.println("File Ŭ���� �������� f4 >>> : " + f22);
		System.out.println("f1.getName() >>> : " + f22.getName());
		boolean zzz1 = f22.createNewFile(); 
		System.out.println("zzz1 >>> : " + zzz1);

		//	C:\00.KOSMO72\00.JExam\ch5>javac -d . FileTest.java
		//	FileTest.java:46: error: illegal escape character
		//					File f22 = new File("C:\00.KOSMO72\00.JExam\ch5\fff1.txt");
		//																^
		//	1 error
		*/		

		File f2 = new File("C:/00.KOSMO72/00.JExam/ch5/fff.txt");  // -> �� ��ġ�� fff.txt �� ������.
		System.out.println("File Ŭ���� �������� f1 >>> : " + f2);
		System.out.println("f1.getName() >>> : " + f2.getName());
		boolean qqq = f2.createNewFile(); // ddd.txt ����
		System.out.println("qqq >>> : " + qqq);
		boolean bbb = f2.isDirectory();
		System.out.println("bbb >>> : " + bbb);
		boolean bbb1 = f2.isDirectory();
		System.out.println("bbb1 >>> : " + bbb1);
		
		File f3 = new File("sgs.jpg");
		System.out.println("File Ŭ���� �������� f3 >>> : " + f3);
		System.out.println("f1.getName() >>> : " + f3.getName());
		boolean zzz = f3.createNewFile(); 
		System.out.println("zzz >>> : " + zzz);
		boolean bbbb = f3.isDirectory();
		System.out.println("bbbb >>> : " + bbbb);
		boolean bbbb1 = f3.isDirectory();
		System.out.println("bbbb1 >>> : " + bbbb1);


/*
		File f3 = new File("ddd.txt");
		System.out.println("File Ŭ���� �������� f1 >>> : " + f1);
		System.out.println("f1.getName() >>> : " + f1.getName());
		boolean sss = f3.createNewFile();  // throws IOException  ����
		System.out.println("sss >>> : " + sss);
*/

	}

}