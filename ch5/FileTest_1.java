package a.b.c;


import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class FileTest_1{

	public static void main(String args[]) throws IOException {
		
		
		File f1 = new File("../cccdd");  // C:\00.KOSMO72\00.JExam   에 cccdd 파일 만들어짐.
		//     ../     -> 상대경로 표시해주는 것. 콘솔에서 입력하던 것 생각해보자!
		//     상대경로 입력할때 . (dot) 잊으면 안 된다.
		System.out.println("File 클래스 참조변수 f1 >>> : " + f1);
		System.out.println("f1.getName() >>> : " + f1.getName());
		boolean sss = f1.createNewFile(); 
		System.out.println("sss >>> : " + sss);
		boolean b = f1.isDirectory();
		System.out.println("b >>> : " + b);
		boolean b1 = f1.isFile();
		System.out.println("b1 >>> : " + b1);
		System.out.println("f1.getPath() >>> : " + f1.getPath());
		// f1.getPath() >>> : ..\cccdd
		// .getPath()       -> file 을 생성할 때 절대경로로 생성했으면, 절대경로를 표시.
		//								  상대경로로 생성했으면, 상대경로를 표시.

		System.out.println("f1.getAbsolutePath() >>> : " + f1.getAbsolutePath());
		// f1.getAbsolutePath() >>> : C:\00.KOSMO72\00.JExam\ch5\..\cccdd
		// .getAbsolutePath()       -> 생성한 파일의 입력된 절대경로를 표시.

		System.out.println("f1.getCanonicalPath() >>> : " + f1.getCanonicalPath());
		// f1.getCanonicalPath() >>> : C:\00.KOSMO72\00.JExam\cccdd
		// .getCanonicalPath()     -> 생성한 파일이 실제로 위치하는 절대경로를 표시.
		//  절대경로 : (C:\ 처럼) 드라이브로 시작하는 경로   개발 시 상대경로를 사용해야 한다.

		// 윈도우 운영체제(O/S) 에서는 폴더 및 파일의 대소문자를 구별하지 않으니 조심하자!!
		// linux, UNIX 운영체제(O/S) 에서는 폴더 및 파일의 대소문자를 구별한다.
		// String codepage = "C:\Program Files\EditPlus\codepage.txt";
		String codepage = "C:Program/Files/EditPlus/CODEPAGE.txt";
		File ff = new File(codepage);
		System.out.println("File 클래스 참조변수 ff >>> : " + ff);
		System.out.println("ff.getName() >>> : " + ff.getName());
		// ff.getName() >>> : CODEPAGE.txt
		System.out.println("ff.getPath() >>> : " + ff.getPath());  // 주소가 다 다르게 출력된다.
		// ff.getPath() >>> : C:Program\Files\EditPlus\CODEPAGE.txt
		System.out.println("ff.getAbsolutePath >>> : " + ff.getAbsolutePath()); 
		// 주소가 다르게 되는 것을 보려고
		// ff.getAbsolutePath >>> : C:\00.KOSMO72\00.JExam\ch5\Program\Files\EditPlus\CODEPAGE.txt
		System.out.println("ff.getCanonicalPath() >>> : " + ff.getCanonicalPath());
		// ff.getCanonicalPath() >>> : C:\00.KOSMO72\00.JExam\ch5\Program\Files\EditPlus\CODEPAGE.txt

		
		FileInputStream fis = new FileInputStream(f1);
		//(f1) 매개변수로 불러옴.
		int data = 0;
		while ((data=fis.read()) != -1)
		{
			System.out.println((char)data);
		}

		
		File f11 = new File("../../dddd"); // 상대경로    C:\00.KOSMO72  에 dddd 파일 만들어짐.
		System.out.println("File 클래스 참조변수 f11 >>> : " + f11);
		System.out.println("f11.getName() >>> : " + f11.getName());
		boolean sss1 = f11.createNewFile(); 
		System.out.println("sss >>> : " + sss);
		boolean bb = f11.isDirectory();
		System.out.println("bb >>> : " + bb);
		boolean bb1 = f11.isFile();
		System.out.println("bb1 >>> : " + bb1);

		/*Q)  cd  \   이건 가는데,   왜 안 만들어짐?    ->  c드라이브에는 뭘 쓰거나 만들수 x 그래서 못감.
		File f111 = new File("\/eeeee");
		System.out.println("File 클래스 참조변수 f111 >>> : " + f111);
		System.out.println("f111.getName() >>> : " + f111.getName());
		boolean sss11 = f111.createNewFile(); 
		System.out.println("sss >>> : " + sss);
		*/


	}

}