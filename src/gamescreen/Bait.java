package gamescreen;

import java.awt.Color;
import java.awt.Graphics;

public class Bait extends Character{
	private int RELATIVE_I;
	private int RELATIVE_J;
	private Color color;
	private Square bait;
	
	public Bait(int i, int j, Color color){
		super();
		this.RELATIVE_I = i;
		this.RELATIVE_J = j;
		this.color = color;
		bait = new Square(5+30*i, 5+30*j, color);
	}
	
	public void draw(Graphics g) {
		bait.draw(g);
	}
	
}
