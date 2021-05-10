package a.b.c;

import java.io.FileOutputStream;
// FileOutputStream : 출력 보조스트림
//                    출력이기 때문에 .read() 함수 없다.
//                    주의! 데이터를 출력할 때 .write() 함수를 사용하기 때문에, 경로를 다르게 설정해서
//                    덮어 쓸 때 원래 치고있던 코딩 파일이 덮어지지 않게 조심해야 한다.
import java.io.File;
import java.io.IOException;
import a.b.c.common.FilePath;

// C:\00.KOSMO72\00.JExam\ch5\output.txt
// 문1) output.txt 문서에 영문자 대문자 A를 write 하세요.
public class FileOutStreamTest_1{


	//  public static final String FILE_PATH = "FileOutStreamTest_1.java";
	//  -> FilePath.java import 해서 상수사용

	public static void main(String args[]) throws IOException {
		
		/*   C:/00.KOSMO72/00.JExam/ch5/    에 output.txt 를 그냥 생성하는 것. 이 안에 데이터를 읽거나 쓰려면
			                                FileInputStream 또는 FileOutputStream 사용.
		File f1 = new File("C:/00.KOSMO72/00.JExam/ch5/output.txt");
		System.out.println("File 클래스 참조변수 f1 >>> : " + f1);
		boolean www = f1.createNewFile(); // output.txt 생성
		System.out.println("www >>> : " + www);  
		*/
		//   File 은 파일을 만들지만, 데이터를 읽고 쓰는 기능을 지원하지 않는다. 따라서 "A" 문자를 File 이 아닌 FileOutputStream 으로 만든 것.

		FileOutputStream fos = null;
		int data = 0;

		try
		{
			fos = new FileOutputStream("output.txt" , true);  
			// , false    o->     AAA
			// , true     x->     AAA
			// , true     o->     AAAAAA
			// Q)왜 C:\00.KOSMO72\00.JExam\ch5\output.txt 를 쓰지도
			//   않았는데, ch5 에 생성?? path 지정했기 때문.
			// public FileOutputStream(String name, boolean append)   파일 연결 함수
			//    boolean append 가 true 일 때, 원래의 파일에 데이터가 추가될 것입니다.
			// fos 는 FileOutputStream ("파일명.확장자", 연결여부) 를 사용해서, 데이터를 쓸건데
			// 확장자가 .txt 인 output 이라는 파일명에 (true)데이터를 연결해서 쓸 준비를 마쳤다.
			fos.write('A');
			// fos 즉, output.txt에 'A'를 .write() 쓰세요
			fos.write(65);  // 10진수     // A
			fos.write(0x41);  // 16진수      // A

			fos.close();   // 다 썼으니 닫자
			//fos.null;

		}
		catch (Exception e) 
		{
			System.out.println("e >>> : " + e);
			
		}
		
		finally
		// 위의 try 절에서 예외가 발생하면  사용한 자원을 닫기 위해 finally 사용.

		{
			if (fos !=null) // fos가 null 이 아니면
			{
				try
				{
					fos.close();
					fos = null;
				}
				catch (Exception e)  //  왜  IOException  x 였지??  위에 throw 해서.
				{
				}
			}
		}
	}
}