package gamescreen;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class GameScreen extends JPanel implements Runnable, KeyListener {
	
	private static final int START_GAME_STATE = 0;
	private static final int GAME_PLAYING_STATE = 1;
	private static final int GAME_OVER_STATE = 2;
	
	private Square square;
	private Thread thread;
	private int gameState = START_GAME_STATE;
	private MainBoard mainBoard;
	
	public GameScreen(int width) {
		thread = new Thread(this);
		square = new Square(10, 10);
		mainBoard = new MainBoard(width);
	}
	
	public void startGame() {
		thread.start();
	}
	
	public void paint(Graphics g){
		mainBoard.draw(g);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		while(true) {
//			repaint();
//			try {
//				Thread.sleep(20);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		repaint();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
