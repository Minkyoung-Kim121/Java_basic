package a.b.c;

import java.io.File;
import java.io.InputStreamReader;
// InputStreamReader   :  입력 보조스트림
//                        2 byte 단위로 읽기 때문에 한글도 읽을 수 있다.
//                        1byte  를  2byte 로 바꿔주는 아이.
import java.io.OutputStreamWriter;
// OutputStreamWriter  :  출력 보조스트림
//                     :  1byte  를  2byte 로 바꿔주는 아이.
//                     :  그래서 한글이 깨지지 않고 써진다.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import a.b.c.common.FilePath;
// package a.b.c.common;

public class InOutStrReadTest{

	public static void main(String args[]) throws IOException{
		
		File ff = null;
		FileInputStream fis = null;
		// 1 byte
		FileOutputStream fos = null;
		// 1 byte
		InputStreamReader isr = null; // byte -> char 변환한는 io 보조스트림 클래스 
		// InputStreamReader   보조스트림은 반드시 flush 를 해서 내보내줘야 한다.
		// 2 byte
		// 더욱 효과적으로 읽기 위해서는 BufferedReader 사용.
		OutputStreamWriter osw = null;
		// 2 byte
		int data = 0;
		//boolean bFile = false; // bFile을 변수 선언하지 않으면, 오류가 뜨고 이유는 아마
							   // 뭐여 데이터타입을 밑에 bFile 존재 확인시 같이 선언해주면 상관 x

		try
		{
			ff = new File(FilePath.FILE_PATH); // 상수로 쓰는 이유
			boolean bFile = ff.exists(); // 데이터(bFile) 존재하는지 확인해야( 컴파일 )

			if (bFile)
			{
				fis = new FileInputStream(ff);
				// 1 byte 로 데이터 읽어오고
				isr = new InputStreamReader(fis);
				// 2 byte 로 데이터 변환하고(입력)
				fos = new FileOutputStream("zzzzz.txt");
				// 1 byte 로 데이터 출력하고("zzzzz.txt" 파일명으로)
				// 출력을 어디서 볼 건지 정하는 것. 
				// 주의!!!!!데이터 출력시 write() 함수를 사용 -> 이것은 덮어씌우는 함수
				//     따라서!!! 출력해서 볼 확장자를 지정하거나, 원본과는 다른 경로에 저장해야!
				osw = new OutputStreamWriter(fos);
				// 2 byte 로 데이터 변환하고(출력)
				while ((data=isr.read()) !=-1) // 데이터를 끝까지 읽어올건데
				{
					// 읽어온 데이터를 문자로 형변환 해서 콘솔에 출력한다. 
					System.out.print((char)data);
					// int 1 byte 데이터를 2byte 로 변환해서 읽어오고
					// isr = new InputStreamReader(fis);
					osw.write(data);
					// 출력할 때도, 1byte->2byte 변환하고
					// osw = new OutputStreamWriter(fos);
				}
				osw.flush();
				// flush() 하기 // OutputStreamWriter 보조 스트림 때문에
				// write() 는 출력하니까, 중간에 데이터 안 채워져도 내보내기 위해 
				// 인위적 내보내기 하고.
				/*
				isr.close();
				isr=null;
				osw.close();
				osw=null;
				fis.close();
				fis=null;
				fos.close();
				fos=null;
				*/  
				//Q) 자원 다썼으면 닫아도 상관,,, 그런데 왜 굳이 여기에서 안 닫고 밑에서 닫았는지???
			}else{
				System.out.println("해당 경로에 파일이 존재하지 않습니다. >>> : ");
			}
			//Q)   자원 닫는 순서가 왜 다르지...?
			isr.close();
			isr=null;
			osw.close();
			osw=null;
			fis.close();
			fis=null;
			fos.close();
			fos=null;
		}
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}
		finally{	
			// 오류떠서 try 도 못했으면 여기서라도 자원 닫고
			if (isr !=null)
			{
				try{isr.close(); isr=null;}catch (Exception e){}
			}
			if (osw !=null)
			{
				try{osw.close(); osw=null;}catch (Exception e){}
			}
			if (fis !=null)
			{
				try{fis.close(); fis=null;}catch (Exception e){}
			}
			if (fos !=null)
			{
				try{fos.close(); fos=null;}catch (Exception e){}
			}
		}
	}
}