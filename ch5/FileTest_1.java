package a.b.c;


import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class FileTest_1{

	public static void main(String args[]) throws IOException {
		
		
		File f1 = new File("../cccdd");  // C:\00.KOSMO72\00.JExam   �� cccdd ���� �������.
		//     ../     -> ����� ǥ�����ִ� ��. �ֿܼ��� �Է��ϴ� �� �����غ���!
		//     ����� �Է��Ҷ� . (dot) ������ �� �ȴ�.
		System.out.println("File Ŭ���� �������� f1 >>> : " + f1);
		System.out.println("f1.getName() >>> : " + f1.getName());
		boolean sss = f1.createNewFile(); 
		System.out.println("sss >>> : " + sss);
		boolean b = f1.isDirectory();
		System.out.println("b >>> : " + b);
		boolean b1 = f1.isFile();
		System.out.println("b1 >>> : " + b1);
		System.out.println("f1.getPath() >>> : " + f1.getPath());
		// f1.getPath() >>> : ..\cccdd
		// .getPath()       -> file �� ������ �� �����η� ����������, �����θ� ǥ��.
		//								  ����η� ����������, ����θ� ǥ��.

		System.out.println("f1.getAbsolutePath() >>> : " + f1.getAbsolutePath());
		// f1.getAbsolutePath() >>> : C:\00.KOSMO72\00.JExam\ch5\..\cccdd
		// .getAbsolutePath()       -> ������ ������ �Էµ� �����θ� ǥ��.

		System.out.println("f1.getCanonicalPath() >>> : " + f1.getCanonicalPath());
		// f1.getCanonicalPath() >>> : C:\00.KOSMO72\00.JExam\cccdd
		// .getCanonicalPath()     -> ������ ������ ������ ��ġ�ϴ� �����θ� ǥ��.
		//  ������ : (C:\ ó��) ����̺�� �����ϴ� ���   ���� �� ����θ� ����ؾ� �Ѵ�.

		// ������ �ü��(O/S) ������ ���� �� ������ ��ҹ��ڸ� �������� ������ ��������!!
		// linux, UNIX �ü��(O/S) ������ ���� �� ������ ��ҹ��ڸ� �����Ѵ�.
		// String codepage = "C:\Program Files\EditPlus\codepage.txt";
		String codepage = "C:Program/Files/EditPlus/CODEPAGE.txt";
		File ff = new File(codepage);
		System.out.println("File Ŭ���� �������� ff >>> : " + ff);
		System.out.println("ff.getName() >>> : " + ff.getName());
		// ff.getName() >>> : CODEPAGE.txt
		System.out.println("ff.getPath() >>> : " + ff.getPath());  // �ּҰ� �� �ٸ��� ��µȴ�.
		// ff.getPath() >>> : C:Program\Files\EditPlus\CODEPAGE.txt
		System.out.println("ff.getAbsolutePath >>> : " + ff.getAbsolutePath()); 
		// �ּҰ� �ٸ��� �Ǵ� ���� ������
		// ff.getAbsolutePath >>> : C:\00.KOSMO72\00.JExam\ch5\Program\Files\EditPlus\CODEPAGE.txt
		System.out.println("ff.getCanonicalPath() >>> : " + ff.getCanonicalPath());
		// ff.getCanonicalPath() >>> : C:\00.KOSMO72\00.JExam\ch5\Program\Files\EditPlus\CODEPAGE.txt

		
		FileInputStream fis = new FileInputStream(f1);
		//(f1) �Ű������� �ҷ���.
		int data = 0;
		while ((data=fis.read()) != -1)
		{
			System.out.println((char)data);
		}

		
		File f11 = new File("../../dddd"); // �����    C:\00.KOSMO72  �� dddd ���� �������.
		System.out.println("File Ŭ���� �������� f11 >>> : " + f11);
		System.out.println("f11.getName() >>> : " + f11.getName());
		boolean sss1 = f11.createNewFile(); 
		System.out.println("sss >>> : " + sss);
		boolean bb = f11.isDirectory();
		System.out.println("bb >>> : " + bb);
		boolean bb1 = f11.isFile();
		System.out.println("bb1 >>> : " + bb1);

		/*Q)  cd  \   �̰� ���µ�,   �� �� �������?    ->  c����̺꿡�� �� ���ų� ����� x �׷��� ����.
		File f111 = new File("\/eeeee");
		System.out.println("File Ŭ���� �������� f111 >>> : " + f111);
		System.out.println("f111.getName() >>> : " + f111.getName());
		boolean sss11 = f111.createNewFile(); 
		System.out.println("sss >>> : " + sss);
		*/


	}

}