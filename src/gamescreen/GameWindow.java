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
		this.snake = gameScreen.getSnake();
	}
	
	public static void main(String[] args) {  
		GameWindow f=new GameWindow();
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
				if (e.getKeyCode() == KeyEvent.VK_SPACE && gameScreen.getState() == 0) {
					gameScreen.setState(1);
					gameScreen.startGame();
				}
				break;
			case 1:
				if (e.getKeyCode() == KeyEvent.VK_DOWN && snake.getDimension() != 2) {
					snake.update(2);
				} else if(e.getKeyCode() == KeyEvent.VK_UP && snake.getDimension() != 0) snake.update(0);
				else if(e.getKeyCode() == KeyEvent.VK_LEFT && snake.getDimension() != 3) snake.update(3);
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT && snake.getDimension() != 1) snake.update(1);
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
		if (gameScreen.getState() == 1) {
			try {
				snake.update(snake.getDimension());

			} catch(NullPointerException ex) {
				ex.printStackTrace();
			}
		}
		
	}
}
