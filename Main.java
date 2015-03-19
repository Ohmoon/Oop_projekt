package Projekt;

import javax.swing.JFrame;

public class Main{
	
	public static Display frame = new Display(); //teeme akna
		public static int width = 600; //akna laius 
		public static int height = 600; //akna kÃµrgus
		public static void main (String[] args){ //peaklass
			frame.setSize(width, height);
			frame.setResizable(false); //vÃµimaldab akna mÃµÃµtmeid ise muuta hiljem
			frame.setVisible(true); // aken on nÃ¤htav
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //vÃµimaldab akent sulgeda
			frame.setTitle("Space game something"); //mÃ¤ngu nimi
			frame.setLocationRelativeTo(null); //et aken ei ilmuks kogu aeg vasakule
			frame.setAlwaysOnTop(true); //aken alati teise akna kohale, mitte peale
		}
		
}

