package a.b.c;

import java.io.FileInputStream;
import java.io.File;
import a.b.c.common.FilePath;

// �ܼ� ��� �� �ѱ��� ������ ����) byte ������
public class FileInStreamTest_mk{

	// ������ ���ó�� �Ѵ�.   : ������    ��� + ���ϸ� + Ȯ���ڸ�
	//public static final String FILE_PATH = "FileInStreamTest.java";   // FILE_PATH �� ����� ���
	//     pubic staic main() �̱� ������ ����() �ȿ� static final ����� �� �� ������ ����.
	public static void main(String args[]){
		// FileInputStream fis // ���������� ����ϴ� �� 
		// int data // ���������� ����ϴ� �� 
		//                   (���������� �Լ� �ȿ��� �¾�� �Լ� �ȿ��� ����ϴ� ��)
		//                   (���, �� ���̴� ���� GC- �������÷��� �� �����Ѵ�.)

		// �Լ� �ȿ��� ����ϴ� ��ü�� �⺻������ default ������ �ʱ�ȭ �Ѵ�.
		// ��ü��  default ���� null �̴�.

		// ��ü �� ����� �ϴ� ��ü(io ��Ű��, connection etc.)�� 
		// ������(MUST) null �� �ʱ�ȭ �ؼ� ����Ѵ�.
		// ex) java.io.FileInputStream, java.io.FileOutputStream
		//     java.sql.Connectionm java.sql.Statement, java.sql.PreparedStatement
		//     java.sql.ResultSet    etc.
		//    + io ( ��Ű�ü) �� ����ϱ� ���ؼ�
		//      * InputStream, * OutputStream ���� ����ϴ� ���̴�.

		FileInputStream fis = null;
		int data = 0;  // �����ڷ��� �ʱ�ȭ �� ��.   default ��    �������� 0;

		/*       ��û �߿�       
			try �� ����� ����)
			1. FileInputStream(File) : �����ڴ� FileNotFoundException ó���� �ؾ��Ѵ�.
			2. close() �Լ� : IOException ó���� �ؾ� �Ѵ�.
			3. �� ����ó���� �����ϴ� Exception ���� Ŭ������ catch() ���� ���
		*/
		// ����ó���� �� �� close�� � Exception�� ���� �ִ��� �˾ƾ� �ϴµ�, �׳� �� �ļ� Exception!
		// �̷��� �˰� �ִ� ���� �ƴ϶� Ŭ����, ������ ������ ����� �Ĳ��ϰ� �ּ��޾Ƽ� �˰�
		// ��Ȯ�ϰ� Exception ó���� ����.
	 
		try   // �� null �� �����ؼ� null�� �޾ƾ� �ϴµ�,
	 		  // ���� �� ������ �� �� �����ϱ� �ݵ��(?) try-catch �������� �޾ƾ��Ѵ�.
		{	
			// File Ŭ������ �̿��ؼ� ������ �����Ѵ�. 
			//                                : ����� �޸𸮿� ������.(������ ������ ���� x)

			File f = new File(FilePath.FILE_PATH);
			// FileInStreamTest.FILE_PATH   : �����̸� �� ��δ� ����� ó���Ѵ�.
			fis = new FileInputStream(f);
			// �������� fis �� FileInputStream(f) �����ڸ� �̿��ؼ� ������ �ν��Ͻ� �� ��,
			// �������� fis �� ����Ű���� �Ѵ�.
			System.out.println("fis >>> : " + fis);
			// fis >>> : java.io.FileInputStream@15db9742

			while ((data=fis.read()) !=-1)
			// ������ ���Ͽ��� �����͸� �о� ���µ�, 
			// �������� fis�� ����Ű�� ���Ͽ��� read() �Լ��� ����ؼ� 1byte �� �о�´�.    �� �ǹ�
			// int �� data ������ fis.read() �� �о�� byte�� �ϳ��� �����Ѵ�.
			// !=-1   : ������ ���� �ǹ��Ѵ�.
			// while ((data=fis.read()) !=-1){}    �� �������� fis �� ����Ű�� ������ ��(-1)����
			//                                     �о����� �ǹ��̴�.
			{
				//System.out.print(data);
				//System.out.print(Integer.toBinatyString(data));
				System.out.print((char)data);
				// �о�� �����͸� ����(char)�� ����ȯ�ؼ� �ֿܼ� ����Ѵ�.
			}

			fis.close(); // �׻� close ����� �Ѵ�.
			// �����ϰ�, �ν��Ͻ��ؼ� ����� �Ϸ��� ���̸� ��ü�� �ݵ�� �ݾ��־�� �Ѵ�.
			fis = null; // fis = null �� �ʱ�ȭ �ϴ� ����)
						//   ������ �÷���(GC) �� �ٺ��� �ش� ��ü�� �޸𸮿��� �������� ���� ��츦
						//   ����ؼ� �ش� ��������(���⿡���� fis) �� �����Ͱ� ����(�� �����ִ�)�� �ǹ̸� �ο��ϴ� ��.
		}

		
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		finally{
				/*
				���� try ���� ����(����) ���� �����ϴٰ� ���ܰ� �߻��Ͽ� try �� �߰��� ���߰�,
				fis.close(); ������ ������� ������
				fis ���� ������ ��ü�� ������ �ʱ� ������,
				finally ������ �ش��ϴ� �������� fis �� null ���� üũ�Ͽ� null ���°� ���� �ʾҴٸ�,
				�ش� ��������(fis)�� close() ó���Ѵ�.
				*/
			if (fis !=null) 
			
			{
				
				try
				{
					fis.close();
					// close() �Լ��� ó�� �� ����,.
					// ����ó�� ���� ���� ����ؾ� �Ѵ�.
					fis = null; 
					// fis = null �� �ʱ�ȭ �ϴ� ����)
					//      ������ �÷���(GC) �� �ٺ��� �ش� ��ü�� �޸𸮿��� �������� ���� ��츦
					//      ����ؼ� �ش� ��������(���⿡���� fis) �� �����Ͱ� ����(�� �����ִ�)�� �ǹ̸� �ο��ϴ� ��.
				}
				catch (Exception e) // ����ó�� ���� ���� ����ؾ� �Ѵ�.
				{
				}
			}
		}
		

//		String filePath = "FileInStreamTest.java";
//		File f = new File(filePath);
//		FileInputStream fis = new FileInputStream(f); 
		
		// File �� ���ϸ� + Ȯ���ڷ� �����Ǿ��ִ�.
		//            �׸��� ��α��� �˾ƾ� �Ѵ�.
		// FileInputStream �� ����Ϸ��� �����ڿ� String filePath ���� �����ؼ� �ƱԸ�Ʈ�� ���? �Ű�����?
		// Q)  ������ ���� ��� new get instance �� 4���� ��� �����ϱ�.
//		System.out.println("fis >>> : " + fis);


	} // end of main()

}