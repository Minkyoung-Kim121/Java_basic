package a.b.c;

import java.io.*;
import java.util.ArrayList;
//  ��� ȣ��
public class FileTest_5{

	// ���� ����
	static int totalFiles = 0;
	//���� ���� �� (��������)
	static int totalDirs = 0;
	//���� ���丮 �� (��������)

	public static void main(String args[]){
	
		//String arg = "C:\\00.JExam";
		//����� �μ��� ���ϴ� path�� �����´�
		String filePath = args[0];
		//�Ʒ����� ����� File Ÿ�� �������� dir ���� �� null �ʱ�ȭ
		File dir = null;

		if (args.length != 1) // args[] �� ���̰� 1�� �ƴ� ��,
		//����� ���ڰ� 1���� �����ϴ��� �˻�
		{
			System.out.println(" USAGE : java FileTest_5 DIRECTORY");
			//���丮�� ã�� �� ���� �����޽��� ���
			System.exit(0); // 0�� ^ ��쿡 ���α׷��� �����Ų��.
			//���α׷� ���� (int�� �Ű������� �׳� �����ڰ� ���� ������ �ľ��ϱ� ���� '���Ƿ�' �����ϴ� ����.)
		}

		File dir_1 = new File(args[0]); // dir =  args[] �迭�� ù��°(0)
		//FileŬ������ File(String pathname)�����ڸ� �̿��ؼ� ��üȭ

		if (!dir_1.exists() || !dir_1.isDirectory()) 
		//dir_1 �� �������� �ʰų� (��������) ���丮�� ��������� �ʾ��� ��,
		//dir_1 ��ȿ�� �˻�
		//dir_1 �������� �ʴ� �����̰ų� or ���丮�� �ƴ��� �˻�
		//���⼭ ���丮���� �ɷ����� ������ �Ʒ��� �ִ�
		//printFileList() �Լ��� �̿��ؼ� ���丮�� ������ ���ϵ��� Ž���ϱ� �����̴�.
		//���丮�� �ƴ� ���ϵ��� ���������� ������ ������ Ž���� �� ���� ������ �ɷ�����.
		{
			System.out.println(" ��ȿ���� ���� ���丮�Դϴ�."); //�����޽��� ���
			System.exit(0); //�ý��� ����
		}

		// method
		printFileList(dir_1); // printFileList() �Լ��� dir_1 �ƱԸ�Ʈ�� ����ؼ� ȣ��.
		// dir_1 �� printFileList �ض�
		// ��� �˰����� �̿��ؼ� ���丮�� ���� ���� ��
		// ���丮�� Ž���Ͽ� ����ϰ� Count�ϴ� ����� ���� �޼ҵ�
		System.out.println();  // () �ȿ� ������ ��� �ֿܼ��� �� �� ���� ��µǴ� �ɷ� ����.
		//printFileList() �Լ����� ����� �� ���丮�� �ƴ� ���� ���� ���
		//�ٹٲ��� ���� println() �޼ҵ� ���.
		//�Ű������� ���� println() �Լ��� �ٹٲ� ���ҷ� ����� �� ����
		System.out.println(" �� : " + totalFiles + " ���� ����");
		//printFileList() �Լ����� ����� �� ���丮�� �ƴ� ���� ���� ���
		System.out.println(" �� : " + totalDirs + " ���� ���丮");
		//printFileList() �Լ����� ����� �� ���丮 ���� ���

	}

	// printFileList �Լ�()
	public static void printFileList (File dir){
		System.out.println("" + dir.getAbsolutePath());
		// .getAbsolutePath()   : ������ �����θ� ��ȯ
		// File dir = new File(args[0]);
		//File Ÿ�� �������� dir�� ������ ���
		File[] files = dir.listFiles();
		// File[] �� ���� + ���丮   ?
		// .listFiles()    ���丮 ��ο� �����ϴ� ���� ����Ʈ ��ȯ
		//     -> dir ��ο� �����ϴ� ���� ����Ʋ ��ȯ�ϴ� ����   files��� File[] �迭.
		//    ���� �ȿ� �ִ� ��� ����,���丮�� ����
		//dir�� ���� ���ϵ��� File �迭�� ��ȯ�޾Ƽ�
		//files�� ������. (files���� dir ������ ���� ���ϵ��� �����)

		ArrayList subDir = new ArrayList(); // subDir �̶�� ���ο� �迭�� ������
		//dir���� �ε����� �����ؼ� ��͸� ���� ������ Ž���ϱ� ���� ���� ���丮������ ArrayList

		for (int i=0; i < files.length; i++) // i�� files[]�� ���̺��� ���� �� i++
		// .length �ʵ�      �迭 ����
		//                  File[] files = dir.listFiles();
		// .length() �Լ�    ���ڿ�(String)
		//                  ������ ũ�⸦ byte ������ ��ȯ
		// .size() �Լ�      ArrayList (�迭 �� �ε����� ũ��??)
		
		//dir�� ���� ���� ������ŭ �ݺ�
		{	
			// for ���� ����� ���� ����
			String fileName = files[i].getName();
			// .getName()  : ������ �̸��� ��ȯ
			//  => files[i] �� �̸��� ��ȯ�� ���� fileName(String)
			//File.getName()�� �̿��� i��° ������ ������ �̸��� String Ÿ������ ��ȯ�޾� fileName�� ������

			if (files[i].isDirectory())  // files[i] �� ���丮�϶�,
			//  .isFile()        : �����Դϱ�?
			//  .isDirectory()   : ���丮�Դϱ�?
			//      -> i��° ������ ������ ���丮�ΰ�?
			{
				fileName = "[" + fileName +"]";
				// [fileName]  ���·� fileName ��.
				// fileName �� files[i] �� �̸��� ��ȯ�� ����.
				//if���� ����ߴٴ� ���� ���� Ž���ϰ� �ִ� ���� i��° ������ ���丮��� ���̹Ƿ�
				//�ε��� i�� SubDir�� add();
				subDir.add(i + "");
				// ArrayList subDir = new ArrayList();
				// subDir �� .add(i + "")�� ���ض�.
				//  => ���丮�� ���ϰ� �����ؼ� ArrayList�� ��ƶ�.
			}
			System.out.println("" + fileName);
		}

		int dirNum = subDir.size();
		// int dirNum �� subDir(ArrayList �迭)�� size()
		// �߰ߵ� ���丮�� ���� 
		// (subDir���� �߰ߵ� ���丮���� �ε����� ����Ǿ��ֱ� ������ subDir�� size()�� �߰ߵ� )
		int fileNum = files.length - dirNum;
		// fileNum �� files ����(length�ʵ�) ���� subDir(ArrayList)�� size()�� �� ��.
		totalFiles += fileNum;
		//�������� totalFiles�� �߰ߵ� ���� ������ ������
		totalDirs += dirNum;
		//�������� totalDirs�� �߰ߵ� ���丮 ������ ������

		System.out.println(fileNum + " ���� ����, " + dirNum + " ���� ���丮");
		// 16 ���� ����, 1 ���� ���丮
		System.out.println();
		// �� �� ���


		//��� ȣ���ϴ� �κ�   -> ���丮 �ȿ� ���丮�� ���丮�� ��� ���� ��
		//                    �鿩�ٺ��鼭 ����ϱ�����
		for (int i=0; i < subDir.size(); i++) // i�� subDir.size()���� ���� �� i++
		//    => ���� �߰ߵ� ���丮 ���ڸ�ŭ �ݺ�
		{
			int index = Integer.parseInt((String)subDir.get(i));
			// index �� subDir.get(i)�� ����� int �� ����ȯ �� ��.
			// int �������� = Integer.parseInt(������);
			// -> ������ int �� ����ȯ
			//subDir�� ����� i�� ���� index�� �����Ѵ�.
			//i���� ���� Ž���ϰ� �ִ� ���丮�� i��° ������ ���丮��°��� �ǹ��Ѵ�.
			printFileList(files[index]);
			// printFileList �� ȣ��
			//������ index�� �̿��� files�� index��° ������ ���丮�� ���� Ž���ϴ� ������
			//��͹������� ����
		}

	}

}

// C:\00.KOSMO72\00.JExam\ch5>java a.b.c.FileTest_5 C:\00.KOSMO72 >> aaddaa.txt
// java a.b.c.FileTest_5 �� ������� >>(�����ؼ�) aaddaa.txt �� �̸����� �������ּ���.