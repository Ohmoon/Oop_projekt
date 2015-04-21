package Projekt;

import javax.swing.*;
import java.awt.*;

public class Images extends JPanel {
	
	  
	 
	private static final long serialVersionUID = 1L;
	public int width = Main.width;
	public int height = Main.height;
	
	public boolean imagesLoaded = false;
	
	public Image taust;
	public Image laev;
	public Image meteoor;
	public Image meteoor2;
	public Image kuul;
	public Image gameover;
	
	
	public void loadImages() {
		taust = new ImageIcon("space.png").getImage();
		laev = new ImageIcon("spaceship.png").getImage();
		meteoor = new ImageIcon("meteoor.png").getImage();
		kuul = new ImageIcon("bullet1.png").getImage();
		gameover = new ImageIcon ("gameover.png").getImage();
		
		
		imagesLoaded = true;
	}
}
