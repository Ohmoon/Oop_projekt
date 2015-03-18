package Projekt;

import javax.swing.*; // teeme Ã¼ldisemaks asendades import javax.swing.JFrame; ---->import javax.swing.*;

import java.awt.*; //Image jaoks

public class Display extends JFrame {
	private static final long serialVersionUID = 1L;
	public JPanel gb = (JPanel) getGlassPane(); //lihtsalt vajalik...
	public Images pilt;
	public Keying v6ti;
	
	public Display() {
		pilt = new Images();
		gb.setVisible(true);
		v6ti = new Keying(this, pilt);
		pilt.loadImages();
		
		gb.setLayout(new GridLayout(1, 1, 0, 0));
		this.setLayout(new GridLayout(1, 1, 0, 0));
		
		gb.add(v6ti);
		this.add(pilt);
	}
}
