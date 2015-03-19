package Projekt;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Random;




public class Keying extends JPanel  {
	
	public static int Random_koht(int min, int max, Random random){
	    int range = max - min + 1;
	    int fraction = (int)(range * random.nextDouble());
	    int randomNumber =  fraction + min;    
	    return randomNumber;
	    
	  }

	private static final long serialVersionUID = 1L;

	public Rectangle character;
	public Rectangle kuul;
	public Rectangle meteoor;

	public int charL = 24;
	public int charP = 36;
	Random random = new Random();


	//public float jumpingTime = 200;

	public boolean right = false;
	public boolean left = false;
	public boolean up = false;
	public boolean down = false;
	public boolean shooting = false;
	
	public Keying(Display frame, Images pilt) {
		character = new Rectangle(290, 500, charL, charP);
		kuul = new Rectangle(10,10,100,100);
		meteoor = new Rectangle(Random_koht(1, 500, random),10,10,10);

		frame.addKeyListener(new KeyAdapter() { //objekti liigutamine
			public void keyPressed(KeyEvent e) {

				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if(character.x<530){
						right = true;
						character.x += 1;

					}}

				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					if(character.x >10){
						left = true;
						character.x -= 1;
					}}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if(character.y < 500){
						up = true;
						character.y += 1;
					}}

				if(e.getKeyCode() == KeyEvent.VK_UP) {
					if(character.y > 350){
						down = true;
						character.y -= 1;
					}}
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					shooting = true;
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
				if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					shooting = false;
				}
				
			}

		});

	}

	public void paintComponent(Graphics g) {
		if(Main.frame.pilt.imagesLoaded) {
			//	timer = new Timer(400, (ActionListener) this);
			//     timer.start();
			g.drawImage(Main.frame.pilt.taust, 0, 0, 1920, 1080, null);
			g.drawImage(Main.frame.pilt.laev, character.x, character.y, 64, 64, null);
			g.drawImage(Main.frame.pilt.meteoor, meteoor.x,meteoor.y,100,100,null);
			meteoor.y+= 1;
			
			


			if(right & character.x != 530) {
				character.x += 1;
			}
			if(left & character.x != 0) {
				character.x -= 1;
			}
			if(up & character.y != 500){
				character.y += 1;
			}
			if(down & character.y != 350) {
				character.y -= 1;
			}
			if(shooting){
				g.drawImage(Main.frame.pilt.kuul, character.x+27, character.y-10,10,10, null );
				if (kuul.y>0){
					kuul.y--;
				}
				try {
					Sound.music1();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			repaint(); //vÃ¤ltida juhust, kus objekt ei hakka liikuma
		}
	}

}
