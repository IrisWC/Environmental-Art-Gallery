package Screens;

import Core.DrawingSurface;

public class MenuScreen extends Screen{

	private DrawingSurface surface;
	
	public MenuScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
	}
	
	public void draw() {
		surface.background(255);
		surface.image(surface.loadImage("img\\Title.png"), 200, 200, 500, 500);
	}
	
	public void mousePressed() {
		surface.switchScreen(1);
	}
}
