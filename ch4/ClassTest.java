package a.b.c;

/*
// java SE 의 주요 패키지
java.lang.* : 자바 프로그램에서 자주 이용하는 기본 클래스 제공
java.io.* : 파일, 프린터, 모니터, 키보드 등의 다양한 입출력 관련 클래스 제공
java.net.* : 네트워크 관련 클래스 제공
java.util.* : 날짜, 시간, 벡터, 난수(random number)등의 유틸리티 클래스 제공
java.sql.* : 데이터베이스 프로그래밍에 필요한 다양한 클래스 제공
             하기 패키지는 특별한 경우에만 사용함
java.applet.* : 애플릿을 구현하기 위한 관련 클래스 제공 -> 현재는 잘 사용하지 x
java.awt.* : 그래픽 윈도우 관련 다양한 클래스 제공
javax.swing.* : AWT 보다 간편한 스윙에 사용되는 윈도우 관련 다양한 클래스 제공
*/
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTest extends Object{ // -> extends Object 생략가능.

	public String toString(){
		
		return "ㅠㅠㅠ";
	}

	public static void main(String args[]){
		
		ClassTest ct = new ClassTest();
		System.out.println("ct 참조변수 >>> : " + ct); // -> ct 참조변수 >>> : ㅠㅠㅠ
		System.out.println("ct.toString() >>> : " + ct.toString());
		// -> ct.toString() >>> : ㅠㅠㅠ

		Date d = new Date(); //   -> 윤년을 쓸 때는 Date 를 써야.
		System.out.println("d >>> : " + d); // -> d >>> : Tue Oct 20 15:51:30 KST 2020

		Calendar c = Calendar.getInstance(); 
		// Calendar c = new Calendar(); 
		// public abstract class Calendar extends Object 
		// -> abstract 는 new 써서 instance 하면 x
		//    추상클래스는 객체화 할 수 x

		System.out.println("c >>> : " + c);
/* ->   c >>> : java.util.GregorianCalendar
		[time=1603176690796,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
		zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,
		dstSavings=0,useDaylight=false,transitions=30,lastRule=null],
		firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,
		YEAR=2020,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,
		DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,
		HOUR_OF_DAY=15,MINUTE=51,SECOND=30,MILLISECOND=796,ZONE_OFFSET=32400000,DST_OFFSET=0]
*/
		ArrayList aList = new ArrayList(); // ArrayList -> 배열을 만들어라, 인덱스가 있다. 순차가 있다.
										   // cf. Vector
		aList.add("aaaa");
		ArrayList aList1 = new ArrayList();
		System.out.println("aList >>> : " + aList); // -> aList >>> : [aaaa]
		aList1.add("sfdg");
		System.out.println("aList1 >>> : " + aList1); // -> aList1 >>> : [sfdg]

//  부모 인터페이스 선언해서 사용하기
		List lt = new List(); // List 와 ArrayList 는 부모 - 자식 관계 
							  // 인터페이스 / 클래스
		System.out.println("lt >>> : " + lt);
		// ClassTest.java:63: error: List is abstract; cannot be instantiated
		//                List lt = new List();

		HashMap hm = new HashMap();
		hm.put("이름", "우웨엑");
		System.out.println("hm >>> : " + hm); // -> hm >>> : {이름=우웨엑}
		HashMap hm1 = new HashMap();
		hm1.put("주소", "우웨엑 엑엑엑");
		System.out.println("hm1 >>> : " + hm1); // -> hm1 >>> : {주소=우웨엑 엑엑엑}

//  부모 인터페이스 선언해서 사용하기
		Map mp = new Map();
		System.out.println("mp >>> : " + mp);
		// ClassTest.java:74: error: Map is abstract; cannot be instantiated
		//                Map mp = new Map();

//  스트링 클래스를 상수로 사용하기
		String s = "abc";
		System.out.println("s >>> : " + s);

// Q) char 로 쪼개기?

//  사용자 정의 배열 인스턴스 하기 
		int iVal[] = new int[5];
		System.out.println("iVal >>> : " + iVal);

	} // end of main()
	
} // end of ClassTest class