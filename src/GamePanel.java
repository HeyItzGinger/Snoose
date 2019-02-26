import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	public GamePanel() {
		Snoose.frame.setVisible(true);
		Snoose.frame.setSize(Snoose.width, Snoose.height);
		drawMenuState();
	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}

	public void drawMenuState() {
		JPanel menuPanel = new JPanel();
		menuPanel.setSize(Snoose.width, Snoose.height);
		menuPanel.setBackground(new Color(255, 238, 170));
		Snoose.frame.add(menuPanel);
	}

	public void drawGameState() {
		JPanel gamePanel = new JPanel();
		gamePanel.setSize(Snoose.width, Snoose.height);
		gamePanel.setBackground(new Color(187, 187, 255));
		Snoose.frame.add(gamePanel);
	}

	public void drawEndState() {
		JPanel endPanel = new JPanel();
		endPanel.setSize(Snoose.width, Snoose.height);
		endPanel.setBackground(new Color(255, 238, 170));
		Snoose.frame.add(endPanel);
	}
}
