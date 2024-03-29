package day12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyWin {
	JFrame fr;
	JButton btn1, btn2, btn3;
	JPanel mainP, bPan;
	
	public MyWin() {
		fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainP = new JPanel();
		mainP.setPreferredSize(new Dimension(280, 450));
		mainP.setBackground(Color.GREEN);
		
		bPan = new JPanel();
		bPan.setLayout(new GridLayout(1, 3));
		
		btn1 = new JButton("닫기");
		btn2 = new JButton("추가");
		btn3 = new JButton("변경");
		

		
		/*
		// 닫기 이벤트 추가 (재사용을 할 경우)
		ActionListener act = new ActionListener() {
			// 이 클래스는 무명 내부클래스...
			// 오버라이드하는 함수의 내용이 극도로 짧아서
			// 별도로 클래스를 구현하는 것이 오히려 더 번거롭다.
			// 따라서 구현하는 순간 new 시킨 인스턴스를 사용하면 된다.
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		*/
		
		ActionListener exit = new MyExit();		// 전역 내부 클래스로 처리
		
//		ActionListener act = new MyEvt();
		
		// 내 위치의 주소를 알려주기 위해 this 를 써야함.
		ActionListener act1 = new MyEvt(this);
		// 일반적인 외부에 클래스를 만들어서 처리하는 방법
		
		// 닫기 버튼 기능
		btn1.addActionListener(exit);
		
		// 추가 버튼 기능
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MyWin();
			}
		});
		
		// 변경 버튼 기능
		btn3.addActionListener(act1);
		
//		btn2.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				mainP.setBackground(Color.blue);
//			}
//		});
		
		bPan.add(btn1);
		bPan.add(btn2);
		bPan.add(btn3);
		
		fr.add(mainP, BorderLayout.CENTER);
		fr.add(bPan, BorderLayout.SOUTH);
		
		fr.setVisible(true);
		fr.setSize(300, 500);
		fr.setResizable(false);
		
		
	}
	public static void main(String[] args) {
		new MyWin();
	}
	
	// 닫기 버튼 기능 추가
	class MyExit implements ActionListener {
		// 전역 내부 클래스...
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

//	// 변경 버튼 기능 추가
//	class MyEvt implements ActionListener {
//		// 전역 내부 클래스...
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			int red = (int)(Math.random() * 256);
//			int green = (int)(Math.random() * 256);
//			int blue = (int)(Math.random() * 256);
//			
//			Color c = new Color(red, green, blue);
//			
//			mainP.setBackground(c);
//		}
//	}
	
}
