package Projekt;
import sun.audio.*;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;

public class Sound extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void music() {
		AudioPlayer AP = AudioPlayer.player;
		AudioStream AS;
		AudioData AD;

		sun.audio.ContinuousAudioDataStream loop = null;
		//if (Main.frame.isVisible()) {
		try{
			AS = new AudioStream( new FileInputStream("soundmusa.wav"));
			AD = AS.getData();
			loop = new sun.audio.ContinuousAudioDataStream(AD);
		}catch(IOException error){}
		AP.start(loop);}
		
	//}
	
	public static void music1() throws MalformedURLException, InterruptedException{
		URL url = new URL("file:/C:/Oop/Projekt/LASER.wav");
		AudioClip clip = Applet.newAudioClip(url);
		clip.play();
		Thread.sleep(100);
	}
	
	public static void plahvatus() throws MalformedURLException, InterruptedException{
		URL url2 = new URL("file:/C:/Eclipse/Projects/projekt/plahvatus.wav"); //miski p2rast ma ei saanud ilma url'ita, dunno why
		AudioClip clip = Applet.newAudioClip(url2);
		clip.play();
		Thread.sleep(2000);
	}


}
