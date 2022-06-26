package Assets;

import Core.DrawingSurface;

public class Player {
	
	private int x, y;
	private int animation;
	private int dir;
	
	public Player(int xcord, int ycord) {
		x = xcord;
		y = ycord;
		dir = 0;
	}
	
	public void move(int xmotion, int ymotion, int direction) {
		x += xmotion;
		y += ymotion;
		dir = direction;
	}
	
	public void draw(DrawingSurface surface) {
		switch(dir) {
		case 0:
			break;
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		}
	}
}
