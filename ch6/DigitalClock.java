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
		super("�����нð�");

		setLayout(new FlowLayout()); //�߾�����
		label = new JLabel();
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		// �̱��� ����(������ ���� ��)
		//   �׻� �ϳ��� Ŭ������ ����Ѵ�.( �� ���� Ŭ������ ������� �ʴ� ��)
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

			String now = cal.get(Calendar.YEAR)+ "��" + 
						 (cal.get(Calendar.MONTH)+1) + "��"  +
						 cal.get(Calendar.DATE)+"��" + 
				         cal.get(Calendar.HOUR)+"��" + 
			             cal.get(Calendar.MINUTE) + "��" + 
				         cal.get(Calendar.SECOND)+ "��";  
			             //cal.get(Calendar.MILLISECOND) + "�и�������";*/

			label.setText(now);

			try {
				Thread.sleep(1000); //1��
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
