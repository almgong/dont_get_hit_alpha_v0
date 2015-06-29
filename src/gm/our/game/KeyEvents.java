package gm.our.game;

import java.awt.event.KeyEvent;

/*
 * Class that manages all key events.
 * 
 * Use in coordination with GamePanel to bind actions to
 * button events.
 */
public class KeyEvents {
	
	//onrelease, stop movement
	public void keyReleased(KeyEvent e) {
		System.out.println("LET GO");
	}

	//when key is pressed down
	public void keyPressed(KeyEvent e) {
		System.out.println("key pressed!");
		
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("LEFT");
		}
				
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
		}
				
	}

}
