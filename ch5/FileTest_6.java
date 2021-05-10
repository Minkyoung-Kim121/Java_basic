package a.b.c;

import java.io.File;
import java.io.FileInputStream;

public class FileTest_6{

	public static void main(String args[]){
		
		FileInputStream fis = new FileInputStream("abcd");
		File f = new File("aa/bb/cc");
		f.mkdirs();
		//  aa 디렉토리 안에 bb 디렉토리 안에 cc 생성.
		// .mkdirs() 함수 : 
		
		fis.close();
		fis = null;

		if (true)
		{
			System.out.println("say hello");
		}
	}
}