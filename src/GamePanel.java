import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {
	int state = 0;
	JPanel menuPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	JPanel endPanel = new JPanel();
	Font titleFont;
	Font subFont;
	Graphics g;
	MenuState menu;
	GameState game;
	EndState end;

	public GamePanel() {
		Snoose.frame.setVisible(true);
		Snoose.frame.setSize(Snoose.width, Snoose.height);
		Snoose.frame.addKeyListener(this);
		Snoose.frame.add(menuPanel);
		titleFont = new Font("Zapfino", Font.PLAIN, 55);
		subFont = new Font("PingFang HK", Font.PLAIN, 28);
		
		menu = new MenuState(Snoose.frame);
		game = new GameState(Snoose.frame);
		end = new EndState(Snoose.frame);
	}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}
	public void drawMenu() {
	menu.drawMenuScreen();
	}
	public void drawGame() {
	game.drawGameScreen();
	}
	public void drawEnd() {
	end.drawEndScreen();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		if (state == 0) {
			drawMenu();
		} else if (state == 1) {
			drawGame();
		} else if (state == 2) {
			drawEnd();
		}
		state = 0;
		if (e.getKeyCode() == KeyEvent.VK_ENTER && state == 0) {
			Snoose.frame.getContentPane().removeAll();
			state = 1;
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && state == 1) {
			Snoose.frame.getContentPane().removeAll();
			state = 2;
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && state == 2) {
			Snoose.frame.getContentPane().removeAll();
			state = 0;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
