package a.b.c;

import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
public class FileTest_4{

	public static void main(String a[]) throws java.io.IOException{
		
		File f1 = new File(a[0]);  // f1 =  File �� ������
		f1.mkdir();  // .mkdir() �Լ��� �̿��ؼ� ������ �����.
		System.out.println("f1 >>> : " + f1);
		// ����� �μ��� bb �����ϸ� ch5 �� bb ���丮 ����.
		File f2 = new File(f1, f1.getName() + ".txt");
		// f2 = f1 �� ".txt" �� �ٿ���. (.getName() �Լ��� �̿��ؼ�)
		f2.createNewFile();  // createNewFile() �Լ��� �̿��ؼ� ������ f2 ������
		if (f2.exists())  //  if, f2 is exists
		{
			java.io.FileWriter fw = null;   // FileWriter �� null �� �ʱ�ȭ
			fw = new java.io.FileWriter(f2); 
			fw.write("���Ͽ� ������ �Ẹ����ˤˤ�"); // .write() �Լ��� �̿��ؼ� fw ���Ͽ� ������ �� ���̴�.
			fw.close(); // �ڿ��� ���� ���� �׻� .close() �Լ��� �ݾƶ�.
		}

		File files[] = f1.listFiles(); // .listFiles()�� ����ؼ� f1�� �迭�� ������� files[]
		System.out.println("files.length >>> : " + files.length);  //  1   bb  �ϳ� ������� ����
		for (int i=0; i < files.length; i++)
		{
			String fileName = files[i].getName();
			System.out.println("fileName >>> : " + fileName);
		}


	}
}