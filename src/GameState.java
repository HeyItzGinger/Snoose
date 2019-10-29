import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameState extends Screen implements ActionListener {
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

	public GameState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 170, 187);
		text = new JTextField(1);
		submit = new JButton("Guess");
		word = new JTextField();

		
		// TODO Auto-generated constructor stub
	}

	public void drawGameScreen() {
		frame.add(this);
		this.setBackground(backgroundColor);
		hangmanImage1 = createLabelImage("pixil-girl-0.png");
		
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
			g.drawString("" + GamePanel.counter, 0, 0);
			System.out.println(GamePanel.counter);
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
	}
}
