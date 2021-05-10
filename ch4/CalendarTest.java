package a.b.c;


import java.util.Calendar;

public class CalendarTest{

		public static String calendarM(){
	//		System.out.println("calendarM() >>> : " + calendarM()); -> 함수안에서 자기 자신(함수)을 또 불러서 cmd 오류
	// -> stackoverflow error!!!  :   코드, 자원이 계속 반복해서 호출되고 있다는 의미.

			return ""; // -> 리턴값이 공백이기 때문에 함수를 출력했을 때 아무것도 안 나온다.
					   //     여기 함수 안에 값을 넣으면 메인의 ii 출력에서 리턴값 나온다.
		}


	



	
	public static void main(String args[]){
		

		Calendar c = Calendar.getInstance();
		//   .getInstance() -> Gets a calendar using the default time zone and locale.
		System.out.println("c >>> : " + c);
	/*
		c >>> : java.util.GregorianCalendar
		[time=1603346911981,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",
		offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],
		firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1
		,YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,
		DAY_OF_YEAR=296,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,
		HOUR=3,HOUR_OF_DAY=15,MINUTE=8,SECOND=31,MILLISECOND=981,
		ZONE_OFFSET=32400000,DST_OFFSET=0]       [] : 배열
	*/


		// 년  Calendar.get(Calendar.YEAR)
//		int get(int field)     from API
		int year = c.get(1);
		// public static final int YEAR = 1;    ->  java jdk scr 안에 가서 맞는 패키지, 클래스 열어서 보면 나와 있다.
		//                                      ->  또는 API 에서 Constant Field Values : 상수값
		System.out.println("year >>> : " + year);  // year >>> : 2020
		String dYear = String.valueOf(year);
		System.out.println("dYear >>> : dYear" + dYear);

		// 월  Calendar.get(Calendar.MONTH)
		// public static final int MONTH = 2;
		int month = c.get(2);
		System.out.println("month >>> : " + month);   // 9
		month = month + 1;
		System.out.println("month >>> : " + month);   // 10
		String dMonth = String.valueOf(month);
		// -> 날짜는 맨 마지막에 리턴할 때 무조건 문자로 써야, 숫자로 쓰면 안 된다.
		System.out.println("dMonth >>> : " + dMonth);

		// 일  Calendar.get(Calendar.DAY_OF_MONTH)
		// public static final int date = 5;
		int date = c.get(5);
		System.out.println("date >>> : " + date);  // 22
		String dDate = String.valueOf(date); // String 으로 바꿔
		System.out.println("dDate >>> : " + dDate);

//		int day = c.get(7);
//		System.out.println("day >>> : " + day);
//		String dDay = String.valueOf(date); // String 으로 바꿔
//		System.out.println("dDay >>> : " + dDay);


		String ii = CalendarTest.calendarM();
		System.out.println("ii >>> : " + ii);

	
	}


}

// 리턴 값 받을 때 반드시 변수를 선언해서 결과 받아서 써라.
// return :  1) 결과 값을 출력해라
//			 2) 데이터 타입을 초기화.