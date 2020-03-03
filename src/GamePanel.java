import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
	Timer timer;
	static long counter;
	
	static int MENU = 0;
	static int GAME = 1;
	static int END = 2;
	int numStates = 3;
	static int state = MENU;
	JPanel menuPanel = new JPanel();
	JPanel gamePanel = new JPanel();
	JPanel endPanel = new JPanel();
	JButton hint = new JButton("Hints (3)");
	Dimension panelSize;
	Font titleFont;
	Font subFont;
	Graphics g;
	static MenuState menu;
	static GameState game;
	static EndState end;
	static Screen currentScreen = null;

	public GamePanel() {
		timer = new Timer(1000, this);
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
		
		timer.start();
	}
	public void paintCompnent(Graphics g) {
		g.drawString("" + GamePanel.counter, 0, 0);
		System.out.println(GamePanel.counter);
}

	public void updateMenuState() {

	}

	public void updateGameState() {

	}

	public void updateEndState() {

	}
	public static void drawMenu() {
	menu.drawMenuScreen();
	}
	public static void drawGame() {
	game.drawGameScreen();
	}
	public static void drawEnd() {
	end.drawEndScreen();
	}
	
	public static void selectScreen() {
		
		if(currentScreen != null) {
			currentScreen.removeScreen();
		}
		
		if(state == MENU) {
			currentScreen = menu;
			drawMenu();
		}
		if(state == GAME) {
			currentScreen = game;
			drawGame();
		}
		if(state == END) {
			currentScreen = end;
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (state == GAME) {
			game.repaint();
			System.out.println("dgjalsjfgb");
			counter ++; 
			System.out.println(counter);
			if (counter == 120) {
				game.removeScreen();
				state = END;
				selectScreen();
				System.out.println("GAME OVER, stop playing");

				timer.stop();
				
			}
		}
		else {
			
		}
	}
}

