package Assets;

import Core.DrawingSurface;

public class Artwork {

	private int x, y;
	private int pageNum;
	
	public Artwork(int xcord, int ycord, int page) {
		x = xcord;
		y = ycord;
		pageNum = page;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getPage() {
		return pageNum;
	}
	
	public void draw(DrawingSurface surface) {
		surface.image(surface.loadImage("img\\Pedestal.png"), x, y, 100, 100);
		surface.image(surface.loadImage("img\\Sphere " + (pageNum+1) + ".png"), x, y-75, 100, 100);
	}
}
