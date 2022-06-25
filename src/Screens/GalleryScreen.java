package Screens;

import Core.DrawingSurface;

public class GalleryScreen extends Screen{

	private DrawingSurface surface;
	
	public GalleryScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
	}
	
	public void draw() {
		surface.image(surface.loadImage("img\\Background.png"), 0, 0, 1600, 900);
	}
}
