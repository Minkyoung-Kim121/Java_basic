package a.b.c;

import java.io.FileInputStream;
import java.io.IOException;

public class IOTest_1{
	public static void main(String args[]) throws IOException{

		FileInputStream fis = new FileInputStream("IOTest_1.java");
		System.out.println("fis >>  " + fis);

		int data = fis.read(); // �� FileInputStream�� �ִ� int �� �������� fis�� byte �� �о��ּ���.
		// .read() �Լ� :  (java.lang.Object -> java.io.InputStream -> java.io.FilterInputStream
		//                  �� �ִ� read() �Լ�)
		//              Reads the next byte of data from this input stream.
		//  The value byte is returned as an int in the range 0 to 255.
		//     : ��Ʈ ���� 0 - 255 ������ ���� ��ȯ�ϰ�
		//  If no byte is available because the end of the stream has been reached, the value -1 is returned.
		//     : -1 �̶� ��, ���̻� ��ȯ�� byte ���� ���ٴ� ��(��Ʈ���� ���� ����)
		//  This method blocks until input data is available,
		//  the end of the stream is detected, or an exception is thrown. 
		System.out.println("data >> " + data);
		System.out.println("(byte)data >> " + (byte)data);
		System.out.println("(char)data >> " + (char)data);
		
		//�ѱ��� 2byte�ε� inputStream�� 1byte�� �Է¹ޱ� ������ ���� ���Ѵ�.
		//�ֹ߼� �޸�
		while((data = fis.read()) != -1){
			System.out.print((char)data);
		}
/*
		while((data = fis.read()) != -1){//������ ������
			System.out.println(  " : " + data
				               + " : " + (char)data
							   + " : " + Integer.toBinaryString(data));

		}
*/
	}
}