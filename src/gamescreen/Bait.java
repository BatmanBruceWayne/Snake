package gamescreen;

import java.awt.Color;

public class Bait extends Character{
	private int RELATIVE_X;
	private int RELATIVE_Y;
	private Color color;
	
	
	public Bait(int x, int y, Color color, int width){
		super();
		this.RELATIVE_X = x;
		this.RELATIVE_Y = y;
		this.color = color;
	}
	
	
	
}
