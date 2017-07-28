package moorProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class playSound {
	public static void play() {

		String soundFile = "sounds\\location.wav";
		{
			try {
				InputStream in = new FileInputStream(soundFile);
				AudioStream audioStream = null;
				try {
					audioStream = new AudioStream(in);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				AudioPlayer.player.start(audioStream);
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				AudioPlayer.player.stop(audioStream);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void stop(){
		
	}
}
