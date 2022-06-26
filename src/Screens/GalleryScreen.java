package Screens;

import Core.DrawingSurface;
import Assets.*;

public class GalleryScreen extends Screen{

	private DrawingSurface surface;
	private Player player;
	private Artwork[] statues;
	
	public GalleryScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
		player = new Player(800, 450);
		statues = new Artwork[6];
		statues[0] = new Artwork(100, 650, 0);
		statues[1] = new Artwork(100, 250, 1);
		statues[2] = new Artwork(600, 250, 2);
		statues[3] = new Artwork(1000, 250, 3);
		statues[4] = new Artwork(1400, 250, 4);
		statues[5] = new Artwork(1400, 650, 5);
	}
	
	public void draw() {
		surface.image(surface.loadImage("img\\Background.png"), 0, 0, 1600, 900);
		player.draw(surface);
		for (Artwork art : statues)
			art.draw(surface);
	}
	
	public void keyPressed() {
		if(surface.key == 'w' || surface.key == 'W') 
			player.move(0, -10, 0);
		else if(surface.key == 'a' || surface.key == 'A') 
			player.move(-10, 0, 1);
		else if(surface.key == 's' || surface.key == 'S') 
			player.move(0, 10, 2);
		else if(surface.key == 'd' || surface.key == 'D') 
			player.move(10, 0, 3);
		
		if(surface.key == ' ') {
			surface.switchScreen(3);
		}
	}
	
	public void keyReleased() {
		//player.stop();
	}
}
