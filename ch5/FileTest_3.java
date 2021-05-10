package a.b.c;

import java.io.File;
import java.io.IOException;

public class FileTest_3{

	public static void main(String args[]) throws IOException{
		
		File f = new File("a.txt");  // 만든 파일을 메모리에만 올려놓음.
		boolean b0 = f.exists();  // 데이터가 있는지 확인하는 .exists() 함수
								  // 파일과 디렉토리를 컴퓨터는 같이 취급.
		System.out.println("b0 >>> : " + b0);  // false
		boolean b1 = f.isFile();
		// Tests whether the file denoted by this abstract pathname is a normal file.
		System.out.println("b1 >>> : " + b1);  // false
		boolean b2 = f.isDirectory();
		// Tests whether the file denoted by this abstract pathname is a directory. 
		System.out.println("b2 >>> : " + b2);  // false

		f.createNewFile();   // 실제로 파일을 만드는 함수
							 // 이 함수를 써야 물리적으로 만들어지고 true 가 나오게 됨
		boolean bb0 = f.exists();    
		System.out.println("bb0 >>> : " + bb0);  // true
		boolean bb1 = f.isFile();
		System.out.println("bb1 >>> : " + bb1);  // true
		boolean bb2 = f.isDirectory();
		// Q) mkdir()  해서 디렉토리를 만들어줘야 true 가 나온다....?
		System.out.println("bb2 >>> : " + bb2);  // false

	}
}

// public boolean mkdir()
// Creates the directory named by this abstract pathname.