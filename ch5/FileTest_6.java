package a.b.c;

import java.io.File;
import java.io.FileInputStream;

public class FileTest_6{

	public static void main(String args[]){
		
		FileInputStream fis = new FileInputStream("abcd");
		File f = new File("aa/bb/cc");
		f.mkdirs();
		//  aa ���丮 �ȿ� bb ���丮 �ȿ� cc ����.
		// .mkdirs() �Լ� : 
		
		fis.close();
		fis = null;

		if (true)
		{
			System.out.println("say hello");
		}
	}
}