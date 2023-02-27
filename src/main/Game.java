package main;

public class Game {
	@SuppressWarnings("unused")
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	public Game () {
		gamePanel = new GamePanel();
		gameWindow = new GameWindow(gamePanel);
		gamePanel.requestFocus();
	}
}
