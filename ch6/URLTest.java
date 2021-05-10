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
	
		String url = "https://www.naver.com"; // http : protocol (��űԾ�)
		// "http://www.naver.com"   -> https://  "s" �� �ٿ��� ��
		// s �� ���̸� ���Ȼ� ���� ���������ٰ�.....�ϴ�...��...

		try
		{
			URL u = new URL(url);
			// �������� u�� new Ű���带 ����ؼ� URL Ŭ������ ������ URL()�� ���� �ν��Ͻ� �� ��.
			// url �ƱԸ�Ʈ�� �־ Ȯ���� ���̴�.
			System.out.println("u >>> : " + u);
			// u >>> : http://www.naver.com
			System.out.println("u >>> : " + u.openStream());
			// u >>> : sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@119d7047
			// .openStream() �Լ� : �ش� URL�� ���� ������ ���� �ش� ���ῡ�� �б� ���� �Է½�Ʈ�� �Լ�.
			BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream(), "UTF-8")); // UTF-8 �� ���� �ֿܼ��� �ѱ��� �� ����. (.html ������ ������.)
			// �������� br �� new Ű����, BufferedReader() �����ڸ� �̿��ؼ� BufferedReader Ŭ���� �ν��Ͻ���.
			//    (u.openStream(), "EUC-KR")
			//  -> �������� u�� �ش� url(https://www.naver.com)�� ������ open �ϰ�, EUC-KR(�ϼ���)�� ���� �غ� �ߴ�.
			//    InputStreamReader  :  byte -> char ��ȯ�ϴ� ������Ʈ�� Ŭ���� 
			//                       1 byte �� 2byte ������ �б� ������ �ѱ� ���� ���� �� �ִ�.
			//    (new InputStreamReader(u.openStream(), "EUC-KR"))
			//  -> 1byte �� 2byte �� ��ȯ�Ѵ�.
			//    BufferedReader    ->  ���뿡 ��Ƽ� �о�´�.
			// => https://www.naver.com�� ������ ��(open)��, EUC-KR(�ϼ���)���� 1byte �� 2byte �� ��ȯ(InputStreamReader)�ؼ�
			//    BufferedReader�� �о�´�.      ����, ������ �ϰ� ������ �� java ��Ű����.���ϸ� >> ��������.�о��Ȯ���� �� �ؼ� 
			// �����ؾ� �Ѵ�. �ȱ׷��� �ܼ� â �츣������

			// InputStreamReader(a, "bb");
			// "bb"   -> Creates an InputStreamReader that uses the named charset.
			// charset ?? : ���� ������ ������ ǥ���ϱ� ���� ���ڳ� ��ȣ���� ������ ������ ���Դϴ�.
			// "UTF-8"  /  "EUC-KR"
			// UTF-8    :   �����ڵ带 ���� ���� ���� ���� ���ڵ� ��� �� �ϳ�,
			//              UTF-8 ���ڵ��� �����ڵ� �� ���ڸ� ��Ÿ���� ���� 1����Ʈ���� 4����Ʈ������ ����Ѵ�.
			// EUC-KR   :  KS X 1001�� KS X 1003�� ����ϴ� 8��Ʈ ���� ���ڵ�, EUC�� ����,
			//             ��ǥ���� �ѱ� �ϼ��� ���ڵ��̱� ������ ���� �ϼ����̶�� �Ҹ���.	
			System.out.println("br >>> : " + br);
			// br >>> : java.io.BufferedReader@776ec8df
			String inLine = "";
			BufferedWriter bw = new BufferedWriter(new FileWriter("nhn4.html"));
			// nhn4.html ��� ����(����) ��� ��Ʈ���� �����ϰ�, BufferedWriter Ŭ����(�����ڷ� �ڿ� ���)�� 
			// �̿��ؼ� ���뿡 ��Ƽ� �� ���̴�.   �������� bw��
			while ((inLine=br.readLine()) !=null)
			// .readLine() �Լ� : �ڹ� ���� �� �پ� �б�
			// Q) inLine("")�� br�� ���پ� �о��?   �� ���� �ƴϸ�,
			{
				System.out.println(inLine);
				/*  -> �̰� �ҷ��ü� ���ٴ� �ǹ�.
				<html>
				<head><title>302 Found</title></head>
				<body>
				<center><h1>302 Found</h1></center>
				<hr><center> NWS </center>
				</body>
				</html>
				*/
				bw.write(inLine);
				// nhn4.html �� inLine �� ���.
			}			
			br.close(); // �ڲ� ����� ���� �ڿ��� ������ �ݾƶ�!!
			br=null;
			bw.flush(); // BufferredWriter �� �� flush()�� ����� �Ѵ�.
			bw.close();
			bw=null;
		}
		catch (Exception m)
		{
			System.out.println("m >>> : " + m);
		}

		

		String url2 = "https://www.daum.net";
		// C:\00.KOSMO72\00.JExam\ch6>java a.b.c.URLTest >> daum.html
		// ������ �ϰ� ������ �� >> ���޿�.html �ٿ��� �����ؾ� ��ü�� �� �� �ִ�.
		// Q)�ֿܼ��� ����� ���� ������, html �������� �� ���� �� ������ ����?
		// -> �ҷ��ͼ� ���� ��ü�� �ٸ��� ������.
		// browser�� html �� �Ѿ�ͼ� �д´�.
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
				// ����ϴ� ������ �־�� Ȯ�� ����!
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