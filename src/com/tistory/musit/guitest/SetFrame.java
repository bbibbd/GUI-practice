package com.tistory.musit.guitest;


import java.awt.BorderLayout;

import javax.swing.*;

public class SetFrame extends JFrame{
	
	public SetFrame(String title, int x, int y, int sizeX, int sizeY) {
			
		super(title);
		setLocation(x, y);
		setSize(sizeX, sizeY);
		//setResizable(false);	//사이즈 변경 불가능하게 하는 method
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
		//box1.isSelected()	선택되었다? return true, 아니다? return false
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
				
		JComboBox cb = new JComboBox(love);	//생성자는 JComboBox(String [])
		add(cb, BorderLayout.SOUTH);
		cb.setSelectedIndex(0);	//기본값으로 어떤 것을 선택할 것인가. index값이라 0이면 기범, 1이면 권석, 2이면 세현이 된다.
	}
	
	public void setJList() {
		String [] love = {"Kim Gibeom","Choi Kwunseok","Hong Saehyeon","Jealous Guy", "김기범", "최권석", "홍세현", "존 레논", "폴 맥카트니", "조지 해리슨", "링고 스타"}; 
		
		JList list1 = new JList(love);
		JScrollPane p = new JScrollPane(list1);	//list를 스크롤과 결합시킴
		
		add(p, BorderLayout.NORTH);	//결합시킨 P를 add에 하면 된다.
		list1.setSelectedIndex(0); 	//setSelectedIndices()는 복수선택이 되어있을때, getter도 똑같음
		list1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION ); 	//사용자가 선택할 수 있는 범위에 제한을 거는 method,
		//여기서는 일정 범위의 연속적인 값만 선택하게 할 수 있다...?
		//ListSelectionModel.SINGLE_SELECTION => 한 값만 선택함
		//ListSelectionModel.MULTIPLE_INTERVAL_SELECTION  => 기본 값, 자유롭게 선택 가능
	}
	
	public void setJTextField() {
		JTextField textField = new JTextField(20);	//화면에 20자만 표시됨, 나중에 Pannel에서 사용할 때
		textField.setText("I love you");
		add(textField, BorderLayout.NORTH);
		//textField.setEditable(false);		//편집을 불가능하게 하는 method, 기본값은 True이고, 안적어도 됨
		
	}
	
	public void setJTextArea()	{
		JTextArea textArea = new JTextArea(5,20);	//5행, 20글자까지만 표시됨, 나중에 Pannel에서 사용할 때		
		JScrollPane p = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
		//textArea를 스크롤과 결합시킴, 스크롤에서 수직스크롤바는 항상 뜨게 했으며, 수평스크롤은 필요할 때 쓰게 했다. 
		//기분은 모두 AS_NEEDED
		textArea.setText("John Lennon\nPaul McCartney\nGeorge Harrison\nRingo Strarr");
		add(p, BorderLayout.CENTER);
		
	}
	
	public void  setContainer() {
		JLabel head = new JLabel("Enter your name");	//라벨을 만들어서
		head.setHorizontalAlignment(JLabel.CENTER);
		add(head, BorderLayout.NORTH);	//프래임 북쪽에 배치
		
		JPanel pc = new JPanel();	//새로운 패널 pc를 만들어서
		JLabel name = new JLabel("Name: ");	//라벨 name과
		JTextField tf = new JTextField(20);	//텍스트필드 ft를
		
		pc.add(name);	pc.add(tf);	//판넬 pc에 넣은 후
		add(pc, BorderLayout.CENTER);	//그 판넬 pc를 프레임의 중앙에 넣는다.
		
		JPanel ps = new JPanel();	
		JButton b1 = new JButton("confirm");
		JButton b2 = new JButton("reset");
		
		ps.add(b1);	ps.add(b2);
		add(ps, BorderLayout.SOUTH);
	}
	
	
}

	//Container Example
		
