package gm.our.game;

import javax.swing.JFrame;


/**
 * Driver class that manages game state and overall
 * game logic. 
 * 
 * @author allengong
 *
 */
public class Game {
	
	private static boolean gameOver = false; 			//can be set
	
	//simple, for communication between Game and GamePanel 
	public static void setGameState(boolean state) {
		gameOver = state;
	}

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		GamePanel p = new GamePanel();
		frame.add(p);
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//badly implemented infinite game loop
		while(true) {
			p.updateItems(); 		//continue game
			p.repaint();
			Thread.sleep(10);		//DO NOT USE IN FINAL, TEMP TO GET PROGRAM RUNNING
		}
		
	}
	
}
