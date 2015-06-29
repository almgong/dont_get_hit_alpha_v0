package gm.our.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 * The panel responsible for painting all of the items
 * on screen as well as managing interactions between 
 * these items.
 * 
 * @author allengong
 *
 */
public class GamePanel extends JPanel {
	
	//sprites
	private User user;
	
	//Events
	private KeyEvents r = new KeyEvents();
	
	/*
	 * Constructor
	 */
	public GamePanel() {
		
		//init sprites
		user = new User(0,0);
		
		//add keylistener
		addKeyListener(new KeyListener() {
			
			//delegation + override
			public void keyTyped(KeyEvent e) {
			}
			
			public void keyReleased(KeyEvent e) {
				r.keyReleased(e);
			}
			
			public void keyPressed(KeyEvent e) {
				r.keyPressed(e);
			}
		});
		setFocusable(true);
	}
	
	/****************** Methods *******************/
	
	/*
	 * Main method that prompts an update of all sprites + items
	 * i.e. calls update() for each sprite
	 */
	public void updateItems() {
		
	}

	/*
	 * Deals with rendering sprites + bg items
	 */
	public void renderItems(Graphics2D g) {
		g.fillOval(0, 0, 50, 50);
	}
	
	/*
	 * Overrides paint() from JPanel
	 * More of a wrapper function than anything.
	 * @see javax.swing.JComponent#paint(java.awt.Graphics)
	 */
	@Override
	public void paint(Graphics g) {
		//cast for better functionality
		Graphics2D g2d = (Graphics2D) g;
		
		//smoooooth
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		renderItems(g2d);
	}

}
