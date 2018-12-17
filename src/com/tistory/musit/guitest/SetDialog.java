package com.tistory.musit.guitest;

import java.awt.BorderLayout;

import javax.swing.*;

public class SetDialog extends JDialog {
	
	public SetDialog (JFrame owner, String title, Boolean modal, int sizeX, int sizeY) {
		
		super(owner, title, modal);
		setSize(sizeX, sizeY);
		setLocationRelativeTo(owner);
		setResizable(false);
	}
	
	public void setContionue() {
		JLabel head = new JLabel("Do you want to continue?");
		JButton btnYes = new JButton("Yes");
		JButton btnNo = new JButton("no");
		
		add(head, BorderLayout.NORTH);
		
		JPanel yesOrNo = new JPanel();
		yesOrNo.add(btnYes);
		yesOrNo.add(btnNo);
		
		add(yesOrNo, BorderLayout.SOUTH);
		
		
	}
}
