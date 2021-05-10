package a.b.c;


public class FileTest_2{
		
		public static void main(String args[]){
			
			String javaVersion = System.getProperty("java.version");
			System.out.println("javaVersion >>> : " + javaVersion);
			// javaVersion >>> : 1.8.0_261

			String userDir = System.getProperty("user.dir");
			System.out.println("userDir ������丮>>> : " + userDir);
			// userDir ������丮>>> : C:\00.KOSMO72\00.JExam\ch5
			// .getProperty() �Լ�   : ��ȣ �ȿ� �־��� Ư�� ���ڸ� ��������� �� ���� String ���� ��µȴ�.

			String osName = System.getProperty("os.name");
			System.out.println("osName �ü���̸�>>> : " + osName);
			// osName �ü���̸�>>> : Windows 10

			String fileSeparator = System.getProperty("file.separator");
			System.out.println("fileSeparator ���� ���й��� >>> : " + fileSeparator);
			// fileSeparator ���� ���й��� >>> : \ 
			System.out.println("java.io.File.separator ���� ���й��� >>> : " + java.io.File.separator);
			// java.io.File.separator ���� ���й��� >>> : \
			//     => ������� ������/�� �̶� �����ڰ� �ٸ��� ������ �̷��� �̾Ƴ��� �͵� �˾ƾ� �Ѵ�.

			String pathSeparator = System.getProperty("path.separator");
			System.out.println("pathSeparator ��� ���й��� >>> : " + pathSeparator);
			// pathSeparator ��� ���й��� >>> : ;

			String lineSeparator = System.getProperty("line.separator");
			System.out.println("lineSeparator �� ���й��� >>> : " + lineSeparator);
			// lineSeparator �� ���й��� >>> :


			//   �߿�   Properties Ŭ������ �� ���� ���� ������ ����ص���   
			java.util.Properties p = System.getProperties();
			// System.out.println("System.getProperties() \n >>> : " + p);

			for (java.util.Enumeration e = p.propertyNames(); e.hasMoreElements(); )
			{
				String key = (String)e.nextElement();
				String value = p.getProperty(key);
				//System.out.println(key+"="+value);
			}

			p.list(System.out);  // () �Ű�����p�� Properties �ȿ� �ִ� �Լ� list �� �̾Ƴ´�.

		
			/*
			String osVersion = System.getProperty("os.version");
			System.out.println("osVersion �����>>> : " + osVersion);
			// osVersion �����>>> : 10.0
			*/
		
		
		}



	}