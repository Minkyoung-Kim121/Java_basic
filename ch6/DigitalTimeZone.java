package a.b.c;

import java.awt.FlowLayout;
// FlowLayout   좌우중앙정렬 등
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JFrame;
// 
import javax.swing.JLabel;
//  짧은 텍스트 문자열 또는 이미지의 표시 영역,
//  레이블의 표시 영역에서 위치를 지정할 수 있음 라벨의 내용이 정렬되어 있다. 
import java.util.TimeZone;
import java.util.Scanner;

public class DigitalTimeZone extends JFrame implements Runnable {

	private Thread thread;
	private JLabel label;
	private String timeZoneID;

	private static final String timeZone[] = {  "Asia/Seoul"
											   ,"America/New_York"
											   ,"Europe/Paris"
											   ,"Europe/London"};
	// 변수를 배열로 쓰는 것 : 같은 타입의 데이터는 여러개 선언해서 지저분(?)하게 x
	//                    배열로 처리.
	// 배열에 데이터를 선언한 후 {}   항상 ; 로 종결해야 한다.
	
	public DigitalTimeZone(String timeZoneID){
	// 생성자에 코드를 쳐도 된다.
		super("디지털시계");
		this.timeZoneID = timeZoneID;

		setLayout(new FlowLayout());  //  중앙정렬
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		if (thread == null)
		{
			thread = new Thread(this);
			thread.start();
		}
	
	add(label);
	// add()  데이터를 차곡차곡 쌓는 함수
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


	public static void main(String[] args){
		
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
			new DigitalTimeZone(DigitalTimeZone.timeZone[0]);
		}
		if ("01".equals(zoneID))
		{
			System.out.println("뉴욕 시간을 선택 했습니다. ");
			new DigitalTimeZone(DigitalTimeZone.timeZone[1]);
		}
		if ("02".equals(zoneID))
		{
			System.out.println("파리 시간을 선택 했습니다. ");
			new DigitalTimeZone(DigitalTimeZone.timeZone[2]);
		}
		if ("03".equals(zoneID))
		{
			System.out.println("런던 시간을 선택 했습니다. ");
			new DigitalTimeZone(DigitalTimeZone.timeZone[3]);
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