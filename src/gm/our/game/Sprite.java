package gm.our.game;

/**
 * Interface for sprites.
 * 
 * Sprites are all interactive objects in the game. Characters, obstacles,
 * blocks, npcs, etc.
 * 
 * @author allengong
 *
 */
public interface Sprite {
	
	public void update();	//updates position of sprite
	public void render();	//renders sprite location
	
	
}
