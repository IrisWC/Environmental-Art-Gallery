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
		statues[0] = new Artwork(200, 650, 0);
		statues[1] = new Artwork(200, 250, 1);
		statues[2] = new Artwork(550, 250, 2);
		statues[3] = new Artwork(950, 250, 3);
		statues[4] = new Artwork(1300, 250, 4);
		statues[5] = new Artwork(1300, 650, 5);
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
			int x = player.getX() + 50;
			int y = player.getY() + 50;
			for (int i = 0; i < statues.length; i++) {
				if(Math.abs(x-statues[i].getX()-50) < 150) {
					if(Math.abs(y-statues[i].getY()) < 150) {
						surface.switchScreen(i+4);
					}
				}
			}
		}
	}
	
	public void keyReleased() {
		//player.stop();
	}
}
