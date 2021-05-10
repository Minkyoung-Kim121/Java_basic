package a.b.c;

// *Event : 이벤트를 처리하는 클래스
// * Listener : 전달하는 클래스
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class JEditor extends JFrame{
	
	JTextArea ta;
	JScrollPane sp;
	JMenuBar mb;
	JMenu mFile;
	JMenuItem miNew, miOpen, miSave, miQuit;
	JFileChooser fc;

	public JEditor(String title){
		
		super(title);
// 객체들
		ta = new JTextArea();
		sp = new JScrollPane(ta);
		mb = new JMenuBar();
		mFile = new JMenu("파일");
		miNew = new JMenuItem("새글");
		miOpen = new JMenuItem("열기");
		miSave = new JMenuItem("저장");
		miQuit = new JMenuItem("종료");

		fc = new JFileChooser();

	}

	public void display(){
		addWindowListener(new WindowHandle());
		miNew.addActionListener(new NewHandle());
		miOpen.addActionListener(new OpenHandle());
		miSave.addActionListener(new SaveHandle());
		miQuit.addActionListener(new QuitHandle());
			
		// 약속된 규칙에 의해 이벤트를 처리하려고 호출한 함수들.
		mb.add(mFile);
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.addSeparator();
		mFile.add(miQuit);
		setJMenuBar(mb);
		getContentPane().add(sp);
		
		setSize(300,300);
		setVisible(true);


	}

	class WindowHandle extends WindowAdapter{
		public void windowClosing(WindowEvent we){
			System.exit(0);
		}	
	}

	class OpenHandle implements ActionListener{
		public void actionPerformed(ActionEvent ae){
			if (fc.showOpenDialog(JEditor.this) == JFileChooser.APPROVE_OPTION)
			{
				File file = fc.getSelectedFile();

				try{
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					
					String totalLine = "";
					String line = "";
					while ((line = br.readLine()) != null) {
						totalLine += (line + "\n");
				}
				
				
			}
			catch (FileNotFoundException e)
				{
					try{}
					catch (IOException ee)
					{					
					}
				}
		}

	}

	class SaveHandle implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			if (fc.showSaveDialog(JEditor.this)
				==JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();

				try	{
					String totalLine = "";
					totalLine = ta.getText();
	 
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(totalLine);
					bw.close();
					fw.close();
				}
				catch (FileNotFoundException e) {
				}
				try{}
				catch (IOException e) {
				}
			}
		}
	}

	class QuitHandle implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			System.exit(0);
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JEditor je = new JEditor("Swing 에디터");
		je.display();		
	}


	
}