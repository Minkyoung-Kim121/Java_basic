package a.b.c;

import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
public class FileTest_4{

	public static void main(String a[]) throws java.io.IOException{
		
		File f1 = new File(a[0]);  // f1 =  File 을 만들어라
		f1.mkdir();  // .mkdir() 함수를 이용해서 파일을 만든다.
		System.out.println("f1 >>> : " + f1);
		// 명령행 인수로 bb 실행하면 ch5 에 bb 디렉토리 생성.
		File f2 = new File(f1, f1.getName() + ".txt");
		// f2 = f1 에 ".txt" 를 붙여라. (.getName() 함수를 이용해서)
		f2.createNewFile();  // createNewFile() 함수를 이용해서 파일을 f2 만들어라
		if (f2.exists())  //  if, f2 is exists
		{
			java.io.FileWriter fw = null;   // FileWriter 를 null 로 초기화
			fw = new java.io.FileWriter(f2); 
			fw.write("파일에 내용을 써보세요ㅛㅛㅛ"); // .write() 함수를 이용해서 fw 파일에 내용을 쓸 것이다.
			fw.close(); // 자원을 쓰고 나면 항상 .close() 함수로 닫아라.
		}

		File files[] = f1.listFiles(); // .listFiles()를 사용해서 f1의 배열을 만든것이 files[]
		System.out.println("files.length >>> : " + files.length);  //  1   bb  하나 만들었기 때문
		for (int i=0; i < files.length; i++)
		{
			String fileName = files[i].getName();
			System.out.println("fileName >>> : " + fileName);
		}


	}
}