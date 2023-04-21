package stg;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Shooting {
	public static ShootingFrame shootingFrame;
	public static boolean loop;
	
	public static void main(String[] args) {
		shootingFrame = new ShootingFrame();
		loop = true;
		
		Graphics gra = shootingFrame.panel.image.createGraphics();
		
//		FPS
		long startTime;
		long fpsTime = 0;
		int fps = 30;
		int FPS = 0;
		int FPSCount = 0;
		
		EnumShootingScreen screen = EnumShootingScreen.START;
		
		while(loop) {
			if ((System.currentTimeMillis() - fpsTime) >= 1000) {
				fpsTime = System.currentTimeMillis();
				FPS = FPSCount;
				FPSCount = 0;
				System.out.println(FPS);
			}
			FPSCount ++;
			
			startTime = System.currentTimeMillis();
			
			gra.setColor(Color.WHITE);
			gra.fillRect(0, 0, 500, 500);
			
			switch (screen) {
			case START:
				gra.setColor(Color.BLACK);
				Font font = new Font("SansSerif", Font.PLAIN, 40);
				gra.setFont(font);
				FontMetrics metrics = gra.getFontMetrics(font);
				gra.drawString("Shooting GAME",250 - (metrics.stringWidth("Shooting GAME") / 2) ,80);
				
				gra.setColor(Color.BLACK);
				font = new Font("SansSerif", Font.PLAIN, 15);
				gra.setFont(font);
				metrics = gra.getFontMetrics(font);
				gra.drawString("PRESS SPACE to START",250 - (metrics.stringWidth("PRESS SPACE to START") / 2) ,120);
				
				break;
			case GAME:
				
				break;
			case GAMEOVER:
				
				break;
				
				
			}
			
			
			gra.setColor(Color.BLACK);
			gra.setFont(new Font("SansSerif", Font.PLAIN, 10));
			gra.drawString(FPS + "FPS", 5, 455);
			
			shootingFrame.panel.draw();
			
			try {
				Long runTime = System.currentTimeMillis() - startTime;
				if (runTime < (1000/ fps)) {
					Thread.sleep((1000/ fps) - (System.currentTimeMillis() - startTime));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}

}
