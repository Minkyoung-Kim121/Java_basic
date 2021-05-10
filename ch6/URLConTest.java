package a.b.c;

import java.net.URL;
import java.net.URLConnection;
// URLConnection is the superclass of all classes
// that represent a communications link between the application and a URL.
import java.net.MalformedURLException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLConTest{
// public abstract class URLConnection extends Object
	public static void main(String args[]){
		
		String url = "https://www.daum.net";

		try
		{
			URL u = new URL(url);
			System.out.println("u >>> : " + u);
			//   u >>> : https://www.daum.net
			URLConnection uc = u.openConnection();
			// .openConnection() 함수 : URL 객체에 대한 연결을 반환하는 함수??
			System.out.println("uc >>> : " + uc);
			//   uc >>> : sun.net.www.protocol.https.DelegateHttpsURLConnection:https://www.daum.net
			BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
			System.out.println("uc.getInputStream() >>> : " + uc.getInputStream());
			//   uc.getInputStream() >>> : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@72d818d1
			System.out.println("br >>> : " + br);
			//   br >>> : java.io.BufferedReader@6e06451e
			String inLine = "";
			while ((inLine=br.readLine()) !=null)
			{
				System.out.println(inLine);
			}
			br.close();
			br=null;
		}
		catch (Exception m)
		{
			System.out.println("m >>> : " + m);
		}
	}
}

/*
u >>> : https://www.daum.net uc >>> : 
 sun.net.www.protocol.https.DelegateHttpsURLConnection
:https://www.daum.net uc.getInputStream() >>> :
 sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@72d818d1 br
 >>> : java.io.BufferedReader@6e06451e 
*/