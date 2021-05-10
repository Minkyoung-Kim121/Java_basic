package a.b.c;

import java.io.*;
import java.util.ArrayList;
//  재귀 호출
public class FileTest_5{

	// 변수 선언
	static int totalFiles = 0;
	//최종 파일 수 (전역변수)
	static int totalDirs = 0;
	//최종 디렉토리 수 (전역변수)

	public static void main(String args[]){
	
		//String arg = "C:\\00.JExam";
		//명령행 인수로 원하는 path를 가져온다
		String filePath = args[0];
		//아래에서 사용할 File 타입 참조변수 dir 선언 및 null 초기화
		File dir = null;

		if (args.length != 1) // args[] 의 길이가 1이 아닐 때,
		//명령행 인자가 1개만 존재하는지 검사
		{
			System.out.println(" USAGE : java FileTest_5 DIRECTORY");
			//디렉토리를 찾을 수 없음 에러메시지 출력
			System.exit(0); // 0은 ^ 경우에 프로그램을 종료시킨다.
			//프로그램 종료 (int형 매개변수는 그냥 개발자가 종료 원인을 파악하기 위해 '임의로' 정의하는 것임.)
		}

		File dir_1 = new File(args[0]); // dir =  args[] 배열의 첫번째(0)
		//File클래스의 File(String pathname)생성자를 이용해서 객체화

		if (!dir_1.exists() || !dir_1.isDirectory()) 
		//dir_1 이 존재하지 않거나 (부정연산) 디렉토리가 만들어지지 않았을 때,
		//dir_1 유효성 검사
		//dir_1 존재하지 않는 파일이거나 or 디렉토리가 아닌지 검사
		//여기서 디렉토리만을 걸러내는 이유는 아래에 있는
		//printFileList() 함수를 이용해서 디렉토리의 하위의 파일들을 탐색하기 위함이다.
		//디렉토리가 아닌 파일들은 구조적으로 하위의 파일을 탐색할 수 없기 때문에 걸러낸다.
		{
			System.out.println(" 유효하지 않은 디렉토리입니다."); //에러메시지 출력
			System.exit(0); //시스템 종료
		}

		// method
		printFileList(dir_1); // printFileList() 함수를 dir_1 아규먼트를 사용해서 호출.
		// dir_1 을 printFileList 해라
		// 재귀 알고리즘을 이용해서 디렉토리의 하위 파일 및
		// 디렉토리를 탐색하여 출력하고 Count하는 사용자 정의 메소드
		System.out.println();  // () 안에 내용이 없어서 콘솔에는 한 줄 띄우고 출력되는 걸로 보임.
		//printFileList() 함수에서 계산한 총 디렉토리가 아닌 파일 개수 출력
		//줄바꿈을 위한 println() 메소드 출력.
		//매개변수가 없는 println() 함수는 줄바꿈 역할로 사용할 수 있음
		System.out.println(" 총 : " + totalFiles + " 개의 파일");
		//printFileList() 함수에서 계산한 총 디렉토리가 아닌 파일 개수 출력
		System.out.println(" 총 : " + totalDirs + " 개의 디렉토리");
		//printFileList() 함수에서 계산한 총 디렉토리 개수 출력

	}

	// printFileList 함수()
	public static void printFileList (File dir){
		System.out.println("" + dir.getAbsolutePath());
		// .getAbsolutePath()   : 파일의 절대경로를 반환
		// File dir = new File(args[0]);
		//File 타입 참조변수 dir의 절대경로 출력
		File[] files = dir.listFiles();
		// File[] 은 파일 + 디렉토리   ?
		// .listFiles()    디렉토리 경로에 존재하는 파일 리스트 반환
		//     -> dir 경로에 존재하는 파일 리스틀 반환하는 것이   files라는 File[] 배열.
		//    폴더 안에 있는 모든 파일,디렉토리의 개수
		//dir의 하위 파일들을 File 배열로 반환받아서
		//files에 저장함. (files에는 dir 폴더의 하위 파일들이 저장됨)

		ArrayList subDir = new ArrayList(); // subDir 이라는 새로운 배열을 만들어라
		//dir들의 인덱스를 저장해서 재귀를 통해 끝까지 탐색하기 위한 서브 디렉토리역할의 ArrayList

		for (int i=0; i < files.length; i++) // i가 files[]의 길이보다 작을 때 i++
		// .length 필드      배열 길이
		//                  File[] files = dir.listFiles();
		// .length() 함수    문자열(String)
		//                  파일의 크기를 byte 단위로 반환
		// .size() 함수      ArrayList (배열 안 인덱스의 크기??)
		
		//dir의 하위 파일 개수만큼 반복
		{	
			// for 문에 사용할 변수 선언
			String fileName = files[i].getName();
			// .getName()  : 파일의 이름을 반환
			//  => files[i] 의 이름을 반환한 것이 fileName(String)
			//File.getName()을 이용해 i번째 파일이 파일의 이름을 String 타입으로 반환받아 fileName에 저장함

			if (files[i].isDirectory())  // files[i] 가 디렉토리일때,
			//  .isFile()        : 파일입니까?
			//  .isDirectory()   : 디렉토리입니까?
			//      -> i번째 파일이 파일이 디렉토리인가?
			{
				fileName = "[" + fileName +"]";
				// [fileName]  형태로 fileName 함.
				// fileName 은 files[i] 의 이름을 반환한 것임.
				//if문을 통과했다는 뜻은 지금 탐색하고 있는 곳에 i번째 파일이 디렉토리라는 뜻이므로
				//인덱스 i를 SubDir에 add();
				subDir.add(i + "");
				// ArrayList subDir = new ArrayList();
				// subDir 에 .add(i + "")를 더해라.
				//  => 디렉토리를 파일과 구분해서 ArrayList에 담아라.
			}
			System.out.println("" + fileName);
		}

		int dirNum = subDir.size();
		// int dirNum 은 subDir(ArrayList 배열)의 size()
		// 발견된 디렉토리의 개수 
		// (subDir에는 발견된 디렉토리들의 인덱스가 저장되어있기 때문에 subDir의 size()는 발견된 )
		int fileNum = files.length - dirNum;
		// fileNum 은 files 길이(length필드) 에서 subDir(ArrayList)의 size()을 뺀 것.
		totalFiles += fileNum;
		//전역변수 totalFiles에 발견된 파일 개수를 저장함
		totalDirs += dirNum;
		//전역변수 totalDirs에 발견된 디렉토리 개수를 저장함

		System.out.println(fileNum + " 개의 파일, " + dirNum + " 개의 디렉토리");
		// 16 개의 파일, 1 개의 디렉토리
		System.out.println();
		// 한 줄 띄고


		//재귀 호출하는 부분   -> 디렉토리 안에 디렉토리가 디렉토리가 계속 있을 때
		//                    들여다보면서 출력하기위해
		for (int i=0; i < subDir.size(); i++) // i가 subDir.size()보다 작을 때 i++
		//    => 현재 발견된 디렉토리 숫자만큼 반복
		{
			int index = Integer.parseInt((String)subDir.get(i));
			// index 는 subDir.get(i)의 결과를 int 로 형변환 한 것.
			// int 참조변수 = Integer.parseInt(랄랄라);
			// -> 랄랄라를 int 로 형변환
			//subDir에 저장된 i을 꺼내 index에 저장한다.
			//i값은 현재 탐색하고 있는 디렉토리에 i번째 파일이 디렉토리라는것을 의미한다.
			printFileList(files[index]);
			// printFileList 를 호출
			//가져온 index를 이용해 files의 index번째 파일인 디렉토리를 열어 탐색하는 과정을
			//재귀문법으로 구현
		}

	}

}

// C:\00.KOSMO72\00.JExam\ch5>java a.b.c.FileTest_5 C:\00.KOSMO72 >> aaddaa.txt
// java a.b.c.FileTest_5 의 결과물을 >>(복사해서) aaddaa.txt 의 이름으로 저장해주세요.