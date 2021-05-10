package a.b.c;
/*
 Data �� "aaa.txt"��� ������ ���Ҷ�
 �����쿡���� "Data\\aaa.txt"
 �ڹٿ����� "Data" + File.separator + "aaa.txt"
*/
//���� ��Ʈ��  > Buffer ��ȿ� �ְ� �� ����
import java.io.BufferedReader;  // ����Ʈ ������ �д� ��Ʈ���� ���۸� ����� ����
import java.io.BufferedWriter; //// ����Ʈ ������ ����ϴ� ��Ʈ���� ���۸� ����� ����
//�׳� ��Ʈ��?
import java.io.FileReader; 	// ���Ͽ��� ����Ʈ ������ �ڷḦ �б� ���� ����ϴ� ��Ʈ��	
import java.io.FileWriter; // ���Ͽ��� ����Ʈ ���� �ڷḦ ����ϱ� ���� ����ϴ� ��Ʈ��
import java.io.IOException;

public class BufferedReaderTest
{
	public static void main(String args[])
	{	
		// �ʱ�ȭ
		BufferedReader inBuffer = null;
		BufferedWriter outBuffer = null;
		FileReader inFile = null;
		FileWriter outFile = null;
		
		//String fileSeparator = "\"; >> window�� ������ ��� (������ ��)
		//�̷��� ���� �ʴ� ������
		//������ ���α׷���(������ ���� �ƴ� �ٸ� ���� ���� �ҷ����� �� �ִ� ��)�� ���ؼ� ���ͷ��� �ʱ�ȭ ���� �ʰ�
		//�̷��� �Լ��� ����Ѵ�.
		
		//array[0]
		//map["key"]      <= key value ���
		// index = value	
		// key=value
		// "file.separator"�� getProperty �޼ҵ��� key ���̴�.  >> api���� Ȯ�� �ϸ� ���� ����
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("fileSeparator >>> : " + fileSeparator);  // '\'
		//�츮�� fileSeparator��� String ���� ���״� charAt()�޼ҵ带 ���ؼ� char ������ �ٲ����
		char fileSep = fileSeparator.charAt(0);

		String inFilePath = "C:/00.KOSMO72/00.JExam/ch5";		
		String outFilePath = "C:/00.KOSMO72/00.JExam/ch5";
		// �ѹ��� �ᵵ �Ǵµ� in�� out �����ϱ� ���� ���� ����
		String inFileName = fileSep + "dataBufferReader.txt"; //"\dataBuffer.txt"
		String outFileName = fileSep + "dataBufferReader.txt"; //������ �����η� ��ħ
		String inFullPath = inFilePath.concat(inFileName); // ���ļ� ���Ӱ� ����
		inFullPath = inFullPath.replace('/' , fileSep); // '/'�� '\'�� �ٲ�
		String outFullPath = outFilePath.concat(outFileName);
		outFullPath = outFullPath.replace('/' , fileSep);

		try
		// ���� �̰� �� ���� �� try catch�������� �ֱ�(���� �߻� ���Ƽ� �ƿ� �����Ϸ��� �׷��� �����Ǿ�����)
		{
			
			outFile = new FileWriter(outFullPath);
			outBuffer = new BufferedWriter(outFile);

			int c = 0;
			for (int i=0; i < 10; i++ )
			{
				outBuffer.write(i + '0');
				 // '0' ���� ������ �ؿ� (char)�� ����ȯ�Ҷ� �̰� �ȳ����� ���� �̻��ϰ� ���ͼ�
			}
			outBuffer.flush(); // buffer �� �� ����ֱ�

			//File f = new File(inFullPath);
			//boolean bool = f.exists();
			//if(bool)
			//�˻��ϴ� ������ ���� �ʿ��� �������� ���ؼ�

			inFile = new FileReader(inFullPath);
			inBuffer = new BufferedReader(inFile);
			while ((c = inBuffer.read()) != -1)
			{
				System.out.print((char)c + " "); // '0' ������ �̰� 
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
			//try������ ���ܰ� �߻��ϸ� �� �Ʒ� �ڵ尡 ������� �ʱ⶧����
			//close() �ϴ� �۾����� ������� ����
			//IO��ü�� close() ���� �ʴ°��� ������ ������ ġ�����ϼ��� �ֱ� ������
			//�ٸ��� ���� close()�۾� ��ŭ�� �� �����϶�� ������
			//������ ����Ǵ� finally ���� ���� �ڵ带 �ۼ���
		{
			if (inBuffer !=null){
				try{inBuffer.close();inBuffer = null;}catch(Exception e){}
			}
			if (outBuffer !=null){
				try{outBuffer.close();outBuffer = null;}catch(Exception e){}
			}	
			if (inFile !=null){
				try{inFile.close();	inFile = null;}catch(Exception e){}
			}
			if (outFile !=null){
				try{outFile.close();outFile = null;}catch(Exception e){}
			}	
		}
	}
}

