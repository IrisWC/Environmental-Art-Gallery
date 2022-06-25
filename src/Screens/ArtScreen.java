package Screens;

import Core.DrawingSurface;

public class ArtScreen extends Screen{

	private DrawingSurface surface;
	
	public ArtScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
	}
	
	public void draw() {
		
	}
}
