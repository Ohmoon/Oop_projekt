package Projekt;

import javax.swing.*; 
import java.awt.*; //Image jaoks

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	public JPanel ekraan = (JPanel) getGlassPane(); 
	public Images pilt;
	public Commands v6ti;
	
	public Display() {
		pilt = new Images();
		ekraan.setVisible(true);
		v6ti = new Commands(this, pilt);
		pilt.loadImages();
		
		ekraan.setLayout(new GridLayout(1, 1, 0, 0));
		this.setLayout(new GridLayout(1, 1, 0, 0));
		
		ekraan.add(v6ti);
		this.add(pilt);
		
		Sound.music();
	}
}
