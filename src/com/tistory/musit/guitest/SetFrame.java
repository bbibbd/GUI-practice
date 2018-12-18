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
	���̾ƿ� ������ - ������Ʈ�� �����̳ʿ� ��� ������� ������ �� �ִ� ��ü
	BorderLayout, FrowLayout, GridLayout, GridBagLayout, BoxLayout
	(1) BorderLayout - ��ü �������� �� �� �� ��, �߾����� ���� ��. �⺻������ Frame�� �� ���̾ƿ��� ����
		BorderLayout(int ����, int ������)
	(2) FlowLayout - ���������� ������� �� ���� �Ʒ������� ������, �⺻������ Panel�� �� ���̾ƿ��� ����
		int parameter�� ���� �����ڰ� �ִµ�, �⺻������ �����ϰ� ����(LEFT, CENTER, RIGHT)
		FlowLayout(int aligh, int ����, int������)
	(3) GridLayout - ���� ��ġ, �����ڴ� ���� ��� ���� ��������, �ű⿡�ٰ� �� �߰��ϸ� ���� ���������� �߰��� �� ����
		GridLayout(int Row, int Column, int ����, int ������)
	(4) GridBagLayout() - �� ������Ʈ�� ���� ���� ���ڸ� ����� �� �ִ� ���̾ƿ�, �������� Parameter�� ������, 
		rows�� columns�� ������ ����. GridBagConstraints��ü�� ���� rows, columns, ũ�� ���� ������ �� �ִ�. 
		GridBagConstraints�� �� ���� ����ؾ� �Ѵ�. int gridx, gridy, width, gridheight 
		add(Component c, GridBagConstraints gbc)
	(5) BoxLayout - �������� ���ڸ� ���� ���, ������ ���� -> ������(X_ASIS), �� -> �Ʒ�(Y_AXIS)�� �����ڿ� �־���
		BoxLayout(Container c,, int axis)
	 */

	public void jBorderLayout() {
		setLayout(new BorderLayout(5, 5));	//������ method���� ������Ʈ�� ������ ������ �� �ִ�.
		add(new JButton("����"),BorderLayout.EAST);
		add(new JButton("����"),BorderLayout.WEST);
		add(new JButton("����"),BorderLayout.NORTH);
		add(new JButton("����"),BorderLayout.SOUTH);
		add(new JButton("�߰�"),BorderLayout.CENTER);

	}

	public void flowLayoutExample() {
		JPanel p = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 7, 7);	//���������� �ϰ� ��, RIGHT�� ����, CENTER�� �߾�����(�⺻), �⺻ ������ 5�ȼ����̴�.
		//BorderLayout bl = new BorderLayout(5,5);


		p.add(new JButton("a"));	p.add(new JButton("b"));	p.add(new JButton("c"));	p.add(new JButton("d"));	p.add(new JButton("e"));	p.add(new JButton("f"));	
		p.setLayout(fl);	//bl�� ���� ��� p�� BorderLayout���� ��밡��
		add(p, BorderLayout.CENTER);
	}

	public void gridLayoutExample() {
		JPanel p = new JPanel();
		GridLayout g = new GridLayout(4, 3, 5, 5);	//���� Row�� Column�� 0���� �ϴ��� �ڹٰ� ������Ʈ�� ������ �ľ��� ������ �����Ѵ�.
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
		p.add(new JButton("��"));	p.add(new JButton("0"));	p.add(new JButton("."));	p.add(new JButton("="));

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


