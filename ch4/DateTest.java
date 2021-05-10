package a.b.c;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTest{
	
	public static String dateM(){
		
		Date d = new Date();
		System.out.println("java.util.Date Ŭ������ �������� d >>> : " + d);
		
		System.out.println("d >>> : " + System.identityHashCode(d));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.a.dd");
		System.out.println("sdf >>> : " + sdf.format(d));
		SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("sdf0 >>> : " + sdf0.format(d));
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("sdf1 >>> : " + sdf1.format(d));

/*
Date Ŭ������ epoch �ð��� �����Ѵ�.
1970�� 1�� 1�� 00:00:00 �ð��� ��������
������ �ð��� millisecond �� ��ȯ�Ѵ�.
*/

		// ��
		int year = d.getYear();
		System.out.println("year >>> : " + year); // 120 ??
		year = year + 1900;
		System.out.println("year >>> : " + year); // 2020
		String yYear = String.valueOf(year); // String ���� 
		// -> ��¥�� �� �������� ������ �� ������ ���ڷ� ���, ���ڷ� ���� �� �ȴ�.
		System.out.println("yYear >>> : " + yYear); // 2020

		// ��
		int month = d.getMonth();
		System.out.println("month >>> : " + month); // 9 ???
		month = month + 1; // january �� 0 ���� �����ϱ� ������ 1�� ������� �Ѵ�.
		System.out.println("month >>> : " + month); // 10
		String mMonth = String.valueOf(month); // �� �������� ��Ʈ������ ��ȯ�ؼ� ����.
		System.out.println("mMonth >>> : " + mMonth);  // 10 
		
		
		// ��
		int date = d.getDate(); // DAY_OF_MONTH
		System.out.println("date >>> : " + date);  // 22
		String dDate = String.valueOf(date); // ��Ʈ������ ��ȯ ����
		System.out.println("dDate >>> : " + dDate); // �����


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

//Q) dateM �����Լ��� �ڿ����� �� �Լ��� ����� ������
	public static void main(String args[]){

		String date = DateTest.dateM(); // ��¥�Լ��� �������.
		System.out.println("date >>> : " + date);




	}


}