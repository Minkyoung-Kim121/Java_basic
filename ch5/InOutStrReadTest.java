package a.b.c;

import java.io.File;
import java.io.InputStreamReader;
// InputStreamReader   :  �Է� ������Ʈ��
//                        2 byte ������ �б� ������ �ѱ۵� ���� �� �ִ�.
//                        1byte  ��  2byte �� �ٲ��ִ� ����.
import java.io.OutputStreamWriter;
// OutputStreamWriter  :  ��� ������Ʈ��
//                     :  1byte  ��  2byte �� �ٲ��ִ� ����.
//                     :  �׷��� �ѱ��� ������ �ʰ� ������.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import a.b.c.common.FilePath;
// package a.b.c.common;

public class InOutStrReadTest{

	public static void main(String args[]) throws IOException{
		
		File ff = null;
		FileInputStream fis = null;
		// 1 byte
		FileOutputStream fos = null;
		// 1 byte
		InputStreamReader isr = null; // byte -> char ��ȯ�Ѵ� io ������Ʈ�� Ŭ���� 
		// InputStreamReader   ������Ʈ���� �ݵ�� flush �� �ؼ� ��������� �Ѵ�.
		// 2 byte
		// ���� ȿ�������� �б� ���ؼ��� BufferedReader ���.
		OutputStreamWriter osw = null;
		// 2 byte
		int data = 0;
		//boolean bFile = false; // bFile�� ���� �������� ������, ������ �߰� ������ �Ƹ�
							   // ���� ������Ÿ���� �ؿ� bFile ���� Ȯ�ν� ���� �������ָ� ��� x

		try
		{
			ff = new File(FilePath.FILE_PATH); // ����� ���� ����
			boolean bFile = ff.exists(); // ������(bFile) �����ϴ��� Ȯ���ؾ�( ������ )

			if (bFile)
			{
				fis = new FileInputStream(ff);
				// 1 byte �� ������ �о����
				isr = new InputStreamReader(fis);
				// 2 byte �� ������ ��ȯ�ϰ�(�Է�)
				fos = new FileOutputStream("zzzzz.txt");
				// 1 byte �� ������ ����ϰ�("zzzzz.txt" ���ϸ�����)
				// ����� ��� �� ���� ���ϴ� ��. 
				// ����!!!!!������ ��½� write() �Լ��� ��� -> �̰��� ������ �Լ�
				//     ����!!! ����ؼ� �� Ȯ���ڸ� �����ϰų�, �������� �ٸ� ��ο� �����ؾ�!
				osw = new OutputStreamWriter(fos);
				// 2 byte �� ������ ��ȯ�ϰ�(���)
				while ((data=isr.read()) !=-1) // �����͸� ������ �о�ðǵ�
				{
					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
					System.out.print((char)data);
					// int 1 byte �����͸� 2byte �� ��ȯ�ؼ� �о����
					// isr = new InputStreamReader(fis);
					osw.write(data);
					// ����� ����, 1byte->2byte ��ȯ�ϰ�
					// osw = new OutputStreamWriter(fos);
				}
				osw.flush();
				// flush() �ϱ� // OutputStreamWriter ���� ��Ʈ�� ������
				// write() �� ����ϴϱ�, �߰��� ������ �� ä������ �������� ���� 
				// ������ �������� �ϰ�.
				/*
				isr.close();
				isr=null;
				osw.close();
				osw=null;
				fis.close();
				fis=null;
				fos.close();
				fos=null;
				*/  
				//Q) �ڿ� �ٽ����� �ݾƵ� ���,,, �׷��� �� ���� ���⿡�� �� �ݰ� �ؿ��� �ݾҴ���???
			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
			//Q)   �ڿ� �ݴ� ������ �� �ٸ���...?
			isr.close();
			isr=null;
			osw.close();
			osw=null;
			fis.close();
			fis=null;
			fos.close();
			fos=null;
		}
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		finally{	
			// �������� try �� �������� ���⼭�� �ڿ� �ݰ�
			if (isr !=null)
			{
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (osw !=null)
			{
				try{osw.close(); osw=null;}catch (Exception e){}
			}
			if (fis !=null)
			{
				try{fis.close(); fis=null;}catch (Exception e){}
			}
			if (fos !=null)
			{
				try{fos.close(); fos=null;}catch (Exception e){}
			}
		}
	}
}