package a.b.c;


import java.util.Calendar;

public class CalendarTest{

		public static String calendarM(){
	//		System.out.println("calendarM() >>> : " + calendarM()); -> �Լ��ȿ��� �ڱ� �ڽ�(�Լ�)�� �� �ҷ��� cmd ����
	// -> stackoverflow error!!!  :   �ڵ�, �ڿ��� ��� �ݺ��ؼ� ȣ��ǰ� �ִٴ� �ǹ�.

			return ""; // -> ���ϰ��� �����̱� ������ �Լ��� ������� �� �ƹ��͵� �� ���´�.
					   //     ���� �Լ� �ȿ� ���� ������ ������ ii ��¿��� ���ϰ� ���´�.
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
		ZONE_OFFSET=32400000,DST_OFFSET=0]       [] : �迭
	*/


		// ��  Calendar.get(Calendar.YEAR)
//		int get(int field)     from API
		int year = c.get(1);
		// public static final int YEAR = 1;    ->  java jdk scr �ȿ� ���� �´� ��Ű��, Ŭ���� ��� ���� ���� �ִ�.
		//                                      ->  �Ǵ� API ���� Constant Field Values : �����
		System.out.println("year >>> : " + year);  // year >>> : 2020
		String dYear = String.valueOf(year);
		System.out.println("dYear >>> : dYear" + dYear);

		// ��  Calendar.get(Calendar.MONTH)
		// public static final int MONTH = 2;
		int month = c.get(2);
		System.out.println("month >>> : " + month);   // 9
		month = month + 1;
		System.out.println("month >>> : " + month);   // 10
		String dMonth = String.valueOf(month);
		// -> ��¥�� �� �������� ������ �� ������ ���ڷ� ���, ���ڷ� ���� �� �ȴ�.
		System.out.println("dMonth >>> : " + dMonth);

		// ��  Calendar.get(Calendar.DAY_OF_MONTH)
		// public static final int date = 5;
		int date = c.get(5);
		System.out.println("date >>> : " + date);  // 22
		String dDate = String.valueOf(date); // String ���� �ٲ�
		System.out.println("dDate >>> : " + dDate);

//		int day = c.get(7);
//		System.out.println("day >>> : " + day);
//		String dDay = String.valueOf(date); // String ���� �ٲ�
//		System.out.println("dDay >>> : " + dDay);


		String ii = CalendarTest.calendarM();
		System.out.println("ii >>> : " + ii);

	
	}


}

// ���� �� ���� �� �ݵ�� ������ �����ؼ� ��� �޾Ƽ� ���.
// return :  1) ��� ���� ����ض�
//			 2) ������ Ÿ���� �ʱ�ȭ.