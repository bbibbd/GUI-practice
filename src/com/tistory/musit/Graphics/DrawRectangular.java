package com.tistory.musit.Graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class DrawRectangular extends JPanel {
	
	private Toolkit tk;
	private Image img;

	public void paintComponent(Graphics g) {
		g.drawRect(80, 50, 120, 50);		//parameter�� ��ǥ�� ���̸� ��Ÿ��  (x, y, width, height)
												//fillRect�� ��ĥ�Ǿ��ִ� ���簢��
		g.drawOval(150, 100, 50, 50);		//���� �ѷ��ΰ� �ִ� ������ �簢�� �� ���� ���� �𼭸� ��ǥ, ���̿� ���̰� ������ ��, �ٸ��� Ÿ��
		
		g.setColor(Color.BLUE); 			//Color�� �������ִ� �⺻ ����(������), BLACK, BLUE, RED, WHITE, ORANGE, PINK ���
		g.fillOval(80, 100, 50, 50);
		
		g.setColor(new Color(255, 255, 0));	//Color �����ڷ� r, g, b ���� 0~255���� �Է� ����, �� ��� �����
		g.fillOval(200, 90, 40, 10);	
		
		g.setColor(new Color(1.0f, 0.0f, 1.0f));	// float�� 0.0~1.0���� R, G, B�� ������ ������ �� ����, �� ���� ��ȫ��
		g.fillArc(80, 50, 60, 50, 90, 90);	//ȣ �׸���, ��ǥ, ���̿� ����, ���۰���, ���۰������� ������ ���� 
		
		g.setColor(new Color(255, 140, 45));	//������ ����, �������� �񽺹Ǹ��ϰ� ����
		g.drawString("Java", 130, 50);
		
		tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("D:\\����\\2018\\Italy\\Rome\\DSC_0889.jpg");
		
		g.drawImage(img, 0, 150, 275, 154, this);
		

		g.setFont(new Font("���� ���� M", Font.PLAIN, 40));
		g.drawString("Lee Cheeun", 300, 80);
		
		g.setFont(new Font("Monospaced",Font.BOLD ,15 ));
		g.drawString("Lee Chenie Chenie", 300, 110);
		
		g.setFont(new Font("Serif",  Font.ITALIC , 30));
		g.drawString("Lee Chenie Chenie", 300, 140);
	}
}
