package gamescreen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameWindow extends JFrame implements KeyListener{
	
	private GameScreen gameScreen;
	private boolean isKeyPressed;
	private Snake snake;
	
	public GameWindow(){
		super("Snake Game");
		setSize(600, 500);
		setLocation(10, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		gameScreen = new GameScreen(15);
		addKeyListener(this);
		add(gameScreen);
		setVisible(true);

	}
	
	public static void main(String[] args) {  
		GameWindow f=new GameWindow();
		//f.startGame();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (!isKeyPressed) {
			isKeyPressed = true;
			switch (gameScreen.getState()) {
			case 0:
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					gameScreen.setState(1);
					System.out.println("space");
					gameScreen.startGame();
				}
				break;
			case 1:
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					System.out.println("down");
					snake.update(2);
				} else if(e.getKeyCode() == KeyEvent.VK_UP) snake.update(0);
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) snake.update(3);
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) snake.update(1);
				break;
			case 2:
//				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//					gameState = GAME_PLAYING_STATE;
//					resetGame();
//				}
				break;

			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		isKeyPressed = false;
		System.out.println("release");
		
	}
}
