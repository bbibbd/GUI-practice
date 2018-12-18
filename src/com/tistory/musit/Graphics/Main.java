package com.tistory.musit.Graphics;

public class Main {
	
	public static void main(String [] args) {
		SetFrame graphicTest = new SetFrame("MainFrame",600, 400, 400, 400);
		graphicTest.drawLine();
		graphicTest.drawRect();
		graphicTest.setVisible(true);
	
	}
}
