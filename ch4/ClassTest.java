package a.b.c;

/*
// java SE �� �ֿ� ��Ű��
java.lang.* : �ڹ� ���α׷����� ���� �̿��ϴ� �⺻ Ŭ���� ����
java.io.* : ����, ������, �����, Ű���� ���� �پ��� ����� ���� Ŭ���� ����
java.net.* : ��Ʈ��ũ ���� Ŭ���� ����
java.util.* : ��¥, �ð�, ����, ����(random number)���� ��ƿ��Ƽ Ŭ���� ����
java.sql.* : �����ͺ��̽� ���α׷��ֿ� �ʿ��� �پ��� Ŭ���� ����
             �ϱ� ��Ű���� Ư���� ��쿡�� �����
java.applet.* : ���ø��� �����ϱ� ���� ���� Ŭ���� ���� -> ����� �� ������� x
java.awt.* : �׷��� ������ ���� �پ��� Ŭ���� ����
javax.swing.* : AWT ���� ������ ������ ���Ǵ� ������ ���� �پ��� Ŭ���� ����
*/
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassTest extends Object{ // -> extends Object ��������.

	public String toString(){
		
		return "�ФФ�";
	}

	public static void main(String args[]){
		
		ClassTest ct = new ClassTest();
		System.out.println("ct �������� >>> : " + ct); // -> ct �������� >>> : �ФФ�
		System.out.println("ct.toString() >>> : " + ct.toString());
		// -> ct.toString() >>> : �ФФ�

		Date d = new Date(); //   -> ������ �� ���� Date �� ���.
		System.out.println("d >>> : " + d); // -> d >>> : Tue Oct 20 15:51:30 KST 2020

		Calendar c = Calendar.getInstance(); 
		// Calendar c = new Calendar(); 
		// public abstract class Calendar extends Object 
		// -> abstract �� new �Ἥ instance �ϸ� x
		//    �߻�Ŭ������ ��üȭ �� �� x

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
		ArrayList aList = new ArrayList(); // ArrayList -> �迭�� ������, �ε����� �ִ�. ������ �ִ�.
										   // cf. Vector
		aList.add("aaaa");
		ArrayList aList1 = new ArrayList();
		System.out.println("aList >>> : " + aList); // -> aList >>> : [aaaa]
		aList1.add("sfdg");
		System.out.println("aList1 >>> : " + aList1); // -> aList1 >>> : [sfdg]

//  �θ� �������̽� �����ؼ� ����ϱ�
		List lt = new List(); // List �� ArrayList �� �θ� - �ڽ� ���� 
							  // �������̽� / Ŭ����
		System.out.println("lt >>> : " + lt);
		// ClassTest.java:63: error: List is abstract; cannot be instantiated
		//                List lt = new List();

		HashMap hm = new HashMap();
		hm.put("�̸�", "�����");
		System.out.println("hm >>> : " + hm); // -> hm >>> : {�̸�=�����}
		HashMap hm1 = new HashMap();
		hm1.put("�ּ�", "����� ������");
		System.out.println("hm1 >>> : " + hm1); // -> hm1 >>> : {�ּ�=����� ������}

//  �θ� �������̽� �����ؼ� ����ϱ�
		Map mp = new Map();
		System.out.println("mp >>> : " + mp);
		// ClassTest.java:74: error: Map is abstract; cannot be instantiated
		//                Map mp = new Map();

//  ��Ʈ�� Ŭ������ ����� ����ϱ�
		String s = "abc";
		System.out.println("s >>> : " + s);

// Q) char �� �ɰ���?

//  ����� ���� �迭 �ν��Ͻ� �ϱ� 
		int iVal[] = new int[5];
		System.out.println("iVal >>> : " + iVal);

	} // end of main()
	
} // end of ClassTest class