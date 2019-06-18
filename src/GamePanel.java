import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {
	int MENU = 0;
	int GAME = 1;
	int END = 2;
	int numStates = 3;
	int state = MENU;
	JPanel menuPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	JPanel endPanel = new JPanel();
	Dimension panelSize;
	Font titleFont;
	Font subFont;
	Graphics g;
	MenuState menu;
	GameState game;
	EndState end;

	public GamePanel() {
		Snoose.frame.setVisible(true);
		panelSize = new Dimension(Snoose.width, Snoose.height);
		Snoose.frame.setPreferredSize(panelSize);
		Snoose.frame.addKeyListener(this);
		Snoose.frame.add(menuPanel);
		titleFont = new Font("Zapfino", Font.PLAIN, 55);
		subFont = new Font("PingFang HK", Font.PLAIN, 28);
		
		menu = new MenuState(Snoose.frame);
		game = new GameState(Snoose.frame);
		end = new EndState(Snoose.frame);
		
		drawMenu();
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
	
	public void selectScreen() {
		if(state == MENU) {
			drawMenu();
		}
		if(state == GAME) {
			drawGame();
		}
		if(state == END) {
			drawEnd();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (state == MENU) {
			menu.removeScreen();
			System.out.println("pressed");
		}
		if (state == GAME) {
			game.removeScreen();
			System.out.println("pressed");
		}
		if (state == END) {
			end.removeScreen();
			System.out.println("pressed");
		}
		
		state = (state + 1) % numStates;
		selectScreen();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
