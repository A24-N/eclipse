package stg;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

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
		int score = 0;
		ArrayList<Bullet> bullets_player = new ArrayList<>();
		ArrayList<Bullet> bullets_enemy = new ArrayList<>();
		ArrayList<Enemy> enemies = new ArrayList<>();
		Random random = new Random();
		
		
		
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

//敵機
				gra.setColor(Color.RED);
				
				for (int i = 0; i < enemies.size(); i++) {
					Enemy enemy = enemies.get(i);
					gra.fillRect(enemy.x + 10, enemy.y +10, 10, 10);
					gra.fillRect(enemy.x, enemy.y, 30, 10);
					enemy.y += 5;
					if (enemy.y > 500) {
						enemies.remove(i);
						i--;
					}
					if (random.nextInt(100) == 1) bullets_enemy.add(new Bullet(enemy.x + 12, enemy.y));
				}
				if (random.nextInt(30) == 1) enemies.add(new Enemy(random.nextInt(470), 0));
				
				for (int i = 0; i < bullets_enemy.size(); i++) {
					Bullet bullet = bullets_enemy.get(i);
					gra.setColor(Color.RED);
					gra.fillRect(bullet.x, bullet.y, 5, 5);
					bullet.y += 10;
					if (bullet.y > 500) {
						bullets_enemy.remove(i);
						i--;
					}
				}
				
//自機
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
					
					for (int l = 0; l < enemies.size(); l++) {
						Enemy enemy = enemies.get(l);
						if (bullet.x >= enemy.x && bullet.x <= enemy.x + 30 && bullet.y >= enemy.y && bullet.y <= enemy.y + 20) {
							enemies.remove(l);
							bullets_player.remove(i);
							score += 10;
						}
					}
					
				}
//移動
				if (Keyboard.isKeyPressed(KeyEvent.VK_LEFT) && playerX > 0) playerX -= 5;
				if (Keyboard.isKeyPressed(KeyEvent.VK_RIGHT) && playerX < 455) playerX += 5;
				if (Keyboard.isKeyPressed(KeyEvent.VK_UP) && playerY > 30) playerY -= 5;
				if (Keyboard.isKeyPressed(KeyEvent.VK_DOWN) && playerY < 420) playerY += 5;
				
				if (Keyboard.isKeyPressed(KeyEvent.VK_SPACE) && bullet_interval == 0) {
					bullets_player.add(new Bullet(playerX + 12, playerY));
					bullet_interval = 12;
				}
				
				if (bullet_interval > 0) bullet_interval--;
				
				gra.setColor(Color.BLACK);
				font = new Font("SansSerif", Font.PLAIN, 20);
				gra.setFont(font);
				metrics = gra.getFontMetrics(font);
				gra.drawString("SCORE:" + score, 470 - metrics.stringWidth("SCORE:" + score), 440);
				
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
