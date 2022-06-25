package Core;

import Screens.MenuScreen;
import Screens.GalleryScreen;
import Screens.ArtScreen;
import processing.core.PApplet;
import Screens.Screen;
import java.util.*;

public class DrawingSurface extends PApplet {
	
	private ArrayList<Screen> screens;
	private Screen currentScreen;
	
	public DrawingSurface() {
		screens = new ArrayList<Screen>();
		
		MenuScreen menu = new MenuScreen(1600, 900, this);
		screens.add(menu);
		GalleryScreen gallery = new GalleryScreen(1600, 900, this);
		screens.add(gallery);
		
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
}
