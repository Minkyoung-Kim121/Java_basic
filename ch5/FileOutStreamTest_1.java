package a.b.c;

import java.io.FileOutputStream;
// FileOutputStream : ��� ������Ʈ��
//                    ����̱� ������ .read() �Լ� ����.
//                    ����! �����͸� ����� �� .write() �Լ��� ����ϱ� ������, ��θ� �ٸ��� �����ؼ�
//                    ���� �� �� ���� ġ���ִ� �ڵ� ������ �������� �ʰ� �����ؾ� �Ѵ�.
import java.io.File;
import java.io.IOException;
import a.b.c.common.FilePath;

// C:\00.KOSMO72\00.JExam\ch5\output.txt
// ��1) output.txt ������ ������ �빮�� A�� write �ϼ���.
public class FileOutStreamTest_1{


	//  public static final String FILE_PATH = "FileOutStreamTest_1.java";
	//  -> FilePath.java import �ؼ� ������

	public static void main(String args[]) throws IOException {
		
		/*   C:/00.KOSMO72/00.JExam/ch5/    �� output.txt �� �׳� �����ϴ� ��. �� �ȿ� �����͸� �аų� ������
			                                FileInputStream �Ǵ� FileOutputStream ���.
		File f1 = new File("C:/00.KOSMO72/00.JExam/ch5/output.txt");
		System.out.println("File Ŭ���� �������� f1 >>> : " + f1);
		boolean www = f1.createNewFile(); // output.txt ����
		System.out.println("www >>> : " + www);  
		*/
		//   File �� ������ ��������, �����͸� �а� ���� ����� �������� �ʴ´�. ���� "A" ���ڸ� File �� �ƴ� FileOutputStream ���� ���� ��.

		FileOutputStream fos = null;
		int data = 0;

		try
		{
			fos = new FileOutputStream("output.txt" , true);  
			// , false    o->     AAA
			// , true     x->     AAA
			// , true     o->     AAAAAA
			// Q)�� C:\00.KOSMO72\00.JExam\ch5\output.txt �� ������
			//   �ʾҴµ�, ch5 �� ����?? path �����߱� ����.
			// public FileOutputStream(String name, boolean append)   ���� ���� �Լ�
			//    boolean append �� true �� ��, ������ ���Ͽ� �����Ͱ� �߰��� ���Դϴ�.
			// fos �� FileOutputStream ("���ϸ�.Ȯ����", ���Ῡ��) �� ����ؼ�, �����͸� ���ǵ�
			// Ȯ���ڰ� .txt �� output �̶�� ���ϸ� (true)�����͸� �����ؼ� �� �غ� ���ƴ�.
			fos.write('A');
			// fos ��, output.txt�� 'A'�� .write() ������
			fos.write(65);  // 10����     // A
			fos.write(0x41);  // 16����      // A

			fos.close();   // �� ������ ����
			//fos.null;

		}
		catch (Exception e) 
		{
			System.out.println("e >>> : " + e);
			
		}
		
		finally
		// ���� try ������ ���ܰ� �߻��ϸ�  ����� �ڿ��� �ݱ� ���� finally ���.

		{
			if (fos !=null) // fos�� null �� �ƴϸ�
			{
				try
				{
					fos.close();
					fos = null;
				}
				catch (Exception e)  //  ��  IOException  x ����??  ���� throw �ؼ�.
				{
				}
			}
		}
	}
}