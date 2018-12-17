package com.tistory.musit.guitest;

public class Main {
	
	public static void main(String[] args) {
		SetFrame frame = new SetFrame("My First Frmae",400, 600, 600, 400);
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
		SetDialog dialog = new SetDialog(frame, "Continue?", true, 200, 100);
		dialog.setContionue();
		dialog.setVisible(true);
		


		
		//SetFrame frame2 = new SetFrame("Main Frame", 400, 600, 300, 130);
		//frame2.setContainer();
		//frame2.setResizable(false);
		//frame2.setVisible(true);
		
	}

}
