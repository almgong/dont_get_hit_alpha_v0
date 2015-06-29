package gm.our.game;

/**
 * 
 * @author allengong
 *
 */
public class User implements Sprite {
	
	//location, x and y values
	private int xLocation = 0;
	private int yLocation = 0;
	
	public User(int x, int y) {
		this.xLocation = x;
		this.yLocation = y;
	}
	
	public void update() {
		System.out.println("Update position");
	}
	
	public void render() {
		System.out.println("Render on Panel");
	}

}
