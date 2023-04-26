package stg;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

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
		
		//GAME
		int playerX = 0, playerY = 0;
		int bullet_interval = 0;
		ArrayList<Bullet> bullets_player = new ArrayList<>();
		ArrayList<Bullet> bullets_enemy = new ArrayList<>();
		ArrayList<Enemy> enemies = new ArrayList<>();
		
		
		
		while(loop) {
			if ((System.currentTimeMillis() - fpsTime) >= 1000) {
				fpsTime = System.currentTimeMillis();
				FPS = FPSCount;
				FPSCount = 0;
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
				if (Keyboard.isKeyPressed(KeyEvent.VK_SPACE)) {
					screen = EnumShootingScreen.GAME;
					bullets_player = new ArrayList<>();
					enemies = new ArrayList<>();
					playerX = 225;
					playerY = 400;
				}
				
				break;
				
			case GAME:
				gra.setColor(Color.BLUE);
				gra.fillRect(playerX + 10, playerY, 10, 10);
				gra.fillRect(playerX, playerY + 10, 30, 10);
				
				for (int i = 0; i < bullets_player.size(); i++) {
					Bullet bullet = bullets_player.get(i);
					gra.setColor(Color.BLUE);
					gra.fillRect(bullet.x, bullet.y, 5, 5);
					bullet.y -= 10;
					if (bullet.y < 0) {
						bullets_player.remove(i);
						i--;
					}
				}
				System.out.println(bullets_player.size());
				
				if (Keyboard.isKeyPressed(KeyEvent.VK_LEFT) && playerX > 0) playerX -= 5;
				if (Keyboard.isKeyPressed(KeyEvent.VK_RIGHT) && playerX < 455) playerX += 5;
				if (Keyboard.isKeyPressed(KeyEvent.VK_UP) && playerY > 30) playerY -= 5;
				if (Keyboard.isKeyPressed(KeyEvent.VK_DOWN) && playerY < 420) playerY += 5;
				
				if (Keyboard.isKeyPressed(KeyEvent.VK_SPACE) && bullet_interval == 0) {
					bullets_player.add(new Bullet(playerX + 12, playerY));
					bullet_interval = 12;
				}
				
				if (bullet_interval > 0) bullet_interval--;

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
