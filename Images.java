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
	public Image kuul;
	
	
	public void loadImages() {
		taust = new ImageIcon("C:/Oop/space.png").getImage();
		laev = new ImageIcon("C:/Oop/spaceship.png").getImage();
		meteoor = new ImageIcon("C:/Oop/meteoor.png").getImage();
		kuul = new ImageIcon("C:/Oop/bullet.png").getImage();
		
		imagesLoaded = true;
	}
}
