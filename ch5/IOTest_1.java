package a.b.c;

import java.io.FileInputStream;
import java.io.IOException;

public class IOTest_1{
	public static void main(String args[]) throws IOException{

		FileInputStream fis = new FileInputStream("IOTest_1.java");
		System.out.println("fis >>  " + fis);

		int data = fis.read(); // 이 FileInputStream에 있는 int 형 참조변수 fis를 byte 로 읽어주세요.
		// .read() 함수 :  (java.lang.Object -> java.io.InputStream -> java.io.FilterInputStream
		//                  에 있는 read() 함수)
		//              Reads the next byte of data from this input stream.
		//  The value byte is returned as an int in the range 0 to 255.
		//     : 인트 범위 0 - 255 사이의 값을 반환하고
		//  If no byte is available because the end of the stream has been reached, the value -1 is returned.
		//     : -1 이란 즉, 더이상 반환할 byte 값이 없다는 것(스트림의 끝에 도달)
		//  This method blocks until input data is available,
		//  the end of the stream is detected, or an exception is thrown. 
		System.out.println("data >> " + data);
		System.out.println("(byte)data >> " + (byte)data);
		System.out.println("(char)data >> " + (char)data);
		
		//한글은 2byte인데 inputStream이 1byte씩 입력받기 때문에 읽지 못한다.
		//휘발성 메모리
		while((data = fis.read()) != -1){
			System.out.print((char)data);
		}
/*
		while((data = fis.read()) != -1){//파일이 끝나면
			System.out.println(  " : " + data
				               + " : " + (char)data
							   + " : " + Integer.toBinaryString(data));

		}
*/
	}
}