package Projekt;

import javax.swing.*;
import java.awt.*;

public class Images extends JPanel {
	
	  
	 
	private static final long serialVersionUID = 1L;
	public int width = Main.width;
	public int height = Main.height;
	
	public boolean imagesLoaded = false;
	
	public Image bg;
	public Image bgg;
	public Image bggg;
	
	
	public void loadImages() {
		bg = new ImageIcon("C:/Oop/space.png").getImage();
		bgg = new ImageIcon("C:/Oop/spaceship.png").getImage();
		bggg = new ImageIcon("C:/Oop/meteoor.png").getImage();
		
		imagesLoaded = true;
	}
}
