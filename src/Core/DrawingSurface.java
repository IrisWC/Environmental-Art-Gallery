package Core;

import Screens.MenuScreen;
import Screens.GalleryScreen;
import Screens.ArtScreen;
import processing.core.PApplet;
import Screens.Screen;
import java.util.*;
import java.awt.Point;

public class DrawingSurface extends PApplet {
	
	private ArrayList<Screen> screens;
	private Screen currentScreen;
	
	public DrawingSurface() {
		screens = new ArrayList<Screen>();
		
		MenuScreen menu = new MenuScreen(1600, 900, this);
		screens.add(menu);
		GalleryScreen gallery = new GalleryScreen(1600, 900, this);
		screens.add(gallery);
		ArtScreen cloudCities = new ArtScreen(1600, 900, this, "img\\Cloud Cities Art.png", "img\\Cloud Cities Description.png");
		screens.add(cloudCities);
		
		currentScreen = screens.get(0);
	}
	
	public void setup() {
		for (Screen screen : screens)
			screen.setup();
	}
	
	public void draw() {
		push();
		scale((float)width/currentScreen.getWidth(), (float)height/currentScreen.getHeight());
		currentScreen.draw();
		pop();
	}
	
	public void switchScreen(int i) {
		currentScreen = screens.get(i);
	}
	
	public void mousePressed() {
		currentScreen.mousePressed();
	}
	
	public void keyPressed() {
		currentScreen.keyPressed();
	}
	
	public Point recalculatePoint (Point original) {
		float ratioX = (float)width / currentScreen.getWidth();
		float ratioY = (float)height / currentScreen.getHeight();
		return new Point((int)(original.getX()/ratioX) , (int)(original.getY()/ratioY));
	}

}
