package gamescreen;

import java.awt.Color;
import java.awt.Graphics;

public class Square {
	public static int width = 25;
	public static int height = 25;
	private int POS_X;
	private int POS_Y;
	private Color color;
	
	public Square(int x, int y, Color color) {
		POS_X = x; POS_Y = y;
		this.color = color;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillRect(this.POS_X, this.POS_Y, this.width, this.height);
		
	}
	
	public void setPos(int x, int y) {
		POS_X = x; POS_Y = y;
	}
	
	public int getX() {
		return POS_X;
	}
	
	public int getY() {
		return POS_Y;
	}
}
