package a.b.c;

// rt.jar �ڿ� ���
// java.lang.* ��Ű���� import �� �ڹٿ��� �������ش�. 
// java.lang ��Ű�� �̿��� �ڿ��� ���� import �ؼ� ����ؾ� �Ѵ�. .
// ������ ������ ���� ����ϼ��� 
import java.io.File;
import java.io.FileInputStream;  // ���ϸ��� �о���� read()
import java.io.FileOutputStream; // ���� �ȿ� �����͸� �Ẽ ���̴�. write()
import java.io.IOException;
import a.b.c.common.FilePath;
// io ��Ű���� Ŭ���� 86�� 
// import java.io.*;

public class FileOutStreamTest_tc{

	public static void main(String args[]){	

		// �������� ���� �� �ʱ�ȭ 		
		FileInputStream fis = null;  //  fis   ������ �Է� ������Ʈ�� ���
		FileOutputStream fos = null; //  fos   ������ ��� ������Ʈ�� ���
		int data = 0; // 1 byte �� �б� ������ int data �� �׻� �����ؾ�!

		try
		{
			// ����� �ڿ� �ν��Ͻ� �ϱ� 
			File ff = new File("FilePath.FILE_OUT_PATH");
			fis = new FileInputStream(ff);
			System.out.println("fis >>> : " + fis);
			fos = new FileOutputStream("FileOutStreamTest.bak", true);
			// write() �� ������ �Լ��̱� ������ �ݵ�� .bak �� ��θ� �ٸ��� �����ؾ� �Ѵ�.
			// FileOutputStream(String, boolean append)   ���� ����
			System.out.println("fos >>> : " + fos);
			
			// ���� ������ �ִ��� Ȯ���ϱ� 
			boolean ffBool = ff.exists();
			// boolean Ÿ���� ���� : �ִ��� ������(.exists()) ���θ� �Ǵ��ϱ� ������
			// true  or   false
			System.out.println("ffBool >>> : " + ffBool);

			if (ffBool)   // if ffBool's result is true.
			{
				//���� ������ ������ �о���� 
				//�о�� ������ ���Ͽ� ���� 
				while ((data=fis.read()) != -1)
					// InputStream �迭�� ���� �о�ö��� while ó�� ��ü�� �о������� �����ִ�(?) �Լ��� 
					// ������ �޾ƾ�.
					// �ֳ��ϸ� ������ �����͸� read() �� ���̱� �����̴�.
				{
					System.out.print((char)data);
					// (char) ����� �Ѵ�!!
					// �ֳ��ϸ� int �� �޾ƿ��� ����(1 byte)
					fos.write(data);
					// ������ �޾Ƽ�(read) 2byte�� �ٲ㼭(char) ����(write) ������(data)
				}		
			}else{
				System.out.println(" ����Ϸ��� �ش� ������(������)�� �����ϴ�. ");
			}
		
			// io �� ���� ���� ���� ������ �ݴ�� �ݴ´�. 
			fos.close();
			fos=null;
			fis.close();
			fis=null;
		}
		catch (Exception e) // catch �� �׻�   (Exception e) �� �޴´�.
		{
			System.out.println("e >>> : " + e);
		}
		finally{
			//try ������ ���� �߻��� 
			//����� �ڿ� �ݱ� (�������)
			if (fos !=null)
			{
				try{fos.close(); fos=null;}catch (Exception e){}
			}
			if (fis !=null)
			{
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}
	}
}