package main;

import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	private int xDelta = 0, yDelta = 0;
	private MouseInputs mouseInputs;
	
	public GamePanel () {
		mouseInputs = new MouseInputs();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.fillRect(100 + xDelta, 100 + yDelta, 200, 50);
	}
}
