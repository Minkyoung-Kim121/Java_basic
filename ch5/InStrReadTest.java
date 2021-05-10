package a.b.c;

import java.io.File;
//  File  은 파일&디렉토리를 만들지만, 그 안의 데이터는 읽고 쓸 수가 x
//  그래서 .txt 안에 데이터를 읽고 쓰기 위해 
//  Stream 계열의 클래스를 이용했다.
import java.io.InputStreamReader;
// InputStreamReader : 
// public abstract class InputStream extends Object implements Closeable
import java.io.FileInputStream;
// FileInputStream  : InputStream에 File 을 붙였다고 이해하자.
//                    1byte 단위로 파일을 읽기 때문에, 한글은 읽을 수 없다.
import java.io.IOException;
// 예외 처리 위해
import a.b.c.common.FilePath;
// 상수를 만들어서 썼다.
public class InStrReadTest{

	public static void main(String args[]) throws IOException{
		/*	
			InputStreamReader isr = 
				new InputStreamReader(
				new FileInputStream("FileInStreamTest.java"));
			while ((data=isr.read()) !=-1)
			{
				// 읽어온 데이터를 문자로 형변환 해서 콘솔에 출력한다. 
				System.out.print((char)data);
			}
		*/

		// 지역변수 선언     밖에다가 빼면 밑의 try, if 스코프에 상관없이 사용 가능.
		// File 계열 클래스는 항상 null;로 초기화 해주어야 한다.
		// 이유 : 다른 걸로 하면 오류난다....
		// + 또한 자원을 다쓰고 .close()를 한 뒤 null; 로 리턴(?) 해서 프로그램의 안정성을 확보하자.
		File ff = null;  
		FileInputStream fis = null;
		// fis 는 FileInputStream 으로, 1 byte 로 읽어야지!
		InputStreamReader isr = null; 
		// byte -> char 변환하는 보조스트림 클래스 
		// 1 byte 를 2byte 단위로 읽기 때문에 한글 또한 읽을 수 있다.
		int data = 0;
		boolean bFile = false;  // (append)
		// File 읽고 써주는 계열의 클래스들은 오류가 미친듯이 많이 난다.
		// 그래서 항상 try-catch 구문으로 예외처리해서 데이터 받아야 한다.
		// ex) FileInputStream 은 입력 보조스트림이고 객체(파일이나 디렉토리)가 생성될 때,
		//                     파일이 없으면(파일을 생성해도 램메모리에만 생성이 된다면),
		//                     오류가 발생하니까!(물리적인 하드메모리에는 파일이 없으니까)

		try
		{
			ff = new File(FilePath.FILE_PATH);	
			// ff 는 새로운 파일을 만들건데, (new 키워드를 사용해서 File 클래스를 함수로 사용)
			// (FilePath.FILE_PATH)  파일의 경로는 상수로 사용한다.
			//  FilePath에 있는 FILE_PATH를 사용할 것이다.
			// FilePath.java
			//  -> public static final String FILE_PATH = "FileInStreamTest.java"
			bFile = ff.exists(); // 데이터가 있는지 확인하는 역할
			// .exists() 함수 : ~~데이터가 존재하느냐??
			// .exists() 함수에 참조변수 ff 를 넣은 것이 bFile 이다.
			if (bFile)  // 만약, bFile 이면  (ff에 데이터가 exists 한다면)
			{
				fis = new FileInputStream(ff);
				// fis 먼저 열고
				// fis는 ff를 1byte 단위로 읽어라
				isr = new InputStreamReader(fis);
				// isr 열었으니까
				// isr 은 fis(ff를 1byte 단위로 읽은 것)를 2byte로 읽어라
				while ((data=isr.read()) !=-1)//data=isr.read()의 값이 끝까지 갈 때,
					// .read() 함수 : 읽어주는 함수
					//             InputStream 처럼 데이터가 들어와서 읽는 기능을 하는 클래스에만 존재한다.
					//             cf. OutputStream 계열들은 쓰는 것이기 때문에, read() 대신 write() 존재.

				{
					System.out.print((char)data);
					// (char) 읽어온 데이터를 문자로 형변환 해서 콘솔에 출력한다.
					//        왜냐하면 InputStreamReader는 2byte 를 읽으니까?
					//  => ff를 2byte 로 끝까지 읽은 것을 출력해라.
				}

			}else{
				System.out.println("해당 경로에 파일이 존재하지 않습니다. >>> : ");
			}
			
			isr.close();
			// isr 먼저 닫고
			isr=null;

			fis.close();
			// fis 닫는다.
			fis=null;
		}
		catch (Exception e)  //  catch 절은 예외처리하는 구절 
		{
			System.out.println("e >>> : " + e);
		}
		finally{
			// finally 구문 : try-catch 구문에서 예외 발생 시 자원을 닫지 못하니까,
			// (.close() 는 catch가 아닌 try에서 호출했기 때문에
			//  try에서 예외가 발생해서 catch 구문이 수행되면 자원을 닫지 못함)
			// 오류가 발생하더라도 finally{} 구절에서만이라도 적어도 자원을 닫기 위해 사용함.
			//    => 이 또한 파일의 안정성을 위해
			if (isr !=null) // isr 이 null이 아닐 때 
							//-> try 절에서 isr 에서 읽으려고 데이터를 받아놨기 때문에 null일 수가 x
							//   null 이면 isr 에서 데이터 조차 받아오지 못한 것.
							//   => isr 에 무언가 있는데, 오류가 나면 여기에서 자원을 닫을 거니까!
			{
				// 이 또한 try-catch {}로 받는 이유는 ???
				//   .close() 함수를 처리할 때, 즉 자원을 닫을 때도 오류가 자주 발생하기 때문!!
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (fis !=null)
			{
				try{fis.close(); fis=null;}catch (Exception e){}
			}
		}
	}
}