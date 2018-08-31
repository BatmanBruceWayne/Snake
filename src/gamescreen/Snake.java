package gamescreen;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake extends Character{
	private ArrayList<Square> snake = new ArrayList<>();
	private Color color;
	
	public void draw(Graphics g) {
		g.setColor(color);
		for (Square square : snake) {
			square.draw(g);
	    }
	}
	
	public boolean alive() {
		return true;
	}
	
}
