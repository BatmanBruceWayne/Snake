package gamescreen;

import java.awt.Color;
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
	private Bait bait;
	
	public GameScreen(int width) {
		thread = new Thread(this);
		mainBoard = new MainBoard(width);
		bait = new Bait((int) width/2, (int) width/2, Color.RED);
	}
	
	public void startGame() {
		thread.start();
	}
	
	public void paint(Graphics g){
		
		System.out.println("paint");

		
		mainBoard.draw(g);

		bait.draw(g);

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
		//repaint();
		System.out.println("run");
		
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
