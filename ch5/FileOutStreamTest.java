package a.b.c;

// rt.jar 자원 사용
// java.lang.* 패키지만 import 를 자바에서 지원해준다. 
// java.lang 패키지 이외의 자원은 직접 import 해서 사용해야 한다.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import a.b.c.common.FilePath;

//   read()   :  한 byte 읽기
//               ex) java.read()   ->  j 만 읽기
//   write()  :  덮어 씌우는 함수
//   close()  :  자원을 쓰고(byte 를 읽고 나면) 나면 항상 닫아주기.

// 이렇게 쓰지말아라. -> 가독성 때문에
//import java.io.*;

public class FileOutStreamTest{

	public static final String FILE_PATH = "FilePath.FILE_OUT_PATH";

	public static void main(String args[]){

		// 지역변수 선언 및 초기화
		//	FileInputStream fis = new FileInputStream("FileOutStreamTest.java");
		FileInputStream fis = null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		// 
		int data = 0;

		
		// try{} catch{} 구문
		try
		{
			// 선언된 자원 인스턴스 하기
			File f1 = new File("FileOutStreamTest.java");
			System.out.println("f1 >>  " + f1);
			
			// 파일 데이터 있는지 확인하기
			boolean bFile1 = f1.exists(); // 여기까지 치고나서 컴파일하고 데이터 있는지 진짜 확인하자
			System.out.println("bFile1 >>> : " + bFile1);

			if (bFile1)
			{	
				// 파일 데이터 있으면 읽어오기
				fis = new FileInputStream(f1);
				System.out.println("fis >>> : " + fis);
				
				// 읽어온 데이터 파일에 쓰기
				while((data = fis.read()) != -1)
				{
					System.out.print((char)data);
					al.add(data);
				}
				// 사용한 자원 닫기
				fis.close();
				// io 를 닫을 때는 여는 순서와 반대로 닫아야 한다.
				// 항상 null 로 초기화;
				fis = null;

			}else{
				System.out.println("해당 경로에 파일이 존재하지 않습니다. >>> : ");
			}
		}
		// catch{} 구문 (예외처리)
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		// finally{}
		finally
		{	
			// try{} 절에서 예외 발생시
			if (fis !=null)
			{
				try
				{	
					// 사용한 자원 닫기
					fis.close();
					// 항상 null 로 초기화;
					fis = null;
				}
				// catch{} 구문 (예외처리)
				catch (Exception e) // IOException    x 
				{
				}
			}

		}



		// 지역변수 선언 및 초기화
		FileOutputStream fos = null;
	//	FileOutputStream fos = new FileOutputStream("FileOutStreamTest.bak");
		int data1 = 0;
		// try{} catch{} 구문
		try
		{
			// 선언된 자원 인스턴스 하기
			File f2 = new File("FileOutStreamTest.bak");
			System.out.println("f2 >>> : " + f2);
			// 파일 데이터 있는지 확인하기
		//	boolean bfile2 = f2.exists();
		//  FileOutputStream 에는 boolean 쓸 수 없다...?  왜???

		//	System.out.println("bfile2 >>> : " + bfile2);
			
		//	if (bfile2)
			//{	// 파일 데이터 있으면 읽어오기
				fos = new FileOutputStream(f2);
				System.out.println("fos >>> : " + fos);
				// 읽어온 데이터 파일에 쓰기
				for(int i=0; i<al.size(); i++)
				{
					data = al.get(i);
					// 
					fos.write(data);
				}
			//}
				// 사용한 자원 닫기
				fos.close();
				// 항상 null 로 초기화;
				fos = null;
				
		}
		// catch{} 구문 (예외처리)
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		// finally{}
		finally   // try절에서 예외 발생 시 사용한 자원은 finally 에서 닫아준다.
		{
			// try{} 절에서 예외 발생시
			if (fos !=null)
			{
				try
				{	
					// 사용한 자원 닫기
					fos.close();
					// 항상 null 로 초기화;
					fos = null;
				}
				// catch{} 구문 (예외처리)
				catch (Exception e)
				{
				}
			}
		}
				
	} // end of main()

} // end of FileOutStream class

/*
1)
FileInputStream :  
.read()   데이터를 읽어라
FileOutputStream : 나오게
.read() 대신 .write() 를 썼는데, write() 함수는 데이터를 덮어씌워라 라는 함수,
따라서 경로를 똑같이 설정해 주면 내가 치고 있는 코드 파일에 그대로 write() 되기 때문에
.bak 백업 파일로 경로를 설정하여 write() 를 해주는 것.

2)
보통은 fis 와 fos 를 같이 선언해서 똑같은 방식으로 쭉 쓰다가,
while 문에서 fis 는 read() 함수를, fos 는 write() 함수를

*/
