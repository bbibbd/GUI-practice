package com.tistory.musit.javatest;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class CheckBoxPanel extends JPanel	{

	private static final long serialVersionUID = -7837735012881293052L;

	public CheckBoxPanel() {
		setLayout(new GridLayout(2,4));
		JCheckBox one = new JCheckBox("one");
		one.setSelected(true);
		JCheckBox two = new JCheckBox("two");
		two.setSelected(true);
		
		add(one);		add(two);	add(new JCheckBox("three"));	add(new JCheckBox("four"));
		add(new JCheckBox("five"));	add(new JCheckBox("six"));	add(new JCheckBox("seven"));	add(new JCheckBox("eight"));
		setBorder(BorderFactory.createTitledBorder("items"));
	}
}
