package gamescreen;

import java.awt.Graphics;
import java.util.ArrayList;

public class MainBoard {
	private ArrayList<Square> board;
	private int SQUARE_WIDTH;
//	private Square square;

	public MainBoard(int width) {
		SQUARE_WIDTH = width;
//		square = new Square()
	}
	
	public void draw(Graphics g) {
		int x = -25;
		for(int i=0; i < this.SQUARE_WIDTH; i++) {
			x += 30; 
			int y = -25;
			for(int j=0; j < this.SQUARE_WIDTH; j++) {
				y += 30;
				Square square = new Square(x, y);
				square.draw(g);
			}
		}
	}
	
}
