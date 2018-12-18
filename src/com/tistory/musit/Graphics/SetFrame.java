package com.tistory.musit.Graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetFrame extends JFrame {
	
	public SetFrame(String title, int x, int y, int sizeX, int sizeY) {
		super(title);
		setLocation(x, y);
		setSize(sizeX, sizeY);
	}
	
	public void drawLine() {
		DrawLine line = new DrawLine();
		add(line, BorderLayout.NORTH);
	}
	
	public void drawRect() {
		DrawRectangular rect = new DrawRectangular();
		add(rect, BorderLayout.CENTER);
	}
}
