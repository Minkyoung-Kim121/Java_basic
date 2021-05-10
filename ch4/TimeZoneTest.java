package a.b.c;

import java.util.TimeZone;
import java.util.Calendar;

public class TimeZoneTest{

	public static String timeZone(String strID){
	
		String strIDs[] = TimeZone.getAvailableIDs();
		System.out.println("strIDs.length >>> : " + strIDs.length);
		
		String seoulTime = "";

		for (int i=0; i < strIDs.length; i++)
		{
			System.out.println("strIDs["+i+"] >>> : " + strIDs[i]);
			String _strID = strIDs[i];
			if (strID.equals(_strID))
			{
				seoulTime = _strID;
				break;
			}
		}

		return seoulTime;
	}

	public static void main(String args[]){
	
		String timeZoneID = TimeZoneTest.timeZone("Asia/Seoul");
		System.out.println("timeZoneID >>> : " + timeZoneID);

		String timeZoneID1 = TimeZoneTest.timeZone("Europe/London");
		System.out.println("timeZoneID1 >>> : " + timeZoneID1);

		String timeZoneID2 = TimeZoneTest.timeZone("Europe/Paris");
		System.out.println("timeZoneID2 >>> : " + timeZoneID2);

		String timeZoneID3 = TimeZoneTest.timeZone("America/New_York");
		System.out.println("timeZoneID3 >>> : " + timeZoneID3);



		

		// ���ýð� �������� 
		TimeZone tz = TimeZone.getTimeZone(timeZoneID1);
		System.out.println("tz >>> : " + tz);

		Calendar cd = Calendar.getInstance(tz);
		System.out.println("cd >>> : " + cd);

		// ����� �ú���

		int year = cd.get(1);
		System.out.println("year >>> : " + year);
		String dYear = String.valueOf(year);
		System.out.println("dYear >>> : " + dYear);

		int month = cd.get(2);
		month = month + 1;
		System.out.println("month >>> : " + month);
		String dMonth = String.valueOf(month);
		System.out.println("month >>> : " + month);

		int date = cd.get(5);
		System.out.println("date >>> : " + date);
		String dDate = String.valueOf(date);
		System.out.println("date >>> : " + date);


		int hour = cd.get(11); // 12/     11�� �ϸ� 24�ð����� ǥ�� 
		System.out.println("hour >>> : " + hour);
		String dHour = String.valueOf(date);
		System.out.println("hour >>> : " + hour);

		int minute = cd.get(12); // API ���� ����� ã�Ƽ� �ֱ�
		System.out.println("minute >>> : " + minute);
		String dMinute = String.valueOf(minute);
		System.out.println("minute >>> : " + minute);


		int second = cd.get(13);
		System.out.println("second >>> : " + second);
		String dSecond = String.valueOf(second);
		System.out.println("second >>> : " + second);




		String time = timeZoneID + " ���� �ð��� : "
		               + year + "��"
		               + month + "��"
		               + date + "�� : "
		               + hour + "��"
		               + minute + "��"
		               + second + "�� �Դϴ�. !!!!";
		System.out.println(time);

		String time111 = timeZoneID1 + " ���� �ð��� : "
		               + year + "��"
		               + month + "��"
		               + date + "�� : "
		               + hour + "��"
		               + minute + "��"
		               + second + "�� �Դϴ�. !!!!";
		System.out.println(time111);

		String time1 = timeZoneID2 + " �ĸ� �ð��� : "
		               + year + "��"
		               + month + "��"
		               + date + "�� : "
		               + hour + "��"
		               + minute + "��"
		               + second + "�� �Դϴ�. !!!!";
		System.out.println(time1);

		String time11 = timeZoneID3 + " ���� �ð��� : "
		               + year + "��"
		               + month + "��"
		               + date + "�� : "
		               + hour + "��"
		               + minute + "��"
		               + second + "�� �Դϴ�. !!!!";
		System.out.println(time11);




		






	}
}