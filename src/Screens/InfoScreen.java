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
		
		surface.textSize(30);
		surface.text("Welcome to the Environmental Art Gallery! "
				+ "Here you can view and learn about different pieces of art from artists around the world, "
				+ "all of which are designed to promote the environment. Each of these artistic creations "
				+ "was either made with the intention of inspiring environmental protection or is made out of recycled materials. "
				+ "Have fun exploring these in the gallery!", 100, 0, 600, 900);
		surface.text("External Credits:\n\nhttps://theartling.com/en/artzine/art-highlights-climate-change/\n"
				+ "https://olafureliasson.net/archive/artwork/WEK109190/ice-watch\n"
				+ "https://qubahq.com/2014/07/player-walk-cycle/\n"
				+ "https://processing.org/\n"
				+ "https://oceanic.global/tan-zi-xi/", 900, 0, 600, 900);
	}
	
	public void mousePressed() {
		Point point = surface.recalculatePoint(new Point(surface.mouseX, surface.mouseY));
		if (backButton.contains(point))
			surface.switchScreen(0);
		
	}
}
