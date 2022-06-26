package Screens;

import Core.DrawingSurface;
import java.awt.Rectangle;
import java.awt.Point;

public class ControlsScreen extends Screen{

	private DrawingSurface surface;
	private Rectangle backButton;
	
	public ControlsScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
		backButton = new Rectangle(20, 20, 100, 100);
	}
	
	public void draw() {
		surface.background(255);
		surface.textAlign(surface.LEFT, surface.TOP);
		surface.fill(0);
		
		surface.textSize(30);
		surface.text("In the gallery:\n\nW to move up\nA to move left\nS to move down\nD to move right", 150, 200);
		
		surface.text("Walk up to statues and hit space to view art", 550, 200);
		surface.image(surface.loadImage("img\\Pedestal.png"), 650, 350, 200, 200);
		
		surface.text("< buttons bring you back to the previous page\n(Ex: look at the top left corner)", 550, 700);
		
		surface.textAlign(surface.LEFT, surface.CENTER);
		surface.text("<- Statues are found on top of these!", 900, 350, 700, 200);
		
		surface.textSize(50);
		surface.text("CONTROLS", 150, 20, 300, 100);
		surface.textSize(30);
		
		surface.textAlign(surface.CENTER, surface.TOP);
		surface.image(surface.loadImage("img\\Player\\Front 1.png"), 150, 550, 200, 200);
		surface.text("This is you!", 150, 800, 200, 100);
		
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