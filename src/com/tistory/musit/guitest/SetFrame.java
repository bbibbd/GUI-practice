package com.tistory.musit.guitest;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;


@SuppressWarnings("serial")
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

	public void borderExample () {
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		SetJPanel myPanel = new SetJPanel("None");
		SetJPanel myPanel2 = new SetJPanel("Line");
		SetJPanel myPanel3 = new SetJPanel("Etched Rised");
		SetJPanel myPanel4 = new SetJPanel("Etched Lowered");
		SetJPanel myPanel5 = new SetJPanel("Bevel Rised");
		SetJPanel myPanel6 = new SetJPanel("Bevel Lowered");

		myPanel.setBorder(BorderFactory.createTitledBorder("LCE"));
		myPanel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.YELLOW),"LCE"));
		myPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "LCE"));
		myPanel4.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		myPanel5.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		myPanel6.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		backgroundPanel.add(myPanel);		backgroundPanel.add(myPanel2);	backgroundPanel.add(myPanel3);	backgroundPanel.add(myPanel4);	backgroundPanel.add(myPanel5);	backgroundPanel.add(myPanel6);
		add(backgroundPanel, BorderLayout.CENTER);
	}

	/*
	레이아웃 관리자 - 컴포넌트를 컨테이너에 어떻게 담는지를 결정할 수 있는 객체
	BorderLayout, FrowLayout, GridLayout, GridBagLayout, BoxLayout
	(1) BorderLayout - 전체 프래임을 동 서 남 북, 중앙으로 나눈 것. 기본적으로 Frame이 이 레이아웃을 따름
		BorderLayout(int 수평갭, int 수직갭)
	(2) FlowLayout - 위에서부터 순서대로 다 차면 아래쪽으로 내려옴, 기본적으로 Panel이 이 레이아웃을 따름
		int parameter을 가진 생성자가 있는데, 기본적으로 정렬하게 해줌(LEFT, CENTER, RIGHT)
		FlowLayout(int aligh, int 수평갭, int수직갭)
	(3) GridLayout - 갹자 배치, 생성자는 각각 행과 열을 지정해줌, 거기에다가 더 추가하면 수평 수직간격을 추가할 수 있음
		GridLayout(int Row, int Column, int 수평갭, int 수직갭)
	(4) GridBagLayout() - 한 컴포턴트가 여러 개의 격자를 사용할 수 있는 레이아웃, 생성자의 Parameter가 없으며, 
		rows와 columns의 정보가 없다. GridBagConstraints객체를 통해 rows, columns, 크기 등을 지정할 수 있다. 
		GridBagConstraints와 꼭 같이 사용해야 한다. int gridx, gridy, width, gridheight 
		add(Component c, GridBagConstraints gbc)
	(5) BoxLayout - 여러개의 상자를 쌓은 모습, 순서는 왼쪽 -> 오른쪽(X_ASIS), 위 -> 아래(Y_AXIS)를 생성자에 넣어줌
		BoxLayout(Container c,, int axis)
	 */

	public void jBorderLayout() {
		setLayout(new BorderLayout(5, 5));	//생성자 method에서 컴포넌트간 간격을 조정할 수 있다.
		add(new JButton("동쪽"),BorderLayout.EAST);
		add(new JButton("서쪽"),BorderLayout.WEST);
		add(new JButton("북쪽"),BorderLayout.NORTH);
		add(new JButton("남쪽"),BorderLayout.SOUTH);
		add(new JButton("중간"),BorderLayout.CENTER);

	}

	public void flowLayoutExample() {
		JPanel p = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 7, 7);	//좌측정렬을 하게 함, RIGHT는 우측, CENTER은 중앙정렬(기본), 기본 간격은 5픽셀씩이다.
		//BorderLayout bl = new BorderLayout(5,5);


		p.add(new JButton("a"));	p.add(new JButton("b"));	p.add(new JButton("c"));	p.add(new JButton("d"));	p.add(new JButton("e"));	p.add(new JButton("f"));	
		p.setLayout(fl);	//bl을 넣을 경우 p를 BorderLayout으로 사용가능
		add(p, BorderLayout.CENTER);
	}

	public void gridLayoutExample() {
		JPanel p = new JPanel();
		GridLayout g = new GridLayout(4, 3, 5, 5);	//만약 Row나 Column을 0으로 하더라도 자바가 컴포넌트의 개수를 파악해 스스로 설정한다.
		p.setLayout(g);

		p.add(new JButton("1"));	p.add(new JButton("2"));	p.add(new JButton("3"));	
		p.add(new JButton("4"));	p.add(new JButton("5"));	p.add(new JButton("6"));	
		p.add(new JButton("7"));	p.add(new JButton("8"));	p.add(new JButton("9"));	
		p.add(new JButton("*"));	p.add(new JButton("0"));	p.add(new JButton("#"));	
		add(p);
	}

	public void calculatorLayout() {
		JPanel p = new JPanel();
		GridLayout g = new GridLayout(0, 4, 5, 5);	
		p.setLayout(g);

		p.add(new JButton("CE"));	p.add(new JButton("C"));	p.add(new JButton("<-"));	p.add(new JButton("/"));
		p.add(new JButton("1"));	p.add(new JButton("2"));	p.add(new JButton("3"));	p.add(new JButton("X"));
		p.add(new JButton("4"));	p.add(new JButton("5"));	p.add(new JButton("6"));	p.add(new JButton("-"));
		p.add(new JButton("7"));	p.add(new JButton("8"));	p.add(new JButton("9"));	p.add(new JButton("+"));
		p.add(new JButton("ㅁ"));	p.add(new JButton("0"));	p.add(new JButton("."));	p.add(new JButton("="));

		JTextArea calculatingArea = new JTextArea();
		calculatingArea.setText("input Value");

		add(calculatingArea, BorderLayout.NORTH);	add(p, BorderLayout.CENTER);
	}

	public void gridBagLayoutExample() {
		JPanel groundPanel = new JPanel();
		groundPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		
		putButton(groundPanel, c, 0, 0, 1, 1, "A");
		c.fill = GridBagConstraints.BOTH;
		c.weightx = c.weighty = 1.0;
		
		putButton(groundPanel, c, 0, 0, 1, 1, "A");
		putButton(groundPanel, c, 1, 0, 1, 2, "B");
		putButton(groundPanel, c, 0, 1, 1, 1, "C");
		putButton(groundPanel, c, 0, 2, 2, 1, "D");

		add(groundPanel, BorderLayout.CENTER);
	}
	
	private void putButton(JPanel p, GridBagConstraints c, int x, int y, int w, int h, String s) {
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = w;
		c.gridheight = h;
		c.fill = GridBagConstraints.BOTH;
		p.add(new JButton(s), c);
	}
	
	public void boxLayoutExample() {
		JPanel gp = new JPanel();
		gp.setLayout(new BoxLayout(gp, BoxLayout.Y_AXIS));
		
		gp.add(new JButton("1"));	gp.add(new JButton("Long Button 2"));	gp.add(new JButton("Long Long Button 3"));
		gp.add(new JButton("Button 4"));
		
		add(gp, BorderLayout.CENTER);
	}
}


