package a.b.c;

import java.io.File;
import java.io.IOException;

public class FileTest_3{

	public static void main(String args[]) throws IOException{
		
		File f = new File("a.txt");  // ���� ������ �޸𸮿��� �÷�����.
		boolean b0 = f.exists();  // �����Ͱ� �ִ��� Ȯ���ϴ� .exists() �Լ�
								  // ���ϰ� ���丮�� ��ǻ�ʹ� ���� ���.
		System.out.println("b0 >>> : " + b0);  // false
		boolean b1 = f.isFile();
		// Tests whether the file denoted by this abstract pathname is a normal file.
		System.out.println("b1 >>> : " + b1);  // false
		boolean b2 = f.isDirectory();
		// Tests whether the file denoted by this abstract pathname is a directory. 
		System.out.println("b2 >>> : " + b2);  // false

		f.createNewFile();   // ������ ������ ����� �Լ�
							 // �� �Լ��� ��� ���������� ��������� true �� ������ ��
		boolean bb0 = f.exists();    
		System.out.println("bb0 >>> : " + bb0);  // true
		boolean bb1 = f.isFile();
		System.out.println("bb1 >>> : " + bb1);  // true
		boolean bb2 = f.isDirectory();
		// Q) mkdir()  �ؼ� ���丮�� �������� true �� ���´�....?
		System.out.println("bb2 >>> : " + bb2);  // false

	}
}

// public boolean mkdir()
// Creates the directory named by this abstract pathname.