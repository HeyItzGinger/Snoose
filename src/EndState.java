
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EndState extends Screen implements KeyListener {
	JLabel label;
	JLabel label2;
	JLabel label3;

	public EndState(JFrame frame) {
		super(frame);

		backgroundColor = new Color(255, 204, 204);
		label = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		// TODO Auto-generated constructor stub
	}

	public void drawEndScreen() {
		frame.add(this);
		this.setBackground(backgroundColor);
		gc.gridx = 0;
		gc.gridy = 0;
		this.add(label, gc);
		label.setFont(new Font("Impact", Font.BOLD, 50));
		label.setText("GAME OVER!! Press any key if you want to replay!");
		gc.gridx = 0;
		gc.gridy = 1;
		this.add(label2, gc);
		label2.setFont(new Font("Impact", Font.PLAIN, 90));
		label2.setText("The word was " + GameState.getAnswer() + "!");
		gc.gridx = 0;
		gc.gridy = 2;
		this.add(label3, gc);
		label3.setFont(new Font("Impact", Font.PLAIN, 40));
		//label3.setText("Press any key if you'd like to restart");
		this.repaint();
		frame.addKeyListener(this);
		frame.requestFocus();
		frame.pack();
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//animals
		if (GameState.secretWrd.equals("frog")) {
			g.drawImage(frog, 100, 100, 200, 100, null);
		}
		if (GameState.secretWrd.equals("penguin")) {
			g.drawImage(penguin, 100, 100, 200, 100, null);	
		}
		if (GameState.secretWrd.equals("skunk")) {
			g.drawImage(skunk, 100, 100, 200, 150, null);
		}
		if (GameState.secretWrd.equals("panda")) {
			g.drawImage(panda, 100, 100, 200, 100, null);
		}
		if (GameState.secretWrd.equals("squid")) {
			g.drawImage(squid, 100, 100, 200, 200, null);	
		}
		
		//places
		if (GameState.secretWrd.equals("france")) {
			g.drawImage(france, 100, 100, 180, 180, null);
		}
		if (GameState.secretWrd.equals("athens")) {
			g.drawImage(athens, 100, 100, 180, 180, null);
		}
		if (GameState.secretWrd.equals("rome")) {
			g.drawImage(rome, 100, 100, 180, 180, null);
		}
		if (GameState.secretWrd.equals("louisiana")) {
			g.drawImage(louisiana, 100, 100, 180, 180, null);
		}
		if (GameState.secretWrd.equals("guatemala")) {
			g.drawImage(guatemala, 100, 100, 180, 180, null);
		}
		
		//basic words
		if (GameState.secretWrd.equals("yeet")) {
			g.drawImage(yeet, 100, 100, 280, 180, null);
		}
		if (GameState.secretWrd.equals("oop")) {
			g.drawImage(oop, 100, 100, 200, 150, null);
		}
		if (GameState.secretWrd.equals("sksksk")){
			g.drawImage(sksksk, 100, 100, 180, 180, null);
		}
		if (GameState.secretWrd.equals("ily")) {
			g.drawImage(ily, 100, 100, 180, 180, null);
		}
		if (GameState.secretWrd.equals("tea")) {
			g.drawImage(tea, 100, 100, 200, 100, null) ;
		}
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		GamePanel.state = GamePanel.MENU;
		GamePanel.selectScreen();
		System.out.println("replayed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
