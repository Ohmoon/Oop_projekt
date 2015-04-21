package Projekt;

import javax.swing.JFrame;

public class Main{
	
	public static Display frame = new Display(); 
		public static int width = 600;  
		public static int height = 600; 
		public static void main (String[] args){ 
			frame.setSize(width, height);
			frame.setResizable(false); 
			frame.setVisible(true); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			frame.setTitle("Space game something"); 
			frame.setLocationRelativeTo(null); 
			frame.setAlwaysOnTop(true); 
		}
		
}
