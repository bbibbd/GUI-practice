package com.tistory.musit.guitest;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

//�⺻������ ���� �ְ� ����� ������ �� �ִ� �ǳ��� ����� ���� Ŭ�����̴�.
public class SetJPanel extends JPanel {	
	
	private static final long serialVersionUID = -6220248856021570319L;

	public SetJPanel(String s) {
		add(new JLabel(s));
	}
	
	//JPanel�� ��������� ���ǵǾ��ִ� getPreferredSize�� Override�� ����� ���Ƿ� �ǳ��� ����� ���� �� �ִ�.
	public Dimension getPreferredSize() {
		return new Dimension(100, 60);
	}
}

