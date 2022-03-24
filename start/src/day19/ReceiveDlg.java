package day19;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ReceiveDlg {
	Jjokji main;
	JTextField field;
	JTextArea area;
	JButton reB, closeB;
	JFrame frame;
	
	public ReceiveDlg(Jjokji main) {
		this.main = main;
		setGui();
	}
	
	public void setGui() {
		frame = new JFrame("받은 메세지");
		field = new JTextField();
		area = new JTextArea();
		JScrollPane sp = new JScrollPane(area);
		
		// 버튼
		reB = new JButton("답장");
		closeB = new JButton("닫기");
		
		JPanel bPan = new JPanel(new GridLayout(1, 2));
		bPan.add(reB);
		bPan.add(closeB);
		
		reB.addActionListener(new BtnEvt());
		
		// 닫기버튼 누르면 현재창 닫히면서 Jjokji 창 띄우기
		closeB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				main.frame.setVisible(true);
			}
		});
		
		frame.add(field, BorderLayout.NORTH);
		frame.add(sp, BorderLayout.CENTER);
		frame.add(bPan, BorderLayout.SOUTH);
	
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.setResizable(false);
		
	}
	
	class BtnEvt implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 이름 알아내고
			String name = field.getText();
			
			MsgWrite wr = new MsgWrite(main);
			wr.field.setText(name);
			frame.dispose();
		}
	}

}
