package a.b.c;

import java.io.File;
//  File  �� ����&���丮�� ��������, �� ���� �����ʹ� �а� �� ���� x
//  �׷��� .txt �ȿ� �����͸� �а� ���� ���� 
//  Stream �迭�� Ŭ������ �̿��ߴ�.
import java.io.InputStreamReader;
// InputStreamReader : 
// public abstract class InputStream extends Object implements Closeable
import java.io.FileInputStream;
// FileInputStream  : InputStream�� File �� �ٿ��ٰ� ��������.
//                    1byte ������ ������ �б� ������, �ѱ��� ���� �� ����.
import java.io.IOException;
// ���� ó�� ����
import a.b.c.common.FilePath;
// ����� ���� ���.
public class InStrReadTest{

	public static void main(String args[]) throws IOException{
		/*	
			InputStreamReader isr = 
				new InputStreamReader(
				new FileInputStream("FileInStreamTest.java"));
			while ((data=isr.read()) !=-1)
			{
				// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
				System.out.print((char)data);
			}
		*/

		// �������� ����     �ۿ��ٰ� ���� ���� try, if �������� ������� ��� ����.
		// File �迭 Ŭ������ �׻� null;�� �ʱ�ȭ ���־�� �Ѵ�.
		// ���� : �ٸ� �ɷ� �ϸ� ��������....
		// + ���� �ڿ��� �پ��� .close()�� �� �� null; �� ����(?) �ؼ� ���α׷��� �������� Ȯ������.
		File ff = null;  
		FileInputStream fis = null;
		// fis �� FileInputStream ����, 1 byte �� �о����!
		InputStreamReader isr = null; 
		// byte -> char ��ȯ�ϴ� ������Ʈ�� Ŭ���� 
		// 1 byte �� 2byte ������ �б� ������ �ѱ� ���� ���� �� �ִ�.
		int data = 0;
		boolean bFile = false;  // (append)
		// File �а� ���ִ� �迭�� Ŭ�������� ������ ��ģ���� ���� ����.
		// �׷��� �׻� try-catch �������� ����ó���ؼ� ������ �޾ƾ� �Ѵ�.
		// ex) FileInputStream �� �Է� ������Ʈ���̰� ��ü(�����̳� ���丮)�� ������ ��,
		//                     ������ ������(������ �����ص� ���޸𸮿��� ������ �ȴٸ�),
		//                     ������ �߻��ϴϱ�!(�������� �ϵ�޸𸮿��� ������ �����ϱ�)

		try
		{
			ff = new File(FilePath.FILE_PATH);	
			// ff �� ���ο� ������ ����ǵ�, (new Ű���带 ����ؼ� File Ŭ������ �Լ��� ���)
			// (FilePath.FILE_PATH)  ������ ��δ� ����� ����Ѵ�.
			//  FilePath�� �ִ� FILE_PATH�� ����� ���̴�.
			// FilePath.java
			//  -> public static final String FILE_PATH = "FileInStreamTest.java"
			bFile = ff.exists(); // �����Ͱ� �ִ��� Ȯ���ϴ� ����
			// .exists() �Լ� : ~~�����Ͱ� �����ϴ���??
			// .exists() �Լ��� �������� ff �� ���� ���� bFile �̴�.
			if (bFile)  // ����, bFile �̸�  (ff�� �����Ͱ� exists �Ѵٸ�)
			{
				fis = new FileInputStream(ff);
				// fis ���� ����
				// fis�� ff�� 1byte ������ �о��
				isr = new InputStreamReader(fis);
				// isr �������ϱ�
				// isr �� fis(ff�� 1byte ������ ���� ��)�� 2byte�� �о��
				while ((data=isr.read()) !=-1)//data=isr.read()�� ���� ������ �� ��,
					// .read() �Լ� : �о��ִ� �Լ�
					//             InputStream ó�� �����Ͱ� ���ͼ� �д� ����� �ϴ� Ŭ�������� �����Ѵ�.
					//             cf. OutputStream �迭���� ���� ���̱� ������, read() ��� write() ����.

				{
					System.out.print((char)data);
					// (char) �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�.
					//        �ֳ��ϸ� InputStreamReader�� 2byte �� �����ϱ�?
					//  => ff�� 2byte �� ������ ���� ���� ����ض�.
				}

			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
			
			isr.close();
			// isr ���� �ݰ�
			isr=null;

			fis.close();
			// fis �ݴ´�.
			fis=null;
		}
		catch (Exception e)  //  catch ���� ����ó���ϴ� ���� 
		{
			System.out.println("e >>> : " + e);
		}
		finally{
			// finally ���� : try-catch �������� ���� �߻� �� �ڿ��� ���� ���ϴϱ�,
			// (.close() �� catch�� �ƴ� try���� ȣ���߱� ������
			//  try���� ���ܰ� �߻��ؼ� catch ������ ����Ǹ� �ڿ��� ���� ����)
			// ������ �߻��ϴ��� finally{} �����������̶� ��� �ڿ��� �ݱ� ���� �����.
			//    => �� ���� ������ �������� ����
			if (isr !=null) // isr �� null�� �ƴ� �� 
							//-> try ������ isr ���� �������� �����͸� �޾Ƴ��� ������ null�� ���� x
							//   null �̸� isr ���� ������ ���� �޾ƿ��� ���� ��.
							//   => isr �� ���� �ִµ�, ������ ���� ���⿡�� �ڿ��� ���� �Ŵϱ�!
			{
				// �� ���� try-catch {}�� �޴� ������ ???
				//   .close() �Լ��� ó���� ��, �� �ڿ��� ���� ���� ������ ���� �߻��ϱ� ����!!
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (fis !=null)
			{
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}
	}
}