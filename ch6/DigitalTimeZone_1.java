package a.b.c;

import java.awt.FlowLayout;
// FlowLayout   좌우중앙정렬 등
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JFrame;
// import java.lang.Thread;
import javax.swing.JLabel;
//  짧은 텍스트 문자열 또는 이미지의 표시 영역,
//  레이블의 표시 영역에서 위치를 지정할 수 있음 라벨의 내용이 정렬되어 있다. 
import java.util.TimeZone;
import java.util.Scanner;

public class DigitalTimeZone_1 extends JFrame implements Runnable {

	public static final int TIME_ZONE_0 = 0;
	// 또는     private static final int TIME_ZONE_0 = 0;
	// timeZone[]   4개니까 0,1,2,3    TIME_ZONE_*  에 0,1,2,3 을 주는 것은
	// 사람들이 어떤 데이터? 를 썼는지 모르게 하는 것이다.
	// 인덱스 순서 0,1,2,3 대신에 상수로 0,1,2,3 사용한것.
	public static final int TIME_ZONE_1 = 1;
	public static final int TIME_ZONE_2 = 2;
	public static final int TIME_ZONE_3 = 3;
	// 상수로 선언해서 쓴다.
	// 상수배열 이넘?

	private static final String timeZone[] = {  "Asia/Seoul"
											   ,"America/New_York"
											   ,"Europe/Paris"
											   ,"Europe/London"};
	// 변수를 배열로 쓰는 것 : 같은 타입의 데이터는 여러개 선언해서 지저분(?)하게 x
	//                    배열로 처리.
	
	private Thread thread;
	// 접근제한자 : private   Thread 데이터타입   thread  변수 선언
	private JLabel label;
	private String timeZoneID;


	public DigitalTimeZone_1(String timeZoneID){
	// 생성자에 코드를 쳐도 된다.
		
		super("디지털시계");
		this.timeZoneID = timeZoneID;

		setLayout(new FlowLayout());  //  중앙정렬
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		if (thread == null) // thread 가 공백이라면,
		{
			thread = new Thread(this);
			thread.start();
		}
	
	add(label);
	setBounds(100, 100, 400, 100);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	public void run(){
		// Asia/Seoul, America/New_York, Europe/Paris, Europe/London
		
		TimeZone tz = TimeZone.getTimeZone(this.timeZoneID);

		while(true)
		{
			Calendar cal = Calendar.getInstance(tz);
			String now = cal.get(Calendar.YEAR) + "년" 
						+ (cal.get(Calendar.MONTH)+1) + "월" 
						+ cal.get(Calendar.DATE) + "일" 
						+ cal.get(Calendar.HOUR) + "시" 
						+ cal.get(Calendar.MINUTE) + "분"
						+ cal.get(Calendar.SECOND) + "초";
						//cal.get(Calendar.MILLISECOND) + "밀리세컨드";
			label.setText(now);
			
			try
			{
				Thread.sleep(1000); // 1초
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}


	public static void main(String args[]){
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		Scanner sc = new Scanner(System.in);
		System.out.println("도시시간을 선택 하세요 \n"
							+ "00 : 서울 \n"
							+ "01 : 뉴욕 \n"
							+ "02 : 파리 \n"
							+ "03 : 런던 \n");
		String zoneID = sc.next();

		if ("00".equals(zoneID))
		{
			System.out.println("서울 시간을 선택 했습니다. ");
			new DigitalTimeZone_1(DigitalTimeZone_1.timeZone[DigitalTimeZone_1.TIME_ZONE_0]);
		}
		if ("01".equals(zoneID))
		{
			System.out.println("뉴욕 시간을 선택 했습니다. ");
			new DigitalTimeZone_1(DigitalTimeZone_1.timeZone[DigitalTimeZone_1.TIME_ZONE_1]);
		}
		if ("02".equals(zoneID))
		{
			System.out.println("파리 시간을 선택 했습니다. ");
			new DigitalTimeZone_1(DigitalTimeZone_1.timeZone[DigitalTimeZone_1.TIME_ZONE_2]);
		}
		if ("03".equals(zoneID))
		{
			System.out.println("런던 시간을 선택 했습니다. ");
			new DigitalTimeZone_1(DigitalTimeZone_1.timeZone[DigitalTimeZone_1.TIME_ZONE_3]);
		}
	}
}

		/*
		String timeZoneID = "Asia/Seoul";
		TimeZone tx = TimeZone.getTimeZone(timeZoneID);

		String timeZoneID1 = "America/New_York";
		TimeZone tx1 = TimeZone.getTimeZone(timeZoneID1);

		String timeZoneID11 = "Europe/Paris";
		TimeZone tx11 = TimeZone.getTimeZone(timeZoneID11);

		String timeZoneID111 = "Europe/London";
		TimeZone tx111 = TimeZone.getTimeZone(timeZoneID111);
		*/