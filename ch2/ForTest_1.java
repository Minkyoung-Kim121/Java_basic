package a.b.c;

public class ForTest_1{
// str[i] 문자열 쪼개기 : length(), charAt()

	public static void main(String[] a){
		String str[] = {"abc", "def23456", "ghi345"};

		// 문1) str[] 쪼개기
		// str[] 문자열을 char로 쪼개기
		// 콘솔에 출력하기 >>>
// 문1) String 배열(String str[])로 문자char를 뽑으세요
		str[0] = "abc";
		String str0 = str[0];
		System.out.println("str0 >>> : " + str0); // str0 >>> : abc
//		char str00 = str[0].charAt(0) = 'a';
		char str00 = str[0].charAt(0);
		System.out.println("str00 >>> : " + str00); // str00 >>> : a
		char str01 = str[0].charAt(1);
		System.out.println("str01 >>> : " + str01); // str01 >>> : b
		char str02 = str[0].charAt(2);
		System.out.println("str02 >>> : " + str02); // str02 >>> : c

		str[1] = "def23456";
		String str1 = str[1];
		char str10 = str[1].charAt(0);
		System.out.println("str10 >>> : " + str10); // str10 >>> : d
		char str11 = str[1].charAt(1);
		System.out.println("str11 >>> : " + str11); // str11 >>> : e
		char str12 = str[1].charAt(2);
		System.out.println("str12 >>> : " + str12); // str12 >>> : f
		char str13 = str[1].charAt(3);
		System.out.println("str13 >>> : " + str13); // str13 >>> : 2
		char str14 = str[1].charAt(4);
		System.out.println("str14 >>> : " + str14); // str14 >>> : 3
		char str15 = str[1].charAt(5);
		System.out.println("str15 >>> : " + str15); // str15 >>> : 4
		char str16 = str[1].charAt(6);
		System.out.println("str16 >>> : " + str16); // str16 >>> : 5
		char str17 = str[1].charAt(7);
		System.out.println("str17 >>> : " + str17); // str17 >>> : 6

		str[2] = "ghi345";
		String str2 = str[2];
		char str20 = str[2].charAt(0);
		System.out.println("str20 >>> : " + str20); // str20 >>> : g
		char str21 = str[2].charAt(1);
		System.out.println("str21 >>> : " + str21); // str21 >>> : h
		char str22 = str[2].charAt(2);
		System.out.println("str22 >>> : " + str22); // str22 >>> : i
		char str23 = str[2].charAt(3);
		System.out.println("str23 >>> : " + str23); // str23 >>> : 3
		char str24 = str[2].charAt(4);
		System.out.println("str24 >>> : " + str24); // str24 >>> : 4
		char str25 = str[2].charAt(5);
		System.out.println("str25 >>> : " + str25); // str25 >>> : 5
/*
		str[0].charAt(0) = 'a';
		str[0].charAt(1) = 'b';
		str[0].charAt(2) = 'c';
		
		str[1] = "def23456";
		str[1] = charAt(0)'d';
		str[1] = charAt(1)'e';
		str[1] = charAt(2)'f';
		str[1] = charAt(3)'2';
		str[1] = charAt(4)'3';
		str[1] = charAt(5)'4';
		str[1] = charAt(6)'5';
		str[1] = charAt(7)'6';

		str[2] = "ghi345";
		str[2].charAt(0) = 'g';
		str[2].charAt(1) = 'h';
		str[2].charAt(2) = 'i';
		str[2].charAt(3) = '3';
		str[2].charAt(4) = '4';
		str[2].charAt(5) = '5';
*/

		// 문2) str[] 쪼개기
		// str[] 문자열을 length() 로 쪼개기
		for (int i=0; i < str.length; i++)
		{
			System.out.println("str.length >>> : " + str.length);
			System.out.println("str["+i+"] >>> : " + str[i]);
			System.out.println("str["+i+"].length() >>> : " + str[i].length());
		}
		for (int ii=0; ii < str.length; ii++)
		{
			System.out.println("str["+ii+"].charAt("+ii+") >>> : " + str[ii].charAt(ii));
		}

	}


}