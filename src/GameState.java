import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameState extends Screen implements ActionListener, MouseListener {
	JLabel hangmanImage1;
	JLabel hangmanImage2;
	JTextField text;
	JTextField word;
	JButton submit;
	Random rand = new Random();
	String spaces;
	char[] answer;
	String strAnswer;
	String secretWrd;
	int c = 0;
	boolean showHint;

	public GameState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 170, 187);
		text = new JTextField(1);
		submit = new JButton("Guess");
		word = new JTextField();
		hangmanImage1 = createLabelImage("pixil-girl-0.png");
		hangmanImage1.addMouseListener(this);
		

		
		// TODO Auto-generated constructor stub
	}

	public void drawGameScreen() {
		frame.add(this);
		this.setBackground(backgroundColor);
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		this.add(hangmanImage1, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 2;
		gc.weighty = 1;
		this.add(text, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 2;
		gc.weighty = 1;
		this.add(submit, gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.weightx = 2;
		gc.weighty = 1;
		this.add(word, gc);
		
		
		
		submit.addActionListener(this);
		
		int wrdLength = rand.nextInt(category.length);
		secretWrd = category[wrdLength];
		
		answer = new char[secretWrd.length()];
	
		for(int i = 0; i < secretWrd.length(); i ++) {
			answer[i] = '_';
		}
		
		strAnswer = new String(answer);
		word.setText(strAnswer);
		submit.addActionListener(this);
		frame.pack();
		this.revalidate();
		this.repaint();

	}
	@Override
	public void paintComponent(Graphics g) {
			g.drawString("" + GamePanel.counter, 20, 20);
			System.out.println(GamePanel.counter);
			if(showHint) {
				g.drawString(hints.get(category), 450, 10);
			}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			if (secretWrd.charAt(c) == text.getText().charAt(0)) {
				answer[c] = text.getText().charAt(0);
				strAnswer = new String(answer);
				word.setText(strAnswer);
				System.out.println(secretWrd + " is the word. your guess is correct");
				
				c ++;
			
			}
			else {
				System.out.println(secretWrd + " is the word. your guess is incorrect");
			}
			this.repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Point p = e.getPoint();
		if (p.x >= 100 && p.x <= 350) {
			showHint = true;
			System.out.println("here");	
		}
		if (p.y >= 10 && p.y <= 460) {
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
