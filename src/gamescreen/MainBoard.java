package gamescreen;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class MainBoard {
	private ArrayList<ArrayList<Square>> board = new ArrayList<>();
	private int SQUARE_WIDTH;

	public MainBoard(int width) {
		SQUARE_WIDTH = width;
		int x = -25;
		for(int i=0; i < this.SQUARE_WIDTH; i++) {
			x += 30; 
			int y = -25;
			ArrayList<Square> tmp = new ArrayList<>();
			for(int j=0; j < this.SQUARE_WIDTH; j++) {
				y += 30;
				tmp.add(new Square(x, y, Color.GRAY));
			}
			board.add(tmp);
		}
	}
	
	public void draw(Graphics g) {
		for(int i=0; i < this.SQUARE_WIDTH; i++) {
			for(int j=0; j < this.SQUARE_WIDTH; j++) {
				board.get(i).get(j).draw(g);
			}
		}
	}
	
	public int getWidth() {
		return this.SQUARE_WIDTH;
	}
	
}
