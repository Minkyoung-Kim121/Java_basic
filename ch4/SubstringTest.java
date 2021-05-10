package a.b.c;


public class SubstringTest{
	
	String orginFileName = "Hello.java";


	public void strIndexOf(){
		System.out.println("strIndexOf() >>> : #################");

		String fullName = "Hello.java";

		int index = fullName.indexOf('.'); // ',' ����
		int index1 = fullName.indexOf(".");
		System.out.println("index >>> : " + index);
		System.out.println("index1 >>> : " + index1);

		String flieName = fullName.substring(0, index);
		System.out.println("flieName >>> : " + flieName); // flieName >>> : Hello

		String extenstions = fullName.substring(index+1);
		System.out.println("extenstions >>> : " + extenstions); // extenstions >>> : java �տ��� ���


		if (orginFileName.equals(fullName))
		{
			//Hello(1).java
			System.out.println("orginFileName.equals(fullName) >>> : #####################");
			System.out.println("fullName" + fullName);

			int index2 = fullName.indexOf('.');
			String fileName2 = fileName.substring(0, index2);
			System.out.println("fileName2 >>> : " + fileName2);

			String extenstions2 = fullName.substring(index2+1);
			System.out.println("extenstions2 >>> : " + extenstions2);

			String fullName2 = fileName2 + "(1)" + extenstions2;
			System.out.println("fullName2 >>> : " + fullName2);
			System.out.println("orginFileName.equals(fullName) >>> : #####################");

		}


	}

	public void strLastIndexOf(){
		System.out.println("strLastIndexOf() >>> : #################");
		String fullName = "Hello!doc";

		int lastIndex = fullName.lastIndexOf('!');
		System.out.println("lastIndex >>> : " + lastIndex); // 5

		String extenstions = fullName.substring(lastIndex+1);
		System.out.println("extenstions >>> : " + extenstions); // doc �ڿ��� �������


		if ("doc".equals(extenstions))
		{
			System.out.println("extenstions >>> : " + extenstions);
			System.out.println("ms doc MIME TYPE : application/msword");
		}



	}


	public static void main(String args[]){
		
		String str = "abcdefghijklmn";
		System.out.println("str >>> : " + str);
		str = str.toUpperCase(); // �빮�ڷ� �ٲ��ּ���.
		System.out.println("str >>> : " + str);
		System.out.println("str.length() >>> : " + str.length()); // 14 -> index : 0~13

		String str0 = str.substring(1); // 1��° �ڷ� �� ����.
		System.out.println("str0 >>> : " + str0); // str0 >>> : BCDEFGHIJKLMN
		
		String str1 = str.substring(1, 5); // ���� ���ϱ� 1~5
		System.out.println("str1 >>> : " + str1); // str1 >>> : BCDE

		String str2 = str.substring(0, 14);
		System.out.println("str2 >>> : " + str2); 
		
		String str3 = str.substring(11, 14); // -> 11~14 ���� : 12, 13, 14 ��° ����ϱ�
		System.out.println("str3 >>> : " + str3);  // LMN
		String str4 = str.substring(str.length()-3,str.length()); // -> ����(.length() )���� ���� ���� ��.
		System.out.println("str4 >>> : " + str4); // LMN

		
		// strIndexOf �տ� static �� �����ϱ� ���������� �ҷ������ �ߴ�,
		// ���� �ȿ� new �� �ٿ��� Ŭ���� ���� = new Ŭ����() �Լ�;
		//                     ����.ȣ���� �Լ�;
		SubstringTest st = new SubstringTest();  
		st.strIndexOf();  
		st.strLastIndexOf();



	}


}