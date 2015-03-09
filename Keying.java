package MinuMäng;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keying extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Rectangle character;
	
	public int charL = 24;
	public int charP = 36;
	
	//public float jumpingTime = 200;
	
	public boolean right = false;
	public boolean left = false;
	public boolean up = false;
	public boolean down = false;
	//public boolean jumping = false;
	
	public Keying(Display frame, Images pilt) {
		//if(pilt.imagesLoaded){
		character = new Rectangle(290, 500, charL, charP);
		frame.addKeyListener(new KeyAdapter() { //objekti liigutamine
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right = true;
					character.x += 1;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left = true;
					character.x -= 1;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					up = true;
					character.y += 1;
				}
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					down = true;
					character.y -= 1;
				}
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					//jumping = true;
					//new Thread = (new thread()).start();
				}
			}
			
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right = false;
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					left = false;
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					up = false;
				}
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					down = false;
				}
			}
		
		});
		//}
	}
	
	public void paintComponent(Graphics g) {
		if(Main.frame.pilt.imagesLoaded) {
			//super.paintComponent(g);
			g.drawImage(Main.frame.pilt.bg, 0, 0, 1920, 1080, null);
			g.drawImage(Main.frame.pilt.bgg, character.x, character.y, 64, 64, null);
			
			//this.setBackground(Color.BLACK);
			//g.setColor(Color.RED.darker());
			//g.fillRect(character.x, character.y, 10, 10);
			
			if(right) {
				character.x += 1;
			}
			if(left) {
				character.x -= 1;
			}
			if(up){
				character.y += 1;
			}
			if(down) {
				character.y -= 1;
			}
			//g.drawImage(Main.frame.pilt.bg, 0, 0, 1920, 1080, null);
			
			repaint(); //vältida juhust, kus objekt ei hakka liikuma
		}
	}

}
