package gamescreen;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	private GameScreen gameScreen;
	
	public GameWindow(){
		super("Snake Game");
		setSize(600, 500);
		setLocation(10, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		gameScreen = new GameScreen(15);
		addKeyListener(gameScreen);
		add(gameScreen);
	}
	
	public void startGame(){
		setVisible(true);
		gameScreen.startGame();
	}
	
	public static void main(String[] args) {  
		GameWindow f=new GameWindow();
		f.startGame();
	}
}
