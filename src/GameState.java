import java.awt.Color;
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

	public GameState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 170, 187);
		text = new JTextField();
		submit = new JButton("Guess");
		word = new JTextField();
		
		// TODO Auto-generated constructor stub
	}

	public void drawGameScreen() {
		frame.add(panel);
		panel.setBackground(backgroundColor);
		hangmanImage1 = createLabelImage("pixil-girl-0.png");
		
		gc.gridx = 0;
		gc.gridy = 0;
		gc.weightx = 1;
		gc.weighty = 0;
		panel.add(hangmanImage1, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.weightx = 2;
		gc.weighty = 1;
		panel.add(text, gc);
		
		gc.gridx = 0;
		gc.gridy = 2;
		gc.weightx = 2;
		gc.weighty = 1;
		panel.add(submit, gc);
		
		gc.gridx = 0;
		gc.gridy = 3;
		gc.weightx = 2;
		gc.weighty = 1;
		panel.add(word, gc);
		
		int wrdLength = rand.nextInt(category.length);
		String secretWrd = category[wrdLength];
		
		answer = new char[secretWrd.length()];
	
		for(int i = 0; i < secretWrd.length(); i ++) {
			answer[i] = '_';
		}
		
		String strAnswer = new String(answer);
		word.setText(strAnswer);
		submit.addActionListener(this);
		panel.repaint();
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
