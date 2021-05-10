package a.b.c;


import java.io.File;
import java.io.IOException;
// ANSI : 마이크로소프트사에서 한글 완성형 코드로 만들어 둔 타입이 ANSI.?
public class FileTest{


	

	public static void main(String args[]) throws IOException {

		/*
			<File 클래스>     자바에서 파일 및 폴더 객체를 다루는 클래스
			new File() : File 클래스의 인스턴스 생성
			1. 메모리(Heap)에 File 클래스의 인스턴스를 생성한다는 의미
			2. 실제 하드디스크에 있는 물리적인 파일/폴더(디렉토리)를 생성하는 것이 아니다.
			3. 실제 파일/폴더(디렉토리)를 만들기 위해서 File 클래스의 함수를 호출해서 사용해야 된다.
			                                    ex) f.createNewFile()
		*/
		
		File f = new File("ccc");
		System.out.println("File 클래스 참조변수 f >>> : " + f);
		System.out.println("f.getName() >>> : " + f.getName());
		boolean sss = f.createNewFile(); // createNewFile() 함수를 쓰려면 throws IOException 
		// -> import java.io.IOException
		// 현재 있는 디렉토리에 ccc 파일 생성.
		System.out.println("sss >>> : " + sss);

		boolean b = f.isDirectory();
		System.out.println("b >>> : " + b);
		boolean b1 = f.isFile();
		System.out.println("b1 >>> : " + b1);
		
		File f1 = new File("ddd.txt");
		System.out.println("File 클래스 참조변수 f1 >>> : " + f1);
		System.out.println("f1.getName() >>> : " + f1.getName());
		boolean www = f1.createNewFile(); // ddd.txt 생성
		System.out.println("www >>> : " + www);
		boolean bb = f1.isDirectory();
		System.out.println("bb >>> : " + bb);
		boolean bb1 = f1.isDirectory();
		System.out.println("bb1 >>> : " + bb1);


		/*Q)  폴더 위치를 복사 붙여넣기하면 파일세퍼레이터가 반대로 되는데, 이대로 실행하면 x?
		File f22 = new File("C:\00.KOSMO72\00.JExam\ch5\fff1.txt");
		System.out.println("File 클래스 참조변수 f4 >>> : " + f22);
		System.out.println("f1.getName() >>> : " + f22.getName());
		boolean zzz1 = f22.createNewFile(); 
		System.out.println("zzz1 >>> : " + zzz1);

		//	C:\00.KOSMO72\00.JExam\ch5>javac -d . FileTest.java
		//	FileTest.java:46: error: illegal escape character
		//					File f22 = new File("C:\00.KOSMO72\00.JExam\ch5\fff1.txt");
		//																^
		//	1 error
		*/		

		File f2 = new File("C:/00.KOSMO72/00.JExam/ch5/fff.txt");  // -> 이 위치에 fff.txt 를 만들어라.
		System.out.println("File 클래스 참조변수 f1 >>> : " + f2);
		System.out.println("f1.getName() >>> : " + f2.getName());
		boolean qqq = f2.createNewFile(); // ddd.txt 생성
		System.out.println("qqq >>> : " + qqq);
		boolean bbb = f2.isDirectory();
		System.out.println("bbb >>> : " + bbb);
		boolean bbb1 = f2.isDirectory();
		System.out.println("bbb1 >>> : " + bbb1);
		
		File f3 = new File("sgs.jpg");
		System.out.println("File 클래스 참조변수 f3 >>> : " + f3);
		System.out.println("f1.getName() >>> : " + f3.getName());
		boolean zzz = f3.createNewFile(); 
		System.out.println("zzz >>> : " + zzz);
		boolean bbbb = f3.isDirectory();
		System.out.println("bbbb >>> : " + bbbb);
		boolean bbbb1 = f3.isDirectory();
		System.out.println("bbbb1 >>> : " + bbbb1);


/*
		File f3 = new File("ddd.txt");
		System.out.println("File 클래스 참조변수 f1 >>> : " + f1);
		System.out.println("f1.getName() >>> : " + f1.getName());
		boolean sss = f3.createNewFile();  // throws IOException  빠짐
		System.out.println("sss >>> : " + sss);
*/

	}

}