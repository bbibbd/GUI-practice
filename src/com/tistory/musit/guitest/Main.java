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
		//JOptionPane: ǥ�� ��ȭâ, JDialog ��� ���� ǥ��ȭ�� ��ȸâ�� �� �� �ֵ��� �����ش�.
		//JOptionPane.showXXXDialog(owner, Text, Title, Option, �޼��� ����)
		JOptionPane.showMessageDialog(frame, "Message Dialog �׽�Ʈ�Դϴ�.", "error",  JOptionPane.INFORMATION_MESSAGE);
		//YES_NO_CANCEL_OPTION�� �� �״�� Yes, No, Cancel�� �� �ɼ��� ǥ���Ѵ�. YES_NO_OPTION�� �ִ�.
		int i = JOptionPane.showConfirmDialog(frame, "Confirm Dialog �׽�Ʈ�Դϴ�. �����Ͻðڽ��ϱ�?", "�׽�Ʈ", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		System.out.println("i= "+i);		//yes Ŭ���� ��� i = 0, No Ŭ���� ��� I = 1, Cancel Ŭ���� ��� i=2, exit Ŭ���� ��� i = -1
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
		SetDialog dialog = new SetDialog(frame, "Continue?", true, 200, 100);	//owner frame, Title, Modal(True�� �� â�� ������� �� �۵� X), SIZE
		dialog.setContionue();
		dialog.setVisible(true);		
		SetFrame frame2 = new SetFrame("Main Frame", 400, 600, 300, 130);
		frame2.setContainer();
		frame2.setResizable(false);
		frame2.setVisible(true);
		*/
	}

}
