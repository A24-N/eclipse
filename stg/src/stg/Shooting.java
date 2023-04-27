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
		int fps = 60;
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
		ArrayList<Enemy2> enemies2 = new ArrayList<>();
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
					enemies2 = new ArrayList<>();
					bullets_enemy = new ArrayList<>();
					playerX = 225;
					playerY = 400;
					score = 0;
				}
				
				break;
				
			case GAME:

//敵機1
				gra.setColor(Color.RED);
				
				for (int i = 0; i < enemies.size(); i++) {
					Enemy enemy = enemies.get(i);
					gra.fillRect(enemy.x + 10, enemy.y +10, 10, 10);
					gra.fillRect(enemy.x, enemy.y, 30, 10);
					enemy.y += 4;
					if (enemy.y > 500) {
						enemies.remove(i);
						i--;
					}
					
//敵機 当たり判定
					if (enemy.x >= playerX && enemy.x <= playerX + 30 && 
							enemy.y >= playerY && enemy.y <= playerY + 20 ||
							enemy.x + 30 >= playerX && enemy.x + 30 <= playerX + 30 && 
							enemy.y + 20 >= playerY && enemy.y + 20 <= playerY + 20) {
						screen = EnumShootingScreen.GAMEOVER;
					}
//敵機 弾頻度
					if (random.nextInt(100) == 1) bullets_enemy.add(new Bullet(enemy.x + 12, enemy.y));
				}
				
//湧き頻度
				if (random.nextInt(30) == 1) enemies.add(new Enemy(random.nextInt(470), 0));
				
//敵の弾
				for (int i = 0; i < bullets_enemy.size(); i++) {
					Bullet bullet = bullets_enemy.get(i);
					gra.setColor(Color.RED);
					gra.fillRect(bullet.x, bullet.y, 5, 5);
					bullet.y += 8;
					if (bullet.y > 500) {
						bullets_enemy.remove(i);
						i--;
					}
					
//敵の弾 当たり判定
					if (bullet.x >= playerX && bullet.x <= playerX + 30 && bullet.y >= playerY && bullet.y <= playerY + 20) {
						screen = EnumShootingScreen.GAMEOVER;
					}
					
				
				}
				
//敵機2
				gra.setColor(Color.ORANGE);
				
				for (int l = 0; l < enemies2.size(); l++) {
					Enemy2 enemy = enemies2.get(l);
					gra.fillRect(enemy.x + 10, enemy.y +10, 10, 10);
					gra.fillRect(enemy.x, enemy.y, 30, 10);
					if (random.nextInt(100) % 3 == 0) {
						enemy.y += 1;
						enemy.x += 4;
					} else {
						enemy.y += 1;
						enemy.x -= 2;
					}
						
					if (enemy.y > 500) {
						enemies2.remove(l);
						l--;
					}
					
//敵機 当たり判定
					if (enemy.x >= playerX && enemy.x <= playerX + 30 && 
							enemy.y >= playerY && enemy.y <= playerY + 20 ||
							enemy.x + 30 >= playerX && enemy.x + 30 <= playerX + 30 && 
							enemy.y + 20 >= playerY && enemy.y + 20 <= playerY + 20) {
						screen = EnumShootingScreen.GAMEOVER;
					}
//敵機 弾頻度
					if (random.nextInt(100) == 1) bullets_enemy.add(new Bullet(enemy.x + 12, enemy.y));
				}
				
//湧き頻度
				if (random.nextInt(30) == 1) enemies2.add(new Enemy2(random.nextInt(470), 0));
				
//敵の弾
				for (int l = 0; l < bullets_enemy.size(); l++) {
					Bullet bullet = bullets_enemy.get(l);
					gra.setColor(Color.RED);
					gra.fillRect(bullet.x, bullet.y, 5, 5);
					bullet.y += 2;
					if (bullet.y > 500) {
						bullets_enemy.remove(l);
						l--;
					}
					
//敵の弾 当たり判定
					if (bullet.x >= playerX && bullet.x <= playerX + 30 && bullet.y >= playerY && bullet.y <= playerY + 20) {
						screen = EnumShootingScreen.GAMEOVER;
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
					
					for (int l = 0; l < enemies2.size(); l++) {
						Enemy2 enemy = enemies2.get(l);
						if (bullet.x >= enemy.x && bullet.x <= enemy.x + 30 && bullet.y >= enemy.y && bullet.y <= enemy.y + 20) {
							enemies2.remove(l);
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
					bullet_interval = 20;
				}
				
				if (bullet_interval > 0) bullet_interval--;
				
				gra.setColor(Color.BLACK);
				font = new Font("SansSerif", Font.PLAIN, 20);
				gra.setFont(font);
				metrics = gra.getFontMetrics(font);
				gra.drawString("SCORE:" + score, 470 - metrics.stringWidth("SCORE:" + score), 440);
				
				break;
			case GAMEOVER:
				
				gra.setColor(Color.BLACK);
				font = new Font("SansSerif", Font.PLAIN, 50);
				gra.setFont(font);
				metrics = gra.getFontMetrics(font);
				gra.drawString("GAME OVER",250 - (metrics.stringWidth("GAME OVER") / 2) ,80);
				
				font = new Font("SansSerif", Font.PLAIN, 30);
				gra.setFont(font);
				metrics = gra.getFontMetrics(font);
				gra.drawString("SCORE:" + score, 250 - (metrics.stringWidth("SCORE:" + score) / 2), 120);
				
				font = new Font("SansSerif", Font.PLAIN, 15);
				gra.setFont(font);
				metrics = gra.getFontMetrics(font);
				gra.drawString("PRESS R to Return Start Screen",250 - (metrics.stringWidth("PRESS R to Return Start Screen") / 2) ,160);
				
				if (Keyboard.isKeyPressed(KeyEvent.VK_R)) {
					screen = EnumShootingScreen.START;
				}
				
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
