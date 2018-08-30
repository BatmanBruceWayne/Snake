package gamescreen;

import java.awt.Color;
import java.awt.Graphics;

public class Square {
	public static int width = 25;
	public static int height = 25;
	private int POS_X;
	private int POS_Y;
	
	public Square(int x, int y) {
		POS_X = x; POS_Y = y;
	}
	
	public void draw(Graphics g) {
		g.fillRect(this.POS_X, this.POS_Y, this.width, this.height);
		
	}
}
