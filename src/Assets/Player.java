package Assets;

import Core.DrawingSurface;

public class Player {
	
	private int x, y;
	private int animation;
	private int dir;
	
	public Player(int xcord, int ycord) {
		x = xcord;
		y = ycord;
		dir = 2;
		animation = 0;
	}
	
	public void move(int xmotion, int ymotion, int direction) {
		if(x >= 0 && x <= 1500 && y >= 200 && y <= 800) {
			x += xmotion;
			y += ymotion;
			dir = direction;
		} else {
			if(x <= 0) 
				x = 1;
			else if (x >= 1500)
				x = 1499;
			else if (y <= 200) 
				y = 201;
			else if (y >= 800) 
				y = 799;
		}
//		if(animation == 0) {
//			animation = 1;
//		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void stop() {
		animation = 0;
	}
	
	public void draw(DrawingSurface surface) {
		
		switch(dir) {
		case 0:
			if(animation == 0) 
				surface.image(surface.loadImage("img\\Player\\Back 1.png"), x, y, 100, 100);
			else if(animation == 1) 
				surface.image(surface.loadImage("img\\Player\\Back 2.png"), x, y, 100, 100);
			else if(animation == 2) 
				surface.image(surface.loadImage("img\\Player\\Back 3.png"), x, y, 100, 100);
			break;
		case 1:
			if(animation == 0) 
				surface.image(surface.loadImage("img\\Player\\Left 1.png"), x, y, 100, 100);
			else if(animation == 1) 
				surface.image(surface.loadImage("img\\Player\\Left 2.png"), x, y, 50, 50);
			else if(animation == 2) 
				surface.image(surface.loadImage("img\\Player\\Left 4.png"), x, y, 50, 50);
			break;
		case 2:
			if(animation == 0) 
				surface.image(surface.loadImage("img\\Player\\Front 1.png"), x, y, 100, 100);
			else if(animation == 1) 
				surface.image(surface.loadImage("img\\Player\\Front 2.png"), x, y, 50, 50);
			else if(animation == 2) 
				surface.image(surface.loadImage("img\\Player\\Front 3.png"), x, y, 50, 50);
			break;
		case 3:
			if(animation == 0) 
				surface.image(surface.loadImage("img\\Player\\Right 1.png"), x, y, 100, 100);
			else if(animation == 1) 
				surface.image(surface.loadImage("img\\Player\\Right 2.png"), x, y, 50, 50);
			else if(animation == 2) 
				surface.image(surface.loadImage("img\\Player\\Right 3.png"), x, y, 50, 50);
			break;
		}
		
		if(animation == 1) {
			animation = 2;
		}
		else if (animation == 2) {
			animation = 1;
		}
	}
}
