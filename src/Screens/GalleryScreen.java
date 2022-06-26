package Screens;

import Core.DrawingSurface;
import Assets.Player;

public class GalleryScreen extends Screen{

	private DrawingSurface surface;
	private Player player;
	
	public GalleryScreen(int width, int height, DrawingSurface drawer) {
		super(width, height);
		surface = drawer;
		player = new Player(800, 450);
	}
	
	public void draw() {
		surface.image(surface.loadImage("img\\Background.png"), 0, 0, 1600, 900);
		player.draw(surface);
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
