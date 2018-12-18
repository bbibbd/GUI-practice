package com.tistory.musit.javatest;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class SetFrame extends JFrame	{

	private static final long serialVersionUID = -8603481377615828210L;

	public SetFrame(String title, int x, int y, int sizeX, int sizeY) {
		super(title);
		setLocation(x, y);
		setSize(sizeX, sizeY);
		//setResizable(false);	//사이즈 변경 불가능하게 하는 method
	}
	
	public void makeJavaTestFrame() {
		
		JPanel gp = new JPanel();
		gp.setLayout(new BoxLayout(gp, BoxLayout.Y_AXIS));
		
		HeadPanel hp = new HeadPanel();
		gp.add(hp);
		
		ComboBoxPanel combp = new ComboBoxPanel();
		gp.add(combp);	
		
		ImagePanel imgp = new ImagePanel();
		gp.add(imgp);
		
		CheckBoxPanel checkbp= new CheckBoxPanel();
		gp.add(checkbp);


		add(gp, BorderLayout.CENTER);

	}
	
}
