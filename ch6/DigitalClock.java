package a.b.c;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable {
	
	private Thread thread;
	private JLabel label;

	public DigitalClock() 
	{
		super("디지털시계");

		setLayout(new FlowLayout()); //중앙정렬
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		// 싱글톤 패턴(디자인 패턴 중)
		//   항상 하나의 클래스만 사용한다.( 두 개의 클래스를 사용하지 않는 것)
		/*
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}
		*/

		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}

		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void run() 
	{
		while(true) 
		{
			Calendar cal = Calendar.getInstance();

			String now = cal.get(Calendar.YEAR)+ "년" + 
						 (cal.get(Calendar.MONTH)+1) + "월"  +
						 cal.get(Calendar.DATE)+"일" + 
				         cal.get(Calendar.HOUR)+"시" + 
			             cal.get(Calendar.MINUTE) + "분" + 
				         cal.get(Calendar.SECOND)+ "초";  
			             //cal.get(Calendar.MILLISECOND) + "밀리세컨드";*/

			label.setText(now);

			try {
				Thread.sleep(1000); //1초
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		new DigitalClock();
	}
}
