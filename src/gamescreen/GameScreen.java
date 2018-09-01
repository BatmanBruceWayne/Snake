package gamescreen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameScreen extends JPanel implements Runnable {
	
	private static final int START_GAME_STATE = 0;
	private static final int GAME_PLAYING_STATE = 1;
	private static final int GAME_OVER_STATE = 2;
	
	private Square square;
	private Thread thread;
	private int gameState = START_GAME_STATE;
	private MainBoard mainBoard;
	private Bait bait;
	private Snake snake;
	
	public GameScreen(int width) {
		thread = new Thread(this);
		mainBoard = new MainBoard(width);
		bait = new Bait((int) width/2, (int) width/2, Color.RED);
		snake = new Snake(Color.YELLOW, this.bait);
	}
	
	public void startGame() {
		System.out.println("start");
		thread.start();
	}
	
	public void paint(Graphics g){
		System.out.println("paint");
		
		switch (gameState) {
			case START_GAME_STATE:
				mainBoard.draw(g);
				bait.draw(g);
				snake.draw(g);
				break;
			case GAME_PLAYING_STATE:
				mainBoard.draw(g);
				bait.draw(g);
				snake.draw(g);
				break;
			case GAME_OVER_STATE:
			
		}
		
		

	}
	
	public void update() {
		snake.update(snake.getDimension());
		if(snake.isEaten()) {
			snake.increase();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			update();
			repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int getState() {
		return this.gameState;
	}
	
	public void setState(int state) {
		this.gameState = state;
	}
	
	public Snake getSnake() {
		return this.snake;
	}
	
	

}
