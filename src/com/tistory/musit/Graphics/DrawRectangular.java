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
		g.drawRect(80, 50, 120, 50);		//parameter는 좌표와 넓이를 나타냄  (x, y, width, height)
												//fillRect는 색칠되어있는 직사각형
		g.drawOval(150, 100, 50, 50);		//원을 둘러싸고 있는 가상의 사각형 중 왼쪽 위의 모서리 좌표, 넓이와 높이가 같으면 원, 다르면 타원
		
		g.setColor(Color.BLUE); 			//Color가 가지고있는 기본 색깔(정수형), BLACK, BLUE, RED, WHITE, ORANGE, PINK 등등
		g.fillOval(80, 100, 50, 50);
		
		g.setColor(new Color(255, 255, 0));	//Color 생성자로 r, g, b 각각 0~255까지 입력 가능, 이 경우 노란색
		g.fillOval(200, 90, 40, 10);	
		
		g.setColor(new Color(1.0f, 0.0f, 1.0f));	// float로 0.0~1.0까지 R, G, B의 비율을 설정할 수 있음, 이 경후 자홍색
		g.fillArc(80, 50, 60, 50, 90, 90);	//호 그리기, 좌표, 넓이와 높이, 시작각도, 시작각도에서 끝나는 각도 
		
		g.setColor(new Color(255, 140, 45));	//임의의 색깔, 오랜지색 비스므리하게 나옴
		g.drawString("Java", 130, 50);
		
		tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("D:\\사진\\2018\\Italy\\Rome\\DSC_0889.jpg");
		
		g.drawImage(img, 0, 150, 275, 154, this);
		

		g.setFont(new Font("한컴 백제 M", Font.PLAIN, 40));
		g.drawString("Lee Cheeun", 300, 80);
		
		g.setFont(new Font("Monospaced",Font.BOLD ,15 ));
		g.drawString("Lee Chenie Chenie", 300, 110);
		
		g.setFont(new Font("Serif",  Font.ITALIC , 30));
		g.drawString("Lee Chenie Chenie", 300, 140);
	}
}
