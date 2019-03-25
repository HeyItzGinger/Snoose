import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameState extends Screen {
	JLabel hangmanImage1;
	JLabel hangmanImage2;
	JTextField text;
	JButton answer;

	public GameState(JFrame frame) {
		super(frame);
		backgroundColor = new Color(255, 170, 187);
		text = new JTextField();
		answer = new JButton("Guess");
		// TODO Auto-generated constructor stub
	}

	public void drawGameScreen() {
		frame.add(panel);
		panel.setBackground(backgroundColor);
		hangmanImage1 = createLabelImage("pixil-girl-0.png");
		gc.gridx = 0;
		gc.gridy = 0;
		panel.add(hangmanImage1);
		hangmanImage2 = createLabelImage("pixil-boy-0.png");
		
		gc.gridx = 0;
		gc.gridy = 1;
		panel.add(text)
		

	}
}
