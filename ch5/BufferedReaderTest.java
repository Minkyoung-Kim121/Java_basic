package a.b.c;
/*
 Data 밑 "aaa.txt"라는 파일을 원할때
 윈도우에서는 "Data\\aaa.txt"
 자바에서는 "Data" + File.separator + "aaa.txt"
*/
//보조 스트림  > Buffer 통안에 넣고 한 번에
import java.io.BufferedReader;  // 바이트 단위로 읽는 스트림에 버퍼링 기능을 제공
import java.io.BufferedWriter; //// 바이트 단위로 출력하는 스트림에 버퍼링 기능을 제공
//그냥 스트림?
import java.io.FileReader; 	// 파일에서 바이트 단위로 자료를 읽기 위해 사용하는 스트림	
import java.io.FileWriter; // 파일에서 바이트 단위 자료를 출력하기 위해 사용하는 스트림
import java.io.IOException;

public class BufferedReaderTest
{
	public static void main(String args[])
	{	
		// 초기화
		BufferedReader inBuffer = null;
		BufferedWriter outBuffer = null;
		FileReader inFile = null;
		FileWriter outFile = null;
		
		//String fileSeparator = "\"; >> window는 저렇게 사용 (정적인 거)
		//이렇게 하지 않는 이유는
		//동적인 프로그래밍(고정된 값이 아닌 다른 값이 들어가도 불러들일 수 있는 거)을 위해서 리터럴로 초기화 하지 않고
		//이렇게 함수를 사용한다.
		
		//array[0]
		//map["key"]      <= key value 방식
		// index = value	
		// key=value
		// "file.separator"는 getProperty 메소드의 key 값이다.  >> api에서 확인 하면 글케 나옴
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("fileSeparator >>> : " + fileSeparator);  // '\'
		//우리가 fileSeparator라는 String 값을 줄테니 charAt()메소드를 통해서 char 형으로 바꿔줘라
		char fileSep = fileSeparator.charAt(0);

		String inFilePath = "C:/00.KOSMO72/00.JExam/ch5";		
		String outFilePath = "C:/00.KOSMO72/00.JExam/ch5";
		// 한번에 써도 되는데 in과 out 구분하기 위해 나눠 쓴거
		String inFileName = fileSep + "dataBufferReader.txt"; //"\dataBuffer.txt"
		String outFileName = fileSep + "dataBufferReader.txt"; //완전한 절대경로로 합침
		String inFullPath = inFilePath.concat(inFileName); // 합쳐서 새롭게 생성
		inFullPath = inFullPath.replace('/' , fileSep); // '/'를 '\'로 바꿈
		String outFullPath = outFilePath.concat(outFileName);
		outFullPath = outFullPath.replace('/' , fileSep);

		try
		// 파일 이거 할 때는 다 try catch구문으로 넣기(오류 발생 많아서 아예 컴파일러가 그렇게 설정되어있음)
		{
			
			outFile = new FileWriter(outFullPath);
			outBuffer = new BufferedWriter(outFile);

			int c = 0;
			for (int i=0; i < 10; i++ )
			{
				outBuffer.write(i + '0');
				 // '0' 붙은 이유는 밑에 (char)로 형변환할때 이거 안넣으면 글자 이상하게 나와서
			}
			outBuffer.flush(); // buffer 쓸 때 비워주기

			//File f = new File(inFullPath);
			//boolean bool = f.exists();
			//if(bool)
			//검사하는 과정이 원래 필요함 안전성을 위해서

			inFile = new FileReader(inFullPath);
			inBuffer = new BufferedReader(inFile);
			while ((c = inBuffer.read()) != -1)
			{
				System.out.print((char)c + " "); // '0' 없으면 이거 
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
			//try문에서 예외가 발생하면 그 아래 코드가 실행되지 않기때문에
			//close() 하는 작업들이 수행되지 않음
			//IO객체를 close() 하지 않는것은 서버에 굉장히 치명적일수도 있기 때문에
			//다른건 몰라도 close()작업 만큼은 꼭 수행하라는 뜻으로
			//무조건 실행되는 finally 문에 종료 코드를 작성함
		{
			if (inBuffer !=null){
				try{inBuffer.close();inBuffer = null;}catch(Exception e){}
			}
			if (outBuffer !=null){
				try{outBuffer.close();outBuffer = null;}catch(Exception e){}
			}	
			if (inFile !=null){
				try{inFile.close();	inFile = null;}catch(Exception e){}
			}
			if (outFile !=null){
				try{outFile.close();outFile = null;}catch(Exception e){}
			}	
		}
	}
}

