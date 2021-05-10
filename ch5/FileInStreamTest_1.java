package a.b.c;

import java.io.FileInputStream;
import java.io.File;
import a.b.c.common.FilePath;

// 콘솔 출력 시 한글이 깨지는 이유) byte 때문에
public class FileInStreamTest_1{

	// 파일은 상수처리 한다.   : 파일은    경로 + 파일명 + 확장자명
	//public static final String FILE_PATH = "FileInStreamTest_1.java";   // FILE_PATH 를 상수로 사용
	//     pubic staic main() 이기 때문에 메인() 안에 static final 상수를 쓸 수 없었기 때문.
	public static void main(String args[]){
		// FileInputStream fis // 지역변수로 사용하는 것 
		// int data // 지역변수로 사용하는 것 
		//                   (지역변수는 함수 안에서 태어나서 함수 안에서 사망하는 것)
		//                   (사망, 즉 죽이는 것은 GC- 가비지컬렉터 가 수행한다.)

		// 함수 안에서 사용하는 객체는 기본적으로 default 값으로 초기화 한다.
		// 객체의  default 값은 null 이다.

		// 객체 중 통신을 하는 객체(io 패키지, connection etc.)는 
		// 무조건(MUST) null 로 초기화 해서 사용한다.
		// ex) java.io.FileInputStream, java.io.FileOutputStream
		//     java.sql.Connectionm java.sql.Statement, java.sql.PreparedStatement
		//     java.sql.ResultSet    etc.
		//    + io ( 통신객체) 를 사용하기 위해서
		//      * InputStream, * OutputStream 등을 사용하는 것이다.

		FileInputStream fis = null;
		int data = 0;  // 기초자료형 초기화 한 것.   default 값    정수형은 0;

		/*       엄청 중요       
			try 절 사용한 이유)
			1. FileInputStream(File) : 생성자는 FileNotFoundException 처리를 해야한다.
			2. close() 함수 : IOException 처리를 해야 한다.
			3. 두 예외처리를 포함하는 Exception 예외 클래스를 catch() 절에 사용
		*/
		// 예외처리를 할 때 close가 어떤 Exception를 갖고 있는지 알아야 하는데, 그냥 퉁 쳐서 Exception!
		// 이렇게 알고 있는 것이 아니라 클래스, 생성자 무엇을 썼는지 꼼꼼하게 주석달아서 알고
		// 정확하게 Exception 처리를 하자.

		try
		{
			// File 클래스를 이용해서 파일을 생성한다. 
			//                                : 현재는 메모리에 생성됨.(실제로 생성된 것이 x)

			File f = new File(FilePath.FILE_PATH); 
			// 경로(어디에 파일을 만들 것인지) : FilePath.FILE_PATH
			// FileInStreamTest.FILE_PATH   : 파일이름 및 경로는 상수로 처리한다.

			boolean bFile = f.exists();
			System.out.println("bFile >>> : " + bFile); // 파일이 생성되면 true
			// 따라서 여기까지 하고 컴파일 실행해봐야 한다. 만들어졌는지 아닌지,
			// 만들어 졌다면 try-catch 절에 넣고 본격적으로 예외처리하면서 돌려야.

			if (bFile)
			{
				fis = new FileInputStream(f);
				// 파일을 읽어오는 stream 이 열렸다는 의미.
				// C:\00.KOSMO72\00.JExam\\ch5\\FileInStreamTest_1.java 파일을 읽을 수 있는 준비가 되었다는 뜻.
				System.out.println("fis >>> : " + fis);

			while ((data=fis.read()) !=-1)
				// 생성된 파일에서 데이터를 읽어 오는데, 
				// 참조변수 fis로 가리키는 파일에서 read() 함수를 사용해서 1byte 씩 읽어온다.    는 의미
				// int 형 data 변수에 fis.read() 로 읽어온 byte를 하나씩 대입한다.
				// !=-1   : 파일의 끝을 의미한다.
				// while ((data=fis.read()) !=-1){}    는 참조변수 fis 가 가리키는 파일의 끝(-1)까지
				//                                     읽어오라는 의미이다.
				//                                     (데이터 웅앵웅)이 끝(-1)이 아니면(!)
			{
				//System.out.print(data);
				//System.out.print(Integer.toBinatyString(data));
				System.out.print((char)data);
				// 읽어온 데이터를 문자(char)로 형변환해서 콘솔에 출력한다.
				// int -> char
			}
				fis.close(); // 항상 close 해줘야 한다.
				// 선언하고, 인스턴스해서 사용을 완료한 파이리 객체는 반드시 닫아주어야 한다.
				fis = null; // fis = null 로 초기화 하는 이유)
							//   가비지 컬렉터(GC) 가 바빠서 해당 객체를 메모리에서 해제하지 못할 경우를
							//   대비해서 해당 참조변수(여기에서는 fis) 에 데이터가 없다(고 말해주는)는 의미를 부여하는 것.
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
				상위 try 절의 구문(문장) 들을 수행하다가 예외가 발생하여 try 이 중간에 멈추고,
				fis.close(); 문장이 수행되지 않으면
				fis 으로 선언한 객체가 닫히지 않기 때문에,
				finally 절에서 해당하는 참조변수 fis 의 null 값을 체크하여 null 상태가 되지 않았다면,
				해당 참조변수(fis)를 close() 처리한다.
				*/
			if (fis !=null) 
			
			{
				
				try
				{
					fis.close();
					// close() 함수를 처리 할 때는,.
					// 예외처리 또한 같이 사용해야 한다.
					fis = null; 
					// fis = null 로 초기화 하는 이유)
					//      가비지 컬렉터(GC) 가 바빠서 해당 객체를 메모리에서 해제하지 못할 경우를
					//      대비해서 해당 참조변수(여기에서는 fis) 에 데이터가 없다(고 말해주는)는 의미를 부여하는 것.
				}
				catch (Exception e) // 예외처리 또한 같이 사용해야 한다.
				{
				}
			}
		}
		

//		String filePath = "FileInStreamTest.java";
//		File f = new File(filePath);
//		FileInputStream fis = new FileInputStream(f); 
		
		// File 은 파일명 + 확장자로 구성되어있다.
		//            그리고 경로까지 알아야 한다.
		// FileInputStream 을 사용하려면 생성자에 String filePath 변수 선언해서 아규먼트로 써야? 매개변수?
		// Q)  생성자 쓰는 방법 new get instance 등 4가지 방법 공부하기.
//		System.out.println("fis >>> : " + fis);


	} // end of main()

}