package com.tistory.musit.Graphics;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawLine extends JPanel{
	
	public void paintComponent(Graphics g) {
		g.drawLine(50, 50, 50, 400);		//parameter´Â ÁÂÇ¥¸¦ ³ªÅ¸³¿, (x1, y1, x2, y2)
	}	
}

