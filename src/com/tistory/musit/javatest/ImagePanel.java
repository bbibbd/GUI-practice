package com.tistory.musit.javatest;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class ImagePanel extends JPanel {

	private static final long serialVersionUID = 7219385643722944612L;
	private Toolkit tk;
	private Image img;
	
	public void paintComponent(Graphics g) {
		tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("D:\\»çÁø\\2018\\Italy\\Rome\\DSC_0889.jpg");
		g.drawImage(img, 40, 0, 200, 112, this);
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(200, 112);
	}
}
