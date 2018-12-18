package com.tistory.musit.Graphics;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	
	public MyPanel() {
		JButton btn1 = new JButton("버튼 1");
		JButton btn2 = new JButton("버튼 2");
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.RED);
		btn1.setFont(new Font("한컴 백제 M",Font.PLAIN, 20));
		
		add(btn1);	add(btn2);
		setBackground(Color.GREEN);
		
	}
}
