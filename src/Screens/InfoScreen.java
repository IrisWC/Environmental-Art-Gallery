package Screens;

import Core.DrawingSurface;

import java.awt.Point;
import java.awt.Rectangle;

public class InfoScreen extends Screen{

	private DrawingSurface surface;
	private Rectangle backButton;
	
	public InfoScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
		backButton = new Rectangle(20, 20, 100, 100);
	}
	
	public void draw() {
		surface.background(255);
		
		surface.noFill();
		surface.rect((float)backButton.x, (float)backButton.y, (float)backButton.width, (float)backButton.height);
	
		surface.fill(0);
		surface.textSize(50);
		surface.textAlign(surface.CENTER, surface.CENTER);
		surface.text("<", 20, 10, 100, 100);
	}
	
	public void mousePressed() {
		Point point = surface.recalculatePoint(new Point(surface.mouseX, surface.mouseY));
		if (backButton.contains(point))
			surface.switchScreen(0);
		
	}
}
