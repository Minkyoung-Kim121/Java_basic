package a.b.c;

import java.net.URL;
import java.net.MalformedURLException;
// Thrown to indicate that a malformed URL has occurred.
// Either no legal protocol could be found in a specification string
// or the string could not be parsed.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class URLTest{

	public static void main(String args[]){
	
		String url = "https://www.naver.com"; // http : protocol (통신규약)
		// "http://www.naver.com"   -> https://  "s" 를 붙여야 됨
		// s 를 붙이면 보안상 조금 안전해진다고.....하는...데...

		try
		{
			URL u = new URL(url);
			// 참조변수 u는 new 키워드를 사용해서 URL 클래스를 생성자 URL()로 만들어서 인스턴스 한 것.
			// url 아규먼트를 넣어서 확인할 것이다.
			System.out.println("u >>> : " + u);
			// u >>> : http://www.naver.com
			System.out.println("u >>> : " + u.openStream());
			// u >>> : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@119d7047
			// .openStream() 함수 : 해당 URL에 대한 연결을 열고 해당 연결에서 읽기 위한 입력스트림 함수.
			BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream(), "UTF-8")); // UTF-8 을 쓰면 콘솔에서 한글이 안 깨짐. (.html 에서는 깨진다.)
			// 참조변수 br 은 new 키워드, BufferedReader() 생성자를 이용해서 BufferedReader 클래스 인스턴스함.
			//    (u.openStream(), "EUC-KR")
			//  -> 참조변수 u를 해당 url(https://www.naver.com)의 연결을 open 하고, EUC-KR(완성형)로 읽을 준비를 했다.
			//    InputStreamReader  :  byte -> char 변환하는 보조스트림 클래스 
			//                       1 byte 를 2byte 단위로 읽기 때문에 한글 또한 읽을 수 있다.
			//    (new InputStreamReader(u.openStream(), "EUC-KR"))
			//  -> 1byte 를 2byte 로 변환한다.
			//    BufferedReader    ->  깡통에 담아서 읽어온다.
			// => https://www.naver.com의 연결을 열(open)고, EUC-KR(완성형)으로 1byte 를 2byte 로 변환(InputStreamReader)해서
			//    BufferedReader로 읽어온다.      따라서, 컴파일 하고 실행할 때 java 패키지명.파일명 >> 만들파일.읽어올확장자 로 해서 
			// 실행해야 한다. 안그러면 콘솔 창 우르르르르

			// InputStreamReader(a, "bb");
			// "bb"   -> Creates an InputStreamReader that uses the named charset.
			// charset ?? : 문자 집합은 정보를 표현하기 위한 글자나 기호들의 집합을 정의한 것입니다.
			// "UTF-8"  /  "EUC-KR"
			// UTF-8    :   유니코드를 위한 가변 길이 문자 인코딩 방식 중 하나,
			//              UTF-8 인코딩은 유니코드 한 문자를 나타내기 위해 1바이트에서 4바이트까지를 사용한다.
			// EUC-KR   :  KS X 1001와 KS X 1003을 사용하는 8비트 문자 인코딩, EUC의 일종,
			//             대표적인 한글 완성형 인코딩이기 때문에 보통 완성형이라고 불린다.	
			System.out.println("br >>> : " + br);
			// br >>> : java.io.BufferedReader@776ec8df
			String inLine = "";
			BufferedWriter bw = new BufferedWriter(new FileWriter("nhn4.html"));
			// nhn4.html 라는 파일(문서) 출력 스트림을 생성하고, BufferedWriter 클래스(생성자로 자원 사용)를 
			// 이용해서 깡통에 담아서 쓸 것이다.   참조변수 bw로
			while ((inLine=br.readLine()) !=null)
			// .readLine() 함수 : 자바 파일 한 줄씩 읽기
			// Q) inLine("")이 br을 한줄씩 읽어온?   이 널이 아니면,
			{
				System.out.println(inLine);
				/*  -> 이건 불러올수 없다는 의미.
				<html>
				<head><title>302 Found</title></head>
				<body>
				<center><h1>302 Found</h1></center>
				<hr><center> NWS </center>
				</body>
				</html>
				*/
				bw.write(inLine);
				// nhn4.html 에 inLine 을 써라.
			}			
			br.close(); // 자꾸 까먹지 말고 자원을 썼으면 닫아라!!
			br=null;
			bw.flush(); // BufferredWriter 은 꼭 flush()를 해줘야 한다.
			bw.close();
			bw=null;
		}
		catch (Exception m)
		{
			System.out.println("m >>> : " + m);
		}

		

		String url2 = "https://www.daum.net";
		// C:\00.KOSMO72\00.JExam\ch6>java a.b.c.URLTest >> daum.html
		// 컴파일 하고 실행할 때 >> 웅앵웅.html 붙여서 실행해야 전체로 볼 수 있다.
		// Q)콘솔에서 출력할 때는 깨지고, html 브라우저로 볼 때는 안 깨지는 이유?
		// -> 불러와서 보는 주체가 다르기 때문에.
		// browser는 html 만 넘어와서 읽는다.
		try
		{
			URL u1 = new URL(url2);
			System.out.println("u1 >>> : " + u1);
			System.out.println("u1 >>> : " + u1.openStream());
			BufferedReader br1 = new BufferedReader(new InputStreamReader(u1.openStream(), "UTF-8"));
			System.out.println("br1 >>> : " + br1);
			String inLine1 = "";
			while ((inLine1=br1.readLine()) !=null)
			{
				System.out.println(inLine1);
				// 출력하는 구문을 넣어야 확인 가능!
			}
			br1.close();
			br1=null;
		}
		catch (Exception m)
		{
			System.out.println("m >>> : " + m);
		}


	}
}