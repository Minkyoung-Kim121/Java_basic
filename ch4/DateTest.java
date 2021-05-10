package a.b.c;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest{
	
	public static String dateM(){
		
		Date d = new Date();
		System.out.println("java.util.Date 클래스의 참조변수 d >>> : " + d);
		
		System.out.println("d >>> : " + System.identityHashCode(d));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.a.dd");
		System.out.println("sdf >>> : " + sdf.format(d));
		SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf0 >>> : " + sdf0.format(d));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("sdf1 >>> : " + sdf1.format(d));

/*
Date 클래스는 epoch 시간을 리턴한다.
1970년 1월 1일 00:00:00 시간을 기준으로
지나간 시간을 millisecond 로 반환한다.
*/

		// 년
		int year = d.getYear();
		System.out.println("year >>> : " + year); // 120 ??
		year = year + 1900;
		System.out.println("year >>> : " + year); // 2020
		String yYear = String.valueOf(year); // String 문자 
		// -> 날짜는 맨 마지막에 리턴할 때 무조건 문자로 써야, 숫자로 쓰면 안 된다.
		System.out.println("yYear >>> : " + yYear); // 2020

		// 월
		int month = d.getMonth();
		System.out.println("month >>> : " + month); // 9 ???
		month = month + 1; // january 가 0 부터 시작하기 때문에 1을 더해줘야 한다.
		System.out.println("month >>> : " + month); // 10
		String mMonth = String.valueOf(month); // 맨 마지막에 스트링으로 변환해서 리턴.
		System.out.println("mMonth >>> : " + mMonth);  // 10 
		
		
		// 일
		int date = d.getDate(); // DAY_OF_MONTH
		System.out.println("date >>> : " + date);  // 22
		String dDate = String.valueOf(date); // 스트링으로 변환 리턴
		System.out.println("dDate >>> : " + dDate); // 재출력


		int day = d.getDay();// DAY_OF_WEEK
		System.out.println("day >>> : " + day);  // 4 


		String time = yYear + "." + mMonth + "." + dDate;
		System.out.println("time >>> : " + time); // 2020.10.22
		time = time.replace('.', '-');
		System.out.println("time >>> : " + time); // 2020-10-22
//		time1 = time1.replace('.', '@');
//		System.out.println("time1 >>> : " + time1);


		return time;
		
	}

//Q) dateM 메인함수를 자원으로 쓸 함수로 만들어 보세요
	public static void main(String args[]){

		String date = DateTest.dateM(); // 날짜함수로 만들었다.
		System.out.println("date >>> : " + date);




	}


}