package a.b.c;

import java.net.URL;

public class URLTest_1{
	
	public static void main(String args[]){
		
		// String url = "https://127.0.0.1:8080/server/xxx/a.jsp?key=value";;
		// String url = "https://www.joinc.co.kr/w/" + "Site/Network_Programing/AdvancedComm/HTTP";
		
		// url   :  Uniform Resource Locator
		//			web address
		//			파일 식별자, 유일자원지시기
		//			scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
		// uri   :  Uniform Resource Identifier
		//          인터넷에 있는 자원을 나타내는 유일한 자원
		// uri > url
		// http://도메인:포트/경로/패스?key=value&page=12
		// url : http://도메인:포트/경로/패스
		// uri : http://도메인:포트/경로/패스?key=value&page=12
		//   url  과  uri  구분 잘 해야.

		String url = "https"     //  protocol
					+"://"       //  프로토콜 과 경로 구분자
					+"127.0.0.1" //  ip 또는 도메인
					+":"         //  ip 또는 도메인과 port 구분자
					+"8080"      //  port(포트 : 어플리케이션)
					+"/webserverContext/fileDirectory/a.jsp"   // 찾고자 하는 파일의 시작점
								//  웹 서버 경로
								//  /webserverContext  :  웹 서버 루트    Context
								//  /fileDirectory     :  경로 폴더
								//  /a.jsp             :  요청한 실제 파일명
					+"?"         //  웹서버 경로와 Query String 구분자
					+"key=value" //  Query String   키 와 값     데이터
					+"&"         //  쿼리 스트링 구분자 : 요청하는 문자열
					+"key=value" //  Query String   키 와 값
					+"&"         //  쿼리 스트링 구분자
					+"key=value"; //  Query String   키 와 값
					// 위와 같이 사용하는 것을 GET 방식이라고 한다.
					// GET 방식 : url 에 Query String 까지 있는 것
					// 쿼리스트링은 데이터.(역할을 한다.)
		/*
		String url = "https://www.joinc.co.kr/w/" + "Site/Network_Programing/AdvancedComm/HTTP";
		*/
		/*
		String url = "https://www.google.com/search?"
					 + "q=http+%ED%94%84%EB%A1%9C%ED%86%A0%EC%BD%9C"
					 + "&rlz=1C1CHBD_koKR924KR924"
					 + "&oq=http+%ED%94%84%EB%A1%9C%EB%A1%9C%ED%86%A0"
					 + "&aqs=chrome.1.69i57j0i13l7.6923j0j15&sourceid=chrome"
					 + "&ie=UTF-8";
		*/

		try
		{
			URL u = new URL(url);
			System.out.println("u >>> : " + u);
			// u >>> : https://www.google.com/search?q=http+%ED%94%84%EB%A1%9C%ED
			//%86%A0%EC%BD%9C&rlz=1C1CHBD_koKR924KR924&oq=http+%ED%94%84%EB%A1%9C%EB%A1%9C%ED
			//%86%A0&aqs=chrome.1.69i57j0i13l7.6923j0j15&sourceid=chrome&ie=UTF-8
			System.out.println("u.getProtocol() >>> : " + u.getProtocol());
			// u.getProtocol() >>> : https
			System.out.println("u.getHost() >>> : " + u.getHost());
			// u.getHost() >>> : www.google.com
			System.out.println("u.getPort() >>> : " + u.getPort());
			// u.getPort() >>> : -1
			System.out.println("u.getPath() >>> : " + u.getPath());
			// u.getPath() >>> : /search
			System.out.println("u.getQuery() >>> : " + u.getQuery());
			// u.getQuery() >>> : q=http+%ED%94%84%EB%A1%9C%ED%86%A0%EC%BD%9C&rlz=1C1CHBD
			//_koKR924KR924&oq=http+%ED%94%84%EB%A1%9C%EB%A1%9C%ED%86%A0&aqs=
			//chrome.1.69i57j0i13l7.6923j0j15&sourceid=chrome&ie=UTF-8
			System.out.println("u.getFile() >>> : " + u.getFile());
			// u.getFile() >>> : /search?q=http+%ED%94%84%EB%A1%9C%ED%86%A0%EC%BD
			//%9C&rlz=1C1CHBD_koKR924KR924&oq=http+%ED%94%84%EB%A1%9C%EB%A1%9C%ED
			//%86%A0&aqs=chrome.1.69i57j0i13l7.6923j0j15&sourceid=chrome&ie=UTF-8
		}
		catch (Exception e)
		{
			System.out.println("e >>> : " + e);
		}


	}

}





