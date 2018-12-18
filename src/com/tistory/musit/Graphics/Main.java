package com.tistory.musit.Graphics;

public class Main {
	
	public static void main(String [] args) {
		SetFrame graphicTest = new SetFrame("MainFrame",600, 400, 800, 400);
		SetFrame colorTest = new SetFrame("Color",600, 400, 400, 400); 
		//graphicTest.drawLine();
		//graphicTest.drawRect();
		//graphicTest.setVisible(true);
		colorTest.setColorTest();
		colorTest.setVisible(true);
	
	}
}
