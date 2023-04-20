package stg;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class ShootingFrame extends JFrame {
	public ShootingFrame() {
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle("Shooting");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}

}
