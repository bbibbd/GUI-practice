package com.tistory.musit.guitest;


import java.awt.BorderLayout;

import javax.swing.*;

public class SetFrame extends JFrame{
	
	public SetFrame(String title, int x, int y, int sizeX, int sizeY) {
			
		super(title);
		setLocation(x, y);
		setSize(sizeX, sizeY);
		//setResizable(false);	//������ ���� �Ұ����ϰ� �ϴ� method
	}
	
	public void setMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu mFile, mEdit, mHelp;
		
		mFile = new JMenu("File");
		mEdit = new JMenu("Edit");
		mHelp = new JMenu("Help");
		setJMenuBar(menuBar);
	
		menuBar.add(mFile);
		menuBar.add(mEdit);
		menuBar.add(mHelp);
		
	}
	
	public void setJLabel() {
		
		JLabel label = new JLabel("Love You!");
		add(label,BorderLayout.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);

	}
	
	public void setJButton() {
		JButton button1 = new JButton("Love");
		JButton button2 = new JButton("You");
		
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		button1.setVerticalAlignment(JButton.CENTER);
		button2.setVerticalAlignment(JButton.CENTER);
		
	}
	
	public void setJCheckBox() {
		JCheckBox box1 = new JCheckBox("Lee Cheeun");
		JCheckBox box2 = new JCheckBox("U");
		box1.setSelected(true);
		box2.setSelected(true);
		//box1.isSelected()	���õǾ���? return true, �ƴϴ�? return false
		add(box1, BorderLayout.NORTH);
		add(box2, BorderLayout.SOUTH);
		box1.setHorizontalAlignment(JCheckBox.CENTER);
		box2.setHorizontalAlignment(JCheckBox.CENTER);
	}
	
	public void setJRadioButton() {
		JRadioButton r1 = new JRadioButton("yes");
		JRadioButton r2 = new JRadioButton("no");
		JRadioButton r3 = new JRadioButton("think");
		
		ButtonGroup g = new ButtonGroup();
		g.add(r1);		g.add(r2);		g.add(r3);
		
		add(r1, BorderLayout.NORTH);
		add(r2, BorderLayout.SOUTH);
		add(r3, BorderLayout.CENTER);
		
		r1.setHorizontalAlignment(JRadioButton.CENTER);
		r2.setHorizontalAlignment(JRadioButton.CENTER);
		r3.setHorizontalAlignment(JRadioButton.CENTER);
	}
	
	
	public void setJComboBox() {
		String [] love = {"Kim Gibeom","Choi Kwunseok","Hong Saehyeon","Jealous Guy"}; 
				
		JComboBox cb = new JComboBox(love);	//�����ڴ� JComboBox(String [])
		add(cb, BorderLayout.SOUTH);
		cb.setSelectedIndex(0);	//�⺻������ � ���� ������ ���ΰ�. index���̶� 0�̸� ���, 1�̸� �Ǽ�, 2�̸� ������ �ȴ�.
	}
	
	public void setJList() {
		String [] love = {"Kim Gibeom","Choi Kwunseok","Hong Saehyeon","Jealous Guy", "����", "�ֱǼ�", "ȫ����", "�� ����", "�� ��īƮ��", "���� �ظ���", "���� ��Ÿ"}; 
		
		JList list1 = new JList(love);
		JScrollPane p = new JScrollPane(list1);	//list�� ��ũ�Ѱ� ���ս�Ŵ
		
		add(p, BorderLayout.NORTH);	//���ս�Ų P�� add�� �ϸ� �ȴ�.
		list1.setSelectedIndex(0); 	//setSelectedIndices()�� ���������� �Ǿ�������, getter�� �Ȱ���
		list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION ); 	//����ڰ� ������ �� �ִ� ������ ������ �Ŵ� method,
		//���⼭�� ���� ������ �������� ���� �����ϰ� �� �� �ִ�...?
		//ListSelectionModel.SINGLE_SELECTION => �� ���� ������
		//ListSelectionModel.MULTIPLE_INTERVAL_SELECTION  => �⺻ ��, �����Ӱ� ���� ����
	}
	
	public void setJTextField() {
		JTextField textField = new JTextField(20);	//ȭ�鿡 20�ڸ� ǥ�õ�, ���߿� Pannel���� ����� ��
		textField.setText("I love you");
		add(textField, BorderLayout.NORTH);
		//textField.setEditable(false);		//������ �Ұ����ϰ� �ϴ� method, �⺻���� True�̰�, ����� ��
		
	}
	
	public void setJTextArea()	{
		JTextArea textArea = new JTextArea(5,20);	//5��, 20���ڱ����� ǥ�õ�, ���߿� Pannel���� ����� ��		
		JScrollPane p = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		//textArea�� ��ũ�Ѱ� ���ս�Ŵ, ��ũ�ѿ��� ������ũ�ѹٴ� �׻� �߰� ������, ����ũ���� �ʿ��� �� ���� �ߴ�. 
		//����� ��� AS_NEEDED
		textArea.setText("John Lennon\nPaul McCartney\nGeorge Harrison\nRingo Strarr");
		add(p, BorderLayout.CENTER);
		
	}
	
	public void  setContainer() {
		JLabel head = new JLabel("Enter your name");	//���� ����
		head.setHorizontalAlignment(JLabel.CENTER);
		add(head, BorderLayout.NORTH);	//������ ���ʿ� ��ġ
		
		JPanel pc = new JPanel();	//���ο� �г� pc�� ����
		JLabel name = new JLabel("Name: ");	//�� name��
		JTextField tf = new JTextField(20);	//�ؽ�Ʈ�ʵ� ft��
		
		pc.add(name);	pc.add(tf);	//�ǳ� pc�� ���� ��
		add(pc, BorderLayout.CENTER);	//�� �ǳ� pc�� �������� �߾ӿ� �ִ´�.
		
		JPanel ps = new JPanel();	
		JButton b1 = new JButton("confirm");
		JButton b2 = new JButton("reset");
		
		ps.add(b1);	ps.add(b2);
		add(ps, BorderLayout.SOUTH);
	}
	
	
}

	//Container Example
		
