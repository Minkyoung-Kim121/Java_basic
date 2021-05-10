package a.b.c;

// rt.jar �ڿ� ���
// java.lang.* ��Ű���� import �� �ڹٿ��� �������ش�. 
// java.lang ��Ű�� �̿��� �ڿ��� ���� import �ؼ� ����ؾ� �Ѵ�.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import a.b.c.common.FilePath;

//   read()   :  �� byte �б�
//               ex) java.read()   ->  j �� �б�
//   write()  :  ���� ����� �Լ�
//   close()  :  �ڿ��� ����(byte �� �а� ����) ���� �׻� �ݾ��ֱ�.

// �̷��� �������ƶ�. -> ������ ������
//import java.io.*;

public class FileOutStreamTest{

	public static final String FILE_PATH = "FilePath.FILE_OUT_PATH";

	public static void main(String args[]){

		// �������� ���� �� �ʱ�ȭ
		//	FileInputStream fis = new FileInputStream("FileOutStreamTest.java");
		FileInputStream fis = null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		// 
		int data = 0;

		
		// try{} catch{} ����
		try
		{
			// ����� �ڿ� �ν��Ͻ� �ϱ�
			File f1 = new File("FileOutStreamTest.java");
			System.out.println("f1 >>  " + f1);
			
			// ���� ������ �ִ��� Ȯ���ϱ�
			boolean bFile1 = f1.exists(); // ������� ġ���� �������ϰ� ������ �ִ��� ��¥ Ȯ������
			System.out.println("bFile1 >>> : " + bFile1);

			if (bFile1)
			{	
				// ���� ������ ������ �о����
				fis = new FileInputStream(f1);
				System.out.println("fis >>> : " + fis);
				
				// �о�� ������ ���Ͽ� ����
				while((data = fis.read()) != -1)
				{
					System.out.print((char)data);
					al.add(data);
				}
				// ����� �ڿ� �ݱ�
				fis.close();
				// io �� ���� ���� ���� ������ �ݴ�� �ݾƾ� �Ѵ�.
				// �׻� null �� �ʱ�ȭ;
				fis = null;

			}else{
				System.out.println("�ش� ��ο� ������ �������� �ʽ��ϴ�. >>> : ");
			}
		}
		// catch{} ���� (����ó��)
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		// finally{}
		finally
		{	
			// try{} ������ ���� �߻���
			if (fis !=null)
			{
				try
				{	
					// ����� �ڿ� �ݱ�
					fis.close();
					// �׻� null �� �ʱ�ȭ;
					fis = null;
				}
				// catch{} ���� (����ó��)
				catch (Exception e) // IOException    x 
				{
				}
			}

		}



		// �������� ���� �� �ʱ�ȭ
		FileOutputStream fos = null;
	//	FileOutputStream fos = new FileOutputStream("FileOutStreamTest.bak");
		int data1 = 0;
		// try{} catch{} ����
		try
		{
			// ����� �ڿ� �ν��Ͻ� �ϱ�
			File f2 = new File("FileOutStreamTest.bak");
			System.out.println("f2 >>> : " + f2);
			// ���� ������ �ִ��� Ȯ���ϱ�
		//	boolean bfile2 = f2.exists();
		//  FileOutputStream ���� boolean �� �� ����...?  ��???

		//	System.out.println("bfile2 >>> : " + bfile2);
			
		//	if (bfile2)
			//{	// ���� ������ ������ �о����
				fos = new FileOutputStream(f2);
				System.out.println("fos >>> : " + fos);
				// �о�� ������ ���Ͽ� ����
				for(int i=0; i<al.size(); i++)
				{
					data = al.get(i);
					// 
					fos.write(data);
				}
			//}
				// ����� �ڿ� �ݱ�
				fos.close();
				// �׻� null �� �ʱ�ȭ;
				fos = null;
				
		}
		// catch{} ���� (����ó��)
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		// finally{}
		finally   // try������ ���� �߻� �� ����� �ڿ��� finally ���� �ݾ��ش�.
		{
			// try{} ������ ���� �߻���
			if (fos !=null)
			{
				try
				{	
					// ����� �ڿ� �ݱ�
					fos.close();
					// �׻� null �� �ʱ�ȭ;
					fos = null;
				}
				// catch{} ���� (����ó��)
				catch (Exception e)
				{
				}
			}
		}
				
	} // end of main()

} // end of FileOutStream class

/*
1)
FileInputStream :  
.read()   �����͸� �о��
FileOutputStream : ������
.read() ��� .write() �� ��µ�, write() �Լ��� �����͸� ������� ��� �Լ�,
���� ��θ� �Ȱ��� ������ �ָ� ���� ġ�� �ִ� �ڵ� ���Ͽ� �״�� write() �Ǳ� ������
.bak ��� ���Ϸ� ��θ� �����Ͽ� write() �� ���ִ� ��.

2)
������ fis �� fos �� ���� �����ؼ� �Ȱ��� ������� �� ���ٰ�,
while ������ fis �� read() �Լ���, fos �� write() �Լ���

*/
