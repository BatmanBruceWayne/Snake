package gamescreen;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake extends Character{
	private ArrayList<Square> snake = new ArrayList<>();
	private Color color;
	private int dimension = 1;
	private int SNAKE_X = 35;
	private int SNAKE_Y = 5;
	private Bait bait;
	
	public Snake(Color color, Bait bait) {
		this.color = color;
		snake.add(new Square(35, 5, color));
		snake.add(new Square(5, 5, color));
		this.bait = bait;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		for (Square square : snake) {
			square.draw(g);
	    }
	}
	
	public void update(int dimension) {
		if(Math.abs(dimension - this.getDimension()) != 2) {
			switch(dimension) {
				case 0:{
					SNAKE_Y -= 30;
					this.setDimension(0);
					break;
				}
				case 1:{
					SNAKE_X += 30;
					this.setDimension(1);
					break;
				}
				case 2:{
					SNAKE_Y += 30;
					this.setDimension(2);
					break;
				}
				case 3:{
					SNAKE_X -= 30;
					this.setDimension(3);
					break;
				}
			}
			for(int i=snake.size()-1; i>0; i--) {
				Square tmp = snake.get(i-1);
				snake.get(i).setPos(tmp.getX(), tmp.getY());
			}
			snake.get(0).setPos(this.SNAKE_X, this.SNAKE_Y);
		}
		
	}
	
	public boolean alive() {
		return true;
	}
	
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	
	public int getDimension() {
		return this.dimension;
	}
	
	public boolean isEaten() {
		return snake.get(0).getX() == this.bait.getPosX() && snake.get(0).getY() == this.bait.getPosY();
	}
	
	public void increase() {
		switch(this.getDimension()) {
			case 0:{
				SNAKE_Y -= 30;
				this.setDimension(0);
				break;
			}
			case 1:{
				SNAKE_X += 30;
				this.setDimension(1);
				break;
			}
			case 2:{
				SNAKE_Y += 30;
				this.setDimension(2);
				break;
			}
			case 3:{
				SNAKE_X -= 30;
				this.setDimension(3);
				break;
			}
		}
		Square head = new Square(SNAKE_X, SNAKE_Y, color);
		snake.add(0, head);
	}
	
}
