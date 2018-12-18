package com.tistory.musit.guitest;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		SetFrame frame = new SetFrame("My First Frmae",400, 600, 520, 600);
		SetFrame panelTestFrame = new SetFrame("My First Frmae",400, 600, 300, 300);
		SetFrame layoutTestFrame = new SetFrame("Layout Test", 400, 600, 300, 200);
		SetFrame calculatorLayout = new SetFrame("Layout Test", 400, 600, 400, 400);
		SetFrame gridBagLayout = new SetFrame("Layout Test", 400, 600, 400, 400);
		
		//layoutTestFrame.jBorderLayout();
		//layoutTestFrame.flowLayoutExample();
		//layoutTestFrame.gridLayoutExample();
		//layoutTestFrame.setVisible(true);
		//calculatorLayout.calculatorLayout();
		//calculatorLayout.setVisible(true);
		//gridBagLayout.setResizable(false);
		//gridBagLayout.gridBagLayoutExample();
		//gridBagLayout.setVisible(true);
		//layoutTestFrame.boxLayoutExample();
		//layoutTestFrame.setVisible(true);
		
		/*
		panelTestFrame.setMenuBar();
		panelTestFrame.borderExample();
		panelTestFrame.setVisible(true);
		*/

		/*
		frame.setJLabel();
		frame.setJRadioButton();
		frame.setJTextField();
		frame.setJTextArea();
		frame.setJComboBox();
		frame.setJButton();
		//JOptionPane: 표준 대화창, JDialog 대신 쉽게 표준화된 대회창을 쓸 수 있도록 도와준다.
		//JOptionPane.showXXXDialog(owner, Text, Title, Option, 메세지 종류)
		JOptionPane.showMessageDialog(frame, "Message Dialog 테스트입니다.", "error",  JOptionPane.INFORMATION_MESSAGE);
		//YES_NO_CANCEL_OPTION은 말 그대로 Yes, No, Cancel의 세 옵션을 표시한다. YES_NO_OPTION도 있다.
		int i = JOptionPane.showConfirmDialog(frame, "Confirm Dialog 테스트입니다. 실행하시겠스니까?", "테스트", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		System.out.println("i= "+i);		//yes 클릭한 경우 i = 0, No 클릭한 경우 I = 1, Cancel 클릭한 경우 i=2, exit 클릭한 경우 i = -1
		if(i==JOptionPane.OK_OPTION)	
			frame.setVisible(true);
		else
			frame.setVisible(false);
		*/
		
		/*
		frame.setJCheckBox();
		frame.setJRadioButton();
		frame.setJComboBox();
		frame.setJList();
		frame.setVisible(true);
		SetDialog dialog = new SetDialog(frame, "Continue?", true, 200, 100);	//owner frame, Title, Modal(True일 때 창이 사라지기 전 작동 X), SIZE
		dialog.setContionue();
		dialog.setVisible(true);		
		SetFrame frame2 = new SetFrame("Main Frame", 400, 600, 300, 130);
		frame2.setContainer();
		frame2.setResizable(false);
		frame2.setVisible(true);
		*/
	}

}
