package com.tistory.musit.guitest;

import java.awt.BorderLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class SetDialog extends JDialog {
	
	public SetDialog() {
		
	}
	
	public SetDialog (JFrame owner, String title, Boolean modal, int sizeX, int sizeY) {
		
		super(owner, title, modal);	//JDialog�� �Ǽ��ڿ� owner, title, modal�� �ְ� ������
		setSize(sizeX, sizeY);	//������ ����	
		setLocationRelativeTo(owner);	//��ġ ����
		setResizable(false);	//������ ���� ���ϰ���
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
