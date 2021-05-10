package a.b.c;

import java.io.FileInputStream;
import java.io.File;
import a.b.c.common.FilePath;

public class FileInStreamTest{

	// 파일은 상수 처리 : 경로 + 파일명 + 확장자명
	//public static final String FILE_PATH = "FileInStreamTest.java";

	public static void main(String args[]){
		// 지역변수로 사용 하는 것 
		// : 지역변수 함수에서 태어나서 함수에서 죽는다. 죽이는 것은 GC(가비지컬렉터 가 한다.)
		// FileInputStream fis
		// int data

		// 함수 안에서 사용하는 객체는 기본적으로 default 값으로 초기화 한다. 
		// 객체의 default 값은 null 이다. 
		// 객체 중 통신을 하는 객체(io 패키지, connection etc.)는 
		// 무조건(MUST) null 초기화 해서 사용 한다.
		// 예) java.io.FileInputStream, java.io.FileOutputStream
		//     java.sql.Connection, java.sql.Statement, 		
		//     java.sql.PrparedStatement, java.sql.ResultSet etc.
		FileInputStream fis = null;
		// 기초자료형 초기화 : default 값 : 정수형은 0 이다. 
		int data = 0;

		/*
			try 절 사용이유 
			1. FileInputStream(File) : 생성자는 FileNotFoundException 처리를 해야 한다. 
			2. close() 함수 : IOException 처리를 해야 한다. 
			3. 두 예외처리를 포함하는 Exception 예외 클래스를 catch() 절에 사용 
		*/
		try
		{
			// File 클래스를 이용해서 파일을 생성한다 : 현재는 메모리에 생성됨 
			// FileInStreamTest.FILE_PATH : 파일이름 및 경로는 상수로 처리 한다. 
			File f = new File(FilePath.FILE_PATH);

			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile);

			if (bFile)
			{
				// FileInputStream(f) 생성자를 이용해서 
				// 파일은 인스턴스 한 후에 참조변수 fis 에 가르키도록 한다. 
				fis = new FileInputStream(f);
				// 파일을 읽어오는 stream 이 열렸다
				// C:\\00.KOSMO72\\00.JExam\\ch5\\FileInStreamTest.java
				// 화일을 읽을 수 있는 준비가 되었다.
				System.out.println("fis >>> : " + fis);

				// 생성된 파일에서 데이터를 읽어 오는데 
				// fis 참조변수로 가르키는 파일에서 read() 함수로 1byte 씩 읽어온다. 
				// int형 data 변수에 fis.read() 로 읽어온 바이트를 하나씩 대입한다. 
				// != -1 의 의미는 파일을 끝을 의미한다.
				// while ((data=fis.read()) !=-1){} 는 fis 참조변수가 가르키는 파일의
				// 끝까지 읽어 오라는 의미이다. 
				while ((data=fis.read()) !=-1)
				{
					// System.out.print(data);
					// System.out.print(Integer.toBinaryString(data));

					// 읽어온 데이터를 문자로 형변환 해서 콘솔에 출력한다. 
					System.out.print((char)data);
				}

				// 선언하고 , 인스턴스 해서 사용을 다 한 파일 객체는 
				// 꼭 닫아 주어야 한다. 
				fis.close(); 
				// GC(가비지 컬렉터)가 바빠서 해당 객체를 메모리에서 해제하지 않을 때를 대비해서
				// 해당 참조변수(여기서는 fis)에 데이터가 없다는 의미를 부여하는 것 
				fis=null;
			}
			else{
				System.out.println("해당 경로에 파일이 존재하지 않습니다. >>> : ");
			}
		}
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		finally{
			/*
				상위 try 절 문장들을 수행 하다 
				예외가 발생해서 try 이 중도에 멈추고 
				fis.close(); 문장이 수행이 않되면 
				fis 으로 선언한 객체가 닫히지 않으므로 
				finally 절에서 
				해당 하는 fis 참조변수의 null 값을 체크해서 
				null 상태가 아니면 해당 참조변수를 close() 처리한다. 
				close() 함수를 처리 할 때는 예외처리를 같이 사용해야 한다. 
			*/
			if (fis !=null)
			{				
				try{ 
						fis.close(); 
						// GC(가비지 컬렉터)가 바빠서 해당 객체를 메모리에서 
						// 해제하지 않을 때를 대비해서
						// 해당 참조변수(여기서는 fis)에 데이터가 없다는 의미를 부여하는 것 
						fis=null;
				   } catch (Exception e){}
			}
		}
		
	}
}