package com.tistory.musit.javatest;

public class Main {

	public static void main(String[] args) {
		SetFrame exam = new SetFrame("자바 시험", 600, 400, 300, 300);
		
		exam.makeJavaTestFrame();
		exam.setVisible(true);
	}

}
