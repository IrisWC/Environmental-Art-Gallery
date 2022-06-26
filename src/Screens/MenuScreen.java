package Screens;

import Core.DrawingSurface;
import java.awt.Rectangle;
import java.awt.Point;

public class MenuScreen extends Screen{

	private DrawingSurface surface;
	private Rectangle infoButton;
	private Rectangle controlsButton;
	private Rectangle galleryButton;
	
	public MenuScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
		infoButton = new Rectangle(900, 200, 500, 100);
		controlsButton = new Rectangle(900, 400, 500, 100);
		galleryButton = new Rectangle(900, 600, 500, 100);
	}
	
	public void draw() {
		surface.background(255);
		surface.image(surface.loadImage("img\\Title.png"), 200, 200, 500, 500);
		
		surface.textAlign(surface.CENTER, surface.CENTER);
		
		surface.fill(255);
		surface.rect(infoButton.x, infoButton.y, infoButton.width, infoButton.height, 30);
		surface.rect(controlsButton.x, controlsButton.y, controlsButton.width, controlsButton.height, 30);
		surface.rect(galleryButton.x, galleryButton.y, galleryButton.width, galleryButton.height, 30);
		
		surface.fill(0);
		surface.textSize(30);
		surface.text("Info", infoButton.x, infoButton.y, infoButton.width, infoButton.height);
		surface.text("Controls", controlsButton.x, controlsButton.y, controlsButton.width, controlsButton.height);
		surface.text("Gallery", galleryButton.x, galleryButton.y, galleryButton.width, galleryButton.height);
	}
	
	public void mousePressed() {
		Point point = surface.recalculatePoint(new Point(surface.mouseX, surface.mouseY));
		if (controlsButton.contains(point))
			surface.switchScreen(1);
		else if (galleryButton.contains(point))
			surface.switchScreen(2);
		
	}
}
