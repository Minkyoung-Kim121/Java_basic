package a.b.c;

// rt.jar 자원 사용
// java.lang.* 패키지만 import 를 자바에서 지원해준다. 
// java.lang 패키지 이외의 자원은 직접 import 해서 사용해야 한다. .
// 가독성 때문에 이케 사용하세요 
import java.io.File;
import java.io.FileInputStream;  // 파일만들어서 읽어오고 read()
import java.io.FileOutputStream; // 파일 안에 데이터를 써볼 것이다. write()
import java.io.IOException;
import a.b.c.common.FilePath;
// io 패키지에 클래스 86개 
// import java.io.*;

public class FileOutStreamTest_tc{

	public static void main(String args[]){	

		// 지역변수 선언 및 초기화 		
		FileInputStream fis = null;  //  fis   데이터 입력 보조스트림 사용
		FileOutputStream fos = null; //  fos   데이터 출력 보조스트림 사용
		int data = 0; // 1 byte 로 읽기 때문에 int data 도 항상 선언해야!

		try
		{
			// 선언된 자원 인스턴스 하기 
			File ff = new File("FilePath.FILE_OUT_PATH");
			fis = new FileInputStream(ff);
			System.out.println("fis >>> : " + fis);
			fos = new FileOutputStream("FileOutStreamTest.bak", true);
			// write() 는 덮어씌우는 함수이기 때문에 반드시 .bak 등 경로를 다르게 설정해야 한다.
			// FileOutputStream(String, boolean append)   파일 연결
			System.out.println("fos >>> : " + fos);
			
			// 파일 데이터 있는지 확인하기 
			boolean ffBool = ff.exists();
			// boolean 타입인 이유 : 있는지 없는지(.exists()) 여부를 판단하기 때문에
			// true  or   false
			System.out.println("ffBool >>> : " + ffBool);

			if (ffBool)   // if ffBool's result is true.
			{
				//파일 데이터 있으면 읽어오기 
				//읽어온 데이터 파일에 쓰기 
				while ((data=fis.read()) != -1)
					// InputStream 계열로 파일 읽어올때는 while 처럼 전체를 읽어오기까지 돌아주는(?) 함수로 
					// 데이터 받아야.
					// 왜냐하면 끝까지 데이터를 read() 할 것이기 때문이다.
				{
					System.out.print((char)data);
					// (char) 해줘야 한다!!
					// 왜냐하면 int 로 받아오기 때문(1 byte)
					fos.write(data);
					// 데이터 받아서(read) 2byte로 바꿔서(char) 쓰자(write) 내용을(data)
				}		
			}else{
				System.out.println(" 사용하려는 해당 데이터(파일이)가 없습니다. ");
			}
		
			// io 를 닫을 때는 여는 순서의 반대로 닫는다. 
			fos.close();
			fos=null;
			fis.close();
			fis=null;
		}
		catch (Exception e) // catch 는 항상   (Exception e) 로 받는다.
		{
			System.out.println("e >>> : " + e);
		}
		finally{
			//try 절에서 예외 발생시 
			//사용한 자원 닫기 (순서대로)
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