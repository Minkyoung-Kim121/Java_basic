package a.b.c;

import java.net.URL;

public class URLTest_1{
	
	public static void main(String args[]){
		
		// String url = "https://127.0.0.1:8080/server/xxx/a.jsp?key=value";;
		// String url = "https://www.joinc.co.kr/w/" + "Site/Network_Programing/AdvancedComm/HTTP";
		
		// url   :  Uniform Resource Locator
		//			web address
		//			���� �ĺ���, �����ڿ����ñ�
		//			scheme:[//[user:password@]host[:port]][/]path[?query][#fragment]
		// uri   :  Uniform Resource Identifier
		//          ���ͳݿ� �ִ� �ڿ��� ��Ÿ���� ������ �ڿ�
		// uri > url
		// http://������:��Ʈ/���/�н�?key=value&page=12
		// url : http://������:��Ʈ/���/�н�
		// uri : http://������:��Ʈ/���/�н�?key=value&page=12
		//   url  ��  uri  ���� �� �ؾ�.

		String url = "https"     //  protocol
					+"://"       //  �������� �� ��� ������
					+"127.0.0.1" //  ip �Ǵ� ������
					+":"         //  ip �Ǵ� �����ΰ� port ������
					+"8080"      //  port(��Ʈ : ���ø����̼�)
					+"/webserverContext/fileDirectory/a.jsp"   // ã���� �ϴ� ������ ������
								//  �� ���� ���
								//  /webserverContext  :  �� ���� ��Ʈ    Context
								//  /fileDirectory     :  ��� ����
								//  /a.jsp             :  ��û�� ���� ���ϸ�
					+"?"         //  ������ ��ο� Query String ������
					+"key=value" //  Query String   Ű �� ��     ������
					+"&"         //  ���� ��Ʈ�� ������ : ��û�ϴ� ���ڿ�
					+"key=value" //  Query String   Ű �� ��
					+"&"         //  ���� ��Ʈ�� ������
					+"key=value"; //  Query String   Ű �� ��
					// ���� ���� ����ϴ� ���� GET ����̶�� �Ѵ�.
					// GET ��� : url �� Query String ���� �ִ� ��
					// ������Ʈ���� ������.(������ �Ѵ�.)
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





