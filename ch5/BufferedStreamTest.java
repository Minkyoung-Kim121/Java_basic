package a.b.c;

// java.lang 패키지 : 자동으로 import 된다.
import java.io.BufferedInputStream;
// public class BufferedInputStream extends FilterInputStream
// BufferedInputStream  : 입력 보조스트림
import java.io.BufferedOutputStream;
// BufferedOutputStream  : 출력 보조스트림
// Buffer) 깡통 -> 스트림에 흘려보내는 데이터들을 하나씩 보내는 것이 아니라,
//                Buffer(깡통) 에 담아서 8k(ex)에 차면 한번에 보내는 것.
//                Buffer 의 default 는 보통 8k(10k 등)
//                ex) 6k 만 담긴 깡통은 데이터를 보내지 못하는데 -> 이 때
//				      꽉 차지 않은 깡통에 담긴 데이터를 보내줘! 하는 것이 .flush()
//  .flush()   : write() 에만 존재. (+ 깡통)
//               read() 는 읽어오는 기능을 하니까, flush 가 필요 x
//               => 출력 보조스트림에만 존재한다.
//               + .close() 닫기 전에 흘려보내주고(.flush()) 닫아야 한다.
import java.io.FileInputStream;
// FileInputStream   :  입력 보조스트림
//                      1 byte 단위로 입력 받기 때문에 한글(2 byte)은 읽을 수 x
//                      객체가 생성될 때, 파일과 연결되는데 파일은 생성하지 x
//                      =>  실제로는 파일이 없고 메모리(RAM)에만 올라가 있기 때문에, 오류가 발생하니까
//                          try-catch 구문으로 예외처리 해야 한다.
import java.io.FileOutputStream;
// FileOutputStream   :  출력 보조스트림
//                       read() 함수가 없고 write() 함수가 존재한다.
//                       주의) 데이터 출력해서 볼 때, write()로 덮어쓰기 때문에 다른경로(.bak)로 지정해야 한다.
//                       close()로 닫아야 한다.
//                    생성자("", true)  : 이유)  boolean
//                                            기존 파일 끝에 데이터를 추가하는 경우
//                                            생성자의 매개값을 true로 준다.
import java.io.IOException;  // 입출력 오류

public class BufferedStreamTest{
	public static void main(String args[])
	{
		BufferedInputStream inBuffer = null;  
		// BufferedInputStream  인 inBuffer 를 null 로 초기화 했다.
		// File 계열 클래스를 null; 로 초기화 하는 이유
		//		    : 무언가를 읽거나 쓰기 위해 백지(공백)(null)로 깨끗하게 만들어서
		//			  준비를 하기 위해
		BufferedOutputStream outBuffer = null;
		FileInputStream inFile = null;
		FileOutputStream outFile = null;
		
		String fileSeparator = System.getProperty("file.separator");
		//  file.separator : 파일 구분문자
		// .getProperty() 함수   : 괄호 안에 주어진 특정 문자를 적어넣으면 그 값이 String 으로 출력된다.
		// .getProperty("file.separator");     
		//    -> String fileSeparator(참조변수)는 파일 구분문자(file.separator)를 
		//       String 으로 출력한다.
		System.out.println("fileSeparator >>> : " + fileSeparator);   // fileSeparator >>> : \ 출력
		// cf.  window는  :  \
		//      리눅스는   :  /

		char fileSep = fileSeparator.charAt(0);
		// 참조변수 fileSep 는 fileSeparator(파일 구분문자를 String 으로 출력한 것  = \)을 char 로 변환시키고 
		//                   문자로 쪼갠다.
		//   => String 으로 출력된 \를 char 문자 형태로 바꿔서 쪼갠다.

		String inFilePath = "C:/00.KOSMO72/00.JExam/ch5"; // 경로 문자열 (파일 구분문자를 쓰기 위해)
		String outFilePath = "C:/00.KOSMO72/00.JExam/ch5";

		String inFileName = fileSep + "dataBuffer.txt";
		// fileSep  -> char 형태로 출력된 파일 구분문자 \ 에
		// + "dataBuffer.txt" 를 붙여라
		String outFileName = fileSep + "dataBuffer.txt";
		// Q) 굳이 똑같은 역할을 inFileName   /   outFileName  두 참조변수로 나눈 이유는...?

		String inFullPath = inFilePath.concat(inFileName);
		// .concat(*) 함수   : 한 문자열 끝에 다른 문자열*을 붙이는 함수.
		// cf. concatenation : 연속, 연쇄라는 의미
		// ex)  String firstname = "김";
		//      String lastname = "민경";
		//      String fullname = firstname.concat(lastname);//    "김민경"  ("김"+"민경")
		//  => inFilePath 에 inFileName 을 붙인 것이 inFullPath

		inFullPath = inFullPath.replace('/' , fileSep);
		// .replace("abc", "cdf") 함수   : "abc" 를 찾아서 "cdf" 로 바꿔서 반환하세요.
		//  주의)  원래의 문자열 "abc" 가 변경이 되는 것이 x    
		//        원본을 찾아서 복제한 다음, 복사본을 바꿔서 반환하는 것.
		// => inFilePath + inFileName 해서 '/' 를 앞에서 출력한 파일구분자(\)로 바꾼 것이 inFullPath

		String outFullPath = outFilePath.concat(outFileName);
		//  outFilePath  +  outFileName     -> outFilePathoutFileName
		//   -> "C:/00.KOSMO72/00.JExam/ch5"+ \ + "dataBuffer.txt"
		outFullPath = outFullPath.replace('/' , fileSep);
		// "C:/00.KOSMO72/00.JExam/ch5"+ \ + "dataBuffer.txt"
		//  ->  "C:\00.KOSMO72\00.JExam\ch5"+ \ + "dataBuffer.txt"
		//  =>  "C:\00.KOSMO72\00.JExam\ch5\dataBuffer.txt"

		try
		{
			// 변수 선언
			outFile = new FileOutputStream(outFullPath, true);
			// ("C:\00.KOSMO72\00.JExam\ch5\dataBuffer.txt", 의 끝에 문자를 추가 연결할 것이다.)
			outBuffer = new BufferedOutputStream(outFile);
			// outFile 을 출력보조스트림으로 보낼건데,

			int c = 0;

			//for 문
			for (int i=0; i < 10; i++ )
			{
				outBuffer.write(i + '0');
				 // '0' 붙은 이유는 밑에 (char)로 형변환할때 이거 안넣으면 글자 이상하게 나와서
			}

			outBuffer.flush();
			// outBuffer 는 BufferedOutputStream 이기 때문에 flush() 해줘야 한다.

			inFile = new FileInputStream(inFullPath);
			inBuffer = new BufferedInputStream(inFile);
			while ((c = inBuffer.read()) != -1)
			{
				System.out.print((char)c + " ");
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
		{						
			if (inBuffer !=null)
			{
				try
				{
					inBuffer.close();	
					inBuffer = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (outBuffer !=null)
			{
				try
				{
					outBuffer.close();	
					outBuffer = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}	

			if (inFile !=null){
				try
				{
					inFile.close();	
					inFile = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}
			if (outFile !=null)
			{
				try
				{
					outFile.close();	
					outFile = null;	
				}
				catch (Exception e)
				{
					System.out.println("e >>> : " + e);
				}
			}	
		}
	}
}

