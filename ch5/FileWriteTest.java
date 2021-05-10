package a.b.c;
// C:\00.KOSMO72\00.JExam\ch5\outputWrite.txt
// output.txt ������ ������ �빮�� A �� write �ϼ��� 
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest{

	public static void main(String args[]) throws IOException {
	
		FileWriter fw = null;

		try
		{
			//FileWriter(String fileName, boolean append) 
			fw = new FileWriter("outputWrite.txt", true);
			//Constructs a FileWriter object given a file name with a boolean indicating 
			//whether or not to append the data written.
			fw.write('A');
			char c[] = {'B','C','D','E','F','G'};
			fw.write(c);
			fw.write("���϶����� Ŭ���� �׽�Ʈ �Դϴ�. ");
			fw.write(c, 2, 5);
			fw.write(65);
			fw.write(0x41);
			fw.write(0x5a);

			fw.close(); 
			fw=null;
		}
		catch (IOException i)
		{
			System.out.println("i >>> : " + i);
		}finally{
			if (fw !=null)
			{
				try{fw.close(); fw=null;}catch (Exception e){}
			}
		}	
	}
}