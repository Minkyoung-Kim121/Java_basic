package a.b.c;

import java.io.FileReader;
import java.io.File;
import a.b.c.common.FilePath;

public class FileReaderTest{

	// ������ ��� ó�� : ��� + ���ϸ� + Ȯ���ڸ�
	// public static final String FILE_PATH_READER = "FileReaderTest.java";

	public static void main(String args[]){
		// ���������� ��� �ϴ� �� 
		// : �������� �Լ����� �¾�� �Լ����� �״´�. ���̴� ���� GC(�������÷��� �� �Ѵ�.)
		// FileInputStream fis
		// int data

		// �Լ� �ȿ��� ����ϴ� ��ü�� �⺻������ default ������ �ʱ�ȭ �Ѵ�. 
		// ��ü�� default ���� null �̴�. 
		// ��ü �� ����� �ϴ� ��ü(io ��Ű��, connection etc.)�� 
		// ������(MUST) null �ʱ�ȭ �ؼ� ��� �Ѵ�.
		// ��) java.io.FileInputStream, java.io.FileOutputStream
		//     java.sql.Connection, java.sql.Statement, 		
		//     java.sql.PrparedStatement, java.sql.ResultSet etc.
		FileReader fr = null;
		// �����ڷ��� �ʱ�ȭ : default �� : �������� 0 �̴�. 
		int data = 0;

		/*
			try �� ������� 
			1. FileInputStream(File) : �����ڴ� FileNotFoundException ó���� �ؾ� �Ѵ�. 
			2. close() �Լ� : IOException ó���� �ؾ� �Ѵ�. 
			3. �� ����ó���� �����ϴ� Exception ���� Ŭ������ catch() ���� ��� 
		*/
		try
		{
			// File Ŭ������ �̿��ؼ� ������ �����Ѵ� : ����� �޸𸮿� ������ 
			// FileInStreamTest.FILE_PATH : �����̸� �� ��δ� ����� ó�� �Ѵ�. 
			// File f = new File(FileInStreamTest.FILE_PATH);
			File f = new File(FilePath.FILE_PATH_READER);

			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);

			if (bFile)
			{
				// FileInputStream(f) �����ڸ� �̿��ؼ� 
				// ������ �ν��Ͻ� �� �Ŀ� �������� fis �� ����Ű���� �Ѵ�. 
				fr = new FileReader(f);
				// ������ �о���� stream �� ���ȴ�
				// C:\\00.KOSMO72\\00.JExam\\ch5\\FileInStreamTest.java
				// ȭ���� ���� �� �ִ� �غ� �Ǿ���.
				System.out.println("fr >>> : " + fr);

				// ������ ���Ͽ��� �����͸� �о� ���µ� 
				// fis ���������� ����Ű�� ���Ͽ��� read() �Լ��� 1byte �� �о�´�. 
				// int�� data ������ fis.read() �� �о�� ����Ʈ�� �ϳ��� �����Ѵ�. 
				// != -1 �� �ǹ̴� ������ ���� �ǹ��Ѵ�.
				// while ((data=fis.read()) !=-1){} �� fis ���������� ����Ű�� ������
				// ������ �о� ����� �ǹ��̴�. 
				while ((data=fr.read()) !=-1)
				{
					// System.out.print(data);
					// System.out.print(Integer.toBinaryString(data));

					// �о�� �����͸� ���ڷ� ����ȯ �ؼ� �ֿܼ� ����Ѵ�. 
					System.out.print((char)data);
				}

				// �����ϰ� , �ν��Ͻ� �ؼ� ����� �� �� ���� ��ü�� 
				// �� �ݾ� �־�� �Ѵ�. 
				fr.close(); 
				// GC(������ �÷���)�� �ٺ��� �ش� ��ü�� �޸𸮿��� �������� ���� ���� ����ؼ�
				// �ش� ��������(���⼭�� fis)�� �����Ͱ� ���ٴ� �ǹ̸� �ο��ϴ� �� 
				fr=null;
			}
			else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
		}
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		finally{
			/*
				���� try �� ������� ���� �ϴ� 
				���ܰ� �߻��ؼ� try �� �ߵ��� ���߰� 
				fis.close(); ������ ������ �ʵǸ� 
				fis ���� ������ ��ü�� ������ �����Ƿ� 
				finally ������ 
				�ش� �ϴ� fis ���������� null ���� üũ�ؼ� 
				null ���°� �ƴϸ� �ش� ���������� close() ó���Ѵ�. 
				close() �Լ��� ó�� �� ���� ����ó���� ���� ����ؾ� �Ѵ�. 
			*/
			if (fr !=null)
			{				
				try{ 
						fr.close(); 
						// GC(������ �÷���)�� �ٺ��� �ش� ��ü�� �޸𸮿��� 
						// �������� ���� ���� ����ؼ�
						// �ش� ��������(���⼭�� fis)�� �����Ͱ� ���ٴ� �ǹ̸� �ο��ϴ� �� 
						fr=null;
				   } catch (Exception e){}
			}
		}
		
	}
}