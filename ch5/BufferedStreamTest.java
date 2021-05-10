package a.b.c;

// java.lang ��Ű�� : �ڵ����� import �ȴ�.
import java.io.BufferedInputStream;
// public class BufferedInputStream extends FilterInputStream
// BufferedInputStream  : �Է� ������Ʈ��
import java.io.BufferedOutputStream;
// BufferedOutputStream  : ��� ������Ʈ��
// Buffer) ���� -> ��Ʈ���� ��������� �����͵��� �ϳ��� ������ ���� �ƴ϶�,
//                Buffer(����) �� ��Ƽ� 8k(ex)�� ���� �ѹ��� ������ ��.
//                Buffer �� default �� ���� 8k(10k ��)
//                ex) 6k �� ��� ������ �����͸� ������ ���ϴµ� -> �� ��
//				      �� ���� ���� ���뿡 ��� �����͸� ������! �ϴ� ���� .flush()
//  .flush()   : write() ���� ����. (+ ����)
//               read() �� �о���� ����� �ϴϱ�, flush �� �ʿ� x
//               => ��� ������Ʈ������ �����Ѵ�.
//               + .close() �ݱ� ���� ��������ְ�(.flush()) �ݾƾ� �Ѵ�.
import java.io.FileInputStream;
// FileInputStream   :  �Է� ������Ʈ��
//                      1 byte ������ �Է� �ޱ� ������ �ѱ�(2 byte)�� ���� �� x
//                      ��ü�� ������ ��, ���ϰ� ����Ǵµ� ������ �������� x
//                      =>  �����δ� ������ ���� �޸�(RAM)���� �ö� �ֱ� ������, ������ �߻��ϴϱ�
//                          try-catch �������� ����ó�� �ؾ� �Ѵ�.
import java.io.FileOutputStream;
// FileOutputStream   :  ��� ������Ʈ��
//                       read() �Լ��� ���� write() �Լ��� �����Ѵ�.
//                       ����) ������ ����ؼ� �� ��, write()�� ����� ������ �ٸ����(.bak)�� �����ؾ� �Ѵ�.
//                       close()�� �ݾƾ� �Ѵ�.
//                    ������("", true)  : ����)  boolean
//                                            ���� ���� ���� �����͸� �߰��ϴ� ���
//                                            �������� �Ű����� true�� �ش�.
import java.io.IOException;  // ����� ����

public class BufferedStreamTest{
	public static void main(String args[])
	{
		BufferedInputStream inBuffer = null;  
		// BufferedInputStream  �� inBuffer �� null �� �ʱ�ȭ �ߴ�.
		// File �迭 Ŭ������ null; �� �ʱ�ȭ �ϴ� ����
		//		    : ���𰡸� �аų� ���� ���� ����(����)(null)�� �����ϰ� ����
		//			  �غ� �ϱ� ����
		BufferedOutputStream outBuffer = null;
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		
		String fileSeparator = System.getProperty("file.separator");
		//  file.separator : ���� ���й���
		// .getProperty() �Լ�   : ��ȣ �ȿ� �־��� Ư�� ���ڸ� ��������� �� ���� String ���� ��µȴ�.
		// .getProperty("file.separator");     
		//    -> String fileSeparator(��������)�� ���� ���й���(file.separator)�� 
		//       String ���� ����Ѵ�.
		System.out.println("fileSeparator >>> : " + fileSeparator);   // fileSeparator >>> : \ ���
		// cf.  window��  :  \
		//      ��������   :  /

		char fileSep = fileSeparator.charAt(0);
		// �������� fileSep �� fileSeparator(���� ���й��ڸ� String ���� ����� ��  = \)�� char �� ��ȯ��Ű�� 
		//                   ���ڷ� �ɰ���.
		//   => String ���� ��µ� \�� char ���� ���·� �ٲ㼭 �ɰ���.

		String inFilePath = "C:/00.KOSMO72/00.JExam/ch5"; // ��� ���ڿ� (���� ���й��ڸ� ���� ����)
		String outFilePath = "C:/00.KOSMO72/00.JExam/ch5";

		String inFileName = fileSep + "dataBuffer.txt";
		// fileSep  -> char ���·� ��µ� ���� ���й��� \ ��
		// + "dataBuffer.txt" �� �ٿ���
		String outFileName = fileSep + "dataBuffer.txt";
		// Q) ���� �Ȱ��� ������ inFileName   /   outFileName  �� ���������� ���� ������...?

		String inFullPath = inFilePath.concat(inFileName);
		// .concat(*) �Լ�   : �� ���ڿ� ���� �ٸ� ���ڿ�*�� ���̴� �Լ�.
		// cf. concatenation : ����, ������ �ǹ�
		// ex)  String firstname = "��";
		//      String lastname = "�ΰ�";
		//      String fullname = firstname.concat(lastname);//    "��ΰ�"  ("��"+"�ΰ�")
		//  => inFilePath �� inFileName �� ���� ���� inFullPath

		inFullPath = inFullPath.replace('/' , fileSep);
		// .replace("abc", "cdf") �Լ�   : "abc" �� ã�Ƽ� "cdf" �� �ٲ㼭 ��ȯ�ϼ���.
		//  ����)  ������ ���ڿ� "abc" �� ������ �Ǵ� ���� x    
		//        ������ ã�Ƽ� ������ ����, ���纻�� �ٲ㼭 ��ȯ�ϴ� ��.
		// => inFilePath + inFileName �ؼ� '/' �� �տ��� ����� ���ϱ�����(\)�� �ٲ� ���� inFullPath

		String outFullPath = outFilePath.concat(outFileName);
		//  outFilePath  +  outFileName     -> outFilePathoutFileName
		//   -> "C:/00.KOSMO72/00.JExam/ch5"+ \ + "dataBuffer.txt"
		outFullPath = outFullPath.replace('/' , fileSep);
		// "C:/00.KOSMO72/00.JExam/ch5"+ \ + "dataBuffer.txt"
		//  ->  "C:\00.KOSMO72\00.JExam\ch5"+ \ + "dataBuffer.txt"
		//  =>  "C:\00.KOSMO72\00.JExam\ch5\dataBuffer.txt"

		try
		{
			// ���� ����
			outFile = new FileOutputStream(outFullPath, true);
			// ("C:\00.KOSMO72\00.JExam\ch5\dataBuffer.txt", �� ���� ���ڸ� �߰� ������ ���̴�.)
			outBuffer = new BufferedOutputStream(outFile);
			// outFile �� ��º�����Ʈ������ �����ǵ�,

			int c = 0;

			//for ��
			for (int i=0; i < 10; i++ )
			{
				outBuffer.write(i + '0');
				 // '0' ���� ������ �ؿ� (char)�� ����ȯ�Ҷ� �̰� �ȳ����� ���� �̻��ϰ� ���ͼ�
			}

			outBuffer.flush();
			// outBuffer �� BufferedOutputStream �̱� ������ flush() ����� �Ѵ�.

			inFile = new FileInputStream(inFullPath);
			inBuffer = new BufferedInputStream(inFile);
			while ((c = inBuffer.read()) != -1)
			{
				System.out.print((char)c + " ");
			}
				
			inBuffer.close();
			outBuffer.close();
			inFile.close();
			outFile.close();
		}
		catch (IOException e)
		{
			System.out.println("e >>> : " + e);
		}
		finally
		{						
			if (inBuffer !=null)
			{
				try
				{
					inBuffer.close();	
					inBuffer = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (outBuffer !=null)
			{
				try
				{
					outBuffer.close();	
					outBuffer = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}	

			if (inFile !=null){
				try
				{
					inFile.close();	
					inFile = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (outFile !=null)
			{
				try
				{
					outFile.close();	
					outFile = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}	
		}
	}
}

