package a.b.c;


public class FileTest_2{
		
		public static void main(String args[]){
			
			String javaVersion = System.getProperty("java.version");
			System.out.println("javaVersion >>> : " + javaVersion);
			// javaVersion >>> : 1.8.0_261

			String userDir = System.getProperty("user.dir");
			System.out.println("userDir 현재디렉토리>>> : " + userDir);
			// userDir 현재디렉토리>>> : C:\00.KOSMO72\00.JExam\ch5
			// .getProperty() 함수   : 괄호 안에 주어진 특정 문자를 적어넣으면 그 값이 String 으로 출력된다.

			String osName = System.getProperty("os.name");
			System.out.println("osName 운영체제이름>>> : " + osName);
			// osName 운영체제이름>>> : Windows 10

			String fileSeparator = System.getProperty("file.separator");
			System.out.println("fileSeparator 파일 구분문자 >>> : " + fileSeparator);
			// fileSeparator 파일 구분문자 >>> : \ 
			System.out.println("java.io.File.separator 파일 구분문자 >>> : " + java.io.File.separator);
			// java.io.File.separator 파일 구분문자 >>> : \
			//     => 윈도우와 리눅스/맥 이랑 구분자가 다르기 때문에 이렇게 뽑아내는 것도 알아야 한다.

			String pathSeparator = System.getProperty("path.separator");
			System.out.println("pathSeparator 경로 구분문자 >>> : " + pathSeparator);
			// pathSeparator 경로 구분문자 >>> : ;

			String lineSeparator = System.getProperty("line.separator");
			System.out.println("lineSeparator 행 구분문자 >>> : " + lineSeparator);
			// lineSeparator 행 구분문자 >>> :


			//   중요   Properties 클래스는 쓸 일이 많기 때문에 기억해두자   
			java.util.Properties p = System.getProperties();
			// System.out.println("System.getProperties() \n >>> : " + p);

			for (java.util.Enumeration e = p.propertyNames(); e.hasMoreElements(); )
			{
				String key = (String)e.nextElement();
				String value = p.getProperty(key);
				//System.out.println(key+"="+value);
			}

			p.list(System.out);  // () 매개변수p로 Properties 안에 있는 함수 list 를 뽑아냈다.

		
			/*
			String osVersion = System.getProperty("os.version");
			System.out.println("osVersion 운영버전>>> : " + osVersion);
			// osVersion 운영버전>>> : 10.0
			*/
		
		
		}



	}