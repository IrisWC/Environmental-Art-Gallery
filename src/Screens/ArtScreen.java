package Screens;

import Core.DrawingSurface;

import java.awt.Rectangle;
import java.awt.Point;

public class ArtScreen extends Screen{

	private DrawingSurface surface;
	private String artPicture;
	private String artDescription;
	private Rectangle backButton;
	
	public ArtScreen(int width, int height, DrawingSurface drawer, String picFile, String descriptionFile) {
		super(width, height);
		surface = drawer;
		artPicture = picFile;
		artDescription = descriptionFile;
		backButton = new Rectangle(20, 20, 100, 100);
	}
	
	public void draw() {
		surface.background(255);
		surface.image(surface.loadImage(artPicture), 0, 0, 800, 900);
		surface.image(surface.loadImage(artDescription), 800, 0, 800, 900);
//		surface.image(surface.loadImage(artPicture), 200, 112, 600, 675);
//		surface.image(surface.loadImage(artDescription), 800, 112, 600, 675);	
		
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
			surface.switchScreen(2);
		
	}
}
