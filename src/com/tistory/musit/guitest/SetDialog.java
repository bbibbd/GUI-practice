package com.tistory.musit.guitest;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class SetDialog extends JDialog {
	
	public SetDialog() {
		
	}
	
	public SetDialog (JFrame owner, String title, Boolean modal, int sizeX, int sizeY) {
		
		super(owner, title, modal);	//JDialog의 건설자에 owner, title, modal을 넣고 실행함
		setSize(sizeX, sizeY);	//사이즈 지정	
		setLocationRelativeTo(owner);	//위치 지정
		setResizable(false);	//사이즈 변경 못하게함
	}
	
	public void setContionue() {
		JLabel head = new JLabel("Do you want to continue?");
		JButton btnYes = new JButton("Yes");
		JButton btnNo = new JButton("no");
		JPanel panel = new JPanel();
		panel.add(head, BorderLayout.NORTH);
		panel.add(btnYes, BorderLayout.SOUTH);
		panel.add(btnNo, BorderLayout.SOUTH);
		add(panel, BorderLayout.CENTER);
		
		//JOptionPane.sho
	}
	

}
