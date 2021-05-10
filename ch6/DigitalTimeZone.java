package a.b.c;

import java.awt.FlowLayout;
// FlowLayout   �¿��߾����� ��
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JFrame;
// 
import javax.swing.JLabel;
//  ª�� �ؽ�Ʈ ���ڿ� �Ǵ� �̹����� ǥ�� ����,
//  ���̺��� ǥ�� �������� ��ġ�� ������ �� ���� ���� ������ ���ĵǾ� �ִ�. 
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
	// ������ �迭�� ���� �� : ���� Ÿ���� �����ʹ� ������ �����ؼ� ������(?)�ϰ� x
	//                    �迭�� ó��.
	// �迭�� �����͸� ������ �� {}   �׻� ; �� �����ؾ� �Ѵ�.
	
	public DigitalTimeZone(String timeZoneID){
	// �����ڿ� �ڵ带 �ĵ� �ȴ�.
		super("�����нð�");
		this.timeZoneID = timeZoneID;

		setLayout(new FlowLayout());  //  �߾�����
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		if (thread == null)
		{
			thread = new Thread(this);
			thread.start();
		}
	
	add(label);
	// add()  �����͸� �������� �״� �Լ�
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
			String now = cal.get(Calendar.YEAR) + "��" 
						+ (cal.get(Calendar.MONTH)+1) + "��" 
						+ cal.get(Calendar.DATE) + "��" 
						+ cal.get(Calendar.HOUR) + "��" 
						+ cal.get(Calendar.MINUTE) + "��"
						+ cal.get(Calendar.SECOND) + "��";
						//cal.get(Calendar.MILLISECOND) + "�и�������";
			label.setText(now);
			
			try
			{
				Thread.sleep(1000); // 1��
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
		System.out.println("���ýð��� ���� �ϼ��� \n"
							+ "00 : ���� \n"
							+ "01 : ���� \n"
							+ "02 : �ĸ� \n"
							+ "03 : ���� \n");
		String zoneID = sc.next();

		if ("00".equals(zoneID))
		{
			System.out.println("���� �ð��� ���� �߽��ϴ�. ");
			new DigitalTimeZone(DigitalTimeZone.timeZone[0]);
		}
		if ("01".equals(zoneID))
		{
			System.out.println("���� �ð��� ���� �߽��ϴ�. ");
			new DigitalTimeZone(DigitalTimeZone.timeZone[1]);
		}
		if ("02".equals(zoneID))
		{
			System.out.println("�ĸ� �ð��� ���� �߽��ϴ�. ");
			new DigitalTimeZone(DigitalTimeZone.timeZone[2]);
		}
		if ("03".equals(zoneID))
		{
			System.out.println("���� �ð��� ���� �߽��ϴ�. ");
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