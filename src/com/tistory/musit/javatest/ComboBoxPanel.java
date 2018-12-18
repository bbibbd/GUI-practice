package com.tistory.musit.javatest;

import javax.swing.JComboBox;
import javax.swing.JPanel;

public class ComboBoxPanel extends JPanel{

	private static final long serialVersionUID = 8157103291640863513L;

	public ComboBoxPanel() {
		String [] list = {"Black", "White", "Red"};
		add(new JComboBox<Object>(list));
	}
}
