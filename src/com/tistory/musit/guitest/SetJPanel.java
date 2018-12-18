package com.tistory.musit.guitest;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

//기본적으로 라벨을 넣고 사이즈를 지정할 수 있는 판넬을 만들기 위한 클래스이다.
public class SetJPanel extends JPanel {	
	
	public SetJPanel(String s) {
		add(new JLabel(s));
	}
	
	//JPanel에 기분족으로 정의되어있는 getPreferredSize를 Override해 사용자 임의로 판넬의 사이즈를 정할 수 있다.
	public Dimension getPreferredSize() {
		return new Dimension(100, 60);
	}
}

