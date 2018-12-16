package com.tistory.musit.guitest;

public class Main {
	static final int locX = 400;
	static final int locY = 600;
	static final int sizeX = 600;
	static final int sizeY = 400;
	
	public static void main(String[] args) {
		SetFrame frame = new SetFrame("My First Frmae",locX,locY,sizeX,sizeY);
		frame.setMenuBar();
		frame.setJLabel();
		frame.setJButton();
		//frame.setJCheckBox();
		//frame.setJRadioButton();
		//frame.setJComboBox();
		//frame.setJList();
		frame.setJTextField();
		frame.setJTextArea();
		frame.setVisible(true);
	}

}
